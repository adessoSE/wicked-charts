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

import de.adesso.wickedcharts.highcharts.options.Axis;
import de.adesso.wickedcharts.highcharts.options.ChartOptions;
import de.adesso.wickedcharts.highcharts.options.Function;
import de.adesso.wickedcharts.highcharts.options.HorizontalAlignment;
import de.adesso.wickedcharts.highcharts.options.Legend;
import de.adesso.wickedcharts.highcharts.options.LegendLayout;
import de.adesso.wickedcharts.highcharts.options.PlotOptions;
import de.adesso.wickedcharts.highcharts.options.PlotOptionsChoice;
import de.adesso.wickedcharts.highcharts.options.SeriesType;
import de.adesso.wickedcharts.highcharts.options.Title;
import de.adesso.wickedcharts.highcharts.options.Tooltip;
import de.adesso.wickedcharts.highcharts.options.VerticalAlignment;
import de.adesso.wickedcharts.highcharts.options.color.HexColor;
import de.adesso.wickedcharts.highcharts.options.series.SimpleSeries;
import de.adesso.wickedcharts.showcase.options.base.ShowcaseOptions;

public class BasicColumnOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public BasicColumnOptions() {

    setChartOptions(new ChartOptions()
        .setType(SeriesType.COLUMN));

    setTitle(new Title("Monthly Average Rainfall"));

    setSubtitle(new Title("Source: WorldClimate.com"));

    setxAxis(new Axis()
        .setCategories(
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "Jul",
            "Aug",
            "Sep",
            "Oct",
            "Nov",
            "Dec"));

    setyAxis(new Axis()
        .setMin(0)
        .setTitle(new Title("Rainfall (mm)")));

    setLegend(new Legend()
        .setLayout(LegendLayout.VERTICAL)
        .setBackgroundColor(new HexColor("#FFFFFF"))
        .setAlign(HorizontalAlignment.LEFT)
        .setVerticalAlign(VerticalAlignment.TOP)
        .setX(100)
        .setY(70)
        .setFloating(Boolean.TRUE)
        .setShadow(Boolean.TRUE));

    setTooltip(new Tooltip()
        .setFormatter(new Function()
            .setFunction(" return ''+ this.x +': '+ this.y +' mm';")));

    setPlotOptions(new PlotOptionsChoice()
        .setColumn(new PlotOptions()
            .setPointPadding(0.2f)
            .setBorderWidth(0)));

    addSeries(new SimpleSeries()
        .setName("Tokyo")
        .setData(
            49.9,
            71.5,
            106.4,
            129.2,
            144.0,
            176.0,
            135.6,
            148.5,
            216.4,
            194.1,
            95.6,
            54.4));

    addSeries(new SimpleSeries()
        .setName("New York")
        .setData(
            83.6,
            78.8,
            98.5,
            93.4,
            106.0,
            84.5,
            105.0,
            104.3,
            91.2,
            83.5,
            106.6,
            92.3));

    addSeries(new SimpleSeries()
        .setName("London")
        .setData(
            48.9,
            38.8,
            39.3,
            41.4,
            47.0,
            48.3,
            59.0,
            59.6,
            52.4,
            65.2,
            59.3,
            51.2));

    addSeries(new SimpleSeries()
        .setName("Berlin")
        .setData(
            42.4,
            33.2,
            34.5,
            39.7,
            52.6,
            75.5,
            57.4,
            60.4,
            47.6,
            39.1,
            46.8,
            51.1));

  }

  @Override
  public String getLabel() {
    return "Basic column";
  }
}
