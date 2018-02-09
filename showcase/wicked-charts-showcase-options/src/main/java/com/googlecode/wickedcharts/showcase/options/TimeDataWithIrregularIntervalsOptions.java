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
import java.util.List;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.AxisType;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.DateTimeLabelFormat;
import com.googlecode.wickedcharts.highcharts.options.DateTimeLabelFormat.DateTimeProperties;
import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.series.Coordinate;
import com.googlecode.wickedcharts.highcharts.options.series.CustomCoordinatesSeries;
import com.googlecode.wickedcharts.showcase.options.base.ShowcaseOptions;

/**
 * Demo of the same spline chart with irregular intervals displayed in the
 * Highcharts Demo at <a href=
 * "http://highcharts.com/demo/spline-irregular-time"
 * >http://highcharts.com/demo/spline-irregular-time</a>.
 * 
 * @author Matthias Balke (matthias.balke@gmail.com)
 * 
 */
public class TimeDataWithIrregularIntervalsOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public TimeDataWithIrregularIntervalsOptions() {
    ChartOptions chartOptions = new ChartOptions();
    chartOptions
        .setType(SeriesType.SPLINE);
    this
        .setChartOptions(chartOptions);

    this
        .setTitle(new Title("Snow depth in the Vikjafjellet mountain, Norway"));
    this
        .setSubtitle(new Title(
            "An example of irregular time data in Highcharts JS"));

    Axis xAxis = new Axis();
    xAxis
        .setType(AxisType.DATETIME);

    DateTimeLabelFormat dateTimeLabelFormat = new DateTimeLabelFormat()
        .setProperty(DateTimeProperties.MONTH, "%e. %b")
        .setProperty(DateTimeProperties.YEAR, "%b");
    xAxis
        .setDateTimeLabelFormats(dateTimeLabelFormat);
    this
        .setxAxis(xAxis);

    Axis yAxis = new Axis();
    yAxis
        .setTitle(new Title("Snow depth (m)"));
    yAxis
        .setMin(0);
    this
        .setyAxis(yAxis);

    Tooltip tooltip = new Tooltip();
    tooltip
        .setFormatter(new Function(
            "return '<b>'+ this.series.name +'</b><br/>'+Highcharts.dateFormat('%e. %b', this.x) +': '+ this.y +' m';"));
    this
        .setTooltip(tooltip);

    // Define the data points. All series have a dummy year
    // of 1970/71 in order to be compared on the same x axis. Note
    // that in JavaScript, months start at 0 for January, 1 for February etc.

    List<Coordinate<String, Float>> seriesData1 = new ArrayList<Coordinate<String, Float>>();
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1970,  9, 27)", 0f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1970, 10, 10)", 0.6f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1970, 10, 18)", 0.7f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1970, 11,  2)", 0.8f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1970, 11,  9)", 0.6f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1970, 11, 16)", 0.6f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1970, 11, 28)", 0.67f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1971,  0,  1)", 0.81f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1971,  0,  8)", 0.78f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1971,  0, 12)", 0.98f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1971,  0, 27)", 1.84f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1971,  1, 10)", 1.80f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1971,  1, 18)", 1.80f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1971,  1, 24)", 1.92f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1971,  2,  4)", 2.49f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1971,  2, 11)", 2.79f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1971,  2, 15)", 2.73f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1971,  2, 25)", 2.61f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1971,  3,  2)", 2.76f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1971,  3,  6)", 2.82f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1971,  3, 13)", 2.8f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1971,  4,  3)", 2.1f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1971,  4, 26)", 1.1f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1971,  5,  9)", 0.25f));
    seriesData1
        .add(new Coordinate<String, Float>("Date.UTC(1971,  5, 12)", 0f));

    CustomCoordinatesSeries<String, Float> series1 = new CustomCoordinatesSeries<String, Float>();
    series1
        .setName("Winter 2007-2008");
    series1
        .setData(seriesData1);
    addSeries(series1);

    List<Coordinate<String, Float>> seriesData2 = new ArrayList<Coordinate<String, Float>>();
    seriesData2
        .add(new Coordinate<String, Float>("Date.UTC(1970,  9, 18)", 0f));
    seriesData2
        .add(new Coordinate<String, Float>("Date.UTC(1970,  9, 26)", 0.2f));
    seriesData2
        .add(new Coordinate<String, Float>("Date.UTC(1970, 11,  1)", 0.47f));
    seriesData2
        .add(new Coordinate<String, Float>("Date.UTC(1970, 11, 11)", 0.55f));
    seriesData2
        .add(new Coordinate<String, Float>("Date.UTC(1970, 11, 25)", 1.38f));
    seriesData2
        .add(new Coordinate<String, Float>("Date.UTC(1971,  0,  8)", 1.38f));
    seriesData2
        .add(new Coordinate<String, Float>("Date.UTC(1971,  0, 15)", 1.38f));
    seriesData2
        .add(new Coordinate<String, Float>("Date.UTC(1971,  1,  1)", 1.38f));
    seriesData2
        .add(new Coordinate<String, Float>("Date.UTC(1971,  1,  8)", 1.48f));
    seriesData2
        .add(new Coordinate<String, Float>("Date.UTC(1971,  1, 21)", 1.5f));
    seriesData2
        .add(new Coordinate<String, Float>("Date.UTC(1971,  2, 12)", 1.89f));
    seriesData2
        .add(new Coordinate<String, Float>("Date.UTC(1971,  2, 25)", 2.0f));
    seriesData2
        .add(new Coordinate<String, Float>("Date.UTC(1971,  3,  4)", 1.94f));
    seriesData2
        .add(new Coordinate<String, Float>("Date.UTC(1971,  3,  9)", 1.91f));
    seriesData2
        .add(new Coordinate<String, Float>("Date.UTC(1971,  3, 13)", 1.75f));
    seriesData2
        .add(new Coordinate<String, Float>("Date.UTC(1971,  3, 19)", 1.6f));
    seriesData2
        .add(new Coordinate<String, Float>("Date.UTC(1971,  4, 25)", 0.6f));
    seriesData2
        .add(new Coordinate<String, Float>("Date.UTC(1971,  4, 31)", 0.35f));
    seriesData2
        .add(new Coordinate<String, Float>("Date.UTC(1971,  5,  7)", 0f));

    CustomCoordinatesSeries<String, Float> series2 = new CustomCoordinatesSeries<String, Float>();
    series2
        .setName("Winter 2008-2009");
    series2
        .setData(seriesData2);
    addSeries(series2);

    List<Coordinate<String, Float>> seriesData3 = new ArrayList<Coordinate<String, Float>>();
    seriesData3
        .add(new Coordinate<String, Float>("Date.UTC(1970,  9,  9)", 0f));
    seriesData3
        .add(new Coordinate<String, Float>("Date.UTC(1970,  9, 14)", 0.15f));
    seriesData3
        .add(new Coordinate<String, Float>("Date.UTC(1970, 10, 28)", 0.35f));
    seriesData3
        .add(new Coordinate<String, Float>("Date.UTC(1970, 11, 12)", 0.46f));
    seriesData3
        .add(new Coordinate<String, Float>("Date.UTC(1971,  0,  1)", 0.59f));
    seriesData3
        .add(new Coordinate<String, Float>("Date.UTC(1971,  0, 24)", 0.58f));
    seriesData3
        .add(new Coordinate<String, Float>("Date.UTC(1971,  1,  1)", 0.62f));
    seriesData3
        .add(new Coordinate<String, Float>("Date.UTC(1971,  1,  7)", 0.65f));
    seriesData3
        .add(new Coordinate<String, Float>("Date.UTC(1971,  1, 23)", 0.77f));
    seriesData3
        .add(new Coordinate<String, Float>("Date.UTC(1971,  2,  8)", 0.77f));
    seriesData3
        .add(new Coordinate<String, Float>("Date.UTC(1971,  2, 14)", 0.79f));
    seriesData3
        .add(new Coordinate<String, Float>("Date.UTC(1971,  2, 24)", 0.86f));
    seriesData3
        .add(new Coordinate<String, Float>("Date.UTC(1971,  3,  4)", 0.8f));
    seriesData3
        .add(new Coordinate<String, Float>("Date.UTC(1971,  3, 18)", 0.94f));
    seriesData3
        .add(new Coordinate<String, Float>("Date.UTC(1971,  3, 24)", 0.9f));
    seriesData3
        .add(new Coordinate<String, Float>("Date.UTC(1971,  4, 16)", 0.39f));
    seriesData3
        .add(new Coordinate<String, Float>("Date.UTC(1971,  4, 21)", 0f));

    CustomCoordinatesSeries<String, Float> series3 = new CustomCoordinatesSeries<String, Float>();
    series3
        .setName("Winter 2009-20010");
    series3
        .setData(seriesData3);
    addSeries(series3);

  }

  @Override
  public String getLabel() {
    return "Time data with irregular intervals";
  }
}
