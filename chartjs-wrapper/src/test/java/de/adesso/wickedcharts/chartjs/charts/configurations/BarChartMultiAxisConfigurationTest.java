package de.adesso.wickedcharts.chartjs.charts.configurations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import de.adesso.wickedcharts.chartjs.ChartConfiguration;
import de.adesso.wickedcharts.chartjs.chartoptions.AxesScale;
import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.Element;
import de.adesso.wickedcharts.chartjs.chartoptions.Filler;
import de.adesso.wickedcharts.chartjs.chartoptions.GridLines;
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
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.BoundaryFillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BarChartMultiAxisConfigurationTest {
	
	@Test
	public void barChartMultiAxisConfigurationTest() {
		String result = "{\r\n" + 
				"  \"type\" : \"bar\",\r\n" + 
				"  \"data\" : {\r\n" + 
				"    \"labels\" : [ \"January\", \"February\", \"March\", \"April\", \"May\", \"June\", \"July\", \"August\", \"September\", \"October\", \"November\", \"December\" ],\r\n" + 
				"    \"datasets\" : [ {\r\n" + 
				"      \"label\" : \"Dataset 1\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(255,99,132,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(255,99,132)',\r\n" + 
				"      \"data\" : [ 10, 11 ],\r\n" + 
				"      \"fill\" : false,\r\n" + 
				"      \"yaxisID\" : \"y-axis-1\",\r\n" + 
				"      \"yAxisID\" : \"y-axis-1\"\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"Dataset 2\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(54,162,235,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(54,162,235)',\r\n" + 
				"      \"data\" : [ 10, 11 ],\r\n" + 
				"      \"fill\" : false,\r\n" + 
				"      \"yaxisID\" : \"y-axis-2\",\r\n" + 
				"      \"yAxisID\" : \"y-axis-2\"\r\n" + 
				"    } ]\r\n" + 
				"  },\r\n" + 
				"  \"options\" : {\r\n" + 
				"    \"responsive\" : true,\r\n" + 
				"    \"legend\" : {\r\n" + 
				"      \"position\" : \"top\"\r\n" + 
				"    },\r\n" + 
				"    \"title\" : {\r\n" + 
				"      \"display\" : true,\r\n" + 
				"      \"text\" : \"Chart.js Bar Chart - Multi Axis\"\r\n" + 
				"    },\r\n" + 
				"    \"tooltips\" : {\r\n" + 
				"      \"mode\" : \"index\",\r\n" + 
				"      \"intersect\" : false\r\n" + 
				"    },\r\n" + 
				"    \"scales\" : {\r\n" + 
				"      \"yAxes\" : [ {\r\n" + 
				"        \"display\" : true,\r\n" + 
				"        \"id\" : \"y-axis-1\",\r\n" + 
				"        \"position\" : \"left\",\r\n" + 
				"        \"type\" : \"linear\"\r\n" + 
				"      }, {\r\n" + 
				"        \"display\" : true,\r\n" + 
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
		ChartConfiguration config = new ChartConfiguration().setType(ChartType.BAR).setData(exampleData());
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Bar Chart - Multi Axis"))
				.setTooltips(new Tooltips()
						.setMode(TooltipMode.INDEX)
						.setIntersect(false))
				.setLegend(new Legend()
						.setPosition(Position.TOP))
				.setScales(new Scales()
						.setYAxes(Arrays.asList(new AxesScale()
								.setType("linear")
								.setDisplay(true)
								.setPosition(Position.LEFT)
								.setId("y-axis-1"),
								new AxesScale()
								.setType("linear")
								.setDisplay(true)
								.setPosition(Position.RIGHT)
								.setId("y-axis-2")
								.setGridLines(new GridLines()
										.setDrawOnChartArea(false)))))
								
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
		
		data.getDatasets().add(exampleDataSet(data.getLabels().size(),"Dataset 1",SimpleColor.RED_TRANSPARENT,SimpleColor.RED));
		data.getDatasets().add(exampleDataSet2(data.getLabels().size(),"Dataset 2",SimpleColor.BLUE_TRANSPARENT,SimpleColor.BLUE));
		return data;
	}
	
	public static Dataset exampleDataSet(int size, String label, Color backgroundColor, Color borderColor) {
		List<Integer> dataList = new ArrayList<Integer>();
		for (int i = 10; i < size; i++) {
			dataList.add(i);
		}
		Dataset dataset = new Dataset()
				.setLabel(label)
				.setBackgroundColor(backgroundColor)
				.setBorderColor(borderColor)
				.setData(IntegerValue.of(dataList))
				.setFill(false)
				.setYAxisID("y-axis-1");
			
		return dataset;
	}
	
	public static Dataset exampleDataSet2(int size, String label, Color backgroundColor, Color borderColor) {
		List<Integer> dataList = new ArrayList<Integer>();
		for (int i = 10; i < size; i++) {
			dataList.add(i);
		}
		Dataset dataset = new Dataset()
				.setLabel(label)
				.setBackgroundColor(backgroundColor)
				.setBorderColor(borderColor)
				.setData(IntegerValue.of(dataList))
				.setFill(false)
				.setYAxisID("y-axis-2");
			
		return dataset;
	}
}
