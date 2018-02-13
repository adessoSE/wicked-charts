package com.googlecode.wickedcharts.showcase.configurations;

import java.util.Arrays;

import com.googlecode.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.TooltipMode;
import de.adesso.wickedcharts.chartjs.chartoptions.Tooltips;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;

@SuppressWarnings("serial")
public class ComboBarLineChartConfiguration extends ShowcaseConfiguration {
	public ComboBarLineChartConfiguration() {
		super();
		setType(ChartType.BAR);
		Data data = new Data();
		Dataset dataset1 = new Dataset();
		dataset1.setType(ChartType.LINE)
		.setBorderColor(SimpleColor.BLUE)
		.setBorderWidth(2)
		.setFill("false")
		.setData(this.randomIntegerList(7))
		.setLabel("Dataset 1");
		
		Dataset dataset2 = new Dataset()
				.setType(ChartType.BAR)
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.WHITE)
				.setBorderWidth(2)
				.setData(this.randomIntegerList(7))
				.setLabel("Dataset 2");
		
		Dataset dataset3 = new Dataset()
				.setType(ChartType.BAR)
				.setBackgroundColor(SimpleColor.GREEN)
				.setData(this.randomIntegerList(7))
				.setLabel("Dataset 3");
		
		data.setDatasets(Arrays.asList(dataset1,dataset2,dataset3))
		.setLabels(Arrays.asList("January", "February", "March", "April", "May", "June", "July"));
		
		setData(data);
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Combo Bar Line Chart"))
				.setTooltips(new Tooltips()
						.setIntersect(true)
						.setMode(TooltipMode.INDEX));
		setOptions(options);
		
	}
}
