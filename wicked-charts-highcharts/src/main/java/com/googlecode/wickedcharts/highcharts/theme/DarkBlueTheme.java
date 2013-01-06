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
package com.googlecode.wickedcharts.highcharts.theme;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.ButtonOptions;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.CreditOptions;
import com.googlecode.wickedcharts.highcharts.options.CssStyle;
import com.googlecode.wickedcharts.highcharts.options.DataLabels;
import com.googlecode.wickedcharts.highcharts.options.DummyOption;
import com.googlecode.wickedcharts.highcharts.options.ExportingButtons;
import com.googlecode.wickedcharts.highcharts.options.ExportingOptions;
import com.googlecode.wickedcharts.highcharts.options.Labels;
import com.googlecode.wickedcharts.highcharts.options.Legend;
import com.googlecode.wickedcharts.highcharts.options.Marker;
import com.googlecode.wickedcharts.highcharts.options.Navigation;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.color.HexColor;
import com.googlecode.wickedcharts.highcharts.options.color.LinearGradient;
import com.googlecode.wickedcharts.highcharts.options.color.RgbaColor;

// CHECKSTYLE:OFF
public class DarkBlueTheme extends Theme {

  private static final long serialVersionUID = 1L;

  // @formatter:off
  public DarkBlueTheme() {

    this.setColors(HexColor.fromStrings("#DDDF0D", "#55BF3B", "#DF5353", "#7798BF", "#aaeeee", "#ff0066", "#eeaaee",
        "#55BF3B", "#DF5353", "#7798BF", "#aaeeee"));

    this.setChartOptions(new ChartOptions()
        .setBackgroundColor(
            new LinearGradient(0, 0, 250, 500).addStop(0, new RgbaColor(48, 48, 96)).addStop(1, new RgbaColor(0, 0, 0)))
        .setBorderColor(new HexColor("#000000")).setBorderWidth(2).setClassName("dark-container")
        .setPlotBackgroundColor(new RgbaColor(255, 255, 255, .1f)).setBorderColor(new HexColor("#CCCCCC"))
        .setPlotBorderWidth(1));

    this.setTitle(new Title().setStyle(new CssStyle().setProperty("color", "#C0C0C0").setProperty("font",
        "bold 16px \"Trebuchet MS\", Verdana, sans-serif")));

    this.setSubtitle(new Title().setStyle(new CssStyle().setProperty("color", "#c0c0c0").setProperty("font",
        "bold 12px \"Trebuchet MS\", Verdana, sans-serif")));

    this.setxAxis(new Axis()
        .setGridLineColor(new HexColor("#333333"))
        .setGridLineWidth(1)
        .setLabels(new Labels().setStyle(new CssStyle().setProperty("color", "#a0a0a0")))
        .setLineColor(new HexColor("#a0a0a0"))
        .setTickColor(new HexColor("#a0a0a0"))
        .setTitle(
            new Title().setStyle(new CssStyle().setProperty("color", "#cccccc").setProperty("fontWeight", "bold")
                .setProperty("fontSize", "12px").setProperty("fontFamily", "Trebuchet MS, Verdana, sans-serif"))));

    this.setyAxis(new Axis()
        .setGridLineColor(new HexColor("#333333"))
        .setLabels(new Labels().setStyle(new CssStyle().setProperty("color", "#a0a0a0")))
        .setLineColor(new HexColor("#a0a0a0"))
        .setMinorTickInterval(null)
        .setTickColor(new HexColor("#a0a0a0"))
        .setTickWidth(1)
        .setTitle(
            new Title().setStyle(new CssStyle().setProperty("color", "#cccccc").setProperty("fontWeight", "bold")
                .setProperty("fontSize", "12px").setProperty("fontFamily", "Trebuchet MS, Verdana, sans-serif"))));

    this.setTooltip(new Tooltip().setBackgroundColor(new RgbaColor(0, 0, 0, 0.75f)).setStyle(
        new CssStyle().setProperty("color", "#f0f0f0")));

    this.setToolbar(new DummyOption());

    this.setPlotOptions(new PlotOptionsChoice()
        .setLine(
            new PlotOptions().setDataLabels(new DataLabels().setColor(new HexColor("#cccccc"))).setMarker(
                new Marker().setLineColor(new HexColor("#333333"))))
        .setSpline(new PlotOptions().setMarker(new Marker().setLineColor(new HexColor("#333333"))))
        .setScatter(new PlotOptions().setMarker(new Marker().setLineColor(new HexColor("#333333"))))
        .setCandleStick(new PlotOptions().setLineColor(new HexColor("#ffffff"))));

    this.setLegend(new Legend()
        .setItemStyle(
            new CssStyle().setProperty("font", "9pt Trebuchet MS, Verdana, sans-serif").setProperty("color", "#a0a0a0"))
        .setItemHoverStyle(new CssStyle().setProperty("color", "#ffffff"))
        .setItemHiddenStyle(new CssStyle().setProperty("color", "#444444")));

    this.setCreditOptions(new CreditOptions().setStyle(new CssStyle().setProperty("color", "#666666")));

    this.setLabels(new Labels().setStyle(new CssStyle().setProperty("color", "#cccccc")));

    this.setNavigation(new Navigation().setButtonOptions(new ButtonOptions()
        .setBackgroundColor(
            new LinearGradient(0, 0, 0, 20).addStop(0.4f, new HexColor("#606060")).addStop(0.6f,
                new HexColor("#333333"))).setBorderColor(new HexColor("#000000"))
        .setSymbolStroke(new HexColor("#c0c0c0")).setHoverSymbolStroke(new HexColor("#ffffff"))));

    this.setExporting(new ExportingOptions().setButtons(new ExportingButtons().setExportButton(
        new ButtonOptions().setSymbolFill(new HexColor("#55be3b"))).setPrintButton(
        new ButtonOptions().setSymbolFill(new HexColor("#7797be")))));

    this.setRangeSelector(new DummyOption());

    this.setNavigator(new DummyOption());

    this.setScrollbar(new DummyOption());

    this.setLegendBackgroundColor(new RgbaColor(0, 0, 0, 0.5f));
    this.setLegendBackgroundColorSolid(new RgbaColor(35, 35, 70));
    this.setDataLabelsColor(new HexColor("#444444"));
    this.setTextColor(new HexColor("#c0c0c0"));
    this.setMaskColor(new RgbaColor(255, 255, 255, 0.3f));

  }
  // @formatter:on

}
