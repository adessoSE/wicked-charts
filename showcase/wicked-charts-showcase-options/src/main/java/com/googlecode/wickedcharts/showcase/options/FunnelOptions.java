package com.googlecode.wickedcharts.showcase.options;

import com.googlecode.wickedcharts.highcharts.options.*;
import com.googlecode.wickedcharts.highcharts.options.series.Coordinate;
import com.googlecode.wickedcharts.highcharts.options.series.CustomCoordinatesSeries;
import com.googlecode.wickedcharts.showcase.options.base.ShowcaseOptions;

public class FunnelOptions extends ShowcaseOptions {

    private static final long serialVersionUID = 1L;

    public FunnelOptions() {
        setChartOptions(new ChartOptions()
                .setType(SeriesType.FUNNEL)
                .setMarginRight(100));

        setTitle(new Title("Sales funnel")
                .setX(-50));

        setPlotOptions(new PlotOptionsChoice()
                .setSeries(new PlotOptions()
                        .setDataLabels(new DataLabels()
                                .setEnabled(Boolean.TRUE)
                                .setFormat("<b>{point.name}</b> ({point.y:,.0f})")
                                .setSoftConnector(Boolean.TRUE))
                        .setNeckWidth(new PixelOrPercent(30, PixelOrPercent.Unit.PERCENT))
                        .setNeckHeight(new PixelOrPercent(25, PixelOrPercent.Unit.PERCENT))));

        setLegend(new Legend(Boolean.FALSE));

        addSeries(new CustomCoordinatesSeries<String, Integer>()
                .setName("Unique users")
                .setData(
                        new Coordinate<String, Integer>("Website visits", 15654).setXQuoted(Boolean.TRUE),
                        new Coordinate<String, Integer>("Downloads", 4064).setXQuoted(Boolean.TRUE),
                        new Coordinate<String, Integer>("Requested price list", 1987).setXQuoted(Boolean.TRUE),
                        new Coordinate<String, Integer>("Invoice sent", 976).setXQuoted(Boolean.TRUE),
                        new Coordinate<String, Integer>("Finalized", 846).setXQuoted(Boolean.TRUE)));
    }

    @Override
    public String getLabel() {
        return "Angular Gauge";
    }
}
