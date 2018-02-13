package com.googlecode.wickedcharts.showcase.configurations;

import java.util.Arrays;

import com.googlecode.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;

@SuppressWarnings("serial")
public class ScatterChartConfiguration extends ShowcaseConfiguration {
	public ScatterChartConfiguration() {
		super();
    	setType(ChartType.SCATTER);
		
		Data data = new Data()
				.setLabels(Arrays.asList("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
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
						.setText("Chart.js Scatter Chart"))
				.setTooltips(new Tooltips()
						.setMode(TooltipMode.INDEX)
						.setIntersect(false))
				.setHover(new Hover()
						.setMode(HoverMode.NEAREST)
						.setIntersect(true))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setDisplay(true)
								.setType("linear")
								.setPosition("bottom")
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Month"))))
				;
		setOptions(options);
	}
}
