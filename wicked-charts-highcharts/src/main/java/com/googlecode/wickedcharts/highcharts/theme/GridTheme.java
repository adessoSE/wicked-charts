/**
 *   Copyright 2012 Wicked Charts (http://wicked-charts.googlecode.com)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.googlecode.wickedcharts.highcharts.theme;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.CssStyle;
import com.googlecode.wickedcharts.highcharts.options.Labels;
import com.googlecode.wickedcharts.highcharts.options.Legend;
import com.googlecode.wickedcharts.highcharts.options.MinorTickInterval;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.color.HexColor;
import com.googlecode.wickedcharts.highcharts.options.color.LinearGradient;
import com.googlecode.wickedcharts.highcharts.options.color.RgbaColor;

/**
 * Grid theme as displayed in the Highcharts demo at <a
 * href="http://www.highcharts.com/demo/column-stacked-and-grouped/grid"
 * >http://www.highcharts.com/demo/column-stacked-and-grouped/grid</a>
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class GridTheme extends Theme {

  private static final long serialVersionUID = 1L;

  public GridTheme() {

    addColor(new HexColor("#058DC7"));
    addColor(new HexColor("#50B432"));
    addColor(new HexColor("#ED561B"));
    addColor(new HexColor("#DDDF00"));
    addColor(new HexColor("#24CBE5"));
    addColor(new HexColor("#64E572"));
    addColor(new HexColor("#FF9655"));
    addColor(new HexColor("#FFF263"));
    addColor(new HexColor("#6AF9C4"));

    ChartOptions chartOptions = new ChartOptions()
        .setBackgroundColor(new LinearGradient(0, 0, 500, 500)
            .addStop(0, new RgbaColor(255, 255, 255))
            .addStop(1, new RgbaColor(240, 240, 255)))
        .setBorderWidth(2)
        .setPlotBackgroundColor(new RgbaColor(255, 255, 255, .9f))
        .setPlotShadow(Boolean.TRUE)
        .setPlotBorderWidth(1);
    setChartOptions(chartOptions);

    Title title = new Title();
    title
        .setStyle(new CssStyle());
    setTitle(title);

    Title subTitle = new Title();
    subTitle
        .setStyle(new CssStyle());
    setSubtitle(subTitle);

    Axis xAxis = new Axis()
        .setGridLineWidth(1)
        .setLineColor(new HexColor("#000000"))
        .setTickColor(new HexColor("#000000"))
        .setLabels(new Labels().setStyle(new CssStyle()))
        .setTitle(new Title().setStyle(new CssStyle()));
    setxAxis(xAxis);

    Axis yAxis = new Axis()
        .setMinorTickInterval(new MinorTickInterval().setAuto(true))
        .setLineColor(new HexColor("#000000"))
        .setLineWidth(1)
        .setTickWidth(1)
        .setTickColor(new HexColor("#000000"))
        .setLabels(new Labels().setStyle(new CssStyle()))
        .setTitle(new Title().setStyle(new CssStyle()));
    setyAxis(yAxis);

    Legend legend = new Legend()
        .setItemStyle(new CssStyle())
        .setItemHoverStyle(new CssStyle())
        .setItemHiddenStyle(new CssStyle());
    setLegend(legend);

    Labels labels = new Labels()
        .setStyle(new CssStyle());
    setLabels(labels);

  }
}
