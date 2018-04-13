package de.adesso.wickedcharts.showcase.configurations;

import java.util.Arrays;
import java.util.Collections;

import de.adesso.wickedcharts.chartjs.chartoptions.AxesScale;
import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.Hover;
import de.adesso.wickedcharts.chartjs.chartoptions.HoverMode;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.ScaleLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.Scales;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.TooltipMode;
import de.adesso.wickedcharts.chartjs.chartoptions.Tooltips;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

/**
 * 
 * A sample that shows how a line chart can be configured to have different point sizes.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/charts/line/point-sizes.html">http://www.chartjs.org/samples/latest/charts/line/point-sizes.html</a>
 *
 * @author maximAtanasov
 * @author anedomansky
 */
@SuppressWarnings("serial")
public class LineChartWithDifferentPointSizesConfiguration extends ShowcaseConfiguration {
	public LineChartWithDifferentPointSizesConfiguration() {
		super();
    	setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("dataset - big points")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setPointRadius(Collections.nCopies(7, 15))
				.setPointHoverRadius(10)
				.setFill(false);
		
		
		Dataset dataset2 = new Dataset()
				.setLabel("dataset - individual point sizes")
				.setBackgroundColor(SimpleColor.BLUE)
				.setBorderColor(SimpleColor.BLUE)
				.setBorderDash(Arrays.asList("5", "5"))
				.setPointRadius(Arrays.asList(2, 4, 6, 18, 0, 12, 20))
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setFill(false);
		
		Dataset dataset3 = new Dataset()
				.setLabel("dataset - large pointHoverRadius")
				.setBackgroundColor(SimpleColor.GREEN)
				.setBorderColor(SimpleColor.GREEN)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setPointHoverRadius(30)
				.setFill(false);
		
		
		Dataset dataset4 = new Dataset()
			.setLabel("dataset - large pointHitRadius")
			.setBackgroundColor(SimpleColor.YELLOW)
			.setBorderColor(SimpleColor.YELLOW)
			.setData(IntegerValue.of(randomIntegerList(7)))
			.setPointHitRadius(20)
			.setFill(false);
		
		data.setDatasets(Arrays.asList(dataset1,dataset2,dataset3, dataset4));
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Line Chart with Different Point Sizes"))
				.setTooltips(new Tooltips()
						.setMode(TooltipMode.INDEX)
						.setIntersect(false))
				.setHover(new Hover()
						.setMode(HoverMode.NEAREST)
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
