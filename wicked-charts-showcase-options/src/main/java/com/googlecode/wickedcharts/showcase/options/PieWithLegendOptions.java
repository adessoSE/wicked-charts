package com.googlecode.wickedcharts.showcase.options;

import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.Cursor;
import com.googlecode.wickedcharts.highcharts.options.DataLabels;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.color.NullColor;
import com.googlecode.wickedcharts.highcharts.options.series.Point;
import com.googlecode.wickedcharts.highcharts.options.series.PointSeries;

public class PieWithLegendOptions extends Options {

  private static final long serialVersionUID = 1L;

  public PieWithLegendOptions() {

    setChartOptions(new ChartOptions()
        .setPlotBackgroundColor(new NullColor())
        .setPlotBorderWidth(null)
        .setPlotShadow(Boolean.FALSE));

    setTitle(new Title("Browser market shares at a specific website, 2010"));

    setTooltip(new Tooltip()
        .setPointFormat("{series.name}: <b>{point.percentage}%</b>")
        .setPercentageDecimals(1));

    setPlotOptions(new PlotOptionsChoice()
        .setPie(new PlotOptions()
            .setAllowPointSelect(Boolean.TRUE)
            .setCursor(Cursor.POINTER)
            .setDataLabels(new DataLabels()
                .setEnabled(Boolean.TRUE))
            .setShowInLegend(Boolean.TRUE)));

    addSeries(new PointSeries()
        .setType(SeriesType.PIE)
        .setName("Browser share")
        .addPoint(new Point("Firefox", 45.0))
        .addPoint(new Point("IE", 26.8))
        .addPoint(new Point("Chrome", 12.8)
            .setSliced(Boolean.TRUE)
            .setSelected(Boolean.TRUE))
        .addPoint(new Point("Safari", 8.5))
        .addPoint(new Point("Opera", 6.2))
        .addPoint(new Point("Others", 0.7)));

  }
}
