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
package com.googlecode.wickedcharts.wicket6.highcharts.features.interaction;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.attributes.AjaxRequestAttributes;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.request.cycle.RequestCycle;
import org.apache.wicket.request.http.WebRequest;
import org.apache.wicket.request.resource.JavaScriptResourceReference;
import org.apache.wicket.util.string.StringValue;

import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.interaction.InteractionEvent;
import com.googlecode.wickedcharts.highcharts.options.series.Point;
import com.googlecode.wickedcharts.highcharts.options.series.Series;
import com.googlecode.wickedcharts.highcharts.options.util.OptionsUtil;
import com.googlecode.wickedcharts.wicket6.highcharts.Chart;
import com.googlecode.wickedcharts.wicket6.highcharts.features.livedata.LiveDataAjaxBehavior;

public abstract class InteractionBehavior extends AbstractDefaultAjaxBehavior {

	private static final String SELECTED_POINT_PLACEHOLDER = "SELECTED_POINT_PLACEHOLDER";

	private static final String SELECTED_SERIES_PLACEHOLDER = "SELECTED_SERIES_PLACEHOLDER";

	private static final String SELECTED_POINT = "selectedPoint";

	private static final String SELECTED_SERIES = "selectedSeries";

	@Override
	protected void respond(AjaxRequestTarget target) {
		RequestCycle cycle = RequestCycle.get();
		WebRequest webRequest = (WebRequest) cycle.getRequest();

		Chart chart = (Chart) getComponent();
		Options options = chart.getOptions();

		InteractionEvent event = new InteractionEvent();

		StringValue selectedPointValue = webRequest.getQueryParameters().getParameterValue(SELECTED_POINT);
		if (selectedPointValue != null && !"".equals(selectedPointValue.toString())) {
			Integer selectedPoint = selectedPointValue.toInteger();
			Point point = OptionsUtil.getPointWithWickedChartsId(options, selectedPoint);
			event.setSelectedPoint(point);
		}

		StringValue selectedSeriesValue = webRequest.getQueryParameters().getParameterValue(SELECTED_SERIES);
		if (selectedSeriesValue != null && !"".equals(selectedSeriesValue.toString())) {
			Integer selectedSeries = selectedSeriesValue.toInteger();
			Series<?> series = OptionsUtil.getSeriesWithWickedChartsId(options, selectedSeries);
			event.setSelectedSeries(series);
		}

		event.setSelectedChart(options);

		onEvent(event, target);
	}

	public abstract void onEvent(InteractionEvent event, AjaxRequestTarget target);

	@Override
	protected void onBind() {
		super.onBind();
		if (!(getComponent() instanceof Chart)) {
			throw new IllegalStateException(LiveDataAjaxBehavior.class.getSimpleName()
			    + " can only be bound to components of type " + Chart.class.getSimpleName() + ".");
		}
	}

	@Override
	public CharSequence getCallbackScript() {
		String script = super.getCallbackScript().toString();
		script = script.replace("\"" + SELECTED_POINT_PLACEHOLDER + "\"", "selectedPoint");
		script = script.replace("\"" + SELECTED_SERIES_PLACEHOLDER + "\"", "selectedSeries");
		return script;
	}

	@Override
	protected void updateAjaxAttributes(AjaxRequestAttributes attributes) {
		super.updateAjaxAttributes(attributes);
		attributes.getExtraParameters().put(SELECTED_SERIES, SELECTED_SERIES_PLACEHOLDER);
		attributes.getExtraParameters().put(SELECTED_POINT, SELECTED_POINT_PLACEHOLDER);
	}

	@Override
	public void renderHead(Component component, IHeaderResponse response) {
		super.renderHead(component, response);
		response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(InteractionBehavior.class,
		    "InteractionBehavior.js")));
	}

}
