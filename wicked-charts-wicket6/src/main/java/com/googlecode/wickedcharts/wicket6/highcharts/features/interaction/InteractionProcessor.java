package com.googlecode.wickedcharts.wicket6.highcharts.features.interaction;

import java.io.Serializable;
import java.util.List;

import org.apache.wicket.ajax.AjaxRequestTarget;

import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.interaction.InteractionEvent;
import com.googlecode.wickedcharts.highcharts.options.interaction.InteractionFunction;
import com.googlecode.wickedcharts.highcharts.options.processing.IOptionsProcessor;
import com.googlecode.wickedcharts.highcharts.options.processing.IdGeneratorProcessor;
import com.googlecode.wickedcharts.highcharts.options.processing.OptionsProcessorContext;
import com.googlecode.wickedcharts.wicket6.highcharts.Chart;

/**
 * {@link IOptionsProcessor} enabling the Client/Server Interaction for Wicket
 * 6.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class InteractionProcessor implements IOptionsProcessor, Serializable {

	private final Chart chart;

	public InteractionProcessor(Chart chart) {
		this.chart = chart;
	}

	@Override
	public void processOptions(Options options, OptionsProcessorContext context) {

		// assign IDs to all Series and Points
		IOptionsProcessor idProcessor = new IdGeneratorProcessor();
		idProcessor.processOptions(options, context);

		List<InteractionFunction> functions = context.getInteractionFunctions();
		for (final InteractionFunction function : functions) {

			// add server side AJAX event
			InteractionBehavior interactionBehavior = new InteractionBehavior() {
				@Override
				public void onEvent(InteractionEvent event, AjaxRequestTarget target) {
					WicketInteractionEvent wicketEvent = new WicketInteractionEvent(target, event);
					function.onInteraction(wicketEvent);
				}
			};
			chart.add(interactionBehavior);

			// add client side javascript to trigger an AJAX call
			String functionBody = "var selectedSeries = WickedCharts.Interaction.getSelectedSeries(this);\n";
			functionBody += "var selectedPoint = WickedCharts.Interaction.getSelectedPoint(this);\n";
			functionBody += interactionBehavior.getCallbackScript();
			function.setFunction(functionBody);
		}
	}

}
