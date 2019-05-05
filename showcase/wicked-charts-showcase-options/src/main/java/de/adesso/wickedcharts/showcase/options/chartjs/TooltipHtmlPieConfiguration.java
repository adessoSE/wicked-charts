package de.adesso.wickedcharts.showcase.options.chartjs;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.options.chartjs.base.ShowcaseConfiguration;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Sample that enables the use of custom html markup for tooltips in a pie chart.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/tooltips/custom-pie.html">http://www.chartjs.org/samples/latest/tooltips/custom-pie.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class TooltipHtmlPieConfiguration extends ShowcaseConfiguration {
	public TooltipHtmlPieConfiguration() {
    	setType(ChartType.PIE);
    	
    	String optionalJavascript=readFile("de/adesso/wickedcharts/showcase/customTooltip-Pie.js");
    	
    	setOptionalJavascript(new ArrayList<String>());
    	addOptionalJavascript(optionalJavascript);
    	
		Data data = new Data();
		setData(data);
		
		Dataset dataset = new Dataset()
				.setLabel("My Dataset")
				.setBackgroundColor(Arrays.asList(SimpleColor.RED,SimpleColor.ORANGE,SimpleColor.YELLOW, SimpleColor.GREEN, SimpleColor.BLUE))
				.setData(IntegerValue.of(300, 50, 100, 40, 10));

		data.setDatasets(Arrays.asList(dataset)).setLabels(TextLabel.of("Red", "Orange", "Yellow", "Green", "Blue"));
		
		Options options = new Options()
				.setResponsive(true)
				.setLegend(new Legend()
						.setDisplay(true))
				.setTitle(new Title()
						.setDisplay(true)
						.setText("HTML Tooltip - Pie"))
				.setTooltips(new Tooltips()
						.setEnabled(false)
//						.setCustom(new JavaScriptReference("customTooltips"))
								);
		setOptions(options);
	}
}
