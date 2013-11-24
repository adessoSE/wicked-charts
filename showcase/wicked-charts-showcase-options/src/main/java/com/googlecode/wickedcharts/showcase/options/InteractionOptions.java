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

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.CreditOptions;
import com.googlecode.wickedcharts.highcharts.options.Cursor;
import com.googlecode.wickedcharts.highcharts.options.DataLabels;
import com.googlecode.wickedcharts.highcharts.options.Events;
import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.Global;
import com.googlecode.wickedcharts.highcharts.options.HorizontalAlignment;
import com.googlecode.wickedcharts.highcharts.options.Labels;
import com.googlecode.wickedcharts.highcharts.options.Legend;
import com.googlecode.wickedcharts.highcharts.options.LegendLayout;
import com.googlecode.wickedcharts.highcharts.options.Overflow;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.VerticalAlignment;
import com.googlecode.wickedcharts.highcharts.options.color.HexColor;
import com.googlecode.wickedcharts.highcharts.options.interaction.InteractionEvent;
import com.googlecode.wickedcharts.highcharts.options.interaction.InteractionFunction;
import com.googlecode.wickedcharts.highcharts.options.series.Point;
import com.googlecode.wickedcharts.highcharts.options.series.PointSeries;
import com.googlecode.wickedcharts.showcase.options.base.ShowcaseOptions;

public class InteractionOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public InteractionOptions() {

    setChartOptions(new ChartOptions()
        .setType(SeriesType.BAR));

    setGlobal(new Global()
        .setUseUTC(Boolean.TRUE));

    setTitle(new Title("Client/Server Interaction Chart"));

    setSubtitle(new Title(
        "A click on a bar will trigger an AJAX call. The server logs which bar has been clicked."));

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

    setPlotOptions(new PlotOptionsChoice()
        .setBar(new PlotOptions()
            .setCursor(Cursor.POINTER)));

    Events interactiveEvents = new Events()
        .setClick(new InteractionFunction(this) {

          @Override
          public void onInteraction(InteractionEvent event) {
            System.out
                .println("Y-Value: " + event
                    .getSelectedPoint()
                    .getY());
            System.out
                .println("Series: " + event
                    .getSelectedSeries()
                    .getName());
          }

        });

    addSeries(new PointSeries()
        .setName("Year 1800")
        .addPoint(new Point(107).setEvents(interactiveEvents))
        .addPoint(new Point(31).setEvents(interactiveEvents))
        .addPoint(new Point(635).setEvents(interactiveEvents))
        .addPoint(new Point(203).setEvents(interactiveEvents))
        .addPoint(new Point(2).setEvents(interactiveEvents)));

    addSeries(new PointSeries()
        .setName("Year 1900")
        .addPoint(new Point(133).setEvents(interactiveEvents))
        .addPoint(new Point(156).setEvents(interactiveEvents))
        .addPoint(new Point(947).setEvents(interactiveEvents))
        .addPoint(new Point(408).setEvents(interactiveEvents))
        .addPoint(new Point(6).setEvents(interactiveEvents)));

    addSeries(new PointSeries()
        .setName("Year 2008")
        .addPoint(new Point(973).setEvents(interactiveEvents))
        .addPoint(new Point(914).setEvents(interactiveEvents))
        .addPoint(new Point(4054).setEvents(interactiveEvents))
        .addPoint(new Point(732).setEvents(interactiveEvents))
        .addPoint(new Point(34).setEvents(interactiveEvents)));

  }

  @Override
  public String getLabel() {
    return "Client/Server interaction chart";
  }
}
