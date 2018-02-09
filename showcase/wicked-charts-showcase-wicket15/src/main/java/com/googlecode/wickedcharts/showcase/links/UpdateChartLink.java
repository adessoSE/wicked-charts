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
package com.googlecode.wickedcharts.showcase.links;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.basic.Label;

import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.showcase.ShowcaseSession;
import com.googlecode.wickedcharts.showcase.StringFromResourceModel;
import com.googlecode.wickedcharts.wicket15.highcharts.Chart;

public class UpdateChartLink extends AjaxLink<Void> {

  private static final long serialVersionUID = 1L;

  private final Chart chart;

  private final Options options;

  private final Label codeContainer;

  /**
   * Constructs a new Link.
   * 
   * @param id
   *          the wicket id of the link
   * @param chart
   *          the container containing the chart
   * @param codeContainer
   *          the container containing the code display of the chart's options
   * @param options
   *          the options of the chart.
   */
  public UpdateChartLink(final String id, final Chart chart,
      final Label codeContainer, final Options options) {
    super(id);
    this.chart = chart;
    this.codeContainer = codeContainer;
    this.options = options;
  }

  public Chart getChartContainer() {
    return this.chart;
  }

  public Label getCodeContainer() {
    return this.codeContainer;
  }

  public Options getOptions() {
    return this.options;
  }

  @Override
  public void onClick(final AjaxRequestTarget target) {
    this.chart
        .setOptions(this.options);
    ((ShowcaseSession) getSession())
        .setCurrentChartOptions(this.options);
    this.codeContainer
        .setDefaultModel(new StringFromResourceModel(this.options
            .getClass(), this.options
            .getClass()
            .getSimpleName() + ".java"));
    target
        .add(this.chart);
    target
        .add(this.codeContainer);

    // make syntaxhighlighter highlight the changed code
    target
        .appendJavaScript("SyntaxHighlighter.highlight();");
  }

}
