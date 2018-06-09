package de.adesso.wickedcharts.showcase.configurations;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import java.util.Arrays;
import de.adesso.wickedcharts.chartjs.chartoptions.*;
/**
 * Sample that supports different point styles:
 * 'circle',
 * 'triangle',
 * 'rect',
 * 'rectRounded',
 * 'rectRot',
 * 'cross',
 * 'crossRot',
 * 'star',
 * 'line',
 * 'dash'
 *
 * @see <a href="http://www.chartjs.org/samples/latest/charts/line/point-styles.html">http://www.chartjs.org/samples/latest/charts/line/point-styles.html</a>
 *
 * @author maximAtanasov
 * @author anedomansky
 */
@SuppressWarnings("serial")
public class PointStylesConfiguration extends ShowcaseConfiguration {
	public PointStylesConfiguration() {
		super();
    	setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("Dash")
				.setBackgroundColor(SimpleColor.GREY)
				.setBorderColor(SimpleColor.GREY)
				.setData(IntegerValue.of(Arrays.asList(1,1,1,1,1,1,1)))
				.setShowLine(false)
				.setPointRadius(10)
				.setPointHoverRadius(15)
				.setPointStyle(PointStyle.DASH)
				.setFill(false);
		
		Dataset dataset2 = new Dataset()
				.setLabel("Star")
				.setBackgroundColor(SimpleColor.PURPLE)
				.setBorderColor(SimpleColor.PURPLE)
				.setData(IntegerValue.of(Arrays.asList(2,2,2,2,2,2,2)))
				.setShowLine(false)
				.setPointRadius(20)
				.setPointHoverRadius(15)
				.setPointStyle(PointStyle.STAR)
				.setFill(false);
		
		Dataset dataset3 = new Dataset()
				.setLabel("Rectangle")
				.setBackgroundColor(SimpleColor.YELLOW)
				.setBorderColor(SimpleColor.YELLOW)
				.setData(IntegerValue.of(Arrays.asList(3,3,3,3,3,3,3)))
				.setShowLine(false)
				.setPointRadius(10)
				.setPointHoverRadius(15)
				.setPointStyle(PointStyle.RECT)
				.setFill(false);
		
		Dataset dataset4 = new Dataset()
				.setLabel("Triangle")
				.setBackgroundColor(SimpleColor.GREEN)
				.setBorderColor(SimpleColor.GREEN)
				.setData(IntegerValue.of(Arrays.asList(4,4,4,4,4,4,4)))
				.setShowLine(false)
				.setPointRadius(10)
				.setPointHoverRadius(15)
				.setPointStyle(PointStyle.TRIANGLE)
				.setFill(false);
		
		Dataset dataset5 = new Dataset()
				.setLabel("Circle")
				.setBackgroundColor(SimpleColor.BLUE)
				.setBorderColor(SimpleColor.BLUE)
				.setData(IntegerValue.of(Arrays.asList(5,5,5,5,5,5,5)))
				.setShowLine(false)
				.setPointRadius(10)
				.setPointHoverRadius(15)
				.setPointStyle(PointStyle.CIRCLE)
				.setFill(false);
		
		Dataset dataset6 = new Dataset()
				.setLabel("CrossRot")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(Arrays.asList(6,6,6,6,6,6,6)))
				.setShowLine(false)
				.setPointRadius(10)
				.setPointHoverRadius(15)
				.setPointStyle(PointStyle.CROSS_ROT)
				.setFill(false);
		
		Dataset dataset7 = new Dataset()
				.setLabel("Line")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED_TRANSPARENT)
				.setData(IntegerValue.of(Arrays.asList(7,7,7,7,7,7,7)))
				.setShowLine(false)
				.setPointRadius(10)
				.setPointHoverRadius(15)
				.setPointStyle(PointStyle.LINE)
				.setFill(false);
		
		Dataset dataset8 = new Dataset()
				.setLabel("Cross")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE_TRANSPARENT)
				.setData(IntegerValue.of(Arrays.asList(8,8,8,8,8,8,8)))
				.setShowLine(false)
				.setPointRadius(10)
				.setPointHoverRadius(15)
				.setPointStyle(PointStyle.CROSS)
				.setFill(false);
		
		Dataset dataset9 = new Dataset()
				.setLabel("Rectangle Rounded")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(Arrays.asList(9,9,9,9,9,9,9)))
				.setShowLine(false)
				.setPointRadius(10)
				.setPointHoverRadius(15)
				.setPointStyle(PointStyle.RECT_ROUNDED)
				.setFill(false);
		
		Dataset dataset10 = new Dataset()
				.setLabel("Rectangle Rotated")
				.setBackgroundColor(SimpleColor.GREEN_TRANSPARENT)
				.setBorderColor(SimpleColor.GREEN_TRANSPARENT)
				.setData(IntegerValue.of(Arrays.asList(11,11,11,11,11,11,11)))
				.setShowLine(false)
				.setPointRadius(10)
				.setPointHoverRadius(15)
				.setPointStyle(PointStyle.RECT_ROT)
				.setFill(false);
		
		data.setDatasets(Arrays.asList(dataset1, dataset2, dataset3, dataset4, dataset5, dataset6,
				dataset7, dataset8, dataset9, dataset10));
		
		//Point Style Can also be set in the options using the Elements option
		//But you can only have one point style for all datasets
		
		//Some Point Styles are drawn incorrectly
		//See this issue: https://github.com/chartjs/Chart.js/issues/2607
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Point Styles"))
				.setLegend(new Legend()
						.setPosition(Position.RIGHT))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setDisplay(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Month")))
						.setYAxes(new AxesScale()
								.setDisplay(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Value"))
								.setTicks(new Ticks()
										.setMax(13)
										.setMin(0))))
				;
		setOptions(options);
	}
}
