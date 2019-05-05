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
import de.adesso.wickedcharts.highcharts.options.series.CoordinatesSeries;
import de.adesso.wickedcharts.showcase.options.highcharts.base.ShowcaseOptions;

/**
 * Demo of the same chart displayed in the Highcharts Demo at <a href=
 * "http://www.highcharts.com/demo/spline-inverted"
 * >http://www.highcharts.com/demo/spline-inverted</a>.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class SplineWithInvertedAxisOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public SplineWithInvertedAxisOptions() {

    ChartOptions chartOptions = new ChartOptions();
    chartOptions
        .setType(SeriesType.SPLINE);
    chartOptions
        .setInverted(Boolean.TRUE);
    chartOptions
        .setStyle(new CssStyle());
    this
        .setChartOptions(chartOptions);

    this
        .setTitle(new Title("Atmosphere Temperature by Altitude"));
    this
        .setSubtitle(new Title("According to the Standard Atmosphere Model"));

    Title AxisTitle = new Title("Altitude");
    AxisTitle
        .setEnabled(Boolean.TRUE);

    Axis xAxis = new Axis();
    xAxis
        .setReversed(Boolean.FALSE);
    xAxis
        .setTitle(AxisTitle);
    xAxis
        .setLabels(new Labels()
            .setStyle(new CssStyle()));
    xAxis
        .setMaxPadding(0.05f);
    xAxis
        .setShowLastLabel(Boolean.TRUE);
    this
        .setyAxis(xAxis);

    Axis yAxis = new Axis();
    yAxis
        .setTitle(new Title("Temperature"));
    yAxis
        .setLabels(new Labels()
            .setStyle(new CssStyle()));
    yAxis
        .setLineWidth(2);
    this
        .setyAxis(yAxis);

    this
        .setLegend(new Legend(Boolean.TRUE));

    this
        .setTooltip(new Tooltip()
            .setFormatter(new Function()
                .setFunction("return '' + this.x +' km: '+ this.y +'C';")));

    PlotOptions splineOptions = new PlotOptions();
    splineOptions
        .setMarker(new Marker(Boolean.TRUE));

    this
        .setPlotOptions(new PlotOptionsChoice()
            .setSpline(splineOptions));
    CoordinatesSeries series = new CoordinatesSeries();
    series
        .addPoint(0, 15)
        .addPoint(10, -50)
        .addPoint(20, -56.5)
        .addPoint(30, -46.5)
        .addPoint(40, -22.1)
        .addPoint(50, -2.5)
        .addPoint(60, -27.7)
        .addPoint(70, -55.7)
        .addPoint(80, -76.5);
    this
        .addSeries(series);

  }

  @Override
  public String getLabel() {
    return "Spline with inverted axis";
  }
}
