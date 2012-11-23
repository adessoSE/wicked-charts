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
package com.googlecode.wickedcharts.showcase.options;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.Marker;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.State;
import com.googlecode.wickedcharts.highcharts.options.StatesChoice;
import com.googlecode.wickedcharts.highcharts.options.Symbol;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.color.HexColor;
import com.googlecode.wickedcharts.highcharts.options.color.RgbaColor;
import com.googlecode.wickedcharts.highcharts.options.series.Point;
import com.googlecode.wickedcharts.highcharts.options.series.PointSeries;

/**
 * Options for a bubble chart by using the scatter chart type (this is not a
 * highcharts-native bubble chart, which will be supported in Highcharts 3.0).
 * 
 * @see http://jsfiddle.net/jlbriggs/yHWfX/5/
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class BubbleChartOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public BubbleChartOptions() {
    setChartOptions(new ChartOptions()
        .setDefaultSeriesType(SeriesType.SCATTER)
        .setBorderWidth(1)
        .setBorderColor(HexColor.fromString("#cccccc"))
        .setMarginLeft(110)
        .setMarginRight(50)
        .setBackgroundColor(HexColor.fromString("#eeeeee"))
        .setPlotBackgroundColor(HexColor.fromString("#ffffff")));

    setTitle(new Title("Bubble Chart"));

    setPlotOptions(new PlotOptionsChoice()
        .setSeries(new PlotOptions()
            .setShadow(Boolean.FALSE)));

    setxAxis(new Axis()
        .setMinPadding(0.75f)
        .setMaxPadding(0.75f)
        .setLineColor(HexColor.fromString("#999999"))
        .setLineWidth(1)
        .setTickColor(HexColor.fromString("#666666"))
        .setTickLength(3)
        .setTitle(new Title("X Axis")));

    setyAxis(new Axis()
        .setLineColor(HexColor.fromString("#999999"))
        .setLineWidth(1)
        .setTickColor(HexColor.fromString("#666666"))
        .setTickLength(3)
        .setGridLineColor(HexColor.fromString("#dddddd"))
        .setTitle(new Title("Y Axis")
            .setRotation(0)
            .setMargin(50)));

    addSeries(new PointSeries()
        .setMarker(new Marker()
            .setSymbol(new Symbol(Symbol.PredefinedSymbol.CIRCLE))
            .setFillColor(new RgbaColor(24, 90, 169, 0.5f))
            .setLineColor(new RgbaColor(24, 90, 169, 0.75f))
            .setLineWidth(1)
            .setColor(new RgbaColor(24, 90, 169, 1f))
            .setStates(new StatesChoice().setHover(new State()
                .setEnabled(Boolean.FALSE))))
        .addPoint(new Point(2, 3).setMarker(radiusMarker(5)))
        .addPoint(new Point(3, 12).setMarker(radiusMarker(10)))
        .addPoint(new Point(5, 6).setMarker(radiusMarker(15)))
        .addPoint(new Point(1, 7).setMarker(radiusMarker(25)))
        .addPoint(new Point(7, 18).setMarker(radiusMarker(18)))
        .addPoint(new Point(4, 10).setMarker(radiusMarker(14)))
        .addPoint(new Point(4, 3).setMarker(radiusMarker(16))));

    addSeries(new PointSeries()
        .setMarker(new Marker()
            .setSymbol(new Symbol(Symbol.PredefinedSymbol.CIRCLE))
            .setFillColor(new RgbaColor(238, 46, 47, 0.5f))
            .setLineColor(new RgbaColor(238, 46, 47, 0.75f))
            .setLineWidth(1)
            .setColor(new RgbaColor(238, 46, 47, 1f))
            .setStates(new StatesChoice().setHover(new State()
                .setEnabled(Boolean.FALSE))))
        .addPoint(new Point(3, 5).setMarker(radiusMarker(7)))
        .addPoint(new Point(2, 9).setMarker(radiusMarker(11)))
        .addPoint(new Point(5, 7).setMarker(radiusMarker(23)))
        .addPoint(new Point(4, 4).setMarker(radiusMarker(14)))
        .addPoint(new Point(7, 8).setMarker(radiusMarker(28)))
        .addPoint(new Point(8, 13).setMarker(radiusMarker(6)))
        .addPoint(new Point(6, 5).setMarker(radiusMarker(12))));

  }

  private Marker radiusMarker(Integer radius) {
    return new Marker()
        .setRadius(radius);
  }

  @Override
  public String getLabel() {
    return "Bubble chart";
  }
}
