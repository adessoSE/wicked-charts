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
package de.adesso.wickedcharts.showcase.options;

import de.adesso.wickedcharts.highcharts.options.*;
import de.adesso.wickedcharts.highcharts.options.color.HexColor;
import de.adesso.wickedcharts.highcharts.options.series.SimpleSeries;
import de.adesso.wickedcharts.showcase.options.base.ShowcaseOptions;

import java.util.Arrays;

public class AreaMissingOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public AreaMissingOptions() {

    setChartOptions(new ChartOptions()
        .setType(SeriesType.AREA)
        .setSpacingBottom(30));

    setTitle(new Title("Fruit consumption *"));

    setSubtitle(new Title()
        .setText("* Jane's banana consumption is unknown")
        .setFloating(Boolean.TRUE)
        .setAlign(HorizontalAlignment.RIGHT)
        .setVerticalAlign(VerticalAlignment.BOTTOM)
        .setY(15));

    setLegend(new Legend()
        .setLayout(LegendLayout.VERTICAL)
        .setAlign(HorizontalAlignment.LEFT)
        .setVerticalAlign(VerticalAlignment.TOP)
        .setX(150)
        .setY(100)
        .setFloating(Boolean.TRUE)
        .setBorderWidth(1)
        .setBackgroundColor(new HexColor("#ffffff")));

    setxAxis(new Axis()
        .setCategories(Arrays
            .asList(new String[] { "Apples", "Pears", "Oranges", "Bananas",
                "Grapes", "Plums", "Strawberries", "Raspberries" })));

    setyAxis(new Axis()
        .setTitle(new Title("Y-Axis"))
        .setLabels(new Labels().setFormatter(new Function()
            .setFunction("return this.value;"))));

    setTooltip(new Tooltip()
        .setFormatter(new Function()
            .setFunction("return '<b>'+ this.series.name +'</b><br/>'+this.x +': '+ this.y;")));

    setPlotOptions(new PlotOptionsChoice()
        .setArea(new PlotOptions()
            .setFillOpacity(0.5f)));

    setCredits(new CreditOptions()
        .setEnabled(Boolean.FALSE));

    addSeries(new SimpleSeries()
        .setName("John")
        .setData(Arrays.asList(new Number[] { 0, 1, 4, 4, 5, 2, 3, 7 })));
    addSeries(new SimpleSeries()
        .setName("Jane")
        .setData(Arrays.asList(new Number[] { 1, 0, 3, null, 3, 1, 2, 1 })));

  }

  @Override
  public String getLabel() {
    return "Area with missing points";
  }
}
