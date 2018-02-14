package de.adesso.wickedcharts.showcase.configurations;

import java.util.Arrays;

import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.JavaScriptReference;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.TooltipMode;
import de.adesso.wickedcharts.chartjs.chartoptions.Tooltips;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

@SuppressWarnings("serial")
public class TooltipHtmlPointsConfiguration extends ShowcaseConfiguration {
	public TooltipHtmlPointsConfiguration() {
    	setType(ChartType.LINE);
    	
    	String optionalJavascript=readFile("de/adesso/wickedcharts/showcase/customTooltip-Point.js");
    	
    	setOptionalJavascript(optionalJavascript);
    	
		Data data = new Data()
				.setLabels(TextLabel.createListOf("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setPointBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(randomIntegerList(7)));
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second dataset")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setPointBackgroundColor(SimpleColor.BLUE)
				.setBorderColor(SimpleColor.BLUE)
				.setData(IntegerValue.of(randomIntegerList(7)));
		
		data.setDatasets(Arrays.asList(dataset1,dataset2));
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js - Custom Tooltips using Data Points"))
				.setTooltips(new Tooltips()
						.setEnabled(false)
						.setIntersect(false)
						.setMode(TooltipMode.INDEX)
						.setCustom(new JavaScriptReference("customTooltips"))
								);
		setOptions(options);
	}
}
