package com.googlecode.wickedcharts.showcase.configurations;

import java.util.Arrays;

import com.googlecode.wickedcharts.chartjs.chartoptions.AxesScale;
import com.googlecode.wickedcharts.chartjs.chartoptions.ChartType;
import com.googlecode.wickedcharts.chartjs.chartoptions.Data;
import com.googlecode.wickedcharts.chartjs.chartoptions.Dataset;
import com.googlecode.wickedcharts.chartjs.chartoptions.GridLines;
import com.googlecode.wickedcharts.chartjs.chartoptions.Options;
import com.googlecode.wickedcharts.chartjs.chartoptions.PointData2D;
import com.googlecode.wickedcharts.chartjs.chartoptions.ScaleLabel;
import com.googlecode.wickedcharts.chartjs.chartoptions.Scales;
import com.googlecode.wickedcharts.chartjs.chartoptions.Title;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.RgbaColor;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import com.googlecode.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

@SuppressWarnings("serial")
public class ScatterChartMultiAxisConfiguration extends ShowcaseConfiguration {
	public ScatterChartMultiAxisConfiguration() {
		super();
    	setType(ChartType.SCATTER);
		
		Data data = new Data()
				.setLabels(Arrays.asList("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setYAxisID("y-axis-1")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setData(Arrays.asList(new PointData2D().setX(10).setY(20),
						new PointData2D().setX(4).setY(14),
						new PointData2D().setX(40).setY(42),
						new PointData2D().setX(23).setY(42),
						new PointData2D().setX(40).setY(22),
						new PointData2D().setX(80).setY(12),
						new PointData2D().setX(30).setY(32)))
				.setFill("false");
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second dataset")
				.setYAxisID("y-axis-2")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE)
				.setData(Arrays.asList(new PointData2D().setX(10).setY(20),
						new PointData2D().setX(7).setY(56),
						new PointData2D().setX(15).setY(54),
						new PointData2D().setX(46).setY(34),
						new PointData2D().setX(36).setY(42),
						new PointData2D().setX(78).setY(64),
						new PointData2D().setX(12).setY(48)))
				.setFill("false");
		
		data.setDatasets(Arrays.asList(dataset1,dataset2));
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Scatter Chart Multi Axis"))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setDisplay(true)
								.setType("linear")
								.setPosition("bottom")
								.setGridLines(new GridLines()
										.setZeroLineColor(new RgbaColor(0, 0, 0, 1)))
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Month")))
						.setYAxes(Arrays.asList(new AxesScale()
								.setType("linear")
								.setDisplay(true)
								.setPosition("left")
								.setId("y-axis-1"),
								new AxesScale()
								.setType("linear")
								.setDisplay(true)
								.setPosition("right")
								.setReverse(true)
								.setId("y-axis-2")
								.setGridLines(new GridLines()
										.setDrawOnChartArea(false)))))
				;
		setOptions(options);
	}
}
