package com.googlecode.wickedcharts.showcase.configurations;

import java.util.Arrays;

import com.googlecode.wickedcharts.chartjs.chartoptions.AxesScale;
import com.googlecode.wickedcharts.chartjs.chartoptions.ChartType;
import com.googlecode.wickedcharts.chartjs.chartoptions.Data;
import com.googlecode.wickedcharts.chartjs.chartoptions.Dataset;
import com.googlecode.wickedcharts.chartjs.chartoptions.Element;
import com.googlecode.wickedcharts.chartjs.chartoptions.Filler;
import com.googlecode.wickedcharts.chartjs.chartoptions.Line;
import com.googlecode.wickedcharts.chartjs.chartoptions.Options;
import com.googlecode.wickedcharts.chartjs.chartoptions.Plugins;
import com.googlecode.wickedcharts.chartjs.chartoptions.ScaleLabel;
import com.googlecode.wickedcharts.chartjs.chartoptions.Scales;
import com.googlecode.wickedcharts.chartjs.chartoptions.Ticks;
import com.googlecode.wickedcharts.chartjs.chartoptions.Title;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import com.googlecode.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

//Valid fill Parameters:
/*
	'false'
	'origin'
	'start'
	'end'
 Change the fill setting in the configuration to see changes*/ 

@SuppressWarnings("serial")
public class AreaLineBoundariesChartConfiguration extends ShowcaseConfiguration {
	public AreaLineBoundariesChartConfiguration() {
		super();
    	setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(Arrays.asList("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("Dataset")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setData(randomIntegerList(7))
					.setFill("end");
		
		data.setDatasets(Arrays.asList(dataset1));
		
		Options options = new Options()
				.setMaintainAspectRatio(true)
				.setSpanGaps(false)
				.setElements(new Element()
						.setLine(new Line()
								.setTension(0.000001)))
				.setPlugins(new Plugins().
						setFiller(new Filler().
								setPropagate(false)))
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Boundaries Chart"))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setDisplay(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Month"))
								.setTicks(new Ticks()
										.setAutoSkip(false)
										.setMaxRotation(0))))
				;
		setOptions(options);
	}
}
