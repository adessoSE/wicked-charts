package com.googlecode.wickedcharts.showcase.configurations;

import java.util.Arrays;

import com.googlecode.wickedcharts.chartjs.chartoptions.Animation;
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
public class DoughnutChartConfiguration extends ShowcaseConfiguration {
	public DoughnutChartConfiguration() {
		super();
		setType(ChartType.DOUGHNUT);

		Data data = new Data();

		Dataset dataset = new Dataset()
				.setData(this.randomIntegerList(5))
				.setBackgroundColor(
						Arrays.asList(SimpleColor.RED,SimpleColor.ORANGE, SimpleColor.YELLOW, SimpleColor.GREEN, SimpleColor.BLUE))
				.setLabel("Dataset 1");

		data.setDatasets(Arrays.asList(dataset)).setLabels(Arrays.asList("Red", "Orange", "Yellow", "Green", "Blue"));
		
		setData(data);
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("ChartJs Doughnut Chart"))
				.setLegend(new Legend()
						.setPosition(Position.TOP))
				.setAnimation(new Animation()
						.setAnimateScale(true)
						.setAnimateRotate(true));
		setOptions(options);
		
	}
}
