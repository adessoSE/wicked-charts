package com.googlecode.wickedcharts.showcase.configurations;

import java.util.Arrays;

import com.googlecode.wickedcharts.chartjs.chartoptions.ChartType;
import com.googlecode.wickedcharts.chartjs.chartoptions.Data;
import com.googlecode.wickedcharts.chartjs.chartoptions.Dataset;
import com.googlecode.wickedcharts.chartjs.chartoptions.Legend;
import com.googlecode.wickedcharts.chartjs.chartoptions.Options;
import com.googlecode.wickedcharts.chartjs.chartoptions.Position;
import com.googlecode.wickedcharts.chartjs.chartoptions.Title;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import com.googlecode.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

@SuppressWarnings("serial")
public class BarChartVerticalConfiguration extends ShowcaseConfiguration {
	public BarChartVerticalConfiguration() {
		super();
    	setType(ChartType.BAR);
		
		Data data = new Data()
				.setLabels(Arrays.asList("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("Dataset 1")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setBorderWidth(1)
				.setData(randomIntegerList(7))
				.setFill("false");
		
		
		Dataset dataset2 = new Dataset()
				.setLabel("Dataset 2")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE)
				.setBorderWidth(1)
				.setData(randomIntegerList(7))
				.setFill("false");
		
		data.setDatasets(Arrays.asList(dataset1,dataset2));
		
		Options options = new Options()
				.setResponsive(true)
				.setLegend(new Legend()
						.setPosition(Position.TOP))
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Bar Chart"))
				;
		setOptions(options);
	}
}
