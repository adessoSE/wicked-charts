/**
 *   Copyright 2012-2013 Wicked Charts (http://wicked-charts.googlecode.com)
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
package de.adesso.wickedcharts.highcharts.theme;

import de.adesso.wickedcharts.highcharts.options.Axis;
import de.adesso.wickedcharts.highcharts.options.ChartOptions;
import de.adesso.wickedcharts.highcharts.options.CssStyle;
import de.adesso.wickedcharts.highcharts.options.Labels;
import de.adesso.wickedcharts.highcharts.options.Legend;
import de.adesso.wickedcharts.highcharts.options.Title;
import de.adesso.wickedcharts.highcharts.options.color.HexColor;
import de.adesso.wickedcharts.highcharts.options.color.LinearGradient;
import de.adesso.wickedcharts.highcharts.options.color.RgbaColor;

/**
 * Theme as displayed in the Highcharts demo at <a
 * href="http://www.highcharts.com/demo/area-basic/skies"
 * >http://www.highcharts.com/demo/area-basic/skies</a>
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
// CHECKSTYLE:OFF
public class SkiesTheme extends Theme {

  private static final long serialVersionUID = 1L;

  public SkiesTheme() {
    this.addColor(new HexColor("#514F78"));
    this.addColor(new HexColor("#42A07B"));
    this.addColor(new HexColor("#9B5E4A"));
    this.addColor(new HexColor("#72727F"));
    this.addColor(new HexColor("#1F949A"));
    this.addColor(new HexColor("#82914E"));
    this.addColor(new HexColor("#86777F"));
    this.addColor(new HexColor("#42A07B"));

    ChartOptions chartOptions = new ChartOptions()
        .setClassName("skies")
        .setBorderWidth(0)
        .setPlotShadow(Boolean.TRUE)
        .setPlotBackgroundImage("/img/skies.jpg")
        .setPlotBackgroundColor(
            new LinearGradient(0, 0, 250, 500).addStop(0, new RgbaColor(255, 255, 255, 1f)).addStop(1,
                new RgbaColor(255, 255, 255, 0f))).setPlotBorderWidth(1);
    this.setChartOptions(chartOptions);

    this.setTitle(new Title().setStyle(new CssStyle()));

    this.setSubtitle(new Title().setStyle(new CssStyle()));

    Axis xAxis = new Axis().setGridLineWidth(0).setLineColor(new HexColor("#C0D0E0"))
        .setTickColor(new HexColor("#C0D0E0")).setLabels(new Labels().setStyle(new CssStyle()))
        .setTitle(new Title().setStyle(new CssStyle()));
    this.setxAxis(xAxis);

    Axis yAxis = new Axis().setAlternateGridColor(new RgbaColor(255, 255, 255, .5f))
        .setLineColor(new HexColor("#C0D0E0")).setTickColor(new HexColor("#C0D0E0")).setTickWidth(1)
        .setLabels(new Labels().setStyle(new CssStyle())).setTitle(new Title().setStyle(new CssStyle()));
    this.setyAxis(yAxis);

    Legend legend = new Legend().setItemStyle(new CssStyle()).setItemHoverStyle(new CssStyle())
        .setItemHiddenStyle(new CssStyle());
    this.setLegend(legend);

    this.setLabels(new Labels().setStyle(new CssStyle()));
  }

}
