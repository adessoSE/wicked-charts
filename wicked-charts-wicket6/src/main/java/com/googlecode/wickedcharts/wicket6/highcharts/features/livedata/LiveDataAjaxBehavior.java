/**
 *   Copyright 2012-2013 Wicked Charts (http://wicked-charts.googlecode.com)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.googlecode.wickedcharts.wicket6.highcharts.features.livedata;

import java.text.MessageFormat;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.head.HeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;

import com.googlecode.wickedcharts.highcharts.jackson.JsonRenderer;
import com.googlecode.wickedcharts.highcharts.options.livedata.JavaScriptParameters;
import com.googlecode.wickedcharts.highcharts.options.livedata.LiveDataSeries;
import com.googlecode.wickedcharts.highcharts.options.livedata.LiveDataUpdateEvent;
import com.googlecode.wickedcharts.highcharts.options.series.Point;
import com.googlecode.wickedcharts.highcharts.options.util.OptionsUtil;
import com.googlecode.wickedcharts.wicket6.JavaScriptExpressionSendingAjaxBehavior;
import com.googlecode.wickedcharts.wicket6.highcharts.Chart;
import com.googlecode.wickedcharts.wicket6.highcharts.JsonRendererFactory;

/**
 * This Behavior adds javascript functionality to a chart that allows live
 * updating of a {@link LiveDataSeries} via AJAX.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class LiveDataAjaxBehavior extends JavaScriptExpressionSendingAjaxBehavior {

	private static final long serialVersionUID = 1L;

	private final LiveDataSeries series;

	private boolean firstRendering = true;

	public LiveDataAjaxBehavior(final LiveDataSeries series) {
		this.series = series;
	}

	@Override
	protected void respond(final AjaxRequestTarget target) {
		Chart chart = (Chart) getComponent();
		int seriesIndex = OptionsUtil.getSeriesIndex(chart.getOptions(), this.series.getWickedChartsId());
		LiveDataUpdateEvent event = new LiveDataUpdateEvent();
		event.setJavascriptChartName(chart.getJavaScriptVarName());
		event.setParameters(createJavascriptParameters());
		WicketLiveDataUpdateEvent wicketEvent = new WicketLiveDataUpdateEvent(target, event);
		final Point point = this.series.update(wicketEvent);
		if (point != null) {
			JsonRenderer renderer = JsonRendererFactory.getInstance().getRenderer();
			String jsonPoint = renderer.toJson(point);
			String javaScript = "var chartVarName = " + ((Chart) getComponent()).getJavaScriptVarName() + ";\n";
			javaScript += "var seriesIndex = " + seriesIndex + ";\n";
			javaScript += "eval(chartVarName).series[seriesIndex].addPoint(" + jsonPoint + ", true, true);\n";
			target.appendJavaScript(javaScript);
		}
	}

	@Override
	public void renderHead(final Component component, final IHeaderResponse response) {
		super.renderHead(component, response);
		if (this.firstRendering) {
			response.render(getIntervalDeclarationHeaderItem());
			this.firstRendering = false;
		} else {
			response.render(getClearIntervalHeaderItem());
		}
	}

	private HeaderItem getClearIntervalHeaderItem() {
		String varName = getIntervalJavaScriptVarName();
		String javaScript = MessageFormat.format("if(!(typeof {0} === \"undefined\"))'{'\n" + "clearInterval({0});\n"
		    + "'}'", varName);
		return OnDomReadyHeaderItem.forScript(javaScript);
	}

	private HeaderItem getIntervalDeclarationHeaderItem() {
		String varName = getIntervalJavaScriptVarName();
		String javaScript = MessageFormat.format("var {0};", varName);
		return JavaScriptHeaderItem.forScript(javaScript, varName + "-declaration");
	}

	protected String getIntervalJavaScriptVarName() {
		Chart chart = (Chart) getComponent();
		int seriesIndex = OptionsUtil.getSeriesIndex(chart.getOptions(), this.series.getWickedChartsId());
		return getComponent().getMarkupId() + "SeriesInterval" + seriesIndex;
	}

	protected void reset() {
		this.firstRendering = true;
	}

	public LiveDataSeries getSeries() {
		return this.series;
	}

	@Override
	protected void onBind() {
		super.onBind();
		if (!(getComponent() instanceof Chart)) {
			throw new IllegalStateException(LiveDataAjaxBehavior.class.getSimpleName()
			    + " can only be bound to components of type " + Chart.class.getSimpleName() + ".");
		}
	}

	private JavaScriptParameters createJavascriptParameters() {
		return new JavaScriptParameters() {
			@Override
			public String getParameterValue(final String parameterName) {
				return LiveDataAjaxBehavior.this.getVariableValue(parameterName).toString();
			}
		};
	}
}
