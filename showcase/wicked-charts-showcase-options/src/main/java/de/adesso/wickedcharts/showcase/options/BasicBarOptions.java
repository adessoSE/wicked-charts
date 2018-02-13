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
import de.adesso.wickedcharts.highcharts.options.CreditOptions;
import de.adesso.wickedcharts.highcharts.options.DataLabels;
import de.adesso.wickedcharts.highcharts.options.Function;
import de.adesso.wickedcharts.highcharts.options.Global;
import de.adesso.wickedcharts.highcharts.options.HorizontalAlignment;
import de.adesso.wickedcharts.highcharts.options.Labels;
import de.adesso.wickedcharts.highcharts.options.Legend;
import de.adesso.wickedcharts.highcharts.options.LegendLayout;
import de.adesso.wickedcharts.highcharts.options.Overflow;
import de.adesso.wickedcharts.highcharts.options.PlotOptions;
import de.adesso.wickedcharts.highcharts.options.PlotOptionsChoice;
import de.adesso.wickedcharts.highcharts.options.SeriesType;
import de.adesso.wickedcharts.highcharts.options.Title;
import de.adesso.wickedcharts.highcharts.options.Tooltip;
import de.adesso.wickedcharts.highcharts.options.VerticalAlignment;
import de.adesso.wickedcharts.highcharts.options.color.HexColor;
import de.adesso.wickedcharts.highcharts.options.series.SimpleSeries;
import de.adesso.wickedcharts.showcase.options.base.ShowcaseOptions;

public class BasicBarOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public BasicBarOptions() {

    setChartOptions(new ChartOptions()
        .setType(SeriesType.BAR));

    setGlobal(new Global()
        .setUseUTC(Boolean.TRUE));

    setTitle(new Title("Historic World Population by Region"));

    setSubtitle(new Title("Source: Wikipedia.org"));

    setxAxis(new Axis()
        .setCategories("Africa", "America", "Asia", "Europe", "Oceania")
        .setTitle(new Title(null)));

    setyAxis(new Axis()
        .setTitle(
            new Title("Population (millions)")
                .setAlign(HorizontalAlignment.HIGH))
        .setLabels(new Labels().setOverflow(Overflow.JUSTIFY)));

    setTooltip(new Tooltip()
        .setFormatter(new Function(
            "return ''+this.series.name +': '+ this.y +' millions';")));

    setPlotOptions(new PlotOptionsChoice()
        .setBar(new PlotOptions()
            .setDataLabels(new DataLabels()
                .setEnabled(Boolean.TRUE))));

    setLegend(new Legend()
        .setLayout(LegendLayout.VERTICAL)
        .setAlign(HorizontalAlignment.RIGHT)
        .setVerticalAlign(VerticalAlignment.TOP)
        .setX(-100)
        .setY(100)
        .setFloating(Boolean.TRUE)
        .setBorderWidth(1)
        .setBackgroundColor(new HexColor("#ffffff"))
        .setShadow(Boolean.TRUE));

    setCredits(new CreditOptions()
        .setEnabled(Boolean.FALSE));

    addSeries(new SimpleSeries()
        .setName("Year 1800")
        .setData(107, 31, 635, 203, 2));

    addSeries(new SimpleSeries()
        .setName("Year 1900")
        .setData(133, 156, 947, 408, 6));

    addSeries(new SimpleSeries()
        .setName("Year 2008")
        .setData(973, 914, 4054, 732, 34));

  }

  @Override
  public String getLabel() {
    return "Basic bar";
  }
}
