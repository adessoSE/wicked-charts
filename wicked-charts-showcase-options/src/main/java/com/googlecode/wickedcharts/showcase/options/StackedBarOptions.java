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
import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.Legend;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Stacking;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.color.HexColor;
import com.googlecode.wickedcharts.highcharts.options.series.SimpleSeries;

public class StackedBarOptions extends Options {

  private static final long serialVersionUID = 1L;

  public StackedBarOptions() {

    setChartOptions(new ChartOptions()
        .setType(SeriesType.BAR));

    setTitle(new Title("Stacked bar chart"));

    setxAxis(new Axis()
        .setCategories("Apples", "Oranges", "Pears", "Grapes", "Bananas"));

    setyAxis(new Axis()
        .setMin(0)
        .setTitle(new Title("Total fruit consumption")));

    setLegend(new Legend()
        .setBackgroundColor(new HexColor("#FFFFFF"))
        .setReversed(Boolean.TRUE));

    setTooltip(new Tooltip()
        .setFormatter(new Function()
            .setFunction("return ''+ this.series.name +': '+ this.y +'';")));

    setPlotOptions(new PlotOptionsChoice()
        .setSeries(new PlotOptions()
            .setStacking(Stacking.NORMAL)));

    addSeries(new SimpleSeries()
        .setName("John")
        .setData(5, 3, 4, 7, 2));

    addSeries(new SimpleSeries()
        .setName("Jane")
        .setData(2, 2, 3, 2, 1));

    addSeries(new SimpleSeries()
        .setName("Joe")
        .setData(3, 4, 4, 2, 5));

  }
}
