/*
 *   Copyright 2012-2019 Wicked Charts (http://github.com/adessoAG/wicked-charts)
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
package de.adesso.wickedcharts.showcase.options.highcharts.base;

import de.adesso.wickedcharts.highcharts.options.*;
import de.adesso.wickedcharts.highcharts.options.Symbol.PredefinedSymbol;
import de.adesso.wickedcharts.highcharts.options.color.HexColor;
import de.adesso.wickedcharts.highcharts.options.series.Point;
import de.adesso.wickedcharts.highcharts.options.series.PointSeries;
import de.adesso.wickedcharts.showcase.options.highcharts.base.ShowcaseOptions;

import java.util.Arrays;

/**
 * Demo of the same spline chart with symbols as in the Highcharts demo at <a
 * href
 * ="http://www.highcharts.com/demo/spline-symbols">http://www.highcharts.com
 * /demo/spline-symbols</a>.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class SplineWithSymbolsOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public SplineWithSymbolsOptions() {
    ChartOptions chartOptions = new ChartOptions();
    chartOptions
        .setType(SeriesType.SPLINE);
    setChartOptions(chartOptions);

    setTitle(new Title("Monthly Average Temperature"));
    setTitle(new Title("Source: WorldClimate.com"));

    Axis xAxis = new Axis();
    xAxis
        .setCategories(Arrays
            .asList(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
    setxAxis(xAxis);

    Axis yAxis = new Axis();
    yAxis
        .setTitle(new Title("Temperature"));
    yAxis
        .setLabels(new Labels()
            .setStyle(new CssStyle()));
    setyAxis(yAxis);

    setTooltip(new Tooltip());

    Marker marker = new Marker();
    marker
        .setRadius(4);
    marker
        .setLineColor(new HexColor("#999999"));
    marker
        .setLineWidth(1);

    PlotOptions plotOptions = new PlotOptions();
    plotOptions
        .setMarker(marker);

    PlotOptionsChoice plotOptionsChoice = new PlotOptionsChoice();
    plotOptionsChoice
        .setSpline(plotOptions);
    setPlotOptions(plotOptionsChoice);

    Marker pointMarker1 = new Marker();
    pointMarker1
        .setSymbol(new Symbol("http://www.highcharts.com/demo/gfx/sun.png"));

    Marker series1Marker = new Marker();
    series1Marker
        .setSymbol(new Symbol(PredefinedSymbol.SQUARE));

    PointSeries series1 = new PointSeries();
    series1
        .setMarker(series1Marker);
    series1
        .setName("Tokyo");
    series1
        .addNumbers(Arrays
            .asList(new Number[] { 7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2 }));
    Point point1 = new Point();
    point1
        .setY(26.5);
    point1
        .setMarker(pointMarker1);
    series1
        .addPoint(point1);
    series1
        .addNumbers(Arrays
            .asList(new Number[] { 23.3, 18.3, 13.9, 9.6 }));
    addSeries(series1);

    Marker pointMarker2 = new Marker();
    pointMarker2
        .setSymbol(new Symbol("http://www.highcharts.com/demo/gfx/snow.png"));

    Marker series2Marker = new Marker();
    series1Marker
        .setSymbol(new Symbol(PredefinedSymbol.DIAMOND));

    PointSeries series2 = new PointSeries();
    series2
        .setMarker(series2Marker);
    series2
        .setName("London");
    series2
        .addNumbers(Arrays
            .asList(new Number[] { 3.9 }));
    Point point2 = new Point();
    point2
        .setY(3.9);
    point2
        .setMarker(pointMarker2);
    series2
        .addPoint(point2);
    series2
        .addNumbers(Arrays
            .asList(new Number[] { 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2,
                10.3, 6.6, 4.8 }));
    addSeries(series2);

  }

  @Override
  public String getLabel() {
    return "Spline with symbols";
  }

}
