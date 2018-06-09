package de.adesso.wickedcharts.showcase.configurations;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextListLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import java.util.Arrays;
import de.adesso.wickedcharts.chartjs.chartoptions.*;

/**
 * 
 * A sample that shows how to configure multiline labels.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/scales/multiline-labels.html">http://www.chartjs.org/samples/latest/scales/multiline-labels.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class MultilineLabelsConfiguration extends ShowcaseConfiguration {

	public MultilineLabelsConfiguration() {
		super();
		setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(Arrays.asList(
				new TextListLabel("June","2015"),
				new TextLabel("July"),
				new TextLabel("August"),
				new TextLabel("September"),
				new TextLabel("October"),
				new TextLabel("November"),
				new TextLabel("December"),
				new TextListLabel("January","2016"),
				new TextLabel("February"),
				new TextLabel("March"),
				new TextLabel("April"),
				new TextLabel("May")
				));
		
		Dataset dataset1 = new Dataset()
				.setData(IntegerValue.of(randomIntegerList(12)))
				.setLabel("My First dataset")
				.setFill(false)
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED);
		
		Dataset dataset2 = new Dataset()
				.setData(IntegerValue.of(randomIntegerList(12)))
				.setLabel("My Second dataset")
				.setFill(false)
				.setBackgroundColor(SimpleColor.BLUE)
				.setBorderColor(SimpleColor.BLUE);
		
		data.setDatasets(Arrays.asList(dataset1,dataset2));
		
		setData(data);
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart with Multiline Labels"));
		setOptions(options);
	}
}
