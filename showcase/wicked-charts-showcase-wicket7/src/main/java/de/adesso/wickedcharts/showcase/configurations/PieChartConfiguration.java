package de.adesso.wickedcharts.showcase.configurations;

import java.util.Arrays;

import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

@SuppressWarnings("serial")
public class PieChartConfiguration extends ShowcaseConfiguration {
	public PieChartConfiguration() {
		super();
		setType(ChartType.PIE);

		Data data = new Data();

		Dataset dataset = new Dataset()
				.setData(IntegerValue.of(randomIntegerList(5)))
				.setBackgroundColor(
						Arrays.asList(SimpleColor.RED,SimpleColor.ORANGE, SimpleColor.YELLOW, SimpleColor.GREEN, SimpleColor.BLUE))
				.setLabel("Dataset 1");

		data.setDatasets(Arrays.asList(dataset)).setLabels(TextLabel.of("Red", "Orange", "Yellow", "Green", "Blue"));
		
		setData(data);
		Options options = new Options()
				.setResponsive(true);
		setOptions(options);
		
	}
}
