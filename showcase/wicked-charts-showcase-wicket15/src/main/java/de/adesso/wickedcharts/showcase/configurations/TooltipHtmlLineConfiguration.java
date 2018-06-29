package de.adesso.wickedcharts.showcase.configurations;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Sample that enables the use of custom html markup for tooltips in a line chart.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/tooltips/custom-line.html">http://www.chartjs.org/samples/latest/tooltips/custom-line.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class TooltipHtmlLineConfiguration extends ShowcaseConfiguration {
	public TooltipHtmlLineConfiguration() {
    	setType(ChartType.LINE);
    	
    	String optionalJavascript=  readFile("de/adesso/wickedcharts/showcase/customTooltip.js");

		setOptionalJavascript(new ArrayList<String>());
    	addOptionalJavascript(optionalJavascript);
    	
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setFill(false);
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second dataset")
				.setBackgroundColor(SimpleColor.BLUE)
				.setBorderColor(SimpleColor.BLUE)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setFill(false);
		
		data.setDatasets(Arrays.asList(dataset1,dataset2));
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("HTML Tooltip - Line"))
				.setTooltips(new Tooltips()
						.setEnabled(false)
						.setMode(TooltipMode.INDEX)
						.setPosition(TooltipPosition.NEAREST)
						.setCustom(new JavaScriptReference("customTooltips"))
								);
		setOptions(options);
	}
	
	
}
