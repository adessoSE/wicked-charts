package com.googlecode.wickedcharts.showcase.options;

import java.util.Arrays;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.Labels;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.Pane;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.PointPlacement;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.series.SimpleSeries;

/**
 * Demo of the same polar chart displayed in the Highcharts Demo at <a href=
 * "http://www.highcharts.com/demo/polar"
 * >http://www.highcharts.com/demo/polar</a>.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class PolarOptions extends Options {

  private static final long serialVersionUID = 1L;

  public PolarOptions() {
    ChartOptions chartOptions = new ChartOptions()
        .setPolar(Boolean.TRUE);
    setChartOptions(chartOptions);

    setTitle(new Title("Highcharts Polar Chart"));

    setPane(new Pane()
        .setStartAngle(0)
        .setEndAngle(360));

    setxAxis(new Axis()
        .setTickInterval(45f)
        .setMin(0)
        .setMax(360)
        .setLabels(new Labels().setFormatter(new Function())));

    setyAxis(new Axis()
        .setMin(0));

    setPlotOptions(new PlotOptionsChoice()
        .setSeries(new PlotOptions()
            .setPointStart(0l)
            .setPointInterval(45))
        .setColumn(new PlotOptions()
            .setPointPadding(0f)
            .setGroupPadding(0f)));

    addSeries(new SimpleSeries()
        .setData(Arrays.asList(new Number[] { 8, 7, 6, 5, 4, 3, 2, 1 }))
        .setType(SeriesType.COLUMN)
        .setName("Column")
        .setPointPlacement(PointPlacement.BETWEEN));

    addSeries(new SimpleSeries()
        .setData(Arrays.asList(new Number[] { 1, 2, 3, 4, 5, 6, 7, 8 }))
        .setType(SeriesType.LINE)
        .setName("Line"));

    addSeries(new SimpleSeries()
        .setData(Arrays.asList(new Number[] { 1, 8, 2, 7, 3, 6, 4, 5 }))
        .setType(SeriesType.AREA)
        .setName("Area"));

  }
}
