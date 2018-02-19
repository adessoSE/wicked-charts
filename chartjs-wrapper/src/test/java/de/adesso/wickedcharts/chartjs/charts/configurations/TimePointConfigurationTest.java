package de.adesso.wickedcharts.chartjs.charts.configurations;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import de.adesso.wickedcharts.chartjs.ChartConfiguration;
import de.adesso.wickedcharts.chartjs.chartoptions.AxesScale;
import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.Legend;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.Position;
import de.adesso.wickedcharts.chartjs.chartoptions.ScaleLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.Scales;
import de.adesso.wickedcharts.chartjs.chartoptions.TickStyle;
import de.adesso.wickedcharts.chartjs.chartoptions.Ticks;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.StringValueColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.DateTimeLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.DateTimeValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.PointValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.StringValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.ValueType;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;

import static org.junit.Assert.*;



public class TimePointConfigurationTest {
	
	@Test
	public void TimePointTest() {
		String result = "{\r\n" + 
				"  \"type\" : \"line\",\r\n" + 
				"  \"data\" : {\r\n" + 
				"    \"labels\" : [ \"moment('2018-01-01T08:00:00',moment.ISO_8601), moment('2018-01-01T09:00:00',moment.ISO_8601), moment('2018-01-01T10:00:00',moment.ISO_8601), moment('2018-01-01T11:00:00',moment.ISO_8601), moment('2018-01-01T12:00:00',moment.ISO_8601), moment('2018-01-01T13:00:00',moment.ISO_8601), moment('2018-01-01T14:00:00',moment.ISO_8601)\" ],\r\n" + 
				"    \"datasets\" : [ {\r\n" + 
				"      \"label\" : \"Dataset with date object point data\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(255,99,132,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(255,99,132)',\r\n" + 
				"      \"borderWidth\" : 2,\r\n" + 
				"      \"data\" : [ {\r\n" + 
				"        \"x\" : \"moment('2018-01-01T08:00:00',moment.ISO_8601)\",\r\n" + 
				"        \"y\" : \"38\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"moment('2018-01-01T09:00:00',moment.ISO_8601)\",\r\n" + 
				"        \"y\" : \"28\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"moment('2018-01-01T10:00:00',moment.ISO_8601)\",\r\n" + 
				"        \"y\" : \"24\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"moment('2018-01-01T11:00:00',moment.ISO_8601)\",\r\n" + 
				"        \"y\" : \"45\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"moment('2018-01-01T12:00:00',moment.ISO_8601)\",\r\n" + 
				"        \"y\" : \"45\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"moment('2018-01-01T13:00:00',moment.ISO_8601)\",\r\n" + 
				"        \"y\" : \"55\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"moment('2018-01-01T14:00:00',moment.ISO_8601)\",\r\n" + 
				"        \"y\" : \"56\"\r\n" + 
				"      } ],\r\n" + 
				"      \"fill\" : false\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"Dataset with date object point data\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(54,162,235,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(54,162,235)',\r\n" + 
				"      \"borderWidth\" : 2,\r\n" + 
				"      \"data\" : [ {\r\n" + 
				"        \"x\" : \"moment('2018-01-01T08:00:00',moment.ISO_8601)\",\r\n" + 
				"        \"y\" : \"54\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"moment('2018-01-01T09:00:00',moment.ISO_8601)\",\r\n" + 
				"        \"y\" : \"26\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"moment('2018-01-01T10:00:00',moment.ISO_8601)\",\r\n" + 
				"        \"y\" : \"27\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"moment('2018-01-01T11:00:00',moment.ISO_8601)\",\r\n" + 
				"        \"y\" : \"14\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"moment('2018-01-01T12:00:00',moment.ISO_8601)\",\r\n" + 
				"        \"y\" : \"49\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"moment('2018-01-01T13:00:00',moment.ISO_8601)\",\r\n" + 
				"        \"y\" : \"57\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"moment('2018-01-01T14:00:00',moment.ISO_8601)\",\r\n" + 
				"        \"y\" : \"1\"\r\n" + 
				"      } ],\r\n" + 
				"      \"fill\" : false\r\n" + 
				"    } ]\r\n" + 
				"  },\r\n" + 
				"  \"options\" : {\r\n" + 
				"    \"title\" : {\r\n" + 
				"      \"text\" : \"Chart.js Time Scale\"\r\n" + 
				"    },\r\n" + 
				"    \"scales\" : {\r\n" + 
				"      \"xAxes\" : [ {\r\n" + 
				"        \"display\" : true,\r\n" + 
				"        \"scaleLabel\" : {\r\n" + 
				"          \"display\" : true,\r\n" + 
				"          \"labelString\" : \"Date\"\r\n" + 
				"        },\r\n" + 
				"        \"type\" : \"time\",\r\n" + 
				"        \"ticks\" : {\r\n" + 
				"          \"major\" : {\r\n" + 
				"            \"fontStyle\" : \"bold\",\r\n" + 
				"            \"fontColor\" : 'red'\r\n" + 
				"          }\r\n" + 
				"        }\r\n" + 
				"      } ],\r\n" + 
				"      \"yAxes\" : [ {\r\n" + 
				"        \"display\" : true,\r\n" + 
				"        \"scaleLabel\" : {\r\n" + 
				"          \"display\" : true,\r\n" + 
				"          \"labelString\" : \"value\"\r\n" + 
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
		Options options = new Options()
				.setTitle(new Title()
						.setText("Chart.js Time Scale"))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setType("time")
								.setDisplay(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Date"))
								.setTicks(new Ticks()
										.setMajor(new TickStyle()
												.setFontColor(new StringValueColor("red"))
												.setFontStyle("bold"))))
						.setYAxes(new AxesScale()
								.setDisplay(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("value"))));
						config.setOptions(options);
				
		JsonRenderer renderer = new JsonRenderer();
				
		return renderer.toJson(config);
	}
	
	private static Data exampleData(){
		Data data = new Data();
		data.setDatasets(new ArrayList<Dataset>());
		
		data.setLabels(TextLabel.of("moment('2018-01-01T08:00:00',moment.ISO_8601), moment('2018-01-01T09:00:00',moment.ISO_8601), moment('2018-01-01T10:00:00',moment.ISO_8601), moment('2018-01-01T11:00:00',moment.ISO_8601), moment('2018-01-01T12:00:00',moment.ISO_8601), moment('2018-01-01T13:00:00',moment.ISO_8601), moment('2018-01-01T14:00:00',moment.ISO_8601)"));
		
		data.getDatasets().add(exampleDataSet(data.getLabels().size(),"Dataset 1",SimpleColor.RED_TRANSPARENT,SimpleColor.RED));
		data.getDatasets().add(exampleDataSet2(data.getLabels().size(),"Dataset 2",SimpleColor.BLUE_TRANSPARENT,SimpleColor.BLUE));
		return data;
	}
	
	public static Dataset exampleDataSet(int size, String label, Color backgroundColor, Color borderColor) {
		Dataset dataset = new Dataset();
		dataset.setData(Arrays.asList(
				new PointValue()
				.setX(new StringValue("moment('2018-01-01T08:00:00',moment.ISO_8601)"))
				.setY(new StringValue("38")),
				new PointValue()
				.setX(new StringValue("moment('2018-01-01T09:00:00',moment.ISO_8601)"))
				.setY(new StringValue("28")),
				new PointValue()
				.setX(new StringValue("moment('2018-01-01T10:00:00',moment.ISO_8601)"))
				.setY(new StringValue("24")),
				new PointValue()
				.setX(new StringValue("moment('2018-01-01T11:00:00',moment.ISO_8601)"))
				.setY(new StringValue("45")),
				new PointValue()
				.setX(new StringValue("moment('2018-01-01T12:00:00',moment.ISO_8601)"))
				.setY(new StringValue("45")),
				new PointValue()
				.setX(new StringValue("moment('2018-01-01T13:00:00',moment.ISO_8601)"))
				.setY(new StringValue("55")),
				new PointValue()
				.setX(new StringValue("moment('2018-01-01T14:00:00',moment.ISO_8601)"))
				.setY(new StringValue("56"))
				))
			.setBackgroundColor(backgroundColor).setBorderColor(borderColor)
			.setBorderWidth(2)
			.setLabel("Dataset with date object point data")
			.setFill(false);
		return dataset;
	}
	
	public static Dataset exampleDataSet2(int size, String label, Color backgroundColor, Color borderColor) {
		Dataset dataset = new Dataset();
		dataset.setData(Arrays.asList(
				new PointValue()
				.setX(new StringValue("moment('2018-01-01T08:00:00',moment.ISO_8601)"))
				.setY(new StringValue("54")),
			new PointValue()
				.setX(new StringValue("moment('2018-01-01T09:00:00',moment.ISO_8601)"))
				.setY(new StringValue("26")),
			new PointValue()
				.setX(new StringValue("moment('2018-01-01T10:00:00',moment.ISO_8601)"))
				.setY(new StringValue("27")),
			new PointValue()
				.setX(new StringValue("moment('2018-01-01T11:00:00',moment.ISO_8601)"))
				.setY(new StringValue("14")),
			new PointValue()
				.setX(new StringValue("moment('2018-01-01T12:00:00',moment.ISO_8601)"))
				.setY(new StringValue("49")),
			new PointValue()
				.setX(new StringValue("moment('2018-01-01T13:00:00',moment.ISO_8601)"))
				.setY(new StringValue("57")),
			new PointValue()
				.setX(new StringValue("moment('2018-01-01T14:00:00',moment.ISO_8601)"))
				.setY(new StringValue("1"))
			))
			.setBackgroundColor(backgroundColor).setBorderColor(borderColor)
			.setBorderWidth(2)
			.setLabel("Dataset with date object point data")
			.setFill(false);
		return dataset;
	}
}
