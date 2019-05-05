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
import de.adesso.wickedcharts.highcharts.options.color.HexColor;
import de.adesso.wickedcharts.highcharts.options.series.Series;
import de.adesso.wickedcharts.highcharts.options.series.SimpleSeries;
import de.adesso.wickedcharts.showcase.options.highcharts.base.ShowcaseOptions;

import java.util.Arrays;
import java.util.Collections;

/**
 * Demo of the same basic line chart displayed in the Highcharts Demo at <a
 * href=
 * "http://www.highcharts.com/demo/line-basic">http://www.highcharts.com/demo
 * /line-basic</a>.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class BasicLineOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public BasicLineOptions() {
    ChartOptions chartOptions = new ChartOptions();
    chartOptions
        .setType(SeriesType.LINE);
    chartOptions
        .setMarginRight(130);
    chartOptions
        .setMarginBottom(25);
    setChartOptions(chartOptions);

    Title title = new Title("Monthly Average Temperature");
    title
        .setX(-20);
    setTitle(title);

    Title subTitle = new Title("Source: WorldClimate.com");
    subTitle
        .setX(-20);
    setSubtitle(subTitle);

    Axis xAxis = new Axis();
    xAxis
        .setCategories(Arrays
            .asList(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
    setxAxis(xAxis);

    PlotLine plotLines = new PlotLine();
    plotLines
        .setValue(0f);
    plotLines
        .setWidth(1);
    plotLines
        .setColor(new HexColor("#999999"));

    Axis yAxis = new Axis();
    yAxis
        .setTitle(new Title("Temperature (°C)"));
    yAxis
        .setPlotLines(Collections
            .singletonList(plotLines));
    setyAxis(yAxis);

    Legend legend = new Legend();
    legend
        .setLayout(LegendLayout.VERTICAL);
    legend
        .setAlign(HorizontalAlignment.RIGHT);
    legend
        .setVerticalAlign(VerticalAlignment.TOP);
    legend
        .setX(-10);
    legend
        .setY(100);
    legend
        .setBorderWidth(0);
    setLegend(legend);

    Series<Number> series1 = new SimpleSeries();
    series1
        .setName("Tokyo");
    series1
        .setData(Arrays
            .asList(new Number[] { 7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5,
                23.3, 18.3, 13.9, 9.6 }));
    addSeries(series1);

    Series<Number> series2 = new SimpleSeries();
    series2
        .setName("New York");
    series2
        .setData(Arrays
            .asList(new Number[] { -0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8,
                24.1, 20.1, 14.1, 8.6, 2.5 }));
    addSeries(series2);

    Series<Number> series3 = new SimpleSeries();
    series3
        .setName("Berlin");
    series3
        .setData(Arrays
            .asList(new Number[] { -0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9,
                14.3, 9.0, 3.9, 1.0 }));
    addSeries(series3);

    Series<Number> series4 = new SimpleSeries();
    series4
        .setName("London");
    series4
        .setData(Arrays
            .asList(new Number[] { 3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6,
                14.2, 10.3, 6.6, 4.8 }));
    addSeries(series4);

  }

  @Override
  public String getLabel() {
    return "Basic line";
  }

}
