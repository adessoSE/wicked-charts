package com.googlecode.wickedcharts.highcharts.theme;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.CssStyle;
import com.googlecode.wickedcharts.highcharts.options.Labels;
import com.googlecode.wickedcharts.highcharts.options.Legend;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.color.HexColor;
import com.googlecode.wickedcharts.highcharts.options.color.LinearGradient;
import com.googlecode.wickedcharts.highcharts.options.color.RgbaColor;

/**
 * Theme as displayed in the Highcharts demo at <a
 * href="http://www.highcharts.com/demo/area-basic/skies"
 * >http://www.highcharts.com/demo/area-basic/skies</a>
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class SkiesTheme extends Theme {

  private static final long serialVersionUID = 1L;

  public SkiesTheme() {
    addColor(new HexColor("#514F78"));
    addColor(new HexColor("#42A07B"));
    addColor(new HexColor("#9B5E4A"));
    addColor(new HexColor("#72727F"));
    addColor(new HexColor("#1F949A"));
    addColor(new HexColor("#82914E"));
    addColor(new HexColor("#86777F"));
    addColor(new HexColor("#42A07B"));

    ChartOptions chartOptions = new ChartOptions()
        .setClassName("skies")
        .setBorderWidth(0)
        .setPlotShadow(Boolean.TRUE)
        .setPlotBackgroundImage("/img/skies.jpg")
        .setPlotBackgroundColor(
            new LinearGradient(0, 0, 250, 500)
                .addStop(0, new RgbaColor(255, 255, 255, 1f))
                .addStop(1, new RgbaColor(255, 255, 255, 0f)))
        .setPlotBorderWidth(1);
    setChartOptions(chartOptions);

    setTitle(new Title()
        .setStyle(new CssStyle()));

    setSubtitle(new Title()
        .setStyle(new CssStyle()));

    Axis xAxis = new Axis()
        .setGridLineWidth(0)
        .setLineColor(new HexColor("#C0D0E0"))
        .setTickColor(new HexColor("#C0D0E0"))
        .setLabels(new Labels().setStyle(new CssStyle()))
        .setTitle(new Title().setStyle(new CssStyle()));
    setxAxis(xAxis);

    Axis yAxis = new Axis()
        .setAlternateGridColor(new RgbaColor(255, 255, 255, .5f))
        .setLineColor(new HexColor("#C0D0E0"))
        .setTickColor(new HexColor("#C0D0E0"))
        .setTickWidth(1)
        .setLabels(new Labels().setStyle(new CssStyle()))
        .setTitle(new Title().setStyle(new CssStyle()));
    setyAxis(yAxis);

    Legend legend = new Legend()
        .setItemStyle(new CssStyle())
        .setItemHoverStyle(new CssStyle())
        .setItemHiddenStyle(new CssStyle());
    setLegend(legend);

    setLabels(new Labels()
        .setStyle(new CssStyle()));
  }

}
