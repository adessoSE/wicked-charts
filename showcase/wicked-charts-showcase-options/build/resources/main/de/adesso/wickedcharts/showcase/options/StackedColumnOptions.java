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
package de.adesso.wickedcharts.showcase.options;

import de.adesso.wickedcharts.highcharts.options.Axis;
import de.adesso.wickedcharts.highcharts.options.ChartOptions;
import de.adesso.wickedcharts.highcharts.options.CssStyle;
import de.adesso.wickedcharts.highcharts.options.DataLabels;
import de.adesso.wickedcharts.highcharts.options.HorizontalAlignment;
import de.adesso.wickedcharts.highcharts.options.Legend;
import de.adesso.wickedcharts.highcharts.options.PlotOptions;
import de.adesso.wickedcharts.highcharts.options.PlotOptionsChoice;
import de.adesso.wickedcharts.highcharts.options.SeriesType;
import de.adesso.wickedcharts.highcharts.options.StackLabels;
import de.adesso.wickedcharts.highcharts.options.Stacking;
import de.adesso.wickedcharts.highcharts.options.Title;
import de.adesso.wickedcharts.highcharts.options.Tooltip;
import de.adesso.wickedcharts.highcharts.options.VerticalAlignment;
import de.adesso.wickedcharts.highcharts.options.color.HexColor;
import de.adesso.wickedcharts.highcharts.options.functions.StackTotalFormatter;
import de.adesso.wickedcharts.highcharts.options.series.SimpleSeries;
import de.adesso.wickedcharts.showcase.options.base.ShowcaseOptions;

public class StackedColumnOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public StackedColumnOptions() {

    setChartOptions(new ChartOptions()
        .setType(SeriesType.COLUMN));

    setTitle(new Title("Stacked column chart"));

    setxAxis(new Axis()
        .setCategories("Apples", "Oranges", "Pears", "Grapes", "Bananas"));

    setyAxis(new Axis()
        .setMin(0)
        .setTitle(new Title("Total fruit consumption"))
        .setStackLabels(new StackLabels()
            .setEnabled(Boolean.TRUE)
            .setStyle(new CssStyle()
                .setProperty("font-weight", "bold")
                .setProperty("color", "gray"))));

    setLegend(new Legend()
        .setAlign(HorizontalAlignment.RIGHT)
        .setX(-100)
        .setVerticalAlign(VerticalAlignment.TOP)
        .setY(20)
        .setFloating(Boolean.TRUE)
        .setBackgroundColor(new HexColor("#FFFFFF"))
        .setBorderColor(new HexColor("#CCCCCC"))
        .setBorderWidth(1)
        .setShadow(Boolean.FALSE));

    setTooltip(new Tooltip()
        .setFormatter(new StackTotalFormatter()));

    setPlotOptions(new PlotOptionsChoice()
        .setColumn(new PlotOptions()
            .setStacking(Stacking.NORMAL)
            .setDataLabels(new DataLabels()
                .setEnabled(Boolean.TRUE)
                .setColor(new HexColor("#FFFFFF")))));

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

  @Override
  public String getLabel() {
    return "Stacked column";
  }
}
