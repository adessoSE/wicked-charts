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
package de.adesso.wickedcharts.showcase;

import java.util.Arrays;

import de.adesso.wickedcharts.highcharts.options.Axis;
import de.adesso.wickedcharts.highcharts.options.ChartOptions;
import de.adesso.wickedcharts.highcharts.options.HorizontalAlignment;
import de.adesso.wickedcharts.highcharts.options.Legend;
import de.adesso.wickedcharts.highcharts.options.LegendLayout;
import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.highcharts.options.SeriesType;
import de.adesso.wickedcharts.highcharts.options.Title;
import de.adesso.wickedcharts.highcharts.options.VerticalAlignment;
import de.adesso.wickedcharts.highcharts.options.series.SimpleSeries;

/**
 * This code is simply to display it on the front page of
 * http://code.google.com/p/wicked-charts/.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Demo {

  public void test() {

    Options options = new Options();

    options
        .setChartOptions(new ChartOptions()
            .setType(SeriesType.LINE));

    options
        .setTitle(new Title("My very own chart."));

    options
        .setxAxis(new Axis()
            .setCategories(Arrays
                .asList(new String[] { "Jan", "Feb", "Mar", "Apr", "May",
                    "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" })));

    options
        .setyAxis(new Axis()
            .setTitle(new Title("Temperature (C)")));

    options
        .setLegend(new Legend()
            .setLayout(LegendLayout.VERTICAL)
            .setAlign(HorizontalAlignment.RIGHT)
            .setVerticalAlign(VerticalAlignment.TOP)
            .setX(-10)
            .setY(100)
            .setBorderWidth(0));

    options
        .addSeries(new SimpleSeries()
            .setName("Tokyo")
            .setData(
                Arrays
                    .asList(new Number[] { 7.0, 6.9, 9.5, 14.5, 18.2, 21.5,
                        25.2, 26.5, 23.3, 18.3, 13.9, 9.6 })));

    options
        .addSeries(new SimpleSeries()
            .setName("New York")
            .setData(
                Arrays
                    .asList(new Number[] { -0.2, 0.8, 5.7, 11.3, 17.0, 22.0,
                        24.8, 24.1, 20.1, 14.1, 8.6, 2.5 })));
  }
}
