package de.adesso.wickedcharts.showcase.configurations;

import java.util.Arrays;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

@SuppressWarnings("serial")
public class ScatterChartConfiguration extends ShowcaseConfiguration {
	public ScatterChartConfiguration() {
		super();
    	setType(ChartType.SCATTER);
		
		Data data = new Data()
				.setLabels(TextLabel.createListOf("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED) 
				.setData(Arrays.asList(
						new PointValue(4,14),
						new PointValue(40,42),
						new PointValue(23,42),
						new PointValue(40,22),
						new PointValue(80,12),
						new PointValue(30,32)))
				.setFill("false");
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second dataset")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE) 
				.setData(Arrays.asList(
						new PointValue(7,56),
						new PointValue(15,54),
						new PointValue(46,34),
						new PointValue(36,42),
						new PointValue(78,64),
						new PointValue(12,48)))
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
