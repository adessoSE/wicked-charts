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

import java.util.Arrays;

import de.adesso.wickedcharts.highcharts.options.Axis;
import de.adesso.wickedcharts.highcharts.options.ChartOptions;
import de.adesso.wickedcharts.highcharts.options.Function;
import de.adesso.wickedcharts.highcharts.options.Labels;
import de.adesso.wickedcharts.highcharts.options.Pane;
import de.adesso.wickedcharts.highcharts.options.PlotOptions;
import de.adesso.wickedcharts.highcharts.options.PlotOptionsChoice;
import de.adesso.wickedcharts.highcharts.options.PointPlacement;
import de.adesso.wickedcharts.highcharts.options.SeriesType;
import de.adesso.wickedcharts.highcharts.options.Title;
import de.adesso.wickedcharts.highcharts.options.series.SimpleSeries;
import de.adesso.wickedcharts.showcase.options.base.ShowcaseOptions;

/**
 * Demo of the same polar chart displayed in the Highcharts Demo at <a href=
 * "http://www.highcharts.com/demo/polar"
 * >http://www.highcharts.com/demo/polar</a>.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class PolarOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public PolarOptions() {
    ChartOptions chartOptions = new ChartOptions()
        .setPolar(Boolean.TRUE);
    setChartOptions(chartOptions);

    setTitle(new Title("Highcharts Polar Chart"));

    setPane(new Pane()
        .setStartAngle(0)
        .setEndAngle(360));

    setxAxis(new Axis()
        .setTickInterval(45f)
        .setMin(0)
        .setMax(360)
        .setLabels(new Labels().setFormatter(new Function())));

    setyAxis(new Axis()
        .setMin(0));

    setPlotOptions(new PlotOptionsChoice()
        .setSeries(new PlotOptions()
            .setPointStart(0l)
            .setPointInterval(45))
        .setColumn(new PlotOptions()
            .setPointPadding(0f)
            .setGroupPadding(0f)));

    addSeries(new SimpleSeries()
        .setData(Arrays.asList(new Number[] { 8, 7, 6, 5, 4, 3, 2, 1 }))
        .setType(SeriesType.COLUMN)
        .setName("Column")
        .setPointPlacement(PointPlacement.BETWEEN));

    addSeries(new SimpleSeries()
        .setData(Arrays.asList(new Number[] { 1, 2, 3, 4, 5, 6, 7, 8 }))
        .setType(SeriesType.LINE)
        .setName("Line"));

    addSeries(new SimpleSeries()
        .setData(Arrays.asList(new Number[] { 1, 8, 2, 7, 3, 6, 4, 5 }))
        .setType(SeriesType.AREA)
        .setName("Area"));

  }

  @Override
  public String getLabel() {
    return "Polar chart";
  }
}
