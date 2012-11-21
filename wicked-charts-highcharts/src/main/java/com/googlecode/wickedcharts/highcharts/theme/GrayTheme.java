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
import com.googlecode.wickedcharts.highcharts.options.ButtonOptions;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.CssStyle;
import com.googlecode.wickedcharts.highcharts.options.DataLabels;
import com.googlecode.wickedcharts.highcharts.options.DummyOption;
import com.googlecode.wickedcharts.highcharts.options.ExportingButtons;
import com.googlecode.wickedcharts.highcharts.options.ExportingOptions;
import com.googlecode.wickedcharts.highcharts.options.Labels;
import com.googlecode.wickedcharts.highcharts.options.Legend;
import com.googlecode.wickedcharts.highcharts.options.Marker;
import com.googlecode.wickedcharts.highcharts.options.MinorTickInterval;
import com.googlecode.wickedcharts.highcharts.options.Navigation;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.color.HexColor;
import com.googlecode.wickedcharts.highcharts.options.color.LinearGradient;
import com.googlecode.wickedcharts.highcharts.options.color.NullColor;
import com.googlecode.wickedcharts.highcharts.options.color.RgbaColor;

/**
 * Gray theme as displayed in the Highcharts demo at <a
 * href="http://www.highcharts.com/demo/column-stacked-and-grouped/gray"
 * >http://www.highcharts.com/demo/column-stacked-and-grouped/gray</a>
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class GrayTheme extends Theme {

  private static final long serialVersionUID = 1L;

  public GrayTheme() {
    setColors(HexColor
        .fromStrings(
            "#DDDF0D",
            "#7798BF",
            "#55BF3B",
            "#DF5353",
            "#aaeeee",
            "#ff0066",
            "#eeaaee",
            "#55BF3B",
            "#DF5353",
            "#7798BF",
            "#aaeeee"));

    setChartOptions(new ChartOptions()
        .setBackgroundColor(new LinearGradient(0, 0, 0, 400)
            .addStop(0, new RgbaColor(96, 96, 96))
            .addStop(1, new RgbaColor(16, 16, 16)))
        .setBorderWidth(0)
        .setBorderRadius(15)
        .setPlotBackgroundColor(new NullColor())
        .setPlotShadow(Boolean.FALSE)
        .setPlotBorderWidth(0));

    setTitle(new Title()
        .setStyle(new CssStyle()
            .setProperty("color", "#FFF")
            .setProperty(
                "font",
                "16px Lucida Grande, Lucida Sans Unicode, Verdana, Arial, Helvetica, sans-serif")));

    setSubtitle(new Title()
        .setStyle(new CssStyle()
            .setProperty("color", "#DDD")
            .setProperty(
                "font",
                "12px Lucida Grande, Lucida Sans Unicode, Verdana, Arial, Helvetica, sans-serif")));

    setxAxis(new Axis()
        .setGridLineWidth(0)
        .setLineColor(HexColor.fromString("#999999"))
        .setTickColor(HexColor.fromString("#999999"))
        .setLabels(new Labels().setStyle(new CssStyle()
            .setProperty("color", "#DDD")
            .setProperty("fontWeight", "bold")))
        .setTitle(
            new Title()
                .setStyle(new CssStyle()
                    .setProperty("color", "#999")
                    .setProperty(
                        "font",
                        "bold 12px Lucida Grande, Lucida Sans Unicode, Verdana, Arial, Helvetica, sans-serif"))));

    setyAxis(new Axis()
        .setAlternateGridColor(new NullColor())
        .setMinorTickInterval(new MinorTickInterval().setNull())
        .setGridLineColor(new RgbaColor(255, 255, 255, .1f))
        .setLineWidth(0)
        .setTickWidth(0)
        .setLabels(new Labels().setStyle(new CssStyle()
            .setProperty("color", "#DDD")
            .setProperty("fontWeight", "bold")))
        .setTitle(
            new Title()
                .setStyle(new CssStyle()
                    .setProperty("color", "#999")
                    .setProperty(
                        "font",
                        "bold 12px Lucida Grande, Lucida Sans Unicode, Verdana, Arial, Helvetica, sans-serif"))));

    setLegend(new Legend()
        .setItemStyle(new CssStyle().setProperty("color", "#CCC"))
        .setItemHoverStyle(new CssStyle().setProperty("color", "#FFF"))
        .setItemHiddenStyle(new CssStyle().setProperty("color", "#333")));

    setLabels(new Labels()
        .setStyle(new CssStyle()
            .setProperty("color", "#CCC")));

    setTooltip(new Tooltip()
        .setBackgroundColor(new LinearGradient(0, 0, 0, 50)
            .addStop(0, new RgbaColor(96, 96, 96, .8f))
            .addStop(1, new RgbaColor(16, 16, 16, .8f)))
        .setBorderWidth(0)
        .setStyle(new CssStyle().setProperty("color", "#FFF")));

    setPlotOptions(new PlotOptionsChoice()
        .setLine(new PlotOptions()
            .setDataLabels(new DataLabels().setColor(HexColor
                .fromString("#cccccc")))
            .setMarker(new Marker().setLineColor(HexColor
                .fromString("#333333"))))
        .setSpline(new PlotOptions().setMarker(new Marker()
            .setLineColor(HexColor
                .fromString("#333333"))))
        .setScatter(new PlotOptions().setMarker(new Marker()
            .setLineColor(HexColor
                .fromString("#333333"))))
        .setCandleStick(new PlotOptions().setLineColor(HexColor
            .fromString("#ffffff"))));

    setToolbar(new DummyOption());

    setNavigation(new Navigation()
        .setButtonOptions(new ButtonOptions()
            .setBackgroundColor(new LinearGradient(0, 0, 0, 20)
                .addStop(0.4f, HexColor
                    .fromString("#606060"))
                .addStop(0.6f, HexColor
                    .fromString("#333333")))
            .setBorderColor(HexColor
                .fromString("#000000"))
            .setSymbolStroke(HexColor
                .fromString("#c0c0c0"))
            .setHoverSymbolStroke(HexColor
                .fromString("#ffffff"))));

    setExporting(new ExportingOptions()
        .setButtons(new ExportingButtons()
            .setExportButton(new ButtonOptions()
                .setSymbolFill(HexColor
                    .fromString("#55be3b")))
            .setPrintButton(new ButtonOptions()
                .setSymbolFill(HexColor
                    .fromString("#7797be")))));

    setRangeSelector(new DummyOption());

    setNavigator(new DummyOption());

    setScrollbar(new DummyOption());

    setLegendBackgroundColor(new RgbaColor(48, 48, 48, .8f));
    setLegendBackgroundColorSolid(new RgbaColor(70, 70, 70));
    setDataLabelsColor(HexColor
        .fromString("#444444"));
    setTextColor(HexColor
        .fromString("#e0e0e0"));
    setMaskColor(new RgbaColor(255, 255, 255, 0f));

  }
}
