package com.googlecode.wickedcharts.showcase.configurations;

import java.util.Arrays;

import com.googlecode.wickedcharts.chartjs.chartoptions.ChartType;
import com.googlecode.wickedcharts.chartjs.chartoptions.Data;
import com.googlecode.wickedcharts.chartjs.chartoptions.Dataset;
import com.googlecode.wickedcharts.chartjs.chartoptions.Label;
import com.googlecode.wickedcharts.chartjs.chartoptions.Options;
import com.googlecode.wickedcharts.chartjs.chartoptions.Title;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import com.googlecode.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

@SuppressWarnings("serial")
public class MultilineLabelsConfiguration extends ShowcaseConfiguration {

	public MultilineLabelsConfiguration() {
		super();
		setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(Arrays.asList(
				new Label("June","2015"),
				new Label("July"),
				new Label("August"),
				new Label("September"),
				new Label("October"),
				new Label("November"),
				new Label("December"),
				new Label("January","2016"),
				new Label("February"),
				new Label("March"),
				new Label("April"),
				new Label("May")
				));
		
		Dataset dataset1 = new Dataset()
				.setData(randomIntegerList(12))
				.setLabel("My First dataset")
				.setFill("false")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED);
		
		Dataset dataset2 = new Dataset()
				.setData(randomIntegerList(12))
				.setLabel("My Second dataset")
				.setFill("false")
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
