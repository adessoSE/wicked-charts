package com.googlecode.wickedcharts.showcase.configurations;

import java.util.Arrays;

import com.googlecode.wickedcharts.chartjs.chartoptions.ChartType;
import com.googlecode.wickedcharts.chartjs.chartoptions.Data;
import com.googlecode.wickedcharts.chartjs.chartoptions.Dataset;
import com.googlecode.wickedcharts.chartjs.chartoptions.Options;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import com.googlecode.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

@SuppressWarnings("serial")
public class PieChartConfiguration extends ShowcaseConfiguration {
	public PieChartConfiguration() {
		setType(ChartType.PIE);

		Data data = new Data();

		Dataset dataset = new Dataset()
				.setData(this.randomIntegerList(5))
				.setBackgroundColor(
						Arrays.asList(SimpleColor.RED,SimpleColor.ORANGE, SimpleColor.YELLOW, SimpleColor.GREEN, SimpleColor.BLUE))
				.setLabel("Dataset 1");

		data.setDatasets(Arrays.asList(dataset)).setLabels(Arrays.asList("Red", "Orange", "Yellow", "Green", "Blue"));
		
		setData(data);
		Options options = new Options()
				.setResponsive(true);
		setOptions(options);
		
	}
}
