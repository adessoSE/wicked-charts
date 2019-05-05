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
import de.adesso.wickedcharts.highcharts.options.series.SimpleSeries;
import de.adesso.wickedcharts.showcase.options.highcharts.base.ShowcaseOptions;

import java.util.Arrays;

public class PercentageAreaOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public PercentageAreaOptions() {
    setChartOptions(new ChartOptions()
        .setType(SeriesType.AREA));

    setTitle(new Title(
        "Historic and Estimated Worldwide Population Growth by Region"));

    setSubtitle(new Title("Source: Wikipedia.org"));

    setxAxis(new Axis()
        .setCategories(
            Arrays
                .asList(new String[] { "1750", "1800", "1850", "1900", "1950",
                    "1999", "2050" }))
        .setTickmarkPlacement(TickmarkPlacement.ON)
        .setTitle(new Title().setEnabled(Boolean.FALSE)));

    setyAxis(new Axis()
        .setTitle(new Title("Percent")));

    setTooltip(new Tooltip()
        .setFormatter(new Function()
            .setFunction("return ''+this.x +': '+ Highcharts.numberFormat(this.percentage, 1) +'% ('+Highcharts.numberFormat(this.y, 0, ',') +' millions)';")));

    setPlotOptions(new PlotOptionsChoice()
        .setArea(new PlotOptions()
            .setStacking(Stacking.PERCENT)
            .setLineColor(new HexColor("#ffffff"))
            .setLineWidth(1)
            .setMarker(new Marker()
                .setLineWidth(1)
                .setLineColor(new HexColor("#ffffff")))));

    addSeries(new SimpleSeries()
        .setName("Asia")
        .setData(
            Arrays
                .asList(new Number[] { 502, 635, 809, 947, 1402, 3634, 5268 })));

    addSeries(new SimpleSeries()
        .setName("Africa")
        .setData(
            Arrays
                .asList(new Number[] { 106, 107, 111, 133, 221, 767, 1766 })));

    addSeries(new SimpleSeries()
        .setName("Europe")
        .setData(
            Arrays
                .asList(new Number[] { 163, 203, 276, 408, 547, 729, 628 })));

    addSeries(new SimpleSeries()
        .setName("America")
        .setData(
            Arrays
                .asList(new Number[] { 18, 31, 54, 156, 339, 818, 1201 })));

    addSeries(new SimpleSeries()
        .setName("Oceania")
        .setData(Arrays.asList(new Number[] { 2, 2, 2, 6, 13, 30, 46 })));
  }

  @Override
  public String getLabel() {
    return "Percentage area";
  }
}
