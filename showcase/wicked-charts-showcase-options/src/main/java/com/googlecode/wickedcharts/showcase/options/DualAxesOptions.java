package com.googlecode.wickedcharts.showcase.options;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.CssStyle;
import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.HorizontalAlignment;
import com.googlecode.wickedcharts.highcharts.options.Labels;
import com.googlecode.wickedcharts.highcharts.options.Legend;
import com.googlecode.wickedcharts.highcharts.options.LegendLayout;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.VerticalAlignment;
import com.googlecode.wickedcharts.highcharts.options.ZoomType;
import com.googlecode.wickedcharts.highcharts.options.color.HexColor;
import com.googlecode.wickedcharts.highcharts.options.series.SimpleSeries;
import com.googlecode.wickedcharts.showcase.options.base.ShowcaseOptions;

public class DualAxesOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public DualAxesOptions() {

    this.setChartOptions(new ChartOptions()
        .setZoomType(ZoomType.XY));

    this.setTitle(new Title("Average Monthly Temperature and Rainfall in Tokyo"));

    this.setSubtitle(new Title("Source: WorldClimate.com"));

    this.setxAxis(new Axis()
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

    this.addyAxis(new Axis()
        .setLabels(new Labels()
            .setFormatter(new Function("return this.value + '°C';"))
            .setStyle(new CssStyle().setProperty("color", "#89A54E")))
        .setTitle(new Title("Temperature").setStyle(new CssStyle()
            .setProperty("color", "#89A54E"))));

    this.addyAxis(new Axis()
        .setLabels(new Labels()
            .setFormatter(new Function("return this.value + ' mm';"))
            .setStyle(new CssStyle().setProperty("color", "#4572A7")))
        .setTitle(new Title("Rainfall").setStyle(new CssStyle()
            .setProperty("color", "#4572A7")))
        .setOpposite(Boolean.TRUE));

    this.setTooltip(new Tooltip()
        .setFormatter(new Function(
            "return ''+ this.x +': '+ this.y + (this.series.name == 'Rainfall' ? ' mm' : '°C');")));

    this.setLegend(new Legend()
        .setLayout(LegendLayout.VERTICAL)
        .setAlign(HorizontalAlignment.LEFT)
        .setX(120)
        .setVerticalAlign(VerticalAlignment.TOP)
        .setY(100)
        .setFloating(Boolean.TRUE)
        .setBackgroundColor(HexColor.fromString("#FFFFFF")));

    this.addSeries(new SimpleSeries()
        .setName("Rainfall")
        .setColor(HexColor.fromString("#4572A7"))
        .setType(SeriesType.COLUMN)
        .setyAxis(1)
        .setData(
            49.9,
            71.5,
            106.4,
            129.2,
            144.0,
            176.0,
            135.6,
            148.5,
            216.4,
            194.1,
            95.6,
            54.4));

    this.addSeries(new SimpleSeries()
        .setName("Temperature")
        .setColor(HexColor.fromString("#89A54E"))
        .setType(SeriesType.SPLINE)
        .setData(
            7.0,
            6.9,
            9.5,
            14.5,
            18.2,
            21.5,
            25.2,
            26.5,
            23.3,
            18.3,
            13.9,
            9.6));

  }

  @Override
  public String getLabel() {
    return "Dual axes, line and column";
  }

}
