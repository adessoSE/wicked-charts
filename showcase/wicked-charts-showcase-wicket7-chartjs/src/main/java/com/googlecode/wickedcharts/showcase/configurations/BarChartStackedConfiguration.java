package com.googlecode.wickedcharts.showcase.configurations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.googlecode.wickedcharts.chartjs.chartoptions.AxesScale;
import com.googlecode.wickedcharts.chartjs.chartoptions.ChartType;
import com.googlecode.wickedcharts.chartjs.chartoptions.Data;
import com.googlecode.wickedcharts.chartjs.chartoptions.Dataset;
import com.googlecode.wickedcharts.chartjs.chartoptions.Hover;
import com.googlecode.wickedcharts.chartjs.chartoptions.HoverMode;
import com.googlecode.wickedcharts.chartjs.chartoptions.Legend;
import com.googlecode.wickedcharts.chartjs.chartoptions.Options;
import com.googlecode.wickedcharts.chartjs.chartoptions.Position;
import com.googlecode.wickedcharts.chartjs.chartoptions.ScaleLabel;
import com.googlecode.wickedcharts.chartjs.chartoptions.Scales;
import com.googlecode.wickedcharts.chartjs.chartoptions.Stacked;
import com.googlecode.wickedcharts.chartjs.chartoptions.Title;
import com.googlecode.wickedcharts.chartjs.chartoptions.TooltipMode;
import com.googlecode.wickedcharts.chartjs.chartoptions.Tooltips;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import com.googlecode.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

@SuppressWarnings("serial")
public class BarChartStackedConfiguration extends ShowcaseConfiguration{
	public BarChartStackedConfiguration() {
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
				.setFill(false)
				.setStack(1);
		
		
		Dataset dataset2 = new Dataset()
				.setLabel("Dataset 2")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE)
				.setBorderWidth(1)
				.setData(randomIntegerList(7))
				.setFill(false)
				.setStack(1);
		
		Dataset dataset3 = new Dataset()
				.setLabel("Dataset 3")
				.setBackgroundColor(SimpleColor.GREEN_TRANSPARENT)
				.setBorderColor(SimpleColor.GREEN)
				.setBorderWidth(1)
				.setData(randomIntegerList(7))
				.setFill(false)
				.setStack(1);
		
		data.setDatasets(Arrays.asList(dataset1,dataset2, dataset3));
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Line Chart"))
				.setTooltips(new Tooltips()
						.setMode(TooltipMode.INDEX)
						.setIntersect(false))
				.setHover(new Hover()
						.setMode(HoverMode.NEAREST)
						.setIntersect(true))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setDisplay(true)
								.setStacked(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Month")))
						.setYAxes(new AxesScale()
								.setDisplay(true)
								.setStacked(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Value"))))
				;
		setOptions(options);
	}
}
