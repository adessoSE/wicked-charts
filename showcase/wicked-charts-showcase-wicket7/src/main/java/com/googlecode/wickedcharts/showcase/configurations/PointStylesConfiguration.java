package com.googlecode.wickedcharts.showcase.configurations;

import java.util.Arrays;
import java.util.Collections;

import com.googlecode.wickedcharts.chartjs.chartoptions.AxesScale;
import com.googlecode.wickedcharts.chartjs.chartoptions.ChartType;
import com.googlecode.wickedcharts.chartjs.chartoptions.Data;
import com.googlecode.wickedcharts.chartjs.chartoptions.Dataset;
import com.googlecode.wickedcharts.chartjs.chartoptions.Element;
import com.googlecode.wickedcharts.chartjs.chartoptions.GridLines;
import com.googlecode.wickedcharts.chartjs.chartoptions.Hover;
import com.googlecode.wickedcharts.chartjs.chartoptions.HoverMode;
import com.googlecode.wickedcharts.chartjs.chartoptions.Legend;
import com.googlecode.wickedcharts.chartjs.chartoptions.Options;
import com.googlecode.wickedcharts.chartjs.chartoptions.Point;
import com.googlecode.wickedcharts.chartjs.chartoptions.Position;
import com.googlecode.wickedcharts.chartjs.chartoptions.ScaleLabel;
import com.googlecode.wickedcharts.chartjs.chartoptions.Scales;
import com.googlecode.wickedcharts.chartjs.chartoptions.Ticks;
import com.googlecode.wickedcharts.chartjs.chartoptions.Title;
import com.googlecode.wickedcharts.chartjs.chartoptions.TooltipMode;
import com.googlecode.wickedcharts.chartjs.chartoptions.Tooltips;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import com.googlecode.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;


/*Supported Point Styles:
 * 
 *  'circle',
    'triangle',
    'rect',
    'rectRounded',
    'rectRot',
    'cross',
    'crossRot',
    'star',
    'line',
    'dash'
 */

@SuppressWarnings("serial")
public class PointStylesConfiguration extends ShowcaseConfiguration {
	public PointStylesConfiguration() {
		super();
    	setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(Arrays.asList("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("Dash")
				.setBackgroundColor(SimpleColor.GREY)
				.setBorderColor(SimpleColor.GREY)
				.setData(Arrays.asList(1,1,1,1,1,1,1))
				.setShowLine(false)
				.setPointRadius(Collections.nCopies(7, "10"))
				.setPointHoverRadius("15")
				.setPointStyle("dash")
				.setFill("false");
		
		Dataset dataset2 = new Dataset()
				.setLabel("Star")
				.setBackgroundColor(SimpleColor.PURPLE)
				.setBorderColor(SimpleColor.PURPLE)
				.setData(Arrays.asList(2,2,2,2,2,2,2))
				.setShowLine(false)
				.setPointRadius(Collections.nCopies(7, "20"))
				.setPointHoverRadius("15")
				.setPointStyle("star")
				.setFill("false");
		
		Dataset dataset3 = new Dataset()
				.setLabel("Rectangle")
				.setBackgroundColor(SimpleColor.YELLOW)
				.setBorderColor(SimpleColor.YELLOW)
				.setData(Arrays.asList(3,3,3,3,3,3,3))
				.setShowLine(false)
				.setPointRadius(Collections.nCopies(7, "10"))
				.setPointHoverRadius("15")
				.setPointStyle("rect")
				.setFill("false");
		
		Dataset dataset4 = new Dataset()
				.setLabel("Triangle")
				.setBackgroundColor(SimpleColor.GREEN)
				.setBorderColor(SimpleColor.GREEN)
				.setData(Arrays.asList(4,4,4,4,4,4,4))
				.setShowLine(false)
				.setPointRadius(Collections.nCopies(7, "10"))
				.setPointHoverRadius("15")
				.setPointStyle("triangle")
				.setFill("false");
		
		Dataset dataset5 = new Dataset()
				.setLabel("Circle")
				.setBackgroundColor(SimpleColor.BLUE)
				.setBorderColor(SimpleColor.BLUE)
				.setData(Arrays.asList(5,5,5,5,5,5,5))
				.setShowLine(false)
				.setPointRadius(Collections.nCopies(7, "10"))
				.setPointHoverRadius("15")
				.setPointStyle("circle")
				.setFill("false");
		
		Dataset dataset6 = new Dataset()
				.setLabel("CrossRot")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(Arrays.asList(6,6,6,6,6,6,6))
				.setShowLine(false)
				.setPointRadius(Collections.nCopies(7, "10"))
				.setPointHoverRadius("15")
				.setPointStyle("crossRot")
				.setFill("false");
		
		Dataset dataset7 = new Dataset()
				.setLabel("Line")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED_TRANSPARENT)
				.setData(Arrays.asList(7,7,7,7,7,7,7))
				.setShowLine(false)
				.setPointRadius(Collections.nCopies(7, "10"))
				.setPointHoverRadius("15")
				.setPointStyle("line")
				.setFill("false");
		
		Dataset dataset8 = new Dataset()
				.setLabel("Cross")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE_TRANSPARENT)
				.setData(Arrays.asList(8,8,8,8,8,8,8))
				.setShowLine(false)
				.setPointRadius(Collections.nCopies(7, "10"))
				.setPointHoverRadius("15")
				.setPointStyle("cross")
				.setFill("false");
		
		Dataset dataset9 = new Dataset()
				.setLabel("Rectangle Rounded")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(Arrays.asList(9,9,9,9,9,9,9))
				.setShowLine(false)
				.setPointRadius(Collections.nCopies(7, "10"))
				.setPointHoverRadius("15")
				.setPointStyle("rectRounded")
				.setFill("false");
		
		Dataset dataset10 = new Dataset()
				.setLabel("Rectangle Rotated")
				.setBackgroundColor(SimpleColor.GREEN_TRANSPARENT)
				.setBorderColor(SimpleColor.GREEN_TRANSPARENT)
				.setData(Arrays.asList(11,11,11,11,11,11,11))
				.setShowLine(false)
				.setPointRadius(Collections.nCopies(7, "10"))
				.setPointHoverRadius("15")
				.setPointStyle("rectRot")
				.setFill("false");
		
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
