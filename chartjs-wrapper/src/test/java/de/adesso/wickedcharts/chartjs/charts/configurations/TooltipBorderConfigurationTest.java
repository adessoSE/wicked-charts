package de.adesso.wickedcharts.chartjs.charts.configurations;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import de.adesso.wickedcharts.chartjs.ChartConfiguration;
import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.Legend;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.Position;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.TooltipMode;
import de.adesso.wickedcharts.chartjs.chartoptions.Tooltips;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.RgbColor;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.RgbaColor;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;

import static org.junit.Assert.*;



public class TooltipBorderConfigurationTest {
	
	@Test
	public void TooltipConfigurationTest() {
		String result = "{\r\n" + 
				"  \"type\" : \"line\",\r\n" + 
				"  \"data\" : {\r\n" + 
				"    \"labels\" : [ \"January\", \"February\", \"March\", \"April\", \"May\", \"June\", \"July\" ],\r\n" + 
				"    \"datasets\" : [ {\r\n" + 
				"      \"label\" : \"Dataset 1\",\r\n" + 
				"      \"backgroundColor\" : 'rgb(255,99,132)',\r\n" + 
				"      \"borderColor\" : 'rgb(255,99,132)',\r\n" + 
				"      \"borderWidth\" : 2,\r\n" + 
				"      \"data\" : [ 10, 30, 46, 2, 8, 50, 0 ],\r\n" + 
				"      \"fill\" : false\r\n" + 
				"    } ]\r\n" + 
				"  },\r\n" + 
				"  \"options\" : {\r\n" + 
				"    \"responsive\" : true,\r\n" + 
				"    \"title\" : {\r\n" + 
				"      \"display\" : true,\r\n" + 
				"      \"text\" : \"Sample tooltip with border\"\r\n" + 
				"    },\r\n" + 
				"    \"tooltips\" : {\r\n" + 
				"      \"position\" : \"nearest\",\r\n" + 
				"      \"mode\" : \"index\",\r\n" + 
				"      \"caretSize\" : 8,\r\n" + 
				"      \"backgroundColor\" : 'rgba(72,241,12,1.00)',\r\n" + 
				"      \"titleFontColor\" : 'rgb(0,0,0)',\r\n" + 
				"      \"bodyFontColor\" : 'rgb(0,0,0)',\r\n" + 
				"      \"borderColor\" : 'rgba(0,0,0,1.00)',\r\n" + 
				"      \"borderWidth\" : 4,\r\n" + 
				"      \"intersect\" : false,\r\n" + 
				"      \"xpadding\" : 10,\r\n" + 
				"      \"ypadding\" : 10\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}";
		System.out.println(test());
		assertTrue(test().compareTo(result) == 0);
	}
	
	public static String test() {
		ChartConfiguration config = new ChartConfiguration().setType(ChartType.LINE).setData(exampleData());
		RgbColor black = new RgbColor(0,0,0);
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Sample tooltip with border"))
				.setTooltips(new Tooltips()
						.setMode(TooltipMode.INDEX)
						.setPosition(Position.NEAREST)
						.setIntersect(false)
						.setYPadding(10)
						.setXPadding(10)
						.setCaretSize(8)
						.setBackgroundColor(new RgbaColor(72, 241, 12,1.0f))
						.setTitleFontColor(black)
						.setBodyFontColor(black)
						.setBorderColor(new RgbaColor(0,0,0,1.0f))
						.setBorderWidth(4))
				;
						config.setOptions(options);
				
		JsonRenderer renderer = new JsonRenderer();
				
		return renderer.toJson(config);
	}
	
	private static Data exampleData(){
		Data data = new Data();
		data.setDatasets(new ArrayList<Dataset>());
		
		data.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		
		data.getDatasets().add(exampleDataSet(data.getLabels().size(),"Dataset 1",SimpleColor.RED,SimpleColor.RED));
		
		return data;
	}
	
	public static Dataset exampleDataSet(int size, String label, Color backgroundColor, Color borderColor) {
		Dataset dataset = new Dataset();
		dataset.setData(IntegerValue.of(10, 30, 46, 2,8,50,0))
			.setBackgroundColor(backgroundColor).setBorderColor(borderColor)
			.setBorderWidth(2)
			.setLabel(label)
			.setFill(false);
		return dataset;
	}
}
