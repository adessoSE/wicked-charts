/**
 *   Copyright 2012-2018 Wicked Charts (http://github.com/adessoAG/wicked-charts)
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
package de.adesso.wickedcharts.wicket15.highcharts.features.global;

import de.adesso.wickedcharts.highcharts.jackson.JsonRenderer;
import de.adesso.wickedcharts.highcharts.options.Global;
import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.highcharts.options.processing.IOptionsProcessor;
import de.adesso.wickedcharts.highcharts.options.processing.OptionsProcessorContext;
import de.adesso.wickedcharts.wicket15.highcharts.JsonRendererFactory;
import org.apache.wicket.markup.html.IHeaderResponse;

/**
 * This processor reads the global options from an {@link Options} object and
 * calls Highcharts' setOptions function to use the options globally for all
 * charts.
 *
 * If more than one chart with global options are on a single page, the global
 * options of the last chart override all others!
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
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
			response.renderJavaScript("Highcharts.setOptions({global: "
					+ globalJson + "});", "highcharts-global");
		}
	}

}
