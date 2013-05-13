package com.googlecode.wickedcharts.wicket14.highcharts.features.global;

import org.apache.wicket.markup.html.IHeaderResponse;

import com.googlecode.wickedcharts.highcharts.jackson.JsonRenderer;
import com.googlecode.wickedcharts.highcharts.options.Global;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.processing.IOptionsProcessor;
import com.googlecode.wickedcharts.highcharts.options.processing.OptionsProcessorContext;
import com.googlecode.wickedcharts.wicket14.highcharts.JsonRendererFactory;

public class GlobalProcessor implements IOptionsProcessor {
	private IHeaderResponse response;

	public GlobalProcessor(IHeaderResponse response) {
		this.response = response;
	}

	@Override
	public void processOptions(Options options, OptionsProcessorContext context) {
		Global global = context.getGlobal();
		if (global != null) {
			JsonRenderer renderer = JsonRendererFactory.getInstance()
					.getRenderer();
			String globalJson = renderer.toJson(global);
			response.renderJavascript("Highcharts.setOptions({global: "
					+ globalJson + "});", "highcharts-global");
		}
	}
}
