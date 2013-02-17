package com.googlecode.wickedcharts.showcase.options;

import com.googlecode.wickedcharts.highcharts.options.*;
import com.googlecode.wickedcharts.highcharts.options.series.CoordinatesSeries;
import com.googlecode.wickedcharts.highcharts.options.series.SimpleSeries;
import com.googlecode.wickedcharts.showcase.options.base.ShowcaseOptions;

public class ScatterWithRegressionLineOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public ScatterWithRegressionLineOptions() {

    this.setChartOptions(new ChartOptions());

    this.setxAxis(new Axis()
        .setMin(-0.5)
        .setMax(5.5));

    this.setyAxis(new Axis()
        .setMin(0));

    this.setTitle(new Title("Scatter plot with regression line"));

    this.addSeries(new CoordinatesSeries()
        .addPoint(0, 1.11)
        .addPoint(5, 4.51)
        .setName("Regression Line")
        .setType(SeriesType.LINE)
        .setMarker(new Marker(Boolean.TRUE))
        .setStates(new StatesChoice().setHover(new State()
            .setLineWidth(0))));

    this.addSeries(new SimpleSeries()
        .setType(SeriesType.SCATTER)
        .setName("Observations")
        .addPoint(1)
        .addPoint(1.5)
        .addPoint(2.8)
        .addPoint(3.5)
        .addPoint(3.9)
        .addPoint(4.2)
        .setMarker(new Marker().setRadius(4)));

  }

  @Override
  public String getLabel() {
    return "Scatter with regression line";
  }

}
