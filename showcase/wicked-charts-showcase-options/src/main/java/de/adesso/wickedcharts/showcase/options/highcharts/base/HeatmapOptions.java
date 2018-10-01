package de.adesso.wickedcharts.showcase.options.highcharts.base;

import de.adesso.wickedcharts.highcharts.options.*;
import de.adesso.wickedcharts.highcharts.options.color.HexColor;
import de.adesso.wickedcharts.highcharts.options.color.HighchartsColor;
import de.adesso.wickedcharts.highcharts.options.heatmap.ColorAxis;
import de.adesso.wickedcharts.highcharts.options.series.Custom3DCoordinateSeries;
import de.adesso.wickedcharts.highcharts.options.series.ThreeDCoordinate;
import de.adesso.wickedcharts.showcase.options.highcharts.base.ShowcaseOptions;

public class HeatmapOptions extends ShowcaseOptions {

    private static final long serialVersionUID = 1L;

    public HeatmapOptions() {

        setChart(new ChartOptions()
                .setType(SeriesType.HEATMAP)
                .setMarginTop(40)
                .setMarginBottom(80)
                .setPlotBorderWidth(1));

        setTitle(new Title("Sales per employee per weekday"));

        setxAxis(new Axis()
                .setCategories("Alexander", "Marie", "Maximilian", "Sophia", "Lukas", "Maria", "Leon", "Anna", "Tim", "Laura"));

        setyAxis(new Axis()
                .setCategories("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
                .setTitle(new Title().setEnabled(Boolean.FALSE)));

        setColorAxis(new ColorAxis()
                .setMin(0)
                .setMinColor(new HexColor("#ffffff"))
                .setMaxColor(new HighchartsColor(0)));

        setLegend(new Legend()
                .setAlign(HorizontalAlignment.RIGHT)
                .setLayout(LegendLayout.VERTICAL)
                .setMargin(0)
                .setVerticalAlign(VerticalAlignment.TOP)
                .setY(25)
                .setSymbolHeight(280));

        setTooltip(new Tooltip()
                .setFormatter(new Function("return '<b>' + this.series.xAxis.categories[this.point.x] + '</b> sold <br><b>' +\n" +
                        "                    this.point.value + '</b> items on <br><b>' + this.series.yAxis.categories[this.point.y] + '</b>';")));

        addSeries(new Custom3DCoordinateSeries<Integer, Integer, Integer>()
                .setData(
                        new ThreeDCoordinate<Integer, Integer, Integer>(0, 0, 10),
                        new ThreeDCoordinate<Integer, Integer, Integer>(0, 1, 19),
                        new ThreeDCoordinate<Integer, Integer, Integer>(0, 2, 8),
                        new ThreeDCoordinate<Integer, Integer, Integer>(0, 3, 24),
                        new ThreeDCoordinate<Integer, Integer, Integer>(0, 4, 67),
                        new ThreeDCoordinate<Integer, Integer, Integer>(1, 0, 92),
                        new ThreeDCoordinate<Integer, Integer, Integer>(1, 1, 58),
                        new ThreeDCoordinate<Integer, Integer, Integer>(1, 2, 78),
                        new ThreeDCoordinate<Integer, Integer, Integer>(1, 3, 117),
                        new ThreeDCoordinate<Integer, Integer, Integer>(1, 4, 48),
                        new ThreeDCoordinate<Integer, Integer, Integer>(2, 0, 35),
                        new ThreeDCoordinate<Integer, Integer, Integer>(2, 1, 15),
                        new ThreeDCoordinate<Integer, Integer, Integer>(2, 2, 123),
                        new ThreeDCoordinate<Integer, Integer, Integer>(2, 3, 64),
                        new ThreeDCoordinate<Integer, Integer, Integer>(2, 4, 52),
                        new ThreeDCoordinate<Integer, Integer, Integer>(3, 0, 72),
                        new ThreeDCoordinate<Integer, Integer, Integer>(3, 1, 132),
                        new ThreeDCoordinate<Integer, Integer, Integer>(3, 2, 114),
                        new ThreeDCoordinate<Integer, Integer, Integer>(3, 3, 19),
                        new ThreeDCoordinate<Integer, Integer, Integer>(3, 4, 16),
                        new ThreeDCoordinate<Integer, Integer, Integer>(4, 0, 38),
                        new ThreeDCoordinate<Integer, Integer, Integer>(4, 1, 5),
                        new ThreeDCoordinate<Integer, Integer, Integer>(4, 2, 8),
                        new ThreeDCoordinate<Integer, Integer, Integer>(4, 3, 117),
                        new ThreeDCoordinate<Integer, Integer, Integer>(4, 4, 115),
                        new ThreeDCoordinate<Integer, Integer, Integer>(5, 0, 88),
                        new ThreeDCoordinate<Integer, Integer, Integer>(5, 1, 32),
                        new ThreeDCoordinate<Integer, Integer, Integer>(5, 2, 12),
                        new ThreeDCoordinate<Integer, Integer, Integer>(5, 3, 6),
                        new ThreeDCoordinate<Integer, Integer, Integer>(5, 4, 120),
                        new ThreeDCoordinate<Integer, Integer, Integer>(6, 0, 13),
                        new ThreeDCoordinate<Integer, Integer, Integer>(6, 1, 44),
                        new ThreeDCoordinate<Integer, Integer, Integer>(6, 2, 88),
                        new ThreeDCoordinate<Integer, Integer, Integer>(6, 3, 98),
                        new ThreeDCoordinate<Integer, Integer, Integer>(6, 4, 96),
                        new ThreeDCoordinate<Integer, Integer, Integer>(7, 0, 31),
                        new ThreeDCoordinate<Integer, Integer, Integer>(7, 1, 1),
                        new ThreeDCoordinate<Integer, Integer, Integer>(7, 2, 82),
                        new ThreeDCoordinate<Integer, Integer, Integer>(7, 3, 32),
                        new ThreeDCoordinate<Integer, Integer, Integer>(7, 4, 30),
                        new ThreeDCoordinate<Integer, Integer, Integer>(8, 0, 85),
                        new ThreeDCoordinate<Integer, Integer, Integer>(8, 1, 97),
                        new ThreeDCoordinate<Integer, Integer, Integer>(8, 2, 123),
                        new ThreeDCoordinate<Integer, Integer, Integer>(8, 3, 64),
                        new ThreeDCoordinate<Integer, Integer, Integer>(8, 4, 84),
                        new ThreeDCoordinate<Integer, Integer, Integer>(9, 0, 47),
                        new ThreeDCoordinate<Integer, Integer, Integer>(9, 1, 114),
                        new ThreeDCoordinate<Integer, Integer, Integer>(9, 2, 31),
                        new ThreeDCoordinate<Integer, Integer, Integer>(9, 3, 48),
                        new ThreeDCoordinate<Integer, Integer, Integer>(9, 4, 91))
                .setDataLabels(new DataLabels()
                        .setEnabled(Boolean.TRUE)
                        .setColor(new HexColor("#000000"))));
    }

    @Override
    public String getLabel() {
        return "Heatmap";
    }
}
