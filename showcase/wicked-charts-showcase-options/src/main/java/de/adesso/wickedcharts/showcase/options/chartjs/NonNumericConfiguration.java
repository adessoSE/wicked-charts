package de.adesso.wickedcharts.showcase.options.chartjs;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.ConstLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.ConstValue;
import de.adesso.wickedcharts.showcase.options.chartjs.base.ShowcaseConfiguration;

import java.util.Arrays;


/**
 * 
 * A sample that shows how to configure non-numeric values in a chart.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/scales/non-numeric-y.html">http://www.chartjs.org/samples/latest/scales/non-numeric-y.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class NonNumericConfiguration extends ShowcaseConfiguration {

	public NonNumericConfiguration() {
		setType(ChartType.LINE);
		
		Data data = new Data()
				.setXLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"))
				.setYLabels(ConstLabel.of("", "Request Added", "Request Viewed", "Request Accepted", "Request Solved", "Solving Confirmed"))
				;
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First Dataset")
				.setFill(false)
				.setBorderColor(SimpleColor.RED)
				.setBackgroundColor(SimpleColor.RED)
				.setData(ConstValue.of("", "Request Added", "Request Added", "Request Added", "Request Viewed", "Request Viewed", "Request Viewed"))
				;
		data.setDatasets(Arrays.asList(dataset1));
		setData(data);
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart with Non Numeric Y Axis"))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setDisplay(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Month")))
						.setYAxes(new AxesScale()
								.setDisplay(true)
								.setType("category")
								.setPosition(Position.LEFT)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Request State"))
								.setTicks(new Ticks()
										.setReverse(true))))
				;
		setOptions(options);
				
		
	}
}
