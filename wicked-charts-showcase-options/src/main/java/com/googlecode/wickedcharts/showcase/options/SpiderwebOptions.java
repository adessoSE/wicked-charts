package com.googlecode.wickedcharts.showcase.options;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.GridlineInterpolation;
import com.googlecode.wickedcharts.highcharts.options.HorizontalAlignment;
import com.googlecode.wickedcharts.highcharts.options.Legend;
import com.googlecode.wickedcharts.highcharts.options.LegendLayout;
import com.googlecode.wickedcharts.highcharts.options.Pane;
import com.googlecode.wickedcharts.highcharts.options.PixelOrPercent;
import com.googlecode.wickedcharts.highcharts.options.PixelOrPercent.Unit;
import com.googlecode.wickedcharts.highcharts.options.PointPlacement;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.TickmarkPlacement;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.VerticalAlignment;
import com.googlecode.wickedcharts.highcharts.options.series.SimpleSeries;
import com.googlecode.wickedcharts.showcase.options.base.ShowcaseOptions;

public class SpiderwebOptions extends ShowcaseOptions {

  public SpiderwebOptions() {

    setChartOptions(new ChartOptions()
        .setPolar(Boolean.TRUE)
        .setType(SeriesType.LINE));

    setTitle(new Title("Budget vs spending")
        .setX(-80));

    setPane(new Pane()
        .setSize(new PixelOrPercent(80, Unit.PERCENT)));

    setxAxis(new Axis()
        .setCategories(
            "Sales",
            "Marketing",
            "Development",
            "Customer Support",
            "Information Technology",
            "Administration")
        .setTickmarkPlacement(TickmarkPlacement.ON)
        .setLineWidth(0));

    setyAxis(new Axis()
        .setGridLineInterpolation(GridlineInterpolation.POLYGON)
        .setLineWidth(0)
        .setMin(0));

    setTooltip(new Tooltip()
        .setShared(Boolean.TRUE)
        .setValuePrefix("$"));

    setLegend(new Legend()
        .setAlign(HorizontalAlignment.RIGHT)
        .setVerticalAlign(VerticalAlignment.TOP)
        .setLayout(LegendLayout.VERTICAL));

    addSeries(new SimpleSeries()
        .setName("Allocated Budget")
        .setData(43000, 19000, 60000, 35000, 17000, 10000)
        .setPointPlacement(PointPlacement.ON));

    addSeries(new SimpleSeries()
        .setName("Actual Spending")
        .setData(50000, 39000, 42000, 31000, 26000, 14000)
        .setPointPlacement(PointPlacement.ON));

  }

  @Override
  public String getLabel() {
    return "Spiderweb";
  }

}
