/*
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
package de.adesso.wickedcharts.showcase.options.highcharts.base;

import de.adesso.wickedcharts.highcharts.options.*;
import de.adesso.wickedcharts.highcharts.options.color.HexColor;
import de.adesso.wickedcharts.highcharts.options.series.Point;
import de.adesso.wickedcharts.highcharts.options.series.PointSeries;
import de.adesso.wickedcharts.highcharts.options.series.Series;
import de.adesso.wickedcharts.highcharts.options.series.SimpleSeries;
import de.adesso.wickedcharts.showcase.options.highcharts.base.ShowcaseOptions;

import java.util.Arrays;

/**
 * Demo of the same combo chart as in the Highcharts demo at <a
 * href="http://www.highcharts.com/demo/combo"
 * >http://www.highcharts.com/demo/combo</a>.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class ComboOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public ComboOptions() {
    ChartOptions chartOptions = new ChartOptions();
    this
        .setChartOptions(chartOptions);
    this
        .setTitle(new Title("Combination chart"));

    Axis xAxis = new Axis();
    xAxis
        .setCategories(Arrays
            .asList(new String[] { "Apples", "Oranges", "Pears", "Bananas",
                "Plums" }));
    this
        .setxAxis(xAxis);

    this
        .setTooltip(new Tooltip());

    this
        .setLabels(new Labels()
            .setStyle(new CssStyle()));

    Series<Number> series1 = new SimpleSeries();
    series1
        .setType(SeriesType.COLUMN);
    series1
        .setName("Jane");
    series1
        .setData(Arrays
            .asList(new Number[] { 3, 2, 1, 3, 4 }));
    this
        .addSeries(series1);

    Series<Number> series2 = new SimpleSeries();
    series2
        .setType(SeriesType.COLUMN);
    series2
        .setName("John");
    series2
        .setData(Arrays
            .asList(new Number[] { 2, 3, 5, 7, 6 }));
    this
        .addSeries(series2);

    Series<Number> series3 = new SimpleSeries();
    series3
        .setType(SeriesType.COLUMN);
    series3
        .setName("Joe");
    series3
        .setData(Arrays
            .asList(new Number[] { 4, 3, 3, 9, 0 }));
    this
        .addSeries(series3);

    Marker series4Marker = new Marker();
    series4Marker
        .setLineWidth(2);
    series4Marker
        .setLineColor(new HexColor("#990000"));
    series4Marker
        .setFillColor(new HexColor("#ffffff"));

    Series<Number> series4 = new SimpleSeries();
    series4
        .setType(SeriesType.SPLINE);
    series4
        .setName("Average");
    series4
        .setData(Arrays
            .asList(new Number[] { 3, 2.67, 3, 6.33, 3.33 }));
    series4
        .setMarker(series4Marker);
    this
        .addSeries(series4);

    PointSeries series5 = new PointSeries();
    series5
        .setType(SeriesType.PIE);
    series5
        .setName("Total consumption");
    series5
        .addPoint(new Point("Jane", 13, new HexColor("#4572A7")));
    series5
        .addPoint(new Point("John", 23, new HexColor("#AA4643")));
    series5
        .addPoint(new Point("Joe", 19, new HexColor("#89A54E")));
    series5
        .setCenter(new Center(100, 80, Center.Unit.PIXELS));
    series5
        .setSize(new PixelOrPercent(100, PixelOrPercent.Unit.PIXELS));
    series5
        .setShowInLegend(Boolean.FALSE);
    series5
        .setDataLabels(new DataLabels(Boolean.TRUE));
    this
        .addSeries(series5);

  }

  @Override
  public String getLabel() {
    return "Column, line and pie";
  }

}
