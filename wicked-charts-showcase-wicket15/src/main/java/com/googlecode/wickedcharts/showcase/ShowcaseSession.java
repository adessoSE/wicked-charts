package com.googlecode.wickedcharts.showcase;

import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.request.Request;

import com.googlecode.wickedcharts.highcharts.options.Options;

public class ShowcaseSession extends WebSession {

  private static final long serialVersionUID = 1L;

  private Options currentChartOptions;

  public ShowcaseSession(final Request request) {
    super(request);
  }

  public Options getCurrentChartOptions() {
    return this.currentChartOptions;
  }

  public void setCurrentChartOptions(final Options currentChartOptions) {
    this.currentChartOptions = currentChartOptions;
  }

}
