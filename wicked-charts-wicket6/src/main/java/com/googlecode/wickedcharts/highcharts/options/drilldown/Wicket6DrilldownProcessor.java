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
package com.googlecode.wickedcharts.highcharts.options.drilldown;

import java.text.MessageFormat;
import java.util.List;

import org.apache.wicket.Component;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.request.resource.JavaScriptResourceReference;

import com.googlecode.wickedcharts.highcharts.jackson.JsonRenderer;
import com.googlecode.wickedcharts.highcharts.options.Events;
import com.googlecode.wickedcharts.highcharts.options.IProcessableOption;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.PointOptions;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.processing.IOptionsProcessor;
import com.googlecode.wickedcharts.highcharts.options.processing.OptionsProcessorContext;
import com.googlecode.wickedcharts.highcharts.options.series.Point;
import com.googlecode.wickedcharts.highcharts.options.util.OptionsUtil;
import com.googlecode.wickedcharts.highcharts.Wicket6JsonRendererFactory;

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
public class Wicket6DrilldownProcessor implements IOptionsProcessor {

  /**
   * Name of the javascript array containing all drilldown options.
   */
  private static final String JS_DRILLDOWN_ARRAY_NAME = "drilldownOptions";

  private final Component component;

  private final IHeaderResponse response;

  public Wicket6DrilldownProcessor(Component component, IHeaderResponse response) {
    this.component = component;
    this.response = response;
  }

  @Override
  public void processOptions(Options options, OptionsProcessorContext context) {
    if (!getDrilldownPoints(options).isEmpty()) {
      collectDrilldownOptions(options, context);
      modifyDrilldownOptions(options, context);
      addDrilldownOptionsArray(context);
      addJavascriptDependencies(response);
    }
  }

  /**
   * Gets all the {@link DrilldownPoint}s in the given {@link Options} object.
   * 
   * @param options
   *          the options to search
   * @return list of {@link DrilldownPoint} contained in the {@link Options}
   *         object.
   */
  private List<IProcessableOption> getDrilldownPoints(Options options) {
    return options.getMarkedForProcessing(DrilldownPoint.PROCESSING_KEY);
  }

  private void modifyDrilldownOptions(Options options, OptionsProcessorContext context) {
    for (Options drilldownOptions : context.getDrilldownOptions()) {
      OptionsUtil.getInstance().copyRenderTo(options, drilldownOptions);
      addDrilldownFunction(drilldownOptions, context);
    }
  }

  /**
   * Iterates recursively through all {@link DrilldownPoint}s and their
   * drilldownOptions in the given {@link Options} and adds them to the context.
   */
  @SuppressWarnings("unchecked")
  private void collectDrilldownOptions(Options options, OptionsProcessorContext context) {
    List<? extends IProcessableOption> drilldownPoints = getDrilldownPoints(options);
    for (DrilldownPoint drilldownPoint : (List<DrilldownPoint>) drilldownPoints) {
      Options drilldownOptions = drilldownPoint.getDrilldownOptions();
      if (!context.getDrilldownOptions().contains(drilldownOptions)) {
        context.getDrilldownOptions().add(drilldownOptions);
        collectDrilldownOptions(drilldownOptions, context);
      }
      drilldownPoint.setDrilldownOptionsIndex(context.getDrilldownOptions().indexOf(drilldownOptions));
    }
  }

  /**
   * Adds the drilldown options stored in the context to a javascript array.
   */
  private void addDrilldownOptionsArray(OptionsProcessorContext context) {
    JsonRenderer renderer = Wicket6JsonRendererFactory.getInstance().getRenderer();
    response.render(JavaScriptHeaderItem.forScript(
        MessageFormat.format("var {0};\n var {1};", JS_DRILLDOWN_ARRAY_NAME, getDrilldownArrayName(component)),
        JS_DRILLDOWN_ARRAY_NAME + "-init"));
    response.render(OnDomReadyHeaderItem.forScript(MessageFormat.format("{0} = {1};", getDrilldownArrayName(component),
        renderer.toJson(context.getDrilldownOptions()))));
  }

  /**
   * Resolves the needed javascript dependencies.
   */
  private void addJavascriptDependencies(IHeaderResponse headerResponse) {
    headerResponse.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(DrilldownFunction.class,
        "drilldown.js")));
  }

  /**
   * Adds a {@link DrilldownFunction} to the {@link PlotOptions} of the given
   * {@link Options}.
   * 
   * @param options
   *          the {@link Options} to add a {@link DrilldownFunction} to
   */
  private void addDrilldownFunction(Options options, OptionsProcessorContext context) {
    SeriesType chartType = options.getChartOptions().getType();
    if (options.getPlotOptions() == null) {
      options.setPlotOptions(new PlotOptionsChoice());
    }
    if (options.getPlotOptions().getPlotOptions(chartType) == null) {
      options.getPlotOptions().setPlotOptions(new PlotOptions(), chartType);
    }
    if (options.getPlotOptions().getPlotOptions(chartType).getPoint() == null) {
      options.getPlotOptions().getPlotOptions(chartType).setPoint(new PointOptions());
    }
    if (options.getPlotOptions().getPlotOptions(chartType).getPoint().getEvents() == null) {
      options.getPlotOptions().getPlotOptions(chartType).getPoint().setEvents(new Events());
    }
    options.getPlotOptions().getPlotOptions(chartType).getPoint().getEvents()
        .setClick(new DrilldownFunction(getDrilldownArrayName(component)));
  }

  private String getDrilldownArrayName(Component component) {
    return component.getMarkupId() + "_" + JS_DRILLDOWN_ARRAY_NAME;
  }
}
