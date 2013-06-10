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
