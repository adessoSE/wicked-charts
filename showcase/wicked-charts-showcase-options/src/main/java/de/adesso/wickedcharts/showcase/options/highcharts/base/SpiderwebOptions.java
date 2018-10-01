package de.adesso.wickedcharts.showcase.options.highcharts.base;

import de.adesso.wickedcharts.highcharts.options.*;
import de.adesso.wickedcharts.highcharts.options.PixelOrPercent.Unit;
import de.adesso.wickedcharts.highcharts.options.series.SimpleSeries;
import de.adesso.wickedcharts.showcase.options.highcharts.base.ShowcaseOptions;

public class SpiderwebOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public SpiderwebOptions() {

    this.setChartOptions(new ChartOptions()
        .setPolar(Boolean.TRUE)
        .setType(SeriesType.LINE));

    this.setTitle(new Title("Budget vs spending")
        .setX(-80));

    this.setPane(new Pane()
        .setSize(new PixelOrPercent(80, Unit.PERCENT)));

    this.setxAxis(new Axis()
        .setCategories(
            "Sales",
            "Marketing",
            "Development",
            "Customer Support",
            "Information Technology",
            "Administration")
        .setTickmarkPlacement(TickmarkPlacement.ON)
        .setLineWidth(0));

    this.setyAxis(new Axis()
        .setGridLineInterpolation(GridlineInterpolation.POLYGON)
        .setLineWidth(0)
        .setMin(0));

    this.setTooltip(new Tooltip()
        .setShared(Boolean.TRUE)
        .setValuePrefix("$"));

    this.setLegend(new Legend()
        .setAlign(HorizontalAlignment.RIGHT)
        .setVerticalAlign(VerticalAlignment.TOP)
        .setLayout(LegendLayout.VERTICAL));

    this.addSeries(new SimpleSeries()
        .setName("Allocated Budget")
        .setData(43000, 19000, 60000, 35000, 17000, 10000)
        .setPointPlacement(PointPlacement.ON));

    this.addSeries(new SimpleSeries()
        .setName("Actual Spending")
        .setData(50000, 39000, 42000, 31000, 26000, 14000)
        .setPointPlacement(PointPlacement.ON));

  }

  @Override
  public String getLabel() {
    return "Spiderweb";
  }

}
