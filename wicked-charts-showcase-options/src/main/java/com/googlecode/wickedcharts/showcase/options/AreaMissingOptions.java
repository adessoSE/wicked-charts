package com.googlecode.wickedcharts.showcase.options;

import java.util.Arrays;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.CreditOptions;
import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.HorizontalAlignment;
import com.googlecode.wickedcharts.highcharts.options.Labels;
import com.googlecode.wickedcharts.highcharts.options.Legend;
import com.googlecode.wickedcharts.highcharts.options.LegendLayout;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.VerticalAlignment;
import com.googlecode.wickedcharts.highcharts.options.color.HexColor;
import com.googlecode.wickedcharts.highcharts.options.series.SimpleSeries;

public class AreaMissingOptions extends Options {

  private static final long serialVersionUID = 1L;

  public AreaMissingOptions() {

    setChartOptions(new ChartOptions()
        .setType(SeriesType.AREA)
        .setSpacingBottom(30));

    setTitle(new Title("Fruit consumption *"));

    setSubtitle(new Title()
        .setText("* Jane's banana consumption is unknown")
        .setFloating(Boolean.TRUE)
        .setAlign(HorizontalAlignment.RIGHT)
        .setVerticalAlign(VerticalAlignment.BOTTOM)
        .setY(15));

    setLegend(new Legend()
        .setLayout(LegendLayout.VERTICAL)
        .setAlign(HorizontalAlignment.LEFT)
        .setVerticalAlign(VerticalAlignment.TOP)
        .setX(150)
        .setY(100)
        .setFloating(Boolean.TRUE)
        .setBorderWidth(1)
        .setBackgroundColor(new HexColor("#ffffff")));

    setxAxis(new Axis()
        .setCategories(Arrays
            .asList(new String[] { "Apples", "Pears", "Oranges", "Bananas",
                "Grapes", "Plums", "Strawberries", "Raspberries" })));

    setyAxis(new Axis()
        .setTitle(new Title("Y-Axis"))
        .setLabels(new Labels().setFormatter(new Function()
            .setFunction("return this.value;"))));

    setTooltip(new Tooltip()
        .setFormatter(new Function()
            .setFunction("return '<b>'+ this.series.name +'</b><br/>'+this.x +': '+ this.y;")));

    setPlotOptions(new PlotOptionsChoice()
        .setArea(new PlotOptions()
            .setFillOpacity(0.5f)));

    setCredits(new CreditOptions()
        .setEnabled(Boolean.FALSE));

    addSeries(new SimpleSeries()
        .setName("John")
        .setData(Arrays.asList(new Number[] { 0, 1, 4, 4, 5, 2, 3, 7 })));
    addSeries(new SimpleSeries()
        .setName("Jane")
        .setData(Arrays.asList(new Number[] { 1, 0, 3, null, 3, 1, 2, 1 })));

  }
}
