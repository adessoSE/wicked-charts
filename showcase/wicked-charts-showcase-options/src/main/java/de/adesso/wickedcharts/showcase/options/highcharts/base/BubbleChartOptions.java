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

import de.adesso.wickedcharts.highcharts.options.ChartOptions;
import de.adesso.wickedcharts.highcharts.options.SeriesType;
import de.adesso.wickedcharts.highcharts.options.Title;
import de.adesso.wickedcharts.highcharts.options.ZoomType;
import de.adesso.wickedcharts.highcharts.options.series.BubbleSeries;
import de.adesso.wickedcharts.showcase.options.highcharts.base.ShowcaseOptions;

public class BubbleChartOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public BubbleChartOptions() {

    setChartOptions(new ChartOptions()
        .setType(SeriesType.BUBBLE)
        .setZoomType(ZoomType.XY));

    setTitle(new Title("Highcharts Bubbles"));

    addSeries(new BubbleSeries()
        .addPoint(97, 36, 79)
        .addPoint(94, 74, 60)
        .addPoint(68, 76, 58)
        .addPoint(64, 87, 56)
        .addPoint(68, 27, 73)
        .addPoint(74, 99, 42)
        .addPoint(7, 93, 87)
        .addPoint(51, 69, 40)
        .addPoint(38, 23, 33)
        .addPoint(57, 86, 31));

    addSeries(new BubbleSeries()
        .addPoint(25, 10, 87)
        .addPoint(2, 75, 59)
        .addPoint(11, 54, 8)
        .addPoint(86, 55, 93)
        .addPoint(5, 3, 58)
        .addPoint(90, 63, 44)
        .addPoint(91, 33, 17)
        .addPoint(97, 3, 56)
        .addPoint(97, 3, 56)
        .addPoint(54, 25, 81));

    addSeries(new BubbleSeries()
        .addPoint(47, 47, 21)
        .addPoint(20, 12, 4)
        .addPoint(6, 76, 91)
        .addPoint(38, 30, 60)
        .addPoint(57, 98, 64)
        .addPoint(61, 17, 80)
        .addPoint(83, 60, 13)
        .addPoint(67, 78, 75)
        .addPoint(64, 12, 10)
        .addPoint(30, 77, 82));

  }

  @Override
  public String getLabel() {
    return "Bubble chart";
  }

}
