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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.AxisType;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.CssStyle;
import com.googlecode.wickedcharts.highcharts.options.Labels;
import com.googlecode.wickedcharts.highcharts.options.Marker;
import com.googlecode.wickedcharts.highcharts.options.Navigation;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.PlotBand;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.State;
import com.googlecode.wickedcharts.highcharts.options.StatesChoice;
import com.googlecode.wickedcharts.highcharts.options.Symbol;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.StatesChoice.StateType;
import com.googlecode.wickedcharts.highcharts.options.color.NullColor;
import com.googlecode.wickedcharts.highcharts.options.color.RgbaColor;
import com.googlecode.wickedcharts.highcharts.options.series.SimpleSeries;

/**
 * Demo of the same chart displayed in the Highcharts Demo at <a href=
 * "http://www.highcharts.com/demo/spline-plot-bands"
 * >http://www.highcharts.com/demo/spline-plot-bands</a>.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class SplineWithPlotBandsOptions extends Options {

  private static final long serialVersionUID = 1L;

  public SplineWithPlotBandsOptions() {
    ChartOptions chartOptions = new ChartOptions(SeriesType.SPLINE);
    setChartOptions(chartOptions);

    setTitle(new Title("Wind speed during two days"));
    setSubtitle(new Title(
        "October 6th and 7th 2009 at two locations in Vik i Sogn, Norway"));

    setxAxis(new Axis(AxisType.DATETIME));

    List<PlotBand> plotBands = new ArrayList<PlotBand>();
    plotBands
        .add(createPlotBand("Light air", 0.3f, 1.5f, true));
    plotBands
        .add(createPlotBand("Light breeze", 1.5f, 3.3f, false));
    plotBands
        .add(createPlotBand("Gentle breeze", 3.3f, 5.5f, true));
    plotBands
        .add(createPlotBand("Moderate breeze", 5.5f, 8, false));
    plotBands
        .add(createPlotBand("Fresh breeze", 8, 11, true));
    plotBands
        .add(createPlotBand("Strong breeze", 11, 14, false));
    plotBands
        .add(createPlotBand("High wind", 14, 15, true));

    Axis yAxis = new Axis();
    yAxis
        .setTitle(new Title("Wind speed (m/s)"));
    yAxis
        .setMin(0);
    yAxis
        .setMinorGridLineWidth(0);
    yAxis
        .setGridLineWidth(0);
    yAxis
        .setAlternateGridColor(new NullColor());
    yAxis
        .setPlotBands(plotBands);
    setyAxis(yAxis);

    setTooltip(new Tooltip());

    State hoverState = new State();
    hoverState
        .setLineWidth(5);

    StatesChoice states = new StatesChoice(hoverState, StateType.HOVER);

    State markerHoverState = new State();
    markerHoverState
        .setEnabled(Boolean.TRUE);
    markerHoverState
        .setSymbol(new Symbol(Symbol.PredefinedSymbol.CIRCLE));
    markerHoverState
        .setRadius(5);
    markerHoverState
        .setLineWidth(1);

    Marker marker = new Marker(Boolean.FALSE);
    marker
        .setStates(new StatesChoice(markerHoverState, StateType.HOVER));

    Calendar cal = Calendar
        .getInstance();
    cal
        .set(Calendar.YEAR, 2009);
    cal
        .set(Calendar.MONTH, 9);
    cal
        .set(Calendar.DAY_OF_MONTH, 6);

    PlotOptions plotOptions = new PlotOptions();
    plotOptions
        .setLineWidth(4);
    plotOptions
        .setStates(states);
    plotOptions
        .setMarker(marker);
    plotOptions
        .setPointInterval(3600000); // one hour
    plotOptions
        .setPointStart(cal
            .getTimeInMillis());
    setPlotOptions(new PlotOptionsChoice()
        .setSpline(plotOptions));

    SimpleSeries series1 = new SimpleSeries();
    series1
        .setName("Hestavollane");
    series1
        .setData(Arrays
            .asList(new Number[] { 4.3, 5.1, 4.3, 5.2, 5.4, 4.7, 3.5, 4.1, 5.6,
                7.4, 6.9, 7.1, 7.9, 7.9, 7.5, 6.7, 7.7, 7.7, 7.4, 7.0, 7.1,
                5.8, 5.9, 7.4, 8.2, 8.5, 9.4, 8.1, 10.9, 10.4, 10.9, 12.4,
                12.1, 9.5, 7.5, 7.1, 7.5, 8.1, 6.8, 3.4, 2.1, 1.9, 2.8, 2.9,
                1.3, 4.4, 4.2, 3.0, 3.0 }));
    addSeries(series1);

    SimpleSeries series2 = new SimpleSeries();
    series2
        .setName("Voll");
    series2
        .setData(Arrays
            .asList(new Number[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.1,
                0.0, 0.3, 0.0, 0.0, 0.4, 0.0, 0.1, 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0, 0.0, 0.0, 0.6, 1.2, 1.7, 0.7, 2.9, 4.1, 2.6, 3.7,
                3.9, 1.7, 2.3, 3.0, 3.3, 4.8, 5.0, 4.8, 5.0, 3.2, 2.0, 0.9,
                0.4, 0.3, 0.5, 0.4 }));
    addSeries(series2);

    Navigation navigation = new Navigation();
    navigation
        .setMenuItemStyle(new CssStyle());

    setNavigation(navigation);

  }

  private PlotBand createPlotBand(final String label, final float from,
      final float to, final boolean highlighted) {
    Labels plotBandLabel = new Labels(label);
    plotBandLabel
        .setStyle(new CssStyle());

    PlotBand plotBand = new PlotBand();
    plotBand
        .setFrom(from);
    plotBand
        .setTo(to);
    plotBand
        .setLabel(plotBandLabel);
    if (highlighted) {
      plotBand
          .setColor(new RgbaColor(68, 170, 213, 0.1f));
    } else {
      plotBand
          .setColor(new RgbaColor(0, 0, 0, 0.0f));
    }

    return plotBand;
  }

}
