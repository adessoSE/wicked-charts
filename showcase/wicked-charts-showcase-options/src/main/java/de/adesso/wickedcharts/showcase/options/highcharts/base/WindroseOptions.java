package de.adesso.wickedcharts.showcase.options.highcharts.base;

import de.adesso.wickedcharts.highcharts.options.*;
import de.adesso.wickedcharts.highcharts.options.PixelOrPercent.Unit;
import de.adesso.wickedcharts.highcharts.options.series.SimpleSeries;
import de.adesso.wickedcharts.showcase.options.highcharts.base.ShowcaseOptions;

public class WindroseOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public WindroseOptions() {

    this.setChartOptions(new ChartOptions()
        .setPolar(Boolean.TRUE)
        .setType(SeriesType.COLUMN));

    this.setTitle(new Title("Wind rose for South Shore Met Station, Oregon"));

    this.setSubtitle(new Title("Source: or.water.usgs.gov"));

    this.setPane(new Pane()
        .setSize(new PixelOrPercent(85, Unit.PERCENT)));

    this.setLegend(new Legend()
        .setReversed(Boolean.TRUE)
        .setAlign(HorizontalAlignment.RIGHT)
        .setVerticalAlign(VerticalAlignment.TOP)
        .setY(100)
        .setLayout(LegendLayout.VERTICAL));

    this.setxAxis(new Axis()
        .setTickmarkPlacement(TickmarkPlacement.ON)
        .setCategories(
            "N",
            "NNE",
            "NE",
            "ENE",
            "E",
            "ESE",
            "SE",
            "SSE",
            "S",
            "SSW",
            "SW",
            "WSW",
            "W",
            "WNW",
            "NW",
            "NNW"));

    this.setyAxis(new Axis()
        .setMin(0)
        .setEndOnTick(Boolean.FALSE)
        .setShowLastLabel(Boolean.TRUE)
        .setTitle(new Title("Frequency (%)"))
        .setLabels(
            new Labels()
                .setFormatter(new Function("return this.value + '%';"))));

    this.setTooltip(new Tooltip()
        .setValueSuffix("%"));

    this.setPlotOptions(new PlotOptionsChoice()
        .setSeries(new PlotOptions()
            .setStacking(Stacking.NORMAL)
            .setShadow(Boolean.FALSE)
            .setGroupPadding(0f)
            .setPointPlacement(PointPlacement.ON)));

    this.addSeries(new SimpleSeries()
        .setName(">10 m/s")
        .setData(
            0.00,
            0.00,
            0.00,
            0.00,
            0.00,
            0.00,
            0.13,
            0.00,
            0.00,
            0.00,
            0.00,
            0.00,
            0.00,
            0.00,
            0.03,
            0.07));

    this.addSeries(new SimpleSeries()
        .setName("8-10 m/s")
        .setData(
            0.00,
            0.00,
            0.00,
            0.00,
            0.00,
            0.00,
            0.39,
            0.49,
            0.00,
            0.00,
            0.00,
            0.00,
            0.10,
            0.00,
            0.69,
            0.13));

    this.addSeries(new SimpleSeries()
        .setName("6-8 m/s")
        .setData(
            0.00,
            0.00,
            0.00,
            0.00,
            0.00,
            0.13,
            1.74,
            0.53,
            0.00,
            0.00,
            0.13,
            0.30,
            0.26,
            0.33,
            0.66,
            0.23));

    this.addSeries(new SimpleSeries()
        .setName("4-6 m/s")
        .setData(
            0.00,
            0.00,
            0.00,
            0.00,
            0.00,
            0.30,
            2.14,
            0.86,
            0.00,
            0.00,
            0.49,
            0.79,
            1.45,
            1.61,
            0.76,
            0.13));

    this.addSeries(new SimpleSeries()
        .setName("2-4 m/s")
        .setData(
            0.16,
            0.00,
            0.07,
            0.07,
            0.49,
            1.55,
            2.37,
            1.97,
            0.43,
            0.26,
            1.22,
            1.97,
            0.92,
            0.99,
            1.28,
            1.32));

    this.addSeries(new SimpleSeries()
        .setName("0.5-2 m/s")
        .setData(
            1.78,
            1.09,
            0.82,
            1.22,
            2.20,
            2.01,
            3.06,
            3.42,
            4.74,
            4.14,
            4.01,
            2.66,
            1.71,
            2.40,
            4.28,
            5.00));

    this.addSeries(new SimpleSeries()
        .setName("<0.5 m/s")
        .setData(
            1.81,
            0.62,
            0.82,
            0.59,
            0.62,
            1.22,
            1.61,
            2.04,
            2.66,
            2.96,
            2.53,
            1.97,
            1.64,
            1.32,
            1.58,
            1.51));

  }

  @Override
  public String getLabel() {
    return "Wind rose";
  }

}
