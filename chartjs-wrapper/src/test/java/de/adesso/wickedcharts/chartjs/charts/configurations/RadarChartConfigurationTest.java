package de.adesso.wickedcharts.chartjs.charts.configurations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import de.adesso.wickedcharts.chartjs.ChartConfiguration;
import de.adesso.wickedcharts.chartjs.chartoptions.Animation;
import de.adesso.wickedcharts.chartjs.chartoptions.AxesScale;
import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.Element;
import de.adesso.wickedcharts.chartjs.chartoptions.Filler;
import de.adesso.wickedcharts.chartjs.chartoptions.GridLines;
import de.adesso.wickedcharts.chartjs.chartoptions.Hover;
import de.adesso.wickedcharts.chartjs.chartoptions.HoverMode;
import de.adesso.wickedcharts.chartjs.chartoptions.Legend;
import de.adesso.wickedcharts.chartjs.chartoptions.Line;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.Plugins;
import de.adesso.wickedcharts.chartjs.chartoptions.Position;
import de.adesso.wickedcharts.chartjs.chartoptions.Rectangle;
import de.adesso.wickedcharts.chartjs.chartoptions.SamplesFillerAnalyzer;
import de.adesso.wickedcharts.chartjs.chartoptions.ScaleLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.Scales;
import de.adesso.wickedcharts.chartjs.chartoptions.Ticks;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.TooltipMode;
import de.adesso.wickedcharts.chartjs.chartoptions.Tooltips;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.StringValueColor;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.AbsoluteIndex;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.BoundaryFillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.RelativeIndex;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RadarChartConfigurationTest {
	
	@Test
	public void radarChartConfigurationTest() {
		String result = "{\r\n" + 
				"  \"type\" : \"radar\",\r\n" + 
				"  \"data\" : {\r\n" + 
				"    \"labels\" : [ \"January\", \"February\", \"March\", \"April\", \"May\", \"June\", \"July\" ],\r\n" + 
				"    \"datasets\" : [ {\r\n" + 
				"      \"label\" : \"D0\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(255,99,132,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(255,99,132)',\r\n" + 
				"      \"data\" : [ 1, 2, 3, 1, 2, 1, 2 ],\r\n" + 
				"      \"fill\" : 'undefined'\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"D1 (hidden) Fill: -1\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(255,159,64,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(255,159,64)',\r\n" + 
				"      \"data\" : [ 5, 4, 3, 5, 4, 3, 5 ],\r\n" + 
				"      \"fill\" : '-1',\r\n" + 
				"      \"hidden\" : true\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"D2 Fill: 1\",\r\n" + 
				"      \"backgroundColor\" : 'rgb(255,205,86)',\r\n" + 
				"      \"borderColor\" : 'rgba(255,205,86,0.50)',\r\n" + 
				"      \"data\" : [ 10, 8, 12, 6, 13, 10, 9 ],\r\n" + 
				"      \"fill\" : 1\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"D3 Fill: False\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(75,192,192,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(75,192,192)',\r\n" + 
				"      \"data\" : [ 20, 18, 22, 16, 23, 20, 19 ],\r\n" + 
				"      \"fill\" : false\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"D4 Fill: -1\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(54,162,235,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(54,162,235)',\r\n" + 
				"      \"data\" : [ 30, 28, 32, 26, 33, 30, 29 ],\r\n" + 
				"      \"fill\" : '-1'\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"D5 Fill: -1\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(153,102,255,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(153,102,255)',\r\n" + 
				"      \"data\" : [ 40, 38, 42, 36, 43, 40, 39 ],\r\n" + 
				"      \"fill\" : '-1'\r\n" + 
				"    } ]\r\n" + 
				"  },\r\n" + 
				"  \"options\" : {\r\n" + 
				"    \"responsive\" : true,\r\n" + 
				"    \"maintainAspectRatio\" : true,\r\n" + 
				"    \"spanGaps\" : false,\r\n" + 
				"    \"title\" : {\r\n" + 
				"      \"display\" : true,\r\n" + 
				"      \"text\" : \"Chart.js Radar Chart\"\r\n" + 
				"    },\r\n" + 
				"    \"elements\" : {\r\n" + 
				"      \"line\" : {\r\n" + 
				"        \"tension\" : 1.0E-6\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    \"plugins\" : {\r\n" + 
				"      \"filler\" : {\r\n" + 
				"        \"propagate\" : false\r\n" + 
				"      },\r\n" + 
				"      \"samples_filler_analyzer\" : {\r\n" + 
				"        \"target\" : \"chart-analyzer\"\r\n" + 
				"      }\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}";
		System.out.println(test());
		assertTrue(test().compareTo(result) == 0);
	}
	
	public static String test() {
		ChartConfiguration config = new ChartConfiguration().setType(ChartType.RADAR).setData(exampleData());
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Radar Chart"))
				.setMaintainAspectRatio(true)
				.setSpanGaps(false)
				.setElements(new Element()
						.setLine(new Line()
								.setTension(0.000001)))
				.setPlugins(new Plugins()
						.setFiller(new Filler()
								.setPropagate(false))
						.setSamples_filler_analyzer(new SamplesFillerAnalyzer()
								.setTarget("chart-analyzer")))
				;
		config.setOptions(options);
				
		JsonRenderer renderer = new JsonRenderer();
				
		return renderer.toJson(config);
	}
	
	private static Data exampleData(){
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		
		Dataset dataset0 = new Dataset()
				.setLabel("D0")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(Arrays.asList(1, 2, 3, 1, 2, 1, 2)))
				.setFill(BoundaryFillingMode.UNDEFINED);
		
		
		Dataset dataset1 = new Dataset()
				.setLabel("D1 (hidden) Fill: -1")
				.setBackgroundColor(SimpleColor.ORANGE_TRANSPARENT)
				.setBorderColor(SimpleColor.ORANGE)
				.setData(IntegerValue.of(Arrays.asList(5, 4, 3, 5, 4, 3, 5)))
				.setHidden(true)
				.setFill(new RelativeIndex("-1"));
		
		Dataset dataset2 = new Dataset()
				.setLabel("D2 Fill: 1")
				.setBackgroundColor(SimpleColor.YELLOW)
				.setBorderColor(SimpleColor.YELLOW_TRANSPARENT)
				.setData(IntegerValue.of(Arrays.asList(10, 8, 12, 6, 13, 10, 9)))
				.setFill(new AbsoluteIndex(1));
		
		
		Dataset dataset3 = new Dataset()
				.setLabel("D3 Fill: False")
				.setBackgroundColor(SimpleColor.GREEN_TRANSPARENT)
				.setBorderColor(SimpleColor.GREEN)
				.setData(IntegerValue.of(Arrays.asList(20, 18, 22, 16, 23, 20, 19)))
				.setFill(false);
		
		Dataset dataset4 = new Dataset()
				.setLabel("D4 Fill: -1")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE)
				.setData(IntegerValue.of(Arrays.asList(30, 28, 32, 26, 33, 30, 29)))
				.setFill(new RelativeIndex("-1"));
		
		
		Dataset dataset5 = new Dataset()
				.setLabel("D5 Fill: -1")
				.setBackgroundColor(SimpleColor.PURPLE_TRANSPARENT)
				.setBorderColor(SimpleColor.PURPLE)
				.setData(IntegerValue.of(Arrays.asList(40, 38, 42, 36, 43, 40, 39)))
				.setFill(new RelativeIndex("-1"));		
		
		data.setDatasets(Arrays.asList(dataset0, dataset1, dataset2, dataset3, dataset4, dataset5));
		return data;
	}
	
	public static List<Integer> integerList(int size){
		List<Integer> dataList = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			dataList.add(i);
		}
		return dataList;
	}
}
