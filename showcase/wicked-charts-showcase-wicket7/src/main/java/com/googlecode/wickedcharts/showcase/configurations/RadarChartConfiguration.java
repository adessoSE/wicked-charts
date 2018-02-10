package com.googlecode.wickedcharts.showcase.configurations;

import java.util.Arrays;
import com.googlecode.wickedcharts.chartjs.chartoptions.ChartType;
import com.googlecode.wickedcharts.chartjs.chartoptions.Data;
import com.googlecode.wickedcharts.chartjs.chartoptions.Dataset;
import com.googlecode.wickedcharts.chartjs.chartoptions.Element;
import com.googlecode.wickedcharts.chartjs.chartoptions.Filler;
import com.googlecode.wickedcharts.chartjs.chartoptions.Hover;
import com.googlecode.wickedcharts.chartjs.chartoptions.HoverMode;
import com.googlecode.wickedcharts.chartjs.chartoptions.Line;
import com.googlecode.wickedcharts.chartjs.chartoptions.Options;
import com.googlecode.wickedcharts.chartjs.chartoptions.Plugins;
import com.googlecode.wickedcharts.chartjs.chartoptions.SamplesFillerAnalyzer;
import com.googlecode.wickedcharts.chartjs.chartoptions.Title;
import com.googlecode.wickedcharts.chartjs.chartoptions.TooltipMode;
import com.googlecode.wickedcharts.chartjs.chartoptions.Tooltips;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import com.googlecode.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

@SuppressWarnings("serial")
public class RadarChartConfiguration extends ShowcaseConfiguration {
	public RadarChartConfiguration() {
		super();
    	setType(ChartType.RADAR);
		
		Data data = new Data()
				.setLabels(Arrays.asList("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset0 = new Dataset()
				.setLabel("D0")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setData(Arrays.asList(1, 2, 3, 1, 2, 1, 2))
				.setFill("undefined");
		
		
		Dataset dataset1 = new Dataset()
				.setLabel("D1 (hidden) Fill: -1")
				.setBackgroundColor(SimpleColor.ORANGE_TRANSPARENT)
				.setBorderColor(SimpleColor.ORANGE)
				.setData(Arrays.asList(5, 4, 3, 5, 4, 3, 5))
				.setHidden(true)
				.setFill("-1");
		
		Dataset dataset2 = new Dataset()
				.setLabel("D2 Fill: 1")
				.setBackgroundColor(SimpleColor.YELLOW)
				.setBorderColor(SimpleColor.YELLOW_TRANSPARENT)
				.setData(Arrays.asList(10, 8, 12, 6, 13, 10, 9))
				.setFill("1");
		
		
		Dataset dataset3 = new Dataset()
				.setLabel("D3 Fill: False")
				.setBackgroundColor(SimpleColor.GREEN_TRANSPARENT)
				.setBorderColor(SimpleColor.GREEN)
				.setData(Arrays.asList(20, 18, 22, 16, 23, 20, 19))
				.setFill("false");
		
		Dataset dataset4 = new Dataset()
				.setLabel("D4 Fill: -1")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE)
				.setData(Arrays.asList(30, 28, 32, 26, 33, 30, 29))
				.setFill("-1");
		
		
		Dataset dataset5 = new Dataset()
				.setLabel("D5 Fill: -1")
				.setBackgroundColor(SimpleColor.PURPLE_TRANSPARENT)
				.setBorderColor(SimpleColor.PURPLE)
				.setData(Arrays.asList(40, 38, 42, 36, 43, 40, 39))
				.setFill("-1");		
		
		data.setDatasets(Arrays.asList(dataset0, dataset1, dataset2, dataset3, dataset4, dataset5));
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Radar Chart"))
				.setMaintainAspectRatio(true)
				.setSpanGaps(false)
				.setElements(new Element()
						.setLine(new Line()
								.setTension(0.000001)))
				.setPlugins(new Plugins()
						.setFiller(new Filler()
								.setPropagate(false))
						.setSamples_filler_analyzer(new SamplesFillerAnalyzer()
								.setTarget("chart-analyzer")))
				;
		setOptions(options);
	}
}
