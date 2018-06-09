package de.adesso.wickedcharts.showcase.configurations.interactions;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import java.util.Arrays;
import de.adesso.wickedcharts.chartjs.chartoptions.*;
/**
 * Returns all items that would intersect based on the X coordinate of the position only.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/tooltips/interactions.html">http://www.chartjs.org/samples/latest/tooltips/interactions.html</a>
 *
 * @author maximAtanasov
 */
@SuppressWarnings("serial")
public class xIntersectTrueConfiguration extends ShowcaseConfiguration {
    public xIntersectTrueConfiguration() {
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
                        .setText("Mode: x, intersect: true"))
                .setTooltips(new Tooltips()
                        .setMode(TooltipMode.X)
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
