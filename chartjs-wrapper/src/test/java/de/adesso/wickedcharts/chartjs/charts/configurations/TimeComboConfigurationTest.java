package de.adesso.wickedcharts.chartjs.charts.configurations;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import de.adesso.wickedcharts.chartjs.ChartConfiguration;
import de.adesso.wickedcharts.chartjs.chartoptions.AxesScale;
import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.Legend;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.Position;
import de.adesso.wickedcharts.chartjs.chartoptions.Scales;
import de.adesso.wickedcharts.chartjs.chartoptions.TimeFormat;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;

import static org.junit.Assert.*;



public class TimeComboConfigurationTest {
	
	@Test
	public void TimeComboTest() {
		String result = "{\r\n" + 
				"  \"type\" : \"bar\",\r\n" + 
				"  \"data\" : {\r\n" + 
				"    \"labels\" : [ \"02/19/2018 13:08\", \"02/20/2018 13:08\", \"02/21/2018 13:08\", \"02/22/2018 13:08\", \"02/23/2018 13:08\", \"02/24/2018 13:08\", \"02/25/2018 13:08\" ],\r\n" + 
				"    \"datasets\" : [ {\r\n" + 
				"      \"type\" : \"bar\",\r\n" + 
				"      \"label\" : \"Dataset 1\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(255,99,132,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(255,99,132)',\r\n" + 
				"      \"data\" : [ 0, 1, 2, 3, 4, 5, 6 ]\r\n" + 
				"    }, {\r\n" + 
				"      \"type\" : \"bar\",\r\n" + 
				"      \"label\" : \"Dataset 2\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(54,162,235,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(54,162,235)',\r\n" + 
				"      \"data\" : [ 0, 1, 2, 3, 4, 5, 6 ]\r\n" + 
				"    }, {\r\n" + 
				"      \"type\" : \"line\",\r\n" + 
				"      \"label\" : \"Dataset 3\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(75,192,192,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(75,192,192)',\r\n" + 
				"      \"data\" : [ 0, 1, 2, 3, 4, 5, 6 ],\r\n" + 
				"      \"fill\" : false\r\n" + 
				"    } ]\r\n" + 
				"  },\r\n" + 
				"  \"options\" : {\r\n" + 
				"    \"title\" : {\r\n" + 
				"      \"text\" : \"Chart.js Combo Time Scale\"\r\n" + 
				"    },\r\n" + 
				"    \"scales\" : {\r\n" + 
				"      \"xAxes\" : [ {\r\n" + 
				"        \"display\" : true,\r\n" + 
				"        \"type\" : \"time\",\r\n" + 
				"        \"time\" : {\r\n" + 
				"          \"format\" : \"MM/DD/YYYY HH:mm\"\r\n" + 
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
		ChartConfiguration config = new ChartConfiguration().setType(ChartType.BAR).setData(exampleData());
		Options options = new Options()
				.setTitle(new Title()
						.setText("Chart.js Combo Time Scale"))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setType("time")
								.setDisplay(true)
								.setTime(new TimeFormat()
										.setFormat(timeFormat)
//										.setRound(TimeFormatRound.DAY)
										)));
						config.setOptions(options);
				
		JsonRenderer renderer = new JsonRenderer();
				
		return renderer.toJson(config);
	}
	
	private static Data exampleData(){
		Data data = new Data();
		data.setDatasets(new ArrayList<Dataset>());
		
		data.setLabels(TextLabel.of("02/19/2018 13:08", "02/20/2018 13:08", "02/21/2018 13:08", "02/22/2018 13:08", "02/23/2018 13:08", "02/24/2018 13:08", "02/25/2018 13:08"));
		
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
			.setLabel(label)
			.setType(ChartType.BAR);
		return dataset;
	}
	
	public static Dataset exampleDataSet2(int size, String label, Color backgroundColor, Color borderColor) {
		List<Integer> dataList = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			dataList.add(i);
		}
		Dataset dataset = new Dataset();
		dataset.setData(IntegerValue.of(dataList))
			.setBackgroundColor(backgroundColor).setBorderColor(borderColor)
			.setLabel(label)
			.setType(ChartType.LINE)
			.setFill(false);
		return dataset;
	}
}
