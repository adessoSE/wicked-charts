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
package de.adesso.wickedcharts.wicket15.highcharts.features.drilldown;

import java.text.MessageFormat;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.request.resource.JavaScriptResourceReference;

import de.adesso.wickedcharts.highcharts.jackson.JsonRenderer;
import de.adesso.wickedcharts.highcharts.options.Events;
import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.highcharts.options.PlotOptions;
import de.adesso.wickedcharts.highcharts.options.PlotOptionsChoice;
import de.adesso.wickedcharts.highcharts.options.PointOptions;
import de.adesso.wickedcharts.highcharts.options.SeriesType;
import de.adesso.wickedcharts.highcharts.options.drilldown.DrilldownFunction;
import de.adesso.wickedcharts.highcharts.options.drilldown.DrilldownPoint;
import de.adesso.wickedcharts.highcharts.options.processing.IOptionsProcessor;
import de.adesso.wickedcharts.highcharts.options.processing.OptionsProcessorContext;
import de.adesso.wickedcharts.highcharts.options.series.Point;
import de.adesso.wickedcharts.highcharts.options.util.OptionsUtil;
import de.adesso.wickedcharts.wicket15.highcharts.JsonRendererFactory;

/**
 * This processor adds drilldown functionality to a chart. It searches the given
 * options for {@link Point.drilldownOptions}. If any drilldown options are
 * found, they are serialized in a special global javascript variable. This
 * variable is referenced in a javascript function that is inserted at
 * {@link PlotOptions.point.events.click}.
 * <p/>
 * This class is not part of the public API! Use {@link DrilldownPoint}s to
 * enable drilldown in your charts.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class DrilldownProcessor implements IOptionsProcessor {

	/**
	 * Name of the javascript array containing all drilldown options.
	 */
	private static final String JS_DRILLDOWN_ARRAY_NAME = "drilldownOptions";

	private final Component component;

	private final IHeaderResponse response;

	public DrilldownProcessor(Component component,
			IHeaderResponse response) {
		this.component = component;
		this.response = response;
	}

	@Override
	public void processOptions(Options options, OptionsProcessorContext context) {
		if (!context.getDrilldownOptions().isEmpty()) {
			modifyDrilldownOptions(options, context);
			addDrilldownOptionsArray(context);
			addJavascriptDependencies(response);
		}
	}

	private void modifyDrilldownOptions(Options options,
			OptionsProcessorContext context) {
		for (Options drilldownOptions : context.getDrilldownOptions()) {
			OptionsUtil.getInstance().copyRenderTo(options, drilldownOptions);
			addDrilldownFunction(drilldownOptions, context);
		}
	}

	/**
	 * Adds the drilldown options stored in the context to a javascript array.
	 */
	private void addDrilldownOptionsArray(OptionsProcessorContext context) {
		JsonRenderer renderer = JsonRendererFactory.getInstance()
				.getRenderer();
		response.renderJavaScript(
				MessageFormat.format("var {0};", JS_DRILLDOWN_ARRAY_NAME),
				JS_DRILLDOWN_ARRAY_NAME + "-init");
		response.renderOnDomReadyJavaScript(MessageFormat.format("{0} = {1};",
				getDrilldownArrayName(component),
				renderer.toJson(context.getDrilldownOptions())));
	}

	/**
	 * Resolves the needed javascript dependencies.
	 */
	private void addJavascriptDependencies(IHeaderResponse headerResponse) {
		headerResponse
				.renderJavaScriptReference(new JavaScriptResourceReference(
						DrilldownFunction.class, "drilldown.js"));
	}

	/**
	 * Adds a {@link DrilldownFunction} to the {@link PlotOptions} of the given
	 * {@link Options}.
	 * 
	 * @param options
	 *            the {@link Options} to add a {@link DrilldownFunction} to
	 */
	private void addDrilldownFunction(Options options,
			OptionsProcessorContext context) {
		SeriesType chartType = options.getChartOptions().getType();
		if (options.getPlotOptions() == null) {
			options.setPlotOptions(new PlotOptionsChoice());
		}
		if (options.getPlotOptions().getPlotOptions(chartType) == null) {
			options.getPlotOptions().setPlotOptions(new PlotOptions(),
					chartType);
		}
		if (options.getPlotOptions().getPlotOptions(chartType).getPoint() == null) {
			options.getPlotOptions().getPlotOptions(chartType)
					.setPoint(new PointOptions());
		}
		if (options.getPlotOptions().getPlotOptions(chartType).getPoint()
				.getEvents() == null) {
			options.getPlotOptions().getPlotOptions(chartType).getPoint()
					.setEvents(new Events());
		}
		options.getPlotOptions()
				.getPlotOptions(chartType)
				.getPoint()
				.getEvents()
				.setClick(
						new DrilldownFunction(getDrilldownArrayName(component)));
	}

	private String getDrilldownArrayName(Component component) {
		return component.getMarkupId() + "_" + JS_DRILLDOWN_ARRAY_NAME;
	}
}
