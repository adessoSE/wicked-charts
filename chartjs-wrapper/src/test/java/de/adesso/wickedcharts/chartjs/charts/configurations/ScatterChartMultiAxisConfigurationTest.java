package de.adesso.wickedcharts.chartjs.charts.configurations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
import de.adesso.wickedcharts.chartjs.chartoptions.ScaleLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.Scales;
import de.adesso.wickedcharts.chartjs.chartoptions.Ticks;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.TooltipMode;
import de.adesso.wickedcharts.chartjs.chartoptions.Tooltips;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.RgbaColor;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.StringValueColor;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.BoundaryFillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.PointValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ScatterChartMultiAxisConfigurationTest {
	
	@Test
	public void scatterChartMultiAxisConfigurationTest() {
		String result = "{\r\n" + 
				"  \"type\" : \"scatter\",\r\n" + 
				"  \"data\" : {\r\n" + 
				"    \"labels\" : [ \"January\", \"February\", \"March\", \"April\", \"May\", \"June\", \"July\" ],\r\n" + 
				"    \"datasets\" : [ {\r\n" + 
				"      \"label\" : \"My First dataset\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(255,99,132,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(255,99,132)',\r\n" + 
				"      \"data\" : [ {\r\n" + 
				"        \"x\" : 4,\r\n" + 
				"        \"y\" : 14\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 40,\r\n" + 
				"        \"y\" : 42\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 23,\r\n" + 
				"        \"y\" : 42\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 40,\r\n" + 
				"        \"y\" : 22\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 80,\r\n" + 
				"        \"y\" : 12\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 30,\r\n" + 
				"        \"y\" : 32\r\n" + 
				"      } ],\r\n" + 
				"      \"fill\" : false,\r\n" + 
				"      \"yaxisID\" : \"y-axis-1\",\r\n" + 
				"      \"yAxisID\" : \"y-axis-1\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"My Second dataset\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(54,162,235,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(54,162,235)',\r\n" + 
				"      \"data\" : [ {\r\n" + 
				"        \"x\" : 7,\r\n" + 
				"        \"y\" : 56\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 15,\r\n" + 
				"        \"y\" : 54\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 46,\r\n" + 
				"        \"y\" : 34\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 36,\r\n" + 
				"        \"y\" : 42\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 78,\r\n" + 
				"        \"y\" : 64\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 12,\r\n" + 
				"        \"y\" : 48\r\n" + 
				"      } ],\r\n" + 
				"      \"fill\" : false,\r\n" + 
				"      \"yaxisID\" : \"y-axis-2\",\r\n" + 
				"      \"yAxisID\" : \"y-axis-2\"\r\n" + 
				"    } ]\r\n" + 
				"  },\r\n" + 
				"  \"options\" : {\r\n" + 
				"    \"responsive\" : true,\r\n" + 
				"    \"title\" : {\r\n" + 
				"      \"display\" : true,\r\n" + 
				"      \"text\" : \"Chart.js Scatter Chart Multi Axis\"\r\n" + 
				"    },\r\n" + 
				"    \"scales\" : {\r\n" + 
				"      \"xAxes\" : [ {\r\n" + 
				"        \"display\" : true,\r\n" + 
				"        \"scaleLabel\" : {\r\n" + 
				"          \"display\" : true,\r\n" + 
				"          \"labelString\" : \"Month\"\r\n" + 
				"        },\r\n" + 
				"        \"position\" : \"bottom\",\r\n" + 
				"        \"type\" : \"linear\",\r\n" + 
				"        \"gridLines\" : {\r\n" + 
				"          \"zeroLineColor\" : 'rgba(0,0,0,1.00)'\r\n" + 
				"        }\r\n" + 
				"      } ],\r\n" + 
				"      \"yAxes\" : [ {\r\n" + 
				"        \"display\" : true,\r\n" + 
				"        \"id\" : \"y-axis-1\",\r\n" + 
				"        \"position\" : \"left\",\r\n" + 
				"        \"type\" : \"linear\"\r\n" + 
				"      }, {\r\n" + 
				"        \"display\" : true,\r\n" + 
				"        \"reverse\" : true,\r\n" + 
				"        \"id\" : \"y-axis-2\",\r\n" + 
				"        \"position\" : \"right\",\r\n" + 
				"        \"type\" : \"linear\",\r\n" + 
				"        \"gridLines\" : {\r\n" + 
				"          \"drawOnChartArea\" : false\r\n" + 
				"        }\r\n" + 
				"      } ]\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}";
		System.out.println(test());
		assertTrue(test().compareTo(result) == 0);
	}
	
	public static String test() {
		ChartConfiguration config = new ChartConfiguration().setType(ChartType.SCATTER).setData(exampleData());
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Scatter Chart Multi Axis"))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setDisplay(true)
								.setType("linear")
								.setPosition(Position.BOTTOM)
								.setGridLines(new GridLines()
										.setZeroLineColor(new RgbaColor(0, 0, 0, 1)))
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Month")))
						.setYAxes(Arrays.asList(new AxesScale()
								.setType("linear")
								.setDisplay(true)
								.setPosition(Position.LEFT)
								.setId("y-axis-1"),
								new AxesScale()
								.setType("linear")
								.setDisplay(true)
								.setPosition(Position.RIGHT)
								.setReverse(true)
								.setId("y-axis-2")
								.setGridLines(new GridLines()
										.setDrawOnChartArea(false)))))
				;
		config.setOptions(options);
				
		JsonRenderer renderer = new JsonRenderer();
				
		return renderer.toJson(config);
	}
	
	private static Data exampleData(){
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setYAxisID("y-axis-1")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED) 
				.setData(Arrays.asList(
						new PointValue(4,14),
						new PointValue(40,42),
						new PointValue(23,42),
						new PointValue(40,22),
						new PointValue(80,12),
						new PointValue(30,32)))
				.setFill(false);
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second dataset")
				.setYAxisID("y-axis-2")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE) 
				.setData(Arrays.asList(
						new PointValue(7,56),
						new PointValue(15,54),
						new PointValue(46,34),
						new PointValue(36,42),
						new PointValue(78,64),
						new PointValue(12,48)))
				.setFill(false);
		
		data.setDatasets(Arrays.asList(dataset1,dataset2));
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
