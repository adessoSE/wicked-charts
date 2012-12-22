package com.googlecode.wickedcharts.showcase.options;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.DataLabels;
import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.Legend;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.series.CoordinatesSeries;
import com.googlecode.wickedcharts.showcase.options.base.ShowcaseOptions;

public class ColumnRangeOptions extends ShowcaseOptions {

  public ColumnRangeOptions() {

    setChartOptions(new ChartOptions()
        .setType(SeriesType.COLUMNRANGE)
        .setInverted(Boolean.TRUE));

    setTitle(new Title("Temperature variation by month"));

    setSubtitle(new Title("Observed in Vik i Sogn, Norway, 2009"));

    setxAxis(new Axis()
        .setCategories(
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "Jul",
            "Aug",
            "Sep",
            "Oct",
            "Nov",
            "Dec"));

    setyAxis(new Axis()
        .setTitle(new Title("Temperature (°C)")));

    setTooltip(new Tooltip()
        .setValueSuffix("°C"));

    setPlotOptions(new PlotOptionsChoice()
        .setColumnrange(new PlotOptions()
            .setDataLabels(new DataLabels()
                .setEnabled(Boolean.TRUE)
                .setFormatter(new Function("return this.y + '°C';"))
                .setY(0))));

    setLegend(new Legend(Boolean.FALSE));

    addSeries(new CoordinatesSeries()
        .addPoint(-9.7, 9.4)
        .addPoint(-8.7, 6.5)
        .addPoint(-3.5, 9.4)
        .addPoint(-1.4, 19.9)
        .addPoint(0.0, 22.6)
        .addPoint(2.9, 29.5)
        .addPoint(9.2, 30.7)
        .addPoint(7.3, 26.5)
        .addPoint(4.4, 18.0)
        .addPoint(-3.1, 11.4)
        .addPoint(-5.2, 10.4)
        .addPoint(-13.5, 9.8));

  }

  @Override
  public String getLabel() {
    return "Column range";
  }

}
