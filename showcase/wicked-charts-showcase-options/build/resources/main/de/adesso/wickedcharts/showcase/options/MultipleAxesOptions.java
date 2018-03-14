package de.adesso.wickedcharts.showcase.options;

import de.adesso.wickedcharts.highcharts.options.Axis;
import de.adesso.wickedcharts.highcharts.options.ChartOptions;
import de.adesso.wickedcharts.highcharts.options.CssStyle;
import de.adesso.wickedcharts.highcharts.options.Function;
import de.adesso.wickedcharts.highcharts.options.GridLineDashStyle;
import de.adesso.wickedcharts.highcharts.options.HorizontalAlignment;
import de.adesso.wickedcharts.highcharts.options.Labels;
import de.adesso.wickedcharts.highcharts.options.Legend;
import de.adesso.wickedcharts.highcharts.options.LegendLayout;
import de.adesso.wickedcharts.highcharts.options.Marker;
import de.adesso.wickedcharts.highcharts.options.SeriesType;
import de.adesso.wickedcharts.highcharts.options.Title;
import de.adesso.wickedcharts.highcharts.options.Tooltip;
import de.adesso.wickedcharts.highcharts.options.VerticalAlignment;
import de.adesso.wickedcharts.highcharts.options.ZoomType;
import de.adesso.wickedcharts.highcharts.options.color.HexColor;
import de.adesso.wickedcharts.highcharts.options.series.SimpleSeries;
import de.adesso.wickedcharts.showcase.options.base.ShowcaseOptions;

public class MultipleAxesOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public MultipleAxesOptions() {

    this
        .setChartOptions(new ChartOptions()
            .setZoomType(ZoomType.XY));

    this
        .setTitle(new Title("Average Monthly Weather Data for Tokyo"));

    this
        .setSubtitle(new Title("Source: WorldClimate.com"));

    this
        .setxAxis(new Axis()
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

    this
        .addyAxis(new Axis()
            .setLabels(new Labels()
                .setFormatter(new Function("return this.value + '°C';"))
                .setStyle(new CssStyle()
                    .setProperty("color", "#89A54E")))
            .setTitle(new Title("Temperature")
                .setStyle(new CssStyle()
                    .setProperty("color", "#89A54E")))
            .setOpposite(Boolean.TRUE));

    this
        .addyAxis(new Axis()
            .setLabels(new Labels()
                .setFormatter(new Function("return this.value + ' mm';"))
                .setStyle(new CssStyle()
                    .setProperty("color", "#4572A7")))
            .setTitle(new Title("Rainfall")
                .setStyle(new CssStyle()
                    .setProperty("color", "#4572A7"))));

    this
        .addyAxis(new Axis()
            .setLabels(new Labels()
                .setFormatter(new Function("return this.value + ' mb';"))
                .setStyle(new CssStyle()
                    .setProperty("color", "#AA4643")))
            .setTitle(new Title("Sea-Level Pressure")
                .setStyle(new CssStyle()
                    .setProperty("color", "#AA4643")))
            .setOpposite(Boolean.TRUE));

    this
        .setTooltip(new Tooltip()
            .setFormatter(new Function("var unit = {" + "'Rainfall': 'mm',"
                + "'Temperature': '°C'," + "'Sea-Level Pressure': 'mb'"
                + "}[this.series.name];" + "return ''+"
                + "   this.x +': '+ this.y +' '+ unit;")));

    this
        .setLegend(new Legend()
            .setLayout(LegendLayout.VERTICAL)
            .setAlign(HorizontalAlignment.LEFT)
            .setX(120)
            .setVerticalAlign(VerticalAlignment.TOP)
            .setY(80)
            .setFloating(Boolean.TRUE)
            .setBackgroundColor(HexColor
                .fromString("#FFFFFF")));

    this
        .addSeries(new SimpleSeries()
            .setName("Rainfall")
            .setColor(HexColor
                .fromString("#4572A7"))
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

    this
        .addSeries(new SimpleSeries()
            .setyAxis(2)
            .setName("Sea-Level Pressure")
            .setColor(HexColor
                .fromString("#AA4643"))
            .setType(SeriesType.SPLINE)
            .setMarker(new Marker(Boolean.FALSE))
            .setDashStyle(GridLineDashStyle.SHORTDOT)
            .setData(
                1016,
                1016,
                1015.9,
                1015.5,
                1012.3,
                1009.5,
                1009.6,
                1010.2,
                1013.1,
                1016.9,
                1018.2,
                1016.7));

    this
        .addSeries(new SimpleSeries()
            .setName("Temperature")
            .setColor(HexColor
                .fromString("#89A54E"))
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
