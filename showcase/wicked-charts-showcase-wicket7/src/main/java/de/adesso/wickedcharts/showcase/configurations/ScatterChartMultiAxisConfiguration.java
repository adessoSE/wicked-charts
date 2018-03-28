package de.adesso.wickedcharts.showcase.configurations;

import java.util.Arrays;

import de.adesso.wickedcharts.chartjs.chartoptions.AxesScale;
import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.GridLines;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.Position;
import de.adesso.wickedcharts.chartjs.chartoptions.ScaleLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.Scales;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.RgbaColor;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.PointValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

/**
 * Sample that displays a scatter chart with two y-axes.
 *
 */
@SuppressWarnings("serial")
public class ScatterChartMultiAxisConfiguration extends ShowcaseConfiguration {
	public ScatterChartMultiAxisConfiguration() {
		super();
    	setType(ChartType.SCATTER);
		
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setYAxisID("y-axis-1")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED) 
				.setData(Arrays.asList(
						new PointValue(4,14),
						new PointValue(40,42),
						new PointValue(23,42),
						new PointValue(40,22),
						new PointValue(80,12),
						new PointValue(30,32)))
				.setFill(false);
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second dataset")
				.setYAxisID("y-axis-2")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE) 
				.setData(Arrays.asList(
						new PointValue(7,56),
						new PointValue(15,54),
						new PointValue(46,34),
						new PointValue(36,42),
						new PointValue(78,64),
						new PointValue(12,48)))
				.setFill(false);
		
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
								.setPosition(Position.BOTTOM)
								.setGridLines(new GridLines()
										.setZeroLineColor(new RgbaColor(0, 0, 0, 1)))
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Month")))
						.setYAxes(Arrays.asList(new AxesScale()
								.setType("linear")
								.setDisplay(true)
								.setPosition(Position.LEFT)
								.setId("y-axis-1"),
								new AxesScale()
								.setType("linear")
								.setDisplay(true)
								.setPosition(Position.RIGHT)
								.setReverse(true)
								.setId("y-axis-2")
								.setGridLines(new GridLines()
										.setDrawOnChartArea(false)))))
				;
		setOptions(options);
	}
}
