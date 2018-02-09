package com.googlecode.wickedcharts.showcase.configurations;

import java.util.Arrays;

import com.googlecode.wickedcharts.chartjs.chartoptions.AxesScale;
import com.googlecode.wickedcharts.chartjs.chartoptions.ChartType;
import com.googlecode.wickedcharts.chartjs.chartoptions.Data;
import com.googlecode.wickedcharts.chartjs.chartoptions.Dataset;
import com.googlecode.wickedcharts.chartjs.chartoptions.Options;
import com.googlecode.wickedcharts.chartjs.chartoptions.Scales;
import com.googlecode.wickedcharts.chartjs.chartoptions.Title;
import com.googlecode.wickedcharts.chartjs.chartoptions.TooltipMode;
import com.googlecode.wickedcharts.chartjs.chartoptions.Tooltips;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import com.googlecode.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

@SuppressWarnings("serial")
public class StackedGroupChartConfiguration extends ShowcaseConfiguration {
	public StackedGroupChartConfiguration() {
		setType(ChartType.BAR);
		
		
		Data data = new Data()
				.setLabels(Arrays.asList("January", "February", "March", "April", "May", "June", "July"));
		
		Dataset dataset1 = new Dataset()
				.setLabel("Dataset 1")
				.setBackgroundColor(SimpleColor.RED)
				.setStack(0)
				.setData(randomIntegerList(7));
		
		Dataset dataset2 = new Dataset()
				.setLabel("Dataset 2")
				.setBackgroundColor(SimpleColor.BLUE)
				.setStack(0)
				.setData(randomIntegerList(7));
		
		Dataset dataset3 = new Dataset()
				.setLabel("Dataset 3")
				.setBackgroundColor(SimpleColor.GREEN)
				.setStack(1)
				.setData(randomIntegerList(7));
		
		data.setDatasets(Arrays.asList(dataset1,dataset2,dataset3));
		
		setData(data);
		
		Options options = new Options()
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Bar Chart - Stacked"))
				.setTooltips(new Tooltips()
						.setIntersect(false)
						.setMode(TooltipMode.INDEX))
				.setResponsive(true)
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setStacked(true))
						.setYAxes(new AxesScale()
								.setStacked(true)));
		setOptions(options);
	}
}
