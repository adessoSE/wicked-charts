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
package de.adesso.wickedcharts.showcase.options;

import de.adesso.wickedcharts.highcharts.options.*;
import de.adesso.wickedcharts.highcharts.options.color.HexColor;
import de.adesso.wickedcharts.highcharts.options.series.SimpleSeries;
import de.adesso.wickedcharts.showcase.options.base.ShowcaseOptions;

public class ColumnWithRotatedLabelsOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public ColumnWithRotatedLabelsOptions() {
    this
        .setChartOptions(new ChartOptions()
            .setType(SeriesType.COLUMN)
            .setMarginTop(50)
            .setMarginRight(50)
            .setMarginBottom(100)
            .setMarginLeft(80));

    this
        .setTitle(new Title("World's largest cities per 2008"));

    this
        .setxAxis(new Axis()
            .setCategories(
                "Tokyo",
                "Jakarta",
                "New York",
                "Seoul",
                "Manila",
                "Mumbai",
                "Sao Paulo",
                "Mexico City",
                "Dehli",
                "Osaka",
                "Cairo",
                "Kolkata",
                "Los Angeles",
                "Shanghai",
                "Moscow",
                "Beijing",
                "Buenos Aires",
                "Guangzhou",
                "Shenzhen",
                "Istanbul")
            .setLabels(new Labels()
                .setRotation(-45)
                .setAlign(HorizontalAlignment.RIGHT)
                .setStyle(new CssStyle()
                    .setProperty("font-size", "13px")
                    .setProperty("font-family", "Verdana, sans-serif"))));

    this
        .setyAxis(new Axis()
            .setMin(0)
            .setTitle(new Title("Population (millions)")));

    this
        .setLegend(new Legend(Boolean.TRUE));

    this
        .setTooltip(new Tooltip()
            .setFormatter(new Function()
                .setFunction("return '<b>'+ this.x +'</b><br/>'+ 'Population in 2008: '+ Highcharts.numberFormat(this.y, 1) + ' millions';")));

    this
        .addSeries(new SimpleSeries()
            .setData(
                34.4,
                21.8,
                20.1,
                20,
                19.6,
                19.5,
                19.1,
                18.4,
                18,
                17.3,
                16.8,
                15,
                14.7,
                14.5,
                13.3,
                12.8,
                12.4,
                11.8,
                11.7,
                11.2)
            .setDataLabels(new DataLabels()
                .setEnabled(Boolean.TRUE)
                .setRotation(-90)
                .setColor(new HexColor("#ffffff"))
                .setAlign(HorizontalAlignment.RIGHT)
                .setX(-3)
                .setY(10)
                .setFormatter(new Function()
                    .setFunction(" return this.y;"))
                .setStyle(new CssStyle()
                    .setProperty("font-size", "13px")
                    .setProperty("font-family", "Verdana, sans-serif"))));

  }

  @Override
  public String getLabel() {
    return "Column with rotated labels";
  }
}
