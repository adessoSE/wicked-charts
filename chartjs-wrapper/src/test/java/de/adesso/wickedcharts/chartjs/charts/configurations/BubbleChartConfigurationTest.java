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
import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.BoundaryFillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.BubbleValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BubbleChartConfigurationTest {
	
	@Test
	public void bubbleChartConfigurationTest() {
		String result = "{\r\n" + 
				"  \"type\" : \"bubble\",\r\n" + 
				"  \"data\" : {\r\n" + 
				"    \"labels\" : [ \"January\", \"February\", \"March\", \"April\", \"May\", \"June\", \"July\", \"August\", \"September\", \"October\", \"November\", \"December\" ],\r\n" + 
				"    \"datasets\" : [ {\r\n" + 
				"      \"label\" : \"Dataset 1\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(255,99,132,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(255,205,86)',\r\n" + 
				"      \"data\" : [ {\r\n" + 
				"        \"x\" : 0,\r\n" + 
				"        \"y\" : 0,\r\n" + 
				"        \"r\" : 0\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 1,\r\n" + 
				"        \"y\" : 2,\r\n" + 
				"        \"r\" : 3\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 2,\r\n" + 
				"        \"y\" : 4,\r\n" + 
				"        \"r\" : 6\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 3,\r\n" + 
				"        \"y\" : 6,\r\n" + 
				"        \"r\" : 9\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 4,\r\n" + 
				"        \"y\" : 8,\r\n" + 
				"        \"r\" : 12\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 5,\r\n" + 
				"        \"y\" : 10,\r\n" + 
				"        \"r\" : 15\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 6,\r\n" + 
				"        \"y\" : 12,\r\n" + 
				"        \"r\" : 18\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 7,\r\n" + 
				"        \"y\" : 14,\r\n" + 
				"        \"r\" : 21\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 8,\r\n" + 
				"        \"y\" : 16,\r\n" + 
				"        \"r\" : 24\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 9,\r\n" + 
				"        \"y\" : 18,\r\n" + 
				"        \"r\" : 27\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 10,\r\n" + 
				"        \"y\" : 20,\r\n" + 
				"        \"r\" : 30\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 11,\r\n" + 
				"        \"y\" : 22,\r\n" + 
				"        \"r\" : 33\r\n" + 
				"      } ],\r\n" + 
				"      \"fill\" : false,\r\n" + 
				"      \"hoverBackgroundColor\" : 'rgb(255,255,255)',\r\n" + 
				"      \"hoverBorderColor\" : 'rgb(255,99,132)',\r\n" + 
				"      \"hoverBorderWidth\" : 10.0\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"Dataset 2\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(255,99,132,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(255,205,86)',\r\n" + 
				"      \"data\" : [ {\r\n" + 
				"        \"x\" : 0,\r\n" + 
				"        \"y\" : 0,\r\n" + 
				"        \"r\" : 0\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 1,\r\n" + 
				"        \"y\" : 2,\r\n" + 
				"        \"r\" : 3\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 2,\r\n" + 
				"        \"y\" : 4,\r\n" + 
				"        \"r\" : 6\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 3,\r\n" + 
				"        \"y\" : 6,\r\n" + 
				"        \"r\" : 9\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 4,\r\n" + 
				"        \"y\" : 8,\r\n" + 
				"        \"r\" : 12\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 5,\r\n" + 
				"        \"y\" : 10,\r\n" + 
				"        \"r\" : 15\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 6,\r\n" + 
				"        \"y\" : 12,\r\n" + 
				"        \"r\" : 18\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 7,\r\n" + 
				"        \"y\" : 14,\r\n" + 
				"        \"r\" : 21\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 8,\r\n" + 
				"        \"y\" : 16,\r\n" + 
				"        \"r\" : 24\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 9,\r\n" + 
				"        \"y\" : 18,\r\n" + 
				"        \"r\" : 27\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 10,\r\n" + 
				"        \"y\" : 20,\r\n" + 
				"        \"r\" : 30\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : 11,\r\n" + 
				"        \"y\" : 22,\r\n" + 
				"        \"r\" : 33\r\n" + 
				"      } ],\r\n" + 
				"      \"fill\" : false,\r\n" + 
				"      \"hoverBackgroundColor\" : 'rgb(255,255,255)',\r\n" + 
				"      \"hoverBorderColor\" : 'rgb(255,99,132)',\r\n" + 
				"      \"hoverBorderWidth\" : 10.0\r\n" + 
				"    } ]\r\n" + 
				"  },\r\n" + 
				"  \"options\" : {\r\n" + 
				"    \"responsive\" : true,\r\n" + 
				"    \"title\" : {\r\n" + 
				"      \"display\" : true,\r\n" + 
				"      \"text\" : \"Chart.js Bubble Chart\"\r\n" + 
				"    },\r\n" + 
				"    \"aspectRatio\" : 1.0\r\n" + 
				"  }\r\n" + 
				"}";
		System.out.println(test());
		assertTrue(test().compareTo(result) == 0);
	}
	
	public static String test() {
		ChartConfiguration config = new ChartConfiguration().setType(ChartType.BUBBLE).setData(exampleData());
		Options options = new Options()
				.setResponsive(true)
				.setAspectRatio((double)1)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Bubble Chart"))
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
		data.getDatasets().add(exampleDataSet(data.getLabels().size(),"Dataset 2",SimpleColor.BLUE_TRANSPARENT,SimpleColor.BLUE));
		return data;
	}
	
	public static Dataset exampleDataSet(int size, String label, Color backgroundColor, Color borderColor) {
		List<BubbleValue> dataList = new ArrayList<BubbleValue>();
		for (int i = 0; i < size; i++) {
			dataList.add(new BubbleValue(i, i*2, i*3));
		}
		Dataset dataset = new Dataset()
				.setLabel(label)
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.YELLOW)
				.setHoverBackgroundColor(SimpleColor.WHITE)
				.setHoverBorderColor(SimpleColor.RED)
				.setHoverBorderWidth(10.0)
				.setData(dataList)
				.setFill(false);
			
		return dataset;
	}
}
