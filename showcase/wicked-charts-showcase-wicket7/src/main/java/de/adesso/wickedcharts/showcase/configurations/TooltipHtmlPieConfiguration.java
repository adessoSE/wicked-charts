package de.adesso.wickedcharts.showcase.configurations;

import java.util.Arrays;

import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.Legend;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.Tooltips;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

@SuppressWarnings("serial")
public class TooltipHtmlPieConfiguration extends ShowcaseConfiguration {
	public TooltipHtmlPieConfiguration() {
    	setType(ChartType.PIE);
    	
    	String optionalJavascript=readFile("de/adesso/wickedcharts/showcase/customTooltip-Pie.js");
    	
    	setOptionalJavascript(optionalJavascript);
    	
		Data data = new Data()
				.setLabels(TextLabel.createListOf("Red","Orange","Yellow","Green","Blue"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setBackgroundColor(Arrays.asList(SimpleColor.RED,SimpleColor.ORANGE,SimpleColor.YELLOW, SimpleColor.GREEN, SimpleColor.BLUE))
				.setData(IntegerValue.of(300, 50, 100, 40, 10));
		
		data.setDatasets(Arrays.asList(dataset1));
		
		Options options = new Options()
				.setResponsive(true)
				.setLegend(new Legend()
						.setDisplay(false))
				.setTooltips(new Tooltips()
						.setEnabled(false)
//						.setCustom(new JavaScriptReference("customTooltips"))
								);
		setOptions(options);
	}
}
