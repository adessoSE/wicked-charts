package de.adesso.wickedcharts.showcase.configurations;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import java.util.Arrays;


/**
 * 
 * A sample that shows how to configure suggestedMin and suggestedMax Ticks in the chart options.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/scales/linear/min-max-suggested.html">http://www.chartjs.org/samples/latest/scales/linear/min-max-suggested.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class MinMaxSuggestedConfiguration extends ShowcaseConfiguration {
	public MinMaxSuggestedConfiguration() {
		super();
    	setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(Arrays.asList(10, 30, 50, 20, 25, 44, -10)))
				.setFill(false);
		
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second dataset")
				.setBackgroundColor(SimpleColor.BLUE)
				.setBorderColor(SimpleColor.BLUE)
				.setData(IntegerValue.of(Arrays.asList(18, 33, 22, 19, 11, 39, 30)))
				.setFill(false);
		
		data.setDatasets(Arrays.asList(dataset1,dataset2));
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Min and Max - Suggested"))
				.setScales(new Scales()
						.setYAxes(new AxesScale()
								.setTicks(new Ticks()
										.setSuggestedMin(10)
										.setSuggestedMax(50))))
				;
		setOptions(options);
	}
}
