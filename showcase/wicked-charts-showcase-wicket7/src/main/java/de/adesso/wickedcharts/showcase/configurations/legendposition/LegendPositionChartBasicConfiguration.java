
package de.adesso.wickedcharts.showcase.configurations.legendposition;

import java.util.Arrays;

import de.adesso.wickedcharts.chartjs.chartoptions.AxesScale;
import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.ScaleLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.Scales;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

@SuppressWarnings("serial")
public class LegendPositionChartBasicConfiguration extends ShowcaseConfiguration {
	public LegendPositionChartBasicConfiguration() {
		super();
		
		setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setBorderWidth(1);
		
		data.setDatasets(Arrays.asList(dataset1));
		setData(data);
		
		Options options = new Options()
				.setResponsive(true)
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setDisplay(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Month")))
						.setXAxes(new AxesScale()
								.setDisplay(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Value")))
						)
				.setTitle(new Title()
						.setDisplay(true))
				;
		setOptions(options);
		
	}
}

