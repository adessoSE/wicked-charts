package de.adesso.wickedcharts.showcase.options;

import de.adesso.wickedcharts.highcharts.options.*;
import de.adesso.wickedcharts.highcharts.options.series.Coordinate;
import de.adesso.wickedcharts.highcharts.options.series.CoordinatesSeries;
import de.adesso.wickedcharts.highcharts.options.series.SimpleSeries;
import de.adesso.wickedcharts.showcase.options.base.ShowcaseOptions;

public class ErrorBarOptions extends ShowcaseOptions {

    private static final long serialVersionUID = 1L;

    public ErrorBarOptions() {

        setChart(new ChartOptions()
                .setZoomType(ZoomType.XY));

        setTitle(new Title("Temperature vs Rainfall"));

        setxAxis(new Axis()
                .setCategories("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));

        addyAxis(new Axis()
                .setLabels(new Labels()
                        .setFormat("{value} °C"))
                .setTitle(new Title("Temperature")));

        addyAxis(new Axis()
                .setTitle(new Title("Rainfall"))
                .setLabels(new Labels()
                        .setFormat("{value} mm"))
                .setOpposite(Boolean.TRUE));

        setTooltip(new Tooltip()
                .setShared(Boolean.TRUE));

        addSeries(new SimpleSeries()
                .setName("Rainfall")
                .setType(SeriesType.COLUMN)
                .setyAxis(1)
                .setData(49.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4)
                .setTooltip(new Tooltip()
                        .setPointFormat("<span style=\"font-weight: bold; color: {series.color}\">{series.name}</span>: <b>{point.y:.1f} mm</b>")));

        addSeries(new CoordinatesSeries()
                .setName("Rainfall error")
                .setType(SeriesType.ERRORBAR)
                .setyAxis(1)
                .setData(
                        new Coordinate<Number, Number>(48, 51),
                        new Coordinate<Number, Number>(68, 73),
                        new Coordinate<Number, Number>(92, 110),
                        new Coordinate<Number, Number>(128, 136),
                        new Coordinate<Number, Number>(140, 150),
                        new Coordinate<Number, Number>(171, 179),
                        new Coordinate<Number, Number>(135, 143),
                        new Coordinate<Number, Number>(142, 149),
                        new Coordinate<Number, Number>(204, 220),
                        new Coordinate<Number, Number>(189, 199),
                        new Coordinate<Number, Number>(95, 110),
                        new Coordinate<Number, Number>(52, 56)
                )
                .setTooltip(new Tooltip()
                        .setPointFormat("(error range: {point.low}-{point.high} mm)<br/>")));

        addSeries(new SimpleSeries()
                .setName("Temperature")
                .setType(SeriesType.SPLINE)
                .setData(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6)
                .setTooltip(new Tooltip()
                        .setPointFormat("<span style=\"font-weight: bold; color: {series.color}\">{series.name}</span>: <b>{point.y:.1f}°C</b>")));

        addSeries(new CoordinatesSeries()
                .setName("Temperature error")
                .setType(SeriesType.ERRORBAR)
                .setData(
                        new Coordinate<Number, Number>(6, 8),
                        new Coordinate<Number, Number>(5.9, 7.6),
                        new Coordinate<Number, Number>(9.4, 10.4),
                        new Coordinate<Number, Number>(14.1, 15.9),
                        new Coordinate<Number, Number>(18.0, 20.1),
                        new Coordinate<Number, Number>(21.0, 24.0),
                        new Coordinate<Number, Number>(23.2, 25.3),
                        new Coordinate<Number, Number>(26.1, 27.8),
                        new Coordinate<Number, Number>(23.2, 23.9),
                        new Coordinate<Number, Number>(18.0, 21.1),
                        new Coordinate<Number, Number>(12.9, 14.0),
                        new Coordinate<Number, Number>(7.6, 10.0)
                )
                .setTooltip(new Tooltip()
                        .setPointFormat("(error range: {point.low}-{point.high}°C)<br/>")));

    }

    @Override
    public String getLabel() {
        return "Error Bar";
    }

}