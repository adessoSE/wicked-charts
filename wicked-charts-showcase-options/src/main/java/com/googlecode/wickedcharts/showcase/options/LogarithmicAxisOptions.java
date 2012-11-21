package com.googlecode.wickedcharts.showcase.options;

import java.util.Arrays;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.AxisType;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.MinorTickInterval;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.series.Series;
import com.googlecode.wickedcharts.highcharts.options.series.SimpleSeries;

/**
 * Demo of the same line chart with logarithmic axis displayed in the Highcharts
 * Demo at <a href=
 * "http://highcharts.com/demo/line-log-axis">http://highcharts.
 * com/demo/line-log-axis</a>.
 * 
 * @author Matthias Balke <matthias.balke@gmail.com>
 * 
 */
public class LogarithmicAxisOptions extends Options {

  private static final long serialVersionUID = 1L;

  public LogarithmicAxisOptions() {
    ChartOptions chartOptions = new ChartOptions();
    this
        .setChartOptions(chartOptions);

    Title title = new Title("Logarithmic Axis Demo");
    this
        .setTitle(title);

    Axis xAxis = new Axis();
    xAxis
        .setTickInterval(1f);
    this
        .setxAxis(xAxis);

    Axis yAxis = new Axis();
    yAxis
        .setTitle(new Title("Y-Values"));
    yAxis
        .setType(AxisType.LOGARITHMIC);

    MinorTickInterval minorTickInterval = new MinorTickInterval();
    yAxis
        .setMinorTickInterval(minorTickInterval
            .setInterval(0.1));
    this
        .setyAxis(yAxis);

    Tooltip tooltip = new Tooltip();
    tooltip
        .setHeaderFormat("<b>{series.name}</b><br>");
    tooltip
        .setPointFormat("x = {point.x}, y = {point.y}");

    this
        .setTooltip(tooltip);

    Series<Number> series1 = new SimpleSeries();
    series1
        .setData(Arrays
            .asList(new Number[] { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512 }));
    series1
        .setPointStart(1);
    addSeries(series1);

  }

}
