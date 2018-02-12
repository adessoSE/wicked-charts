package com.googlecode.wickedcharts.showcase.configurations;

import java.util.Arrays;

import com.googlecode.wickedcharts.chartjs.chartoptions.AxesScale;
import com.googlecode.wickedcharts.chartjs.chartoptions.ChartType;
import com.googlecode.wickedcharts.chartjs.chartoptions.Data;
import com.googlecode.wickedcharts.chartjs.chartoptions.Dataset;
import com.googlecode.wickedcharts.chartjs.chartoptions.GridLines;
import com.googlecode.wickedcharts.chartjs.chartoptions.Options;
import com.googlecode.wickedcharts.chartjs.chartoptions.Scales;
import com.googlecode.wickedcharts.chartjs.chartoptions.Ticks;
import com.googlecode.wickedcharts.chartjs.chartoptions.Title;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.StringValueColor;
import com.googlecode.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;


@SuppressWarnings("serial")
public class GridLineStylesConfiguration extends ShowcaseConfiguration {
	public GridLineStylesConfiguration() {
		super();
    	setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(Arrays.asList("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(Arrays.asList(10, 30, 39, 20, 25, 34, -10))
				.setFill("false");
		
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second dataset")
				.setBackgroundColor(SimpleColor.BLUE)
				.setBorderColor(SimpleColor.BLUE)
				.setData(Arrays.asList(18, 33, 22, 19, 11, 39, 30))
				.setFill("false");
		
		data.setDatasets(Arrays.asList(dataset1,dataset2));

		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Grid Line Settings"))
				.setScales(new Scales()
						.setYAxes(new AxesScale()
								.setGridLines(new GridLines()
										.setDrawBorder(true)
										.setColor(Arrays.asList(
												new StringValueColor("pink"),
												new StringValueColor("red"),
												new StringValueColor("orange"),
												new StringValueColor("yellow"),
												new StringValueColor("green"),
												new StringValueColor("blue"),
												new StringValueColor("indigo"),
												new StringValueColor("purple"))))
								.setTicks(new Ticks()
										.setMin(0)
										.setMax(100)
										.setStepSize(10))))
				;
		setOptions(options);
	}
}
