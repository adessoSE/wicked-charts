package com.googlecode.wickedcharts.showcase.configurations;

import java.util.Arrays;

import com.googlecode.wickedcharts.chartjs.chartoptions.AxesScale;
import com.googlecode.wickedcharts.chartjs.chartoptions.ChartType;
import com.googlecode.wickedcharts.chartjs.chartoptions.Data;
import com.googlecode.wickedcharts.chartjs.chartoptions.Dataset;
import com.googlecode.wickedcharts.chartjs.chartoptions.Hover;
import com.googlecode.wickedcharts.chartjs.chartoptions.HoverMode;
import com.googlecode.wickedcharts.chartjs.chartoptions.Options;
import com.googlecode.wickedcharts.chartjs.chartoptions.ScaleLabel;
import com.googlecode.wickedcharts.chartjs.chartoptions.Scales;
import com.googlecode.wickedcharts.chartjs.chartoptions.Title;
import com.googlecode.wickedcharts.chartjs.chartoptions.TooltipMode;
import com.googlecode.wickedcharts.chartjs.chartoptions.Tooltips;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import com.googlecode.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

@SuppressWarnings("serial")
public class LineChartStackedConfiguration extends ShowcaseConfiguration{
	public LineChartStackedConfiguration() {
		super();
    	setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(Arrays.asList("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(randomIntegerList(7));
		
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second dataset")
				.setBackgroundColor(SimpleColor.BLUE)
				.setBorderColor(SimpleColor.BLUE)
				.setData(randomIntegerList(7));
		
		Dataset dataset3 = new Dataset()
				.setLabel("My Third dataset")
				.setBackgroundColor(SimpleColor.GREEN)
				.setBorderColor(SimpleColor.GREEN)
				.setData(randomIntegerList(7));
		
		data.setDatasets(Arrays.asList(dataset1,dataset2, dataset3));
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Stacked Line Chart"))
				.setTooltips(new Tooltips()
						.setMode(TooltipMode.INDEX)
						.setIntersect(false))
				.setHover(new Hover()
						.setMode(HoverMode.NEAREST)
						.setIntersect(true))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setDisplay(true)
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