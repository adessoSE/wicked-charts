package de.adesso.wickedcharts.showcase.configurations;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import java.util.Arrays;
import de.adesso.wickedcharts.chartjs.chartoptions.*;
/**
 * 
 * A sample that shows how a chart with label filtering is configured.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/scales/filtering-labels.html">http://www.chartjs.org/samples/latest/scales/filtering-labels.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class FilteringLabelsConfiguration extends ShowcaseConfiguration {
	public FilteringLabelsConfiguration() {
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
						.setText("Chart.js Line Chart - X-Axis Filter"))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setDisplay(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Month"))
								.setTicks(new Ticks()
										.setCallback(
												new CallbackFunction("function(dataLabel, index) {\r\n" + 
												" // Hide the label of every 2nd dataset. return null to hide the grid line too\r\n" + 
												" return index % 2 === 0 ? dataLabel : '';}"))))
						.setYAxes(new AxesScale()
								.setDisplay(true)
								.setBeginAtZero(true)))
				;
		setOptions(options);
	}
}
