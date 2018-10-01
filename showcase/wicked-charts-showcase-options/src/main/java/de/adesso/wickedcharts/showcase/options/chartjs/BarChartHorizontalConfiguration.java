package de.adesso.wickedcharts.showcase.options.chartjs;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.options.chartjs.base.ShowcaseConfiguration;

import java.util.Arrays;

/**
 * A sample that shows how a horizontal bar chart configuration looks.
 */

/**
 *
 * A sample that shows how a horizontal bar chart configuration looks.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/charts/bar/horizontal.html">http://www.chartjs.org/samples/latest/charts/bar/horizontal.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class BarChartHorizontalConfiguration extends ShowcaseConfiguration {
	public BarChartHorizontalConfiguration() {
		super();
    	setType(ChartType.HORIZONTAL_BAR);
		
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("Dataset 1")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setBorderWidth(1)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setFill(false);


		
		
		Dataset dataset2 = new Dataset()
				.setLabel("Dataset 2")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE)
				.setBorderWidth(1)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setFill(false);
		
		data.setDatasets(Arrays.asList(dataset1,dataset2));
		
		Options options = new Options()
				.setResponsive(true)
				.setElements(new Rectangle())
				.setLegend(new Legend()
						.setPosition(Position.RIGHT))
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Horizontal Bar Chart"))
				;
		setOptions(options);
	}
}
