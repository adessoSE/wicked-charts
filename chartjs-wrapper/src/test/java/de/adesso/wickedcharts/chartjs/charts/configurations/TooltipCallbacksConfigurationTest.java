package de.adesso.wickedcharts.chartjs.charts.configurations;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import de.adesso.wickedcharts.chartjs.ChartConfiguration;
import de.adesso.wickedcharts.chartjs.chartoptions.AxesScale;
import de.adesso.wickedcharts.chartjs.chartoptions.CallbackFunction;
import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.FontStyle;
import de.adesso.wickedcharts.chartjs.chartoptions.Hover;
import de.adesso.wickedcharts.chartjs.chartoptions.HoverMode;
import de.adesso.wickedcharts.chartjs.chartoptions.Legend;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.Position;
import de.adesso.wickedcharts.chartjs.chartoptions.ScaleLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.Scales;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.TooltipCallbacks;
import de.adesso.wickedcharts.chartjs.chartoptions.TooltipMode;
import de.adesso.wickedcharts.chartjs.chartoptions.Tooltips;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;

import static org.junit.Assert.*;



public class TooltipCallbacksConfigurationTest {
	
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
				"      \"data\" : [ 0, 1, 2, 3, 4, 5, 6 ],\r\n" + 
				"      \"fill\" : false\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"Dataset 2\",\r\n" + 
				"      \"backgroundColor\" : 'rgb(54,162,235)',\r\n" + 
				"      \"borderColor\" : 'rgb(54,162,235)',\r\n" + 
				"      \"borderWidth\" : 2,\r\n" + 
				"      \"data\" : [ 0, 1, 2, 3, 4, 5, 6 ],\r\n" + 
				"      \"fill\" : false\r\n" + 
				"    } ]\r\n" + 
				"  },\r\n" + 
				"  \"options\" : {\r\n" + 
				"    \"responsive\" : true,\r\n" + 
				"    \"title\" : {\r\n" + 
				"      \"display\" : true,\r\n" + 
				"      \"text\" : \"Chart.js Line Chart - Custom Information in Tooltip\"\r\n" + 
				"    },\r\n" + 
				"    \"tooltips\" : {\r\n" + 
				"      \"mode\" : \"index\",\r\n" + 
				"      \"callbacks\" : {\r\n" + 
				"        \"footer\" : function(tooltipItems, data) {\r\n" + 
				"                            var sum = 0;\r\n" + 
				"\r\n" + 
				"                            tooltipItems.forEach(function(tooltipItem) {\r\n" + 
				"                                sum += data.datasets[tooltipItem.datasetIndex].data[tooltipItem.index];\r\n" + 
				"                            });\r\n" + 
				"                            return 'Sum: ' + sum;\r\n" + 
				"                        }\r\n" + 
				"      },\r\n" + 
				"      \"footerFontStyle\" : \"normal\"\r\n" + 
				"    },\r\n" + 
				"    \"hover\" : {\r\n" + 
				"      \"mode\" : \"index\",\r\n" + 
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
				"        \"display\" : true,\r\n" + 
				"        \"scaleLabel\" : {\r\n" + 
				"          \"display\" : true,\r\n" + 
				"          \"labelString\" : \"Value\"\r\n" + 
				"        }\r\n" + 
				"      } ]\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}";
		System.out.println(test());
		assertTrue(test().compareTo(result) == 0);
	}
	
	public static String test() {
		ChartConfiguration config = new ChartConfiguration().setType(ChartType.LINE).setData(exampleData());
		String footerFunction = "function(tooltipItems, data) {\r\n" + 
				"                            var sum = 0;\r\n" + 
				"\r\n" + 
				"                            tooltipItems.forEach(function(tooltipItem) {\r\n" + 
				"                                sum += data.datasets[tooltipItem.datasetIndex].data[tooltipItem.index];\r\n" + 
				"                            });\r\n" + 
				"                            return 'Sum: ' + sum;\r\n" + 
				"                        }";
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Line Chart - Custom Information in Tooltip"))
				.setTooltips(new Tooltips()
						.setMode(TooltipMode.INDEX)
						.setCallbacks(new TooltipCallbacks()
								.setFooter(new CallbackFunction(footerFunction)))
						.setFooterFontStyle(FontStyle.NORMAL))
				.setHover(new Hover()
						.setMode(HoverMode.INDEX)
						.setIntersect(true))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setDisplay(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Month")))
						.setYAxes(new AxesScale()
								.setDisplay(true)
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
		
		data.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		
		data.getDatasets().add(exampleDataSet(data.getLabels().size(),"Dataset 1",SimpleColor.RED,SimpleColor.RED));
		data.getDatasets().add(exampleDataSet(data.getLabels().size(),"Dataset 2",SimpleColor.BLUE,SimpleColor.BLUE));
		return data;
	}
	
	public static Dataset exampleDataSet(int size, String label, Color backgroundColor, Color borderColor) {
		List<Integer> dataList = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			dataList.add(i);
		}
		Dataset dataset = new Dataset();
		dataset.setData(IntegerValue.of(dataList))
			.setBackgroundColor(backgroundColor).setBorderColor(borderColor)
			.setBorderWidth(2)
			.setLabel(label)
			.setFill(false);
		return dataset;
	}
}
