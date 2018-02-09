package com.googlecode.wickedcharts.showcase.configurations;

import java.util.Arrays;
import java.util.Collections;

import com.googlecode.wickedcharts.chartjs.chartoptions.AxesScale;
import com.googlecode.wickedcharts.chartjs.chartoptions.ChartType;
import com.googlecode.wickedcharts.chartjs.chartoptions.Data;
import com.googlecode.wickedcharts.chartjs.chartoptions.Dataset;
import com.googlecode.wickedcharts.chartjs.chartoptions.Element;
import com.googlecode.wickedcharts.chartjs.chartoptions.Hover;
import com.googlecode.wickedcharts.chartjs.chartoptions.HoverMode;
import com.googlecode.wickedcharts.chartjs.chartoptions.Options;
import com.googlecode.wickedcharts.chartjs.chartoptions.Point;
import com.googlecode.wickedcharts.chartjs.chartoptions.ScaleLabel;
import com.googlecode.wickedcharts.chartjs.chartoptions.Scales;
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
				.setLabel("Cross")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(randomIntegerList(7))
				.setShowLine(false)
				.setPointRadius(Collections.nCopies(7, "13"))
				.setPointHoverRadius("15")
				.setFill(false);
		
		data.setDatasets(Arrays.asList(dataset1));
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Point Styles"))
				.setTooltips(new Tooltips()
						.setMode(TooltipMode.INDEX)
						.setIntersect(false))
				.setHover(new Hover()
						.setMode(HoverMode.NEAREST)
						.setIntersect(true))
				.setElements(new Element()
						.setPoint(new Point().setPointStyle("crossRot")))
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
										.setLabelString("Value"))))
				;
		setOptions(options);
	}
}
