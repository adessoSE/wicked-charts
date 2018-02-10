package com.googlecode.wickedcharts.showcase.configurations;

import java.util.Arrays;

import com.googlecode.wickedcharts.chartjs.chartoptions.Animation;
import com.googlecode.wickedcharts.chartjs.chartoptions.ChartType;
import com.googlecode.wickedcharts.chartjs.chartoptions.Data;
import com.googlecode.wickedcharts.chartjs.chartoptions.Dataset;
import com.googlecode.wickedcharts.chartjs.chartoptions.Legend;
import com.googlecode.wickedcharts.chartjs.chartoptions.Options;
import com.googlecode.wickedcharts.chartjs.chartoptions.Position;
import com.googlecode.wickedcharts.chartjs.chartoptions.Scale;
import com.googlecode.wickedcharts.chartjs.chartoptions.Scales;
import com.googlecode.wickedcharts.chartjs.chartoptions.Ticks;
import com.googlecode.wickedcharts.chartjs.chartoptions.Title;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import com.googlecode.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

@SuppressWarnings("serial")
public class PolarAreaChartConfiguration extends ShowcaseConfiguration {
	public PolarAreaChartConfiguration() {
		super();
		setType(ChartType.POLAR_AREA);

		Data data = new Data();

		Dataset dataset = new Dataset()
				.setData(this.randomIntegerList(5))
				.setBackgroundColor(
						Arrays.asList(SimpleColor.RED_TRANSPARENT,SimpleColor.ORANGE_TRANSPARENT,
								SimpleColor.YELLOW_TRANSPARENT, SimpleColor.GREEN_TRANSPARENT, 
								SimpleColor.BLUE_TRANSPARENT))
				.setLabel("Dataset 1");

		data.setDatasets(Arrays.asList(dataset)).setLabels(Arrays.asList("Red", "Orange", "Yellow", "Green", "Blue"));
		
		setData(data);
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("ChartJs Polar Area Chart"))
				.setLegend(new Legend()
						.setPosition(Position.RIGHT))
				.setScale(new Scale()
						.setTicks(new Ticks()
								.setBeginAtZero(true))
						.setReverse(false))
				.setAnimation(new Animation()
						.setAnimateScale(true)
						.setAnimateRotate(false));
		setOptions(options);
		
	}
}
