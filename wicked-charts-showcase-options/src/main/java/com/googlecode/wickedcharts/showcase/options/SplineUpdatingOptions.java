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
package com.googlecode.wickedcharts.showcase.options;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.AxisType;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.ExportingOptions;
import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.Legend;
import com.googlecode.wickedcharts.highcharts.options.PlotLine;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.color.HexColor;
import com.googlecode.wickedcharts.highcharts.options.livedata.LiveDataSeries;
import com.googlecode.wickedcharts.highcharts.options.series.Coordinate;
import com.googlecode.wickedcharts.highcharts.options.series.Point;
import com.googlecode.wickedcharts.showcase.options.base.ShowcaseOptions;

public class SplineUpdatingOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  private LiveDataSeries series;

  public SplineUpdatingOptions() {

    this.setChartOptions(new ChartOptions()
        .setType(SeriesType.SPLINE)
        .setMarginRight(10));

    this.setTitle(new Title("Live random data"));

    this.setxAxis(new Axis()
        .setType(AxisType.DATETIME)
        .setTickPixelInterval(150));

    this.setyAxis(new Axis()
        .setTitle(new Title("Value"))
        .setPlotLines(Collections.singletonList(new PlotLine()
            .setValue(0f)
            .setWidth(1)
            .setColor(new HexColor("#808080")))));

    this.setTooltip(new Tooltip()
        .setFormatter(new Function()
            .setFunction("return '<b>'+ this.series.name +'</b><br/>'+"
                + "Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) +'<br/>'+"
                + "Highcharts.numberFormat(this.y, 2);")));

    this.setLegend(new Legend(Boolean.FALSE));

    this.setExporting(new ExportingOptions()
        .setEnabled(Boolean.FALSE));

    this.series = new LiveDataSeries(this, 1000) {

      private static final long serialVersionUID = 1L;

      @Override
      public Coordinate<Number, Number> update() {
        return new Coordinate<Number, Number>(new Date().getTime(),
            Math
                .random());
      }
    };
    this.series
        .setData(this.randomData(20))
        .setName("Random data");
    this.addSeries(this.series);

  }

  /**
   * Refreshes the series data so that it starts at the current date.
   */
  public void refresh() {
    this.series
        .setData(this.randomData(20));
  }

  private List<Point> randomData(int size) {
    long time = new Date()
        .getTime() - 20000;
    List<Point> result = new ArrayList<Point>();
    for (int i = 0; i < size; i++) {
      result
          .add(new Point()
              .setX(time)
              .setY(Math
                  .random()));
      time += 1000;
    }
    return result;
  }

  @Override
  public String getLabel() {
    return "Spline updating each second";
  }

}
