package com.googlecode.wickedcharts.wicket14.highcharts.features.drilldown;

import java.text.MessageFormat;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

import com.googlecode.wickedcharts.highcharts.jackson.JsonRenderer;
import com.googlecode.wickedcharts.highcharts.options.Events;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.PointOptions;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.drilldown.DrilldownFunction;
import com.googlecode.wickedcharts.highcharts.options.processing.IOptionsProcessor;
import com.googlecode.wickedcharts.highcharts.options.processing.OptionsProcessorContext;
import com.googlecode.wickedcharts.highcharts.options.util.OptionsUtil;
import com.googlecode.wickedcharts.wicket14.highcharts.JsonRendererFactory;

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
		response.renderJavascript(
				MessageFormat.format("var {0};", JS_DRILLDOWN_ARRAY_NAME),
				JS_DRILLDOWN_ARRAY_NAME + "-init");
		response.renderOnDomReadyJavascript(MessageFormat.format("{0} = {1};",
				getDrilldownArrayName(component),
				renderer.toJson(context.getDrilldownOptions())));
	}

	/**
	 * Resolves the needed javascript dependencies.
	 */
	private void addJavascriptDependencies(IHeaderResponse headerResponse) {
		headerResponse
				.renderJavascriptReference(new JavascriptResourceReference(
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
