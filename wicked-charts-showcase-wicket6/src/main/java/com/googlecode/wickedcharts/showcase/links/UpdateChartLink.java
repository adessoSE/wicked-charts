package com.googlecode.wickedcharts.showcase.links;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.basic.Label;

import com.googlecode.wickedcharts.highcharts.Chart;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.showcase.ShowcaseSession;
import com.googlecode.wickedcharts.showcase.StringFromResourceModel;

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
