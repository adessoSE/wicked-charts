package com.googlecode.wickedcharts.showcase.configurations;

import java.util.Arrays;
import java.util.Random;

import com.googlecode.wickedcharts.chartjs.chartoptions.AxesScale;
import com.googlecode.wickedcharts.chartjs.chartoptions.ChartType;
import com.googlecode.wickedcharts.chartjs.chartoptions.Data;
import com.googlecode.wickedcharts.chartjs.chartoptions.Dataset;
import com.googlecode.wickedcharts.chartjs.chartoptions.TimeDisplayFormats;
import com.googlecode.wickedcharts.chartjs.chartoptions.Hover;
import com.googlecode.wickedcharts.chartjs.chartoptions.HoverMode;
import com.googlecode.wickedcharts.chartjs.chartoptions.Options;
import com.googlecode.wickedcharts.chartjs.chartoptions.PointData;
import com.googlecode.wickedcharts.chartjs.chartoptions.ScaleLabel;
import com.googlecode.wickedcharts.chartjs.chartoptions.Scales;
import com.googlecode.wickedcharts.chartjs.chartoptions.Time;
import com.googlecode.wickedcharts.chartjs.chartoptions.Title;
import com.googlecode.wickedcharts.chartjs.chartoptions.TooltipMode;
import com.googlecode.wickedcharts.chartjs.chartoptions.Tooltips;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import com.googlecode.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeScaleLineChartConfiguration extends ShowcaseConfiguration {
	public TimeScaleLineChartConfiguration(){
    	setType(ChartType.LINE);
    	
		Data data = new Data()
					.setLabels(Arrays.asList("02/09/2018", "02/10/2018", "02/11/2018", 
							"02/12/2018", "02/13/2018", "02/14/2018", "02/15/2018"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("Dataset 1 ")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setData(randomIntegerList(7))
				.setFill(false);
		
		
		Dataset dataset2 = new Dataset()
				.setLabel("Dataset 2 (Point Data)")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE)
				.setData(Arrays.asList(new PointData(data.getLabels().get(0), new Random().nextInt(20)),			
						new PointData(data.getLabels().get(1) , new Random().nextInt(20)),
						new PointData(data.getLabels().get(2), new Random().nextInt(20)),
						new PointData(data.getLabels().get(3), new Random().nextInt(20)),
						new PointData(data.getLabels().get(4), new Random().nextInt(20)),
						new PointData(data.getLabels().get(5), new Random().nextInt(20)),
						new PointData(data.getLabels().get(6), new Random().nextInt(20))))
				.setFill(false);
		
		Dataset dataset3 = new Dataset()
				.setLabel("Dataset 3 (Point Data)")
				.setBackgroundColor(SimpleColor.GREEN_TRANSPARENT)
				.setBorderColor(SimpleColor.GREEN)
				.setBorderWidth(1)
				.setData(Arrays.asList(new PointData(data.getLabels().get(0), new Random().nextInt(20)),			
						new PointData(data.getLabels().get(1) , new Random().nextInt(20)),
						new PointData(data.getLabels().get(2), new Random().nextInt(20)),
						new PointData(data.getLabels().get(3), new Random().nextInt(20)),
						new PointData(data.getLabels().get(4), new Random().nextInt(20)),
						new PointData(data.getLabels().get(5), new Random().nextInt(20)),
						new PointData(data.getLabels().get(6), new Random().nextInt(20))))
				.setFill(false);
		
		data.setDatasets(Arrays.asList(dataset1,dataset2, dataset3));
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Time Scale Line Chart"))
				.setTooltips(new Tooltips()
						.setMode(TooltipMode.INDEX)
						.setIntersect(false))
				.setHover(new Hover()
						.setMode(HoverMode.NEAREST)
						.setIntersect(true))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setType("time")
								.setDistribution("linear")
								.setTime(new Time()
										.setFormat("MM/DD/YYYY")
										.setUnit("day")
										.setUnitStepSize(1)
										.setRound("day")
										.setTooltipFormat("MMM D")
										.setDisplayFormats(new TimeDisplayFormats()
												.setDay("MMM D")))
								.setDisplay(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Date")))
						.setYAxes(new AxesScale()
								.setDisplay(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Value"))))
				;
		setOptions(options);
	}
}
