/**
 *   Copyright 2012 Wicked Charts (http://wicked-charts.googlecode.com)
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
package com.googlecode.wickedcharts.wicket6.highcharts.features.global;

import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;

import com.googlecode.wickedcharts.highcharts.jackson.JsonRenderer;
import com.googlecode.wickedcharts.highcharts.options.Global;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.processing.IOptionsProcessor;
import com.googlecode.wickedcharts.highcharts.options.processing.OptionsProcessorContext;
import com.googlecode.wickedcharts.wicket6.highcharts.Wicket6JsonRendererFactory;

/**
 * This processor reads the global options from an {@link Options} object and
 * calls Highcharts' setOptions function to use the options globally for all
 * charts.
 * <p/>
 * If more than one chart with global options are on a single page, the global
 * options of the last chart override all others!
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Wicket6GlobalProcessor implements IOptionsProcessor {

  private IHeaderResponse response;

  public Wicket6GlobalProcessor(IHeaderResponse response) {
    this.response = response;
  }

  @Override
  public void processOptions(Options options, OptionsProcessorContext context) {
    Global global = context.getGlobal();
    if (global != null) {
      JsonRenderer renderer = Wicket6JsonRendererFactory.getInstance().getRenderer();
      String globalJson = renderer.toJson(global);
      response.render(JavaScriptHeaderItem.forScript("Highcharts.setOptions({global: " + globalJson + "});",
          "highcharts-global"));
    }
  }

}
