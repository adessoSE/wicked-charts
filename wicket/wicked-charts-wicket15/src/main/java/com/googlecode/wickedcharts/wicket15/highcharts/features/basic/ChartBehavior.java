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
package com.googlecode.wickedcharts.wicket15.highcharts.features.basic;

import java.text.MessageFormat;

import javax.swing.text.html.Option;

import org.apache.wicket.Component;
import org.apache.wicket.behavior.Behavior;
import org.apache.wicket.markup.html.IHeaderResponse;

import com.googlecode.wickedcharts.highcharts.jackson.JsonRenderer;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.processing.Feature;
import com.googlecode.wickedcharts.highcharts.options.processing.FeatureCheckingOptionsProcessor;
import com.googlecode.wickedcharts.highcharts.options.processing.IOptionsProcessor;
import com.googlecode.wickedcharts.highcharts.options.processing.OptionsProcessorContext;
import com.googlecode.wickedcharts.highcharts.options.util.OptionsUtil;
import com.googlecode.wickedcharts.wicket15.JavaScriptResourceRegistry;
import com.googlecode.wickedcharts.wicket15.highcharts.Chart;
import com.googlecode.wickedcharts.wicket15.highcharts.JsonRendererFactory;
import com.googlecode.wickedcharts.wicket15.highcharts.features.drilldown.DrilldownProcessor;
import com.googlecode.wickedcharts.wicket15.highcharts.features.global.GlobalProcessor;

/**
 * This behavior takes in an {@link Options} object containing the configuration
 * of a chart and calls the proper javascript to display the chart in the
 * component to which this behavior is added.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class ChartBehavior extends Behavior {

	private static final long serialVersionUID = 1L;

	private final Chart chart;
	
	private static final Feature[] SUPPORTED_FEATURES = new Feature[] {

		Feature.DRILLDOWN,

		Feature.GLOBAL,

		};

	/**
	 * Constructor.
	 * 
	 * @param options
	 *            the options for the chart. The {@link Option} class is very
	 *            similar in structure to the Highcharts API reference, see
	 *            http://www.highcharts.com/ref/.
	 */
	public ChartBehavior(final Chart container) {
		this.chart = container;
	}

	private void addTheme(final IHeaderResponse response,
			final JsonRenderer renderer) {
		if (this.chart.getTheme() != null) {
			response.renderOnDomReadyJavaScript(MessageFormat.format(
					"Highcharts.setOptions({0});",
					renderer.toJson(this.chart.getTheme())));
		} else if (this.chart.getThemeUrl() != null) {
			response.renderJavaScriptReference(this.chart.getThemeUrl());
		} else if (this.chart.getThemeReference() != null) {
			response.renderJavaScriptReference(this.chart.getThemeReference());
		}
	}

	/**
	 * Includes the javascript that calls the Highcharts library to visualize
	 * the chart.
	 * 
	 * @param response
	 *            the Wicket HeaderResponse
	 * @param options
	 *            the options containing the data to display
	 * @param renderer
	 *            the JsonRenderer responsible for rendering the options
	 * @param markupId
	 *            the DOM ID of the chart component.
	 */
	protected void includeChartJavascript(final IHeaderResponse response,
			final Options options, final JsonRenderer renderer,
			final String markupId) {
		String chartVarname = markupId;
		String optionsVarname = markupId + "Options";
		response.renderOnDomReadyJavaScript(MessageFormat.format(
				"var {0} = {1};var {2} = new Highcharts.Chart({0});",
				optionsVarname, renderer.toJson(options), chartVarname));
	}

	private void includeJavascriptDependencies(final IHeaderResponse response,
			final Options options) {
		JavaScriptResourceRegistry.getInstance().getJQueryEntry()
				.addToHeaderResponse(response);
		JavaScriptResourceRegistry.getInstance().getHighchartsEntry()
				.addToHeaderResponse(response);
		if (OptionsUtil.needsExportingJs(options)) {
			JavaScriptResourceRegistry.getInstance()
					.getHighchartsExportingEntry()
					.addToHeaderResponse(response);
		}
		if (OptionsUtil.needsHighchartsMoreJs(options)) {
			JavaScriptResourceRegistry.getInstance().getHighchartsMoreEntry()
					.addToHeaderResponse(response);
		}
	}

	@Override
	public void renderHead(final Component component,
			final IHeaderResponse response) {

		component.setOutputMarkupId(true);
		Options options = this.chart.getOptions();
		final String id = component.getMarkupId();
		OptionsUtil.getInstance().setRenderTo(options, id);

		JsonRenderer renderer = JsonRendererFactory.getInstance()
				.getRenderer();
		includeJavascriptDependencies(response, options);
		addTheme(response, renderer);

		OptionsProcessorContext context = new OptionsProcessorContext(options);
		
		IOptionsProcessor featureProcessor = new FeatureCheckingOptionsProcessor(SUPPORTED_FEATURES);
		featureProcessor.processOptions(this.chart.getOptions(), context);

		DrilldownProcessor drilldownProcessor = new DrilldownProcessor(
				component, response);
		drilldownProcessor.processOptions(options, context);

		GlobalProcessor globalProcessor = new GlobalProcessor(
				response);
		globalProcessor.processOptions(options, context);

		includeChartJavascript(response, options, renderer, id);
	}

}
