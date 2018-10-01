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
import de.adesso.wickedcharts.highcharts.options.color.RgbaColor;
import de.adesso.wickedcharts.highcharts.options.series.SimpleSeries;
import de.adesso.wickedcharts.showcase.options.highcharts.base.ShowcaseOptions;

import java.util.Arrays;
import java.util.Collections;

public class AreaSplineOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public AreaSplineOptions() {

    setChart(new ChartOptions()
        .setType(SeriesType.AREASPLINE));

    setTitle(new Title("Average fruit consumption during one week"));

    setLegend(new Legend()
        .setLayout(LegendLayout.VERTICAL)
        .setAlign(HorizontalAlignment.LEFT)
        .setVerticalAlign(VerticalAlignment.TOP)
        .setX(150)
        .setY(100)
        .setFloating(Boolean.TRUE)
        .setBorderWidth(1)
        .setBackgroundColor(new HexColor("#FFFFFF")));

    setxAxis(new Axis()
        .setCategories(
            Arrays
                .asList(new String[] { "Monday", "Tuesday", "Wednesday",
                    "Thursday", "Friday", "Saturday", "Sunday" }))
        .setPlotBands(Collections.singletonList(new PlotBand()
            .setFrom(4.5f)
            .setTo(6.5f)
            .setColor(new RgbaColor(68, 170, 213, .2f)))));

    setyAxis(new Axis()
        .setTitle(new Title("Fruit units")));

    setTooltip(new Tooltip()
        .setFormatter(new Function(" return ''+this.x +': '+ this.y +' units';")));

    setCredits(new CreditOptions()
        .setEnabled(Boolean.FALSE));

    setPlotOptions(new PlotOptionsChoice()
        .setAreaspline(new PlotOptions()
            .setFillOpacity(0.5f)));

    addSeries(new SimpleSeries()
        .setName("John")
        .setData(Arrays.asList(new Number[] { 3, 4, 3, 5, 4, 10, 12 })));

    addSeries(new SimpleSeries()
        .setName("Jane")
        .setData(Arrays.asList(new Number[] { 1, 3, 4, 3, 3, 5, 4 })));
  }

  @Override
  public String getLabel() {
    return "Area spline";
  }

}
