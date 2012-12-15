package com.googlecode.wickedcharts.highcharts.options.global;

import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;

import com.googlecode.wickedcharts.highcharts.Wicket6JsonRendererFactory;
import com.googlecode.wickedcharts.highcharts.jackson.JsonRenderer;
import com.googlecode.wickedcharts.highcharts.options.Global;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.processing.IOptionsProcessor;
import com.googlecode.wickedcharts.highcharts.options.processing.OptionsProcessorContext;

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
