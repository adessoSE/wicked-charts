package de.adesso.wickedcharts.showcase.configurations;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import java.util.Arrays;

/**
 * 
 * A sample that shows how different line styles can be configured.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/charts/line/line-styles.html">http://www.chartjs.org/samples/latest/charts/line/line-styles.html</a>
 *
 * @author maximAtanasov
 * @author anedomansky
 */
@SuppressWarnings("serial")
public class LineStylesConfiguration extends ShowcaseConfiguration {
	public LineStylesConfiguration() {
		super();
    	setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("Filled")
				.setBackgroundColor(SimpleColor.GREEN)
				.setBorderColor(SimpleColor.GREEN)
				.setData(IntegerValue.of(randomIntegerList(7)));
		
		Dataset dataset2 = new Dataset()
				.setLabel("Unfilled")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setFill(false);
		
		
		Dataset dataset3 = new Dataset()
				.setLabel("Dashed")
				.setBackgroundColor(SimpleColor.BLUE)
				.setBorderColor(SimpleColor.BLUE)
				.setBorderDash(Arrays.asList("5", "5"))
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setFill(false);
		
		
		data.setDatasets(Arrays.asList(dataset1,dataset2,dataset3));
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Line Styles"))
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
