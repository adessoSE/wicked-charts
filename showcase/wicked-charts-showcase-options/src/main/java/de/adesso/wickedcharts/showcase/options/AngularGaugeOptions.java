package de.adesso.wickedcharts.showcase.options;

import de.adesso.wickedcharts.highcharts.options.Axis;
import de.adesso.wickedcharts.highcharts.options.Background;
import de.adesso.wickedcharts.highcharts.options.ChartOptions;
import de.adesso.wickedcharts.highcharts.options.Labels;
import de.adesso.wickedcharts.highcharts.options.MinorTickInterval;
import de.adesso.wickedcharts.highcharts.options.Pane;
import de.adesso.wickedcharts.highcharts.options.PixelOrPercent;
import de.adesso.wickedcharts.highcharts.options.PlotBand;
import de.adesso.wickedcharts.highcharts.options.SeriesType;
import de.adesso.wickedcharts.highcharts.options.TickPosition;
import de.adesso.wickedcharts.highcharts.options.Title;
import de.adesso.wickedcharts.highcharts.options.Tooltip;
import de.adesso.wickedcharts.highcharts.options.PixelOrPercent.Unit;
import de.adesso.wickedcharts.highcharts.options.color.HexColor;
import de.adesso.wickedcharts.highcharts.options.color.LinearGradient;
import de.adesso.wickedcharts.highcharts.options.color.NullColor;
import de.adesso.wickedcharts.highcharts.options.series.SimpleSeries;
import de.adesso.wickedcharts.showcase.options.base.ShowcaseOptions;

public class AngularGaugeOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public AngularGaugeOptions() {
    setChartOptions(new ChartOptions()
        .setType(SeriesType.GAUGE)
        .setPlotBackgroundColor(new NullColor())
        .setPlotBackgroundImage(null)
        .setPlotBorderWidth(0)
        .setPlotShadow(Boolean.FALSE));

    setTitle(new Title("Speedometer"));

    setPane(new Pane()
        .setStartAngle(-150)
        .setEndAngle(150)
        .addBackground(new Background()
            .setBackgroundColor(new LinearGradient(0, 0, 0, 1)
                .addStop(0, HexColor.fromString("#FFFFFF"))
                .addStop(1, HexColor.fromString("#333333")))
            .setBorderWidth(0)
            .setOuterRadius(new PixelOrPercent(109, Unit.PERCENT)))
        .addBackground(new Background()
            .setBackgroundColor(new LinearGradient(0, 1, 0, 1)
                .addStop(0, HexColor.fromString("#333333"))
                .addStop(1, HexColor.fromString("#FFFFFF")))
            .setBorderWidth(1)
            .setOuterRadius(new PixelOrPercent(107, Unit.PERCENT)))
        .addBackground(Background.DEFAULT_BACKGROUND)
        .addBackground(new Background()
            .setBackgroundColor(HexColor.fromString("#DDDDDD"))
            .setBorderWidth(0)
            .setOuterRadius(new PixelOrPercent(105, Unit.PERCENT))
            .setInnerRadius(new PixelOrPercent(103, Unit.PERCENT))));

    addyAxis(new Axis()
        .setMin(0)
        .setMax(200)
        .setMinorTickInterval(new MinorTickInterval().setAuto(Boolean.TRUE))
        .setMinorTickWidth(1)
        .setMinorTickLength(10)
        .setMinorTickPosition(TickPosition.INSIDE)
        .setMinorTickColor(HexColor.fromString("#666666"))
        .setTickPixelInterval(30)
        .setTickWidth(2)
        .setTickPosition(TickPosition.INSIDE)
        .setTickLength(10)
        .setTickColor(HexColor.fromString("#666666"))
        .setLabels(new Labels().setStep(2))
        .setTitle(new Title("km/h"))
        .addPlotBand(new PlotBand()
            .setFrom(0)
            .setTo(120)
            .setColor(HexColor.fromString("#55bf3b")))
        .addPlotBand(new PlotBand()
            .setFrom(120)
            .setTo(160)
            .setColor(HexColor.fromString("#DDDF0D")))
        .addPlotBand(new PlotBand()
            .setFrom(160)
            .setTo(200)
            .setColor(HexColor.fromString("#DF5353"))));

    addSeries(new SimpleSeries()
        .addPoint(80)
        .setName("Speed")
        .setTooltip(new Tooltip().setValueSuffix(" km/h")));
  }

  @Override
  public String getLabel() {
    return "Angular Gauge";
  }
}
