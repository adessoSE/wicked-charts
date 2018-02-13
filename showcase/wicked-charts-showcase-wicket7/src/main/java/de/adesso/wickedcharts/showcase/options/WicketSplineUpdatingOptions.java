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

import de.adesso.wickedcharts.highcharts.options.*;
import de.adesso.wickedcharts.highcharts.options.color.HexColor;
import de.adesso.wickedcharts.highcharts.options.livedata.JavaScriptParameters;
import de.adesso.wickedcharts.highcharts.options.livedata.LiveDataSeries;
import de.adesso.wickedcharts.highcharts.options.livedata.LiveDataUpdateEvent;
import de.adesso.wickedcharts.highcharts.options.series.Point;
import de.adesso.wickedcharts.wicket7.highcharts.features.livedata.WicketLiveDataUpdateEvent;

import de.adesso.wickedcharts.showcase.options.base.ShowcaseOptions;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class WicketSplineUpdatingOptions extends ShowcaseOptions {

    private static final long serialVersionUID = 1L;

    protected LiveDataSeries series;

    protected LiveDataSeries series2;

    public WicketSplineUpdatingOptions() {

        this
                .setChartOptions(new ChartOptions()
                        .setType(SeriesType.SPLINE)
                        .setMarginRight(10));

        this
                .setTitle(new Title("Live random data"))
                .setSubtitle(
                        new Title(
                                "The Y values are calculated on the server. Depending on the value, the server creates javascript to change the color."));

        this
                .setxAxis(new Axis()
                        .setType(AxisType.DATETIME)
                        .setTickPixelInterval(150));

        this
                .setyAxis(new Axis()
                        .setTitle(new Title("Value"))
                        .setPlotLines(Collections
                                .singletonList(new PlotLine()
                                        .setValue(0f)
                                        .setWidth(1)
                                        .setColor(new HexColor("#808080")))));

        this
                .setTooltip(new Tooltip()
                        .setFormatter(new Function()
                                .setFunction("return '<b>'+ this.series.name +'</b><br/>'+"
                                        + "Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) +'<br/>'+"
                                        + "Highcharts.numberFormat(this.y, 2);")));

        this
                .setLegend(new Legend(Boolean.FALSE));

        this
                .setExporting(new ExportingOptions()
                        .setEnabled(Boolean.FALSE));

        this.series = createSeries(this.randomData(20));
        // this.series2 = createSeries(this.randomData(20));
        this.addSeries(this.series);
        // this.addSeries(this.series2);

    }

    private LiveDataSeries createSeries(final List<Point> data) {
        LiveDataSeries series = new LiveDataSeries(this, 1000) {

            private static final long serialVersionUID = 1L;

            @Override
            public Point update(final LiveDataUpdateEvent event) {
                JavaScriptParameters params = event
                        .getParameters();
                System.out
                        .println(params
                                .getParameterValue("currentTime"));

                // switch color depending on y-value
                double yValue = Math.random();
                String newColor;
                if (yValue > 0.5d) {
                    newColor = "#00ff00";
                } else {
                    newColor = "#ff0000";
                }

                Point point = new Point();
                point
                        .setX(new Date()
                                .getTime());
                point
                        .setY(yValue);
                point
                        .setMarker(new Marker()
                                .setFillColor(HexColor
                                        .fromString(newColor)));

                // update color of series via javascript
                AjaxRequestTarget target = ((WicketLiveDataUpdateEvent) event).getAjaxRequestTarget();
                target.getHeaderResponse().render(
                        OnDomReadyHeaderItem.forScript(event.getJavascriptChartName() + ".series[0].graph.attr('stroke', '"
                                + newColor
                                + "');"));

                return point;
            }
        };
        series.addJavaScriptParameter("currentTime", "new Date()");
        series.setData(data);
        series.setName("Random Data");
        return series;
    }

    /**
     * Refreshes the series data so that it starts at the current date.
     */
    public void refresh() {
        this.series
                .setData(this
                        .randomData(20));
        this.series2
                .setData(this
                        .randomData(20));
    }

    protected List<Point> randomData(final int size) {
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
