package de.adesso.wickedcharts.chartjs.charts.configurations;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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
import de.adesso.wickedcharts.chartjs.chartoptions.TimeFormat;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.DateTimeLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.PointValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.StringValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.ValueType;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;

import static org.junit.Assert.*;



public class TimeLineConfigurationTest {
	
	@Test
	public void TimeLineTest() {
		String result = "{\r\n" + 
				"  \"type\" : \"line\",\r\n" + 
				"  \"data\" : {\r\n" + 
				"    \"labels\" : [ \"moment('2018-01-01T08:00:00',moment.ISO_8601), moment('2018-01-01T09:00:00',moment.ISO_8601), moment('2018-01-01T10:00:00',moment.ISO_8601), moment('2018-01-01T11:00:00',moment.ISO_8601), moment('2018-01-01T12:00:00',moment.ISO_8601), moment('2018-01-01T13:00:00',moment.ISO_8601), moment('2018-01-01T14:00:00',moment.ISO_8601)\" ],\r\n" + 
				"    \"datasets\" : [ {\r\n" + 
				"      \"label\" : \"Dataset 1\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(255,99,132,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(255,99,132)',\r\n" + 
				"      \"borderWidth\" : 2,\r\n" + 
				"      \"data\" : [ 0 ],\r\n" + 
				"      \"fill\" : false\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"Dataset 2\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(54,162,235,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(54,162,235)',\r\n" + 
				"      \"borderWidth\" : 2,\r\n" + 
				"      \"data\" : [ 0 ],\r\n" + 
				"      \"fill\" : false\r\n" + 
				"    }, {\r\n" + 
				"      \"label\" : \"Dataset 3\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(75,192,192,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(75,192,192)',\r\n" + 
				"      \"borderWidth\" : 2,\r\n" + 
				"      \"data\" : [ {\r\n" + 
				"        \"x\" : \"01/01/2018 08:00\",\r\n" + 
				"        \"y\" : \"7\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"01/01/2018 09:00\",\r\n" + 
				"        \"y\" : \"21\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"01/01/2018 10:00\",\r\n" + 
				"        \"y\" : \"20\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"01/01/2018 11:00\",\r\n" + 
				"        \"y\" : \"58\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"01/01/2018 12:00\",\r\n" + 
				"        \"y\" : \"23\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"01/01/2018 13:00\",\r\n" + 
				"        \"y\" : \"42\\r\\n\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"01/01/2018 14:00\",\r\n" + 
				"        \"y\" : \"17\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"01/01/2018 15:00\",\r\n" + 
				"        \"y\" : \"30\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"01/01/2018 16:00\",\r\n" + 
				"        \"y\" : \"37\"\r\n" + 
				"      }, {\r\n" + 
				"        \"x\" : \"01/01/2018 17:00\",\r\n" + 
				"        \"y\" : \"39\"\r\n" + 
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
				"        \"type\" : \"time\",\r\n" + 
				"        \"time\" : {\r\n" + 
				"          \"timeFormat\" : \"MM/DD/YYYY HH:mm\",\r\n" + 
				"          \"tooltipFormat\" : \"ll HH:mm\"\r\n" + 
				"        }\r\n" + 
				"      } ],\r\n" + 
				"      \"yAxes\" : [ {\r\n" + 
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
		String timeFormat = "MM/DD/YYYY HH:mm";
		ChartConfiguration config = new ChartConfiguration().setType(ChartType.LINE).setData(exampleData());
		Options options = new Options()
				.setTitle(new Title()
						.setText("Chart.js Time Scale"))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setType("time")
								.setTime(new TimeFormat()
										.setTimeFormat(timeFormat )
										.setTooltipFormat("ll HH:mm")))
						.setYAxes(new AxesScale()
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("value"))));
						config.setOptions(options);
				
		JsonRenderer renderer = new JsonRenderer();
				
		return renderer.toJson(config);
	}
	
	private static Data exampleData(){
		List<DateTimeLabel> dateList = new ArrayList<DateTimeLabel>();
		for(int i = 0; i < 7; i++) {
			dateList.add(new DateTimeLabel(LocalDateTime.of(2018, 1,1, 8+i, 00)));
		}
		Data data = new Data();
		data.setDatasets(new ArrayList<Dataset>());
		
		data.setLabels(TextLabel.of("moment('2018-01-01T08:00:00',moment.ISO_8601), moment('2018-01-01T09:00:00',moment.ISO_8601), moment('2018-01-01T10:00:00',moment.ISO_8601), moment('2018-01-01T11:00:00',moment.ISO_8601), moment('2018-01-01T12:00:00',moment.ISO_8601), moment('2018-01-01T13:00:00',moment.ISO_8601), moment('2018-01-01T14:00:00',moment.ISO_8601)"));
		
		data.getDatasets().add(exampleDataSet(data.getLabels().size(),"Dataset 1",SimpleColor.RED_TRANSPARENT,SimpleColor.RED));
		data.getDatasets().add(exampleDataSet(data.getLabels().size(),"Dataset 2",SimpleColor.BLUE_TRANSPARENT,SimpleColor.BLUE));
		data.getDatasets().add(exampleDataSet2(data.getLabels().size(),"Dataset 3",SimpleColor.GREEN_TRANSPARENT,SimpleColor.GREEN));
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
	
	public static Dataset exampleDataSet2(int size, String label, Color backgroundColor, Color borderColor) {
		Dataset dataset = new Dataset();
		dataset.setData(Arrays.asList(
				new PointValue()
				.setX(new StringValue("01/01/2018 08:00"))
				.setY(new StringValue("7")),
				new PointValue()
				.setX(new StringValue("01/01/2018 09:00"))
				.setY(new StringValue("21")),
				new PointValue()
				.setX(new StringValue("01/01/2018 10:00"))
				.setY(new StringValue("20")),
				new PointValue()
				.setX(new StringValue("01/01/2018 11:00"))
				.setY(new StringValue("58")),
				new PointValue()
				.setX(new StringValue("01/01/2018 12:00"))
				.setY(new StringValue("23")),
				new PointValue()
				.setX(new StringValue("01/01/2018 13:00"))
				.setY(new StringValue("42\r\n")),
				new PointValue()
				.setX(new StringValue("01/01/2018 14:00"))
				.setY(new StringValue("17")),
				new PointValue()
				.setX(new StringValue("01/01/2018 15:00"))
				.setY(new StringValue("30")),
				new PointValue()
				.setX(new StringValue("01/01/2018 16:00"))
				.setY(new StringValue("37")),
				new PointValue()
				.setX(new StringValue("01/01/2018 17:00"))
				.setY(new StringValue("39"))
				))
			.setBackgroundColor(backgroundColor).setBorderColor(borderColor)
			.setBorderWidth(2)
			.setLabel(label)
			.setFill(false);
		return dataset;
	}
}
