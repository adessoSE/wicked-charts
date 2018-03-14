package de.adesso.wickedcharts.showcase.options;

import de.adesso.wickedcharts.highcharts.options.*;
import de.adesso.wickedcharts.highcharts.options.color.ColorReference;
import de.adesso.wickedcharts.highcharts.options.color.HexColor;
import de.adesso.wickedcharts.highcharts.options.series.Box;
import de.adesso.wickedcharts.highcharts.options.series.BoxSeries;
import de.adesso.wickedcharts.showcase.options.base.ShowcaseOptions;

import java.util.ArrayList;
import java.util.List;

public class BoxplotChartOptions extends ShowcaseOptions {

    private static final long serialVersionUID = 1L;

    public BoxplotChartOptions() {

        setCredits(new CreditOptions().setEnabled(false))
                .setNavigation(new Navigation().setButtonOptions(new ButtonOptions().setEnabled(false)))
                .setChartOptions(new ChartOptions(SeriesType.BOXPLOT))
                .setTitle(new Title("Highcharts Boxplot"))
                .setTooltip(new Tooltip()
                        .setShared(false)
                        .setUseHTML(true)
                        .setHeaderFormat("<em>Experiment No {point.key}</em><br/>")
                )
                .setLegend(new Legend().setEnabled(false));

        BoxSeries boxplotSeries = new BoxSeries();
        List<ColorReference> colors = new ArrayList<ColorReference>();
        double open = 1;
        for (int i = 0; i < 10; i++) {
            double random = (Math.random() * 10 - 5) * 100;
            random = Math.round(random) / 100.0;
            double low = open - 1;
            double close = open + random;
            double high = close + 1;
            double median = (open + close) / 2;
            Box bar = new Box(low, open, median, close, high);
            boxplotSeries.addPoint(bar);
            open = close;
            colors.add(new HexColor(bar.isIncrease() ? "#00FF00" : "#FF0000"));
        }
        addSeries(boxplotSeries);

        PlotOptions plotOptions = new PlotOptions();
        plotOptions.setColorByPoint(true)
                .setLineWidth(1)
                .setMedianWidth(1)
                .setWhiskerWidth(2)
                .setWhiskerLength(20)
                .setStemWidth(2)
                .setColors(colors);
        setPlotOptions(new PlotOptionsChoice().setBoxplot(plotOptions));

    }

    @Override
    public String getLabel() {
        return "Boxplot chart";
    }

}