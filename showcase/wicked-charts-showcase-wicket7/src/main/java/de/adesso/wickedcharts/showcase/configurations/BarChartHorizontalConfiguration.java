package de.adesso.wickedcharts.showcase.configurations;

import java.util.Arrays;

/**
 * 
 * A sample that shows how a horizontal bar chart configuration looks.
 *
 */

import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.Legend;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.Position;
import de.adesso.wickedcharts.chartjs.chartoptions.Rectangle;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

/**
 *
 * A sample that shows how a horizontal bar chart configuration looks.
 *
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
