/**
 *   Copyright 2012-2018 Wicked Charts (http://github.com/adessoAG/wicked-charts)
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
import de.adesso.wickedcharts.highcharts.options.ButtonOptions;
import de.adesso.wickedcharts.highcharts.options.ChartOptions;
import de.adesso.wickedcharts.highcharts.options.CssStyle;
import de.adesso.wickedcharts.highcharts.options.DataLabels;
import de.adesso.wickedcharts.highcharts.options.DummyOption;
import de.adesso.wickedcharts.highcharts.options.ExportingButtons;
import de.adesso.wickedcharts.highcharts.options.ExportingOptions;
import de.adesso.wickedcharts.highcharts.options.Labels;
import de.adesso.wickedcharts.highcharts.options.Legend;
import de.adesso.wickedcharts.highcharts.options.Marker;
import de.adesso.wickedcharts.highcharts.options.MinorTickInterval;
import de.adesso.wickedcharts.highcharts.options.Navigation;
import de.adesso.wickedcharts.highcharts.options.PlotOptions;
import de.adesso.wickedcharts.highcharts.options.PlotOptionsChoice;
import de.adesso.wickedcharts.highcharts.options.Title;
import de.adesso.wickedcharts.highcharts.options.Tooltip;
import de.adesso.wickedcharts.highcharts.options.color.HexColor;
import de.adesso.wickedcharts.highcharts.options.color.LinearGradient;
import de.adesso.wickedcharts.highcharts.options.color.NullColor;
import de.adesso.wickedcharts.highcharts.options.color.RgbaColor;

/**
 * Gray theme as displayed in the Highcharts demo at <a
 * href="http://www.highcharts.com/demo/column-stacked-and-grouped/gray"
 * >http://www.highcharts.com/demo/column-stacked-and-grouped/gray</a>
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
// CHECKSTYLE:OFF
public class GrayTheme extends Theme {

  private static final long serialVersionUID = 1L;

  public GrayTheme() {
    this.setColors(HexColor.fromStrings("#DDDF0D", "#7798BF", "#55BF3B", "#DF5353", "#aaeeee", "#ff0066", "#eeaaee",
        "#55BF3B", "#DF5353", "#7798BF", "#aaeeee"));

    this.setChartOptions(new ChartOptions()
        .setBackgroundColor(
            new LinearGradient(0, 0, 0, 400).addStop(0, new RgbaColor(96, 96, 96))
                .addStop(1, new RgbaColor(16, 16, 16))).setBorderWidth(0).setBorderRadius(15)
        .setPlotBackgroundColor(new NullColor()).setPlotShadow(Boolean.FALSE).setPlotBorderWidth(0));

    this.setTitle(new Title().setStyle(new CssStyle().setProperty("color", "#FFF").setProperty("font",
        "16px Lucida Grande, Lucida Sans Unicode, Verdana, Arial, Helvetica, sans-serif")));

    this.setSubtitle(new Title().setStyle(new CssStyle().setProperty("color", "#DDD").setProperty("font",
        "12px Lucida Grande, Lucida Sans Unicode, Verdana, Arial, Helvetica, sans-serif")));

    this.setxAxis(new Axis()
        .setGridLineWidth(0)
        .setLineColor(HexColor.fromString("#999999"))
        .setTickColor(HexColor.fromString("#999999"))
        .setLabels(new Labels().setStyle(new CssStyle().setProperty("color", "#DDD").setProperty("fontWeight", "bold")))
        .setTitle(
            new Title().setStyle(new CssStyle().setProperty("color", "#999").setProperty("font",
                "bold 12px Lucida Grande, Lucida Sans Unicode, Verdana, Arial, Helvetica, sans-serif"))));

    this.setyAxis(new Axis()
        .setAlternateGridColor(new NullColor())
        .setMinorTickInterval(new MinorTickInterval().setNull())
        .setGridLineColor(new RgbaColor(255, 255, 255, .1f))
        .setLineWidth(0)
        .setTickWidth(0)
        .setLabels(new Labels().setStyle(new CssStyle().setProperty("color", "#DDD").setProperty("fontWeight", "bold")))
        .setTitle(
            new Title().setStyle(new CssStyle().setProperty("color", "#999").setProperty("font",
                "bold 12px Lucida Grande, Lucida Sans Unicode, Verdana, Arial, Helvetica, sans-serif"))));

    this.setLegend(new Legend().setItemStyle(new CssStyle().setProperty("color", "#CCC"))
        .setItemHoverStyle(new CssStyle().setProperty("color", "#FFF"))
        .setItemHiddenStyle(new CssStyle().setProperty("color", "#333")));

    this.setLabels(new Labels().setStyle(new CssStyle().setProperty("color", "#CCC")));

    this.setTooltip(new Tooltip()
        .setBackgroundColor(
            new LinearGradient(0, 0, 0, 50).addStop(0, new RgbaColor(96, 96, 96, .8f)).addStop(1,
                new RgbaColor(16, 16, 16, .8f))).setBorderWidth(0)
        .setStyle(new CssStyle().setProperty("color", "#FFF")));

    this.setPlotOptions(new PlotOptionsChoice()
        .setLine(
            new PlotOptions().setDataLabels(new DataLabels().setColor(HexColor.fromString("#cccccc"))).setMarker(
                new Marker().setLineColor(HexColor.fromString("#333333"))))
        .setSpline(new PlotOptions().setMarker(new Marker().setLineColor(HexColor.fromString("#333333"))))
        .setScatter(new PlotOptions().setMarker(new Marker().setLineColor(HexColor.fromString("#333333"))))
        .setCandleStick(new PlotOptions().setLineColor(HexColor.fromString("#ffffff"))));

    this.setToolbar(new DummyOption());

    this.setNavigation(new Navigation().setButtonOptions(new ButtonOptions()
        .setBackgroundColor(
            new LinearGradient(0, 0, 0, 20).addStop(0.4f, HexColor.fromString("#606060")).addStop(0.6f,
                HexColor.fromString("#333333"))).setBorderColor(HexColor.fromString("#000000"))
        .setSymbolStroke(HexColor.fromString("#c0c0c0")).setHoverSymbolStroke(HexColor.fromString("#ffffff"))));

    this.setExporting(new ExportingOptions().setButtons(new ExportingButtons().setExportButton(
        new ButtonOptions().setSymbolFill(HexColor.fromString("#55be3b"))).setPrintButton(
        new ButtonOptions().setSymbolFill(HexColor.fromString("#7797be")))));

    this.setRangeSelector(new DummyOption());

    this.setNavigator(new DummyOption());

    this.setScrollbar(new DummyOption());

    this.setLegendBackgroundColor(new RgbaColor(48, 48, 48, .8f));
    this.setLegendBackgroundColorSolid(new RgbaColor(70, 70, 70));
    this.setDataLabelsColor(HexColor.fromString("#444444"));
    this.setTextColor(HexColor.fromString("#e0e0e0"));
    this.setMaskColor(new RgbaColor(255, 255, 255, 0f));

  }
}
