
package com.googlecode.wickedcharts.showcase.configurations.legendposition;

import java.util.Arrays;

import com.googlecode.wickedcharts.chartjs.chartoptions.AxesScale;
import com.googlecode.wickedcharts.chartjs.chartoptions.ChartType;
import com.googlecode.wickedcharts.chartjs.chartoptions.Data;
import com.googlecode.wickedcharts.chartjs.chartoptions.Dataset;
import com.googlecode.wickedcharts.chartjs.chartoptions.Options;
import com.googlecode.wickedcharts.chartjs.chartoptions.ScaleLabel;
import com.googlecode.wickedcharts.chartjs.chartoptions.Scales;
import com.googlecode.wickedcharts.chartjs.chartoptions.Title;
import com.googlecode.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

@SuppressWarnings("serial")
public class LegendPositionChartBasicConfiguration extends ShowcaseConfiguration {
	public LegendPositionChartBasicConfiguration() {
		super();
		
		setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(Arrays.asList("January", "February", "March", "April", "May", "June", "July"));
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setData(randomIntegerList(7))
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

