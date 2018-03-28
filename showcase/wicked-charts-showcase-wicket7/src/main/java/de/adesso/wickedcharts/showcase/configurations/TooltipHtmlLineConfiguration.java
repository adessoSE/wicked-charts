package de.adesso.wickedcharts.showcase.configurations;

import java.util.ArrayList;
import java.util.Arrays;

import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.JavaScriptReference;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.Position;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.TooltipMode;
import de.adesso.wickedcharts.chartjs.chartoptions.TooltipPosition;
import de.adesso.wickedcharts.chartjs.chartoptions.Tooltips;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

/**
 * Sample that enables the use of custom html markup for tooltips in a line chart.
 *
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
