package com.googlecode.wickedcharts.showcase.configurations;

import java.util.Arrays;

import com.googlecode.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.Label;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;

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
