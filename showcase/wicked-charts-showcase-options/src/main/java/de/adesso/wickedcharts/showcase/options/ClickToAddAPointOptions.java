package de.adesso.wickedcharts.showcase.options;

import java.util.Arrays;

import de.adesso.wickedcharts.highcharts.options.Axis;
import de.adesso.wickedcharts.highcharts.options.ChartOptions;
import de.adesso.wickedcharts.highcharts.options.Events;
import de.adesso.wickedcharts.highcharts.options.ExportingOptions;
import de.adesso.wickedcharts.highcharts.options.Legend;
import de.adesso.wickedcharts.highcharts.options.PlotLine;
import de.adesso.wickedcharts.highcharts.options.PlotOptions;
import de.adesso.wickedcharts.highcharts.options.PlotOptionsChoice;
import de.adesso.wickedcharts.highcharts.options.PointOptions;
import de.adesso.wickedcharts.highcharts.options.SeriesType;
import de.adesso.wickedcharts.highcharts.options.Title;
import de.adesso.wickedcharts.highcharts.options.color.HexColor;
import de.adesso.wickedcharts.highcharts.options.functions.AddPointFunction;
import de.adesso.wickedcharts.highcharts.options.functions.RemovePointFunction;
import de.adesso.wickedcharts.highcharts.options.series.CoordinatesSeries;
import de.adesso.wickedcharts.showcase.options.base.ShowcaseOptions;

public class ClickToAddAPointOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;
  
  public ClickToAddAPointOptions() {

    this.setChartOptions(new ChartOptions()
        .setType(SeriesType.SCATTER)
        .setMargin(Arrays.asList(70, 50, 60, 80))
        .setEvents(new Events().setClick(new AddPointFunction())));

    this.setTitle(new Title("User supplied data"));

    this.setSubtitle(new Title(
        "Click the plot area to add a point. Click a point to remove it."));

    this.setxAxis(new Axis()
        .setMinPadding(0.2f)
        .setMaxPadding(0.2f)
        .setMaxZoom(60));

    this.setyAxis(new Axis()
        .setTitle(new Title("Value"))
        .setMinPadding(0.2f)
        .setMaxPadding(0.2f)
        .setMaxZoom(60)
        .addPlotLine(new PlotLine()
            .setValue(0f)
            .setWidth(1)
            .setColor(HexColor.fromString("#808080"))));

    this.setLegend(new Legend()
        .setEnabled(Boolean.FALSE));

    this.setExporting(new ExportingOptions()
        .setEnabled(Boolean.FALSE));

    this.setPlotOptions(new PlotOptionsChoice()
        .setSeries(new PlotOptions()
            .setLineWidth(1)
            .setPoint(new PointOptions()
                .setEvents(new Events()
                    .setClick(new RemovePointFunction())))));

    this.addSeries(new CoordinatesSeries()
        .addPoint(20, 20)
        .addPoint(80, 80));

  }

  @Override
  public String getLabel() {
    return "Click to add a point";
  }

}
