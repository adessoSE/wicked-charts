package com.googlecode.wickedcharts.highcharts.options.util;

import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.Events;
import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.Options;

public class OptionsUtil {

  private static OptionsUtil INSTANCE = new OptionsUtil();

  public static OptionsUtil getInstance() {
    return INSTANCE;
  }

  private OptionsUtil() {

  }

  /**
   * Copies the renderTo configuration from one {@link Options} object to
   * another. Null-safe.
   */
  public void copyRenderTo(Options from, Options to) {
    if (to.getChartOptions() == null) {
      to.setChartOptions(new ChartOptions());
    }
    to.getChartOptions().setRenderTo(from.getChartOptions().getRenderTo());
  }

  /**
   * Null-safe setter for the renderTo configuration.
   */
  public void setRenderTo(Options options, String renderTo) {
    if (options.getChartOptions() == null) {
      options.setChartOptions(new ChartOptions());
    }
    options.getChartOptions().setRenderTo(renderTo);
  }

  /**
   * Null-safe setter for the chart.events.load configuration.
   */
  public void setChartEventsLoad(Options options, Function function) {
    if (options.getChartOptions().getEvents() == null) {
      options.getChartOptions().setEvents(new Events());
    }
    if (options.getChartOptions().getEvents().getLoad() == null) {
      options.getChartOptions().getEvents().setLoad(function);
    }
  }

}
