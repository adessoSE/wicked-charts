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
package com.googlecode.wickedcharts.highcharts.options.livedata;

import java.text.MessageFormat;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.head.HeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.request.resource.JavaScriptResourceReference;

import com.googlecode.wickedcharts.highcharts.Chart;
import com.googlecode.wickedcharts.highcharts.options.series.Coordinate;

/**
 * This Behavior adds javascript functionality to a chart that allows live
 * updating of a {@link LiveDataSeries} via AJAX.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Wicket6LiveDataAjaxBehavior extends AbstractDefaultAjaxBehavior {

  private static final long serialVersionUID = 1L;

  private final LiveDataSeries series;

  private boolean firstRendering = true;

  public Wicket6LiveDataAjaxBehavior(LiveDataSeries series) {
    this.series = series;
  }

  @Override
  protected void respond(AjaxRequestTarget target) {
    final Coordinate<Number, Number> coordinates = series.update();
    String javaScript = "var chartVarName = " + ((Chart) getComponent()).getJavaScriptVarName() + ";\n";
    javaScript += "var seriesIndex = 0;\n";
    javaScript += "var x = " + coordinates.getX() + ";\n";
    javaScript += "var y = " + coordinates.getY() + ";\n";
    javaScript += "eval(chartVarName).series[seriesIndex].addPoint([x,y], true, true);\n";
    target.appendJavaScript(javaScript);
  }

  @Override
  public void renderHead(Component component, IHeaderResponse response) {
    super.renderHead(component, response);
    response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(LiveDataSeries.class,
        "livedata.js")));
    if (firstRendering) {
      response.render(getIntervalDeclarationHeaderItem());
      firstRendering = false;
    } else {
      response.render(getClearIntervalHeaderItem());
    }
  }

  private HeaderItem getClearIntervalHeaderItem() {
    String varName = getIntervalJavaScriptVarName();
    String javaScript = MessageFormat.format("if(!(typeof {0} === \"undefined\"))'{'\n" +
    		"clearInterval({0});\n" +
    		"'}'", varName);
    return OnDomReadyHeaderItem.forScript(javaScript);
  }

  private HeaderItem getIntervalDeclarationHeaderItem() {
    String varName = getIntervalJavaScriptVarName();
    String javaScript = MessageFormat.format("var {0};", varName);
    return JavaScriptHeaderItem.forScript(javaScript, varName + "-declaration");
  }

  protected String getIntervalJavaScriptVarName() {
    return getComponent().getMarkupId() + "SeriesInterval";
  }

  protected void reset() {
    firstRendering = true;
  }

  public LiveDataSeries getSeries() {
    return series;
  }

}
