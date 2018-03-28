package de.adesso.wickedcharts.showcase.configurations.interactions;


import java.util.Arrays;

import de.adesso.wickedcharts.chartjs.chartoptions.AxesScale;
import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.ScaleLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.Scales;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.TooltipMode;
import de.adesso.wickedcharts.chartjs.chartoptions.TooltipPosition;
import de.adesso.wickedcharts.chartjs.chartoptions.Tooltips;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

/**
 * If the intersect setting is true, the first intersecting item is used to determine the index in the data.
 */
@SuppressWarnings("serial")
public class IndexIntersectTrueConfiguration extends ShowcaseConfiguration {
    public IndexIntersectTrueConfiguration() {
        super();
        setType(ChartType.LINE);

        Data data = new Data()
                .setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
        setData(data);

        Dataset dataset1 = new Dataset()
                .setLabel("My First dataset")
                .setBackgroundColor(SimpleColor.RED)
                .setBorderColor(SimpleColor.RED)
                .setData(IntegerValue.of(randomIntegerList(7)))
                .setFill(false);


        Dataset dataset2 = new Dataset()
                .setLabel("My Second dataset")
                .setBackgroundColor(SimpleColor.BLUE)
                .setBorderColor(SimpleColor.BLUE)
                .setData(IntegerValue.of(randomIntegerList(7)))
                .setFill(false);

        data.setDatasets(Arrays.asList(dataset1,dataset2));

        Options options = new Options()
                .setResponsive(true)
                .setTitle(new Title()
                        .setDisplay(true)
                        .setText("Mode: Index, intersect: true"))
                .setTooltips(new Tooltips()
                        .setMode(TooltipMode.INDEX)
                        .setIntersect(true))
                .setScales(new Scales()
                        .setXAxes(new AxesScale()
                                .setDisplay(true)
                                .setScaleLabel(new ScaleLabel()
                                        .setDisplay(true)
                                        .setLabelString("Month")))
                        .setYAxes(new AxesScale()
                                .setDisplay(true)
                                .setScaleLabel(new ScaleLabel()
                                        .setDisplay(true)
                                        .setLabelString("Value"))))
                ;
        setOptions(options);
    }
}
