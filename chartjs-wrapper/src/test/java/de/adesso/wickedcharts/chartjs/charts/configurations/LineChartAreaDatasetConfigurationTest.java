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


public class LineChartAreaDatasetConfigurationTest {
	
	@Test
	public void lineChartAreaDatasetConfigurationTest() {
		String result = "{\r\n" + 
				"  \"type\" : \"line\",\r\n" + 
				"  \"data\" : {\r\n" + 
				"    \"labels\" : [ \"January\", \"February\", \"March\", \"April\", \"May\", \"June\", \"July\", \"August\", \"September\", \"October\", \"November\", \"December\" ],\r\n" + 
				"    \"datasets\" : [ {\r\n" + 
				"      \"label\" : \"D0 (hidden), Fill: undefined\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(255,99,132,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(255,99,132)',\r\n" + 
				"      \"data\" : [ 0, 1, 2, 3, 4, 5, 6 ],\r\n" + 
				"      \"fill\" : 'undefined',\r\n" + 
				"      \"hidden\" : true\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"D1 Fill: -1\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(255,99,132,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(255,99,132)',\r\n" + 
				"      \"data\" : [ 0, 1, 2, 3, 4, 5, 6 ],\r\n" + 
				"      \"fill\" : '-1'\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"D2 (hidden) Fill: 1\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(255,159,64,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(255,159,64)',\r\n" + 
				"      \"data\" : [ 0, 1, 2, 3, 4, 5, 6 ],\r\n" + 
				"      \"fill\" : 1,\r\n" + 
				"      \"hidden\" : true\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"D3 Fill: -1\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(255,205,86,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(255,205,86)',\r\n" + 
				"      \"data\" : [ 0, 1, 2, 3, 4, 5, 6 ],\r\n" + 
				"      \"fill\" : false\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"D4 Fill: -1\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(75,192,192,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(75,192,192)',\r\n" + 
				"      \"data\" : [ 0, 1, 2, 3, 4, 5, 6 ],\r\n" + 
				"      \"fill\" : '-1'\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"D5 Fill: +2\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(54,162,235,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(54,162,235)',\r\n" + 
				"      \"data\" : [ 0, 1, 2, 3, 4, 5, 6 ],\r\n" + 
				"      \"fill\" : '+2'\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"D6 Fill: false\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(201,203,207,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(201,203,207)',\r\n" + 
				"      \"data\" : [ 0, 1, 2, 3, 4, 5, 6 ],\r\n" + 
				"      \"fill\" : false\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"D7 Fill: 8\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(153,102,255,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(153,102,255)',\r\n" + 
				"      \"data\" : [ 0, 1, 2, 3, 4, 5, 6 ],\r\n" + 
				"      \"fill\" : 8\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"D8 (hidden) Fill: end\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(255,99,132,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(255,99,132)',\r\n" + 
				"      \"data\" : [ 0, 1, 2, 3, 4, 5, 6 ],\r\n" + 
				"      \"fill\" : 'end',\r\n" + 
				"      \"hidden\" : true\r\n" + 
				"    } ]\r\n" + 
				"  },\r\n" + 
				"  \"options\" : {\r\n" + 
				"    \"responsive\" : true,\r\n" + 
				"    \"maintainAspectRatio\" : true,\r\n" + 
				"    \"spanGaps\" : false,\r\n" + 
				"    \"title\" : {\r\n" + 
				"      \"display\" : true,\r\n" + 
				"      \"text\" : \"Chart.js Line Dataset Chart\"\r\n" + 
				"    },\r\n" + 
				"    \"tooltips\" : {\r\n" + 
				"      \"mode\" : \"index\",\r\n" + 
				"      \"intersect\" : false\r\n" + 
				"    },\r\n" + 
				"    \"hover\" : {\r\n" + 
				"      \"mode\" : \"nearest\",\r\n" + 
				"      \"intersect\" : true\r\n" + 
				"    },\r\n" + 
				"    \"scales\" : {\r\n" + 
				"      \"xAxes\" : [ {\r\n" + 
				"        \"display\" : true,\r\n" + 
				"        \"scaleLabel\" : {\r\n" + 
				"          \"display\" : true,\r\n" + 
				"          \"labelString\" : \"Month\"\r\n" + 
				"        }\r\n" + 
				"      } ],\r\n" + 
				"      \"yAxes\" : [ {\r\n" + 
				"        \"stacked\" : true,\r\n" + 
				"        \"display\" : true,\r\n" + 
				"        \"scaleLabel\" : {\r\n" + 
				"          \"display\" : true,\r\n" + 
				"          \"labelString\" : \"Value\"\r\n" + 
				"        }\r\n" + 
				"      } ]\r\n" + 
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
		ChartConfiguration config = new ChartConfiguration().setType(ChartType.LINE).setData(exampleData());
		Options options = new Options()
				.setMaintainAspectRatio(true)
				.setSpanGaps(false)
				.setElements(new Element()
						.setLine(new Line()
								.setTension(0.000001)))
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Line Dataset Chart"))
				.setTooltips(new Tooltips()
						.setMode(TooltipMode.INDEX)
						.setIntersect(false))
				.setHover(new Hover()
						.setMode(HoverMode.NEAREST)
						.setIntersect(true))
				.setPlugins(new Plugins()
						.setFiller(new Filler()
								.setPropagate(false))
						.setSamples_filler_analyzer(new SamplesFillerAnalyzer()
								.setTarget("chart-analyzer")))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setDisplay(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Month")))
						.setYAxes(new AxesScale()
								.setDisplay(true)
								.setStacked(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Value"))))
				;
		config.setOptions(options);
				
		JsonRenderer renderer = new JsonRenderer();
				
		return renderer.toJson(config);
	}
	
	private static Data exampleData(){
		Data data = new Data();
		data.setDatasets(new ArrayList<Dataset>());
		
		data.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July", "August",
						"September", "October", "November", "December"));
		
		Dataset dataset0 = new Dataset()
				.setLabel("D0 (hidden), Fill: undefined")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(integerList(7)))
				.setFill(BoundaryFillingMode.UNDEFINED)
				.setHidden(true);
		
		
		Dataset dataset1 = new Dataset()
				.setLabel("D1 Fill: -1")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(integerList(7)))
				.setFill(new RelativeIndex("-1"));
		
		
		Dataset dataset2 = new Dataset()
				.setLabel("D2 (hidden) Fill: 1")
				.setBackgroundColor(SimpleColor.ORANGE_TRANSPARENT)
				.setBorderColor(SimpleColor.ORANGE)
				.setData(IntegerValue.of(integerList(7)))
				.setHidden(true)
				.setFill(new AbsoluteIndex(1));
		
		Dataset dataset3 = new Dataset()
				.setLabel("D3 Fill: -1")
				.setBackgroundColor(SimpleColor.YELLOW_TRANSPARENT)
				.setBorderColor(SimpleColor.YELLOW)
				.setData(IntegerValue.of(integerList(7)))
				.setFill(false);
		
		
		Dataset dataset4 = new Dataset()
				.setLabel("D4 Fill: -1")
				.setBackgroundColor(SimpleColor.GREEN_TRANSPARENT)
				.setBorderColor(SimpleColor.GREEN)
				.setData(IntegerValue.of(integerList(7)))
				.setFill(new RelativeIndex("-1"));
		
		Dataset dataset5 = new Dataset()
				.setLabel("D5 Fill: +2")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE)
				.setData(IntegerValue.of(integerList(7)))
				.setFill(new RelativeIndex("+2"));
		
		
		Dataset dataset6 = new Dataset()
				.setLabel("D6 Fill: false")
				.setBackgroundColor(SimpleColor.GREY_TRANSPARENT)
				.setBorderColor(SimpleColor.GREY)
				.setData(IntegerValue.of(integerList(7)))
				.setFill(false);
		
		Dataset dataset7 = new Dataset()
				.setLabel("D7 Fill: 8")
				.setBackgroundColor(SimpleColor.PURPLE_TRANSPARENT)
				.setBorderColor(SimpleColor.PURPLE)
				.setData(IntegerValue.of(integerList(7)))
				.setFill(new AbsoluteIndex(8));
		
		
		Dataset dataset8 = new Dataset()
				.setLabel("D8 (hidden) Fill: end")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(integerList(7)))
				.setHidden(true)
				.setFill(BoundaryFillingMode.END);
		
		data.getDatasets().add(dataset0);
		data.getDatasets().add(dataset1);
		data.getDatasets().add(dataset2);
		data.getDatasets().add(dataset3);
		data.getDatasets().add(dataset4);
		data.getDatasets().add(dataset5);
		data.getDatasets().add(dataset6);
		data.getDatasets().add(dataset7);
		data.getDatasets().add(dataset8);
		return data;
	}
	
	public static Dataset exampleDataSet(int size, String label, Color backgroundColor, Color borderColor) {
		List<Integer> dataList = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			dataList.add(i);
		}
		Dataset dataset = new Dataset()
				.setLabel(label)
				.setBackgroundColor(backgroundColor)
				.setBorderColor(borderColor)
				.setData(IntegerValue.of(Arrays.asList(10, 30, 39, 20, 25, 34, -10)))
				.setFill(false);
		return dataset;
	}
	
	public static List<Integer> integerList(int size){
		List<Integer> dataList = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			dataList.add(i);
		}
		return dataList;
	}
}
