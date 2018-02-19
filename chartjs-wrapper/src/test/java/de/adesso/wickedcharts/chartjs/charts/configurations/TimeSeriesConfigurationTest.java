package de.adesso.wickedcharts.chartjs.charts.configurations;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import de.adesso.wickedcharts.chartjs.ChartConfiguration;
import de.adesso.wickedcharts.chartjs.chartoptions.AxesScale;
import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.DistributionType;
import de.adesso.wickedcharts.chartjs.chartoptions.Legend;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.Position;
import de.adesso.wickedcharts.chartjs.chartoptions.ScaleLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.Scales;
import de.adesso.wickedcharts.chartjs.chartoptions.TickSource;
import de.adesso.wickedcharts.chartjs.chartoptions.Ticks;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.DateTimeLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.DoubleValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;

import static org.junit.Assert.*;



public class TimeSeriesConfigurationTest {
	
	@Test
	public void TimeSeriesTest() {
		String result = "{\r\n" + 
				"  \"type\" : \"line\",\r\n" + 
				"  \"data\" : {\r\n" + 
				"    \"labels\" : [ \"moment('2018-02-19T10:54:35.074',moment.ISO_8601), moment('2018-02-20T10:54:35.074',moment.ISO_8601), moment('2018-02-21T10:54:35.074',moment.ISO_8601), moment('2018-02-22T10:54:35.074',moment.ISO_8601), moment('2018-02-23T10:54:35.074',moment.ISO_8601), moment('2018-02-26T10:54:35.074',moment.ISO_8601), moment('2018-02-27T10:54:35.074',moment.ISO_8601), moment('2018-02-28T10:54:35.074',moment.ISO_8601), moment('2018-03-01T10:54:35.074',moment.ISO_8601), moment('2018-03-02T10:54:35.074',moment.ISO_8601), moment('2018-03-05T10:54:35.074',moment.ISO_8601), moment('2018-03-06T10:54:35.074',moment.ISO_8601), moment('2018-03-07T10:54:35.074',moment.ISO_8601), moment('2018-03-08T10:54:35.074',moment.ISO_8601), moment('2018-03-09T10:54:35.074',moment.ISO_8601), moment('2018-03-12T10:54:35.074',moment.ISO_8601), moment('2018-03-13T10:54:35.074',moment.ISO_8601), moment('2018-03-14T10:54:35.074',moment.ISO_8601), moment('2018-03-15T10:54:35.074',moment.ISO_8601), moment('2018-03-16T10:54:35.074',moment.ISO_8601), moment('2018-03-19T10:54:35.074',moment.ISO_8601), moment('2018-03-20T10:54:35.074',moment.ISO_8601), moment('2018-03-21T10:54:35.074',moment.ISO_8601), moment('2018-03-22T10:54:35.074',moment.ISO_8601), moment('2018-03-23T10:54:35.074',moment.ISO_8601), moment('2018-03-26T10:54:35.074',moment.ISO_8601), moment('2018-03-27T10:54:35.074',moment.ISO_8601), moment('2018-03-28T10:54:35.074',moment.ISO_8601), moment('2018-03-29T10:54:35.074',moment.ISO_8601), moment('2018-03-30T10:54:35.074',moment.ISO_8601), moment('2018-04-02T10:54:35.074',moment.ISO_8601), moment('2018-04-03T10:54:35.074',moment.ISO_8601), moment('2018-04-04T10:54:35.074',moment.ISO_8601), moment('2018-04-05T10:54:35.074',moment.ISO_8601), moment('2018-04-06T10:54:35.074',moment.ISO_8601), moment('2018-04-09T10:54:35.074',moment.ISO_8601), moment('2018-04-10T10:54:35.074',moment.ISO_8601), moment('2018-04-11T10:54:35.074',moment.ISO_8601), moment('2018-04-12T10:54:35.074',moment.ISO_8601), moment('2018-04-13T10:54:35.074',moment.ISO_8601), moment('2018-04-16T10:54:35.074',moment.ISO_8601), moment('2018-04-17T10:54:35.074',moment.ISO_8601), moment('2018-04-18T10:54:35.074',moment.ISO_8601), moment('2018-04-19T10:54:35.074',moment.ISO_8601)\" ],\r\n" + 
				"    \"datasets\" : [ {\r\n" + 
				"      \"type\" : \"line\",\r\n" + 
				"      \"label\" : \"Dataset 1\",\r\n" + 
				"      \"backgroundColor\" : 'rgba(255,99,132,0.50)',\r\n" + 
				"      \"borderColor\" : 'rgb(255,99,132)',\r\n" + 
				"      \"borderWidth\" : 2,\r\n" + 
				"      \"data\" : [ 29.394123085959233, 28.830272107233185, 26.706018611341783, 25.739180693808617, 25.53365443375014, 26.273840321005682, 27.236981504660843, 26.239868433561696, 25.521699296922304, 27.065693664053466, 28.177752868033, 28.137429684612997, 30.30127958376518, 29.71254819202197, 31.116159773026606, 29.309380874619805, 27.83134224779929, 28.91617102859406, 28.456526976129012, 26.431893061047116, 27.54467622670617, 26.16556019711834, 27.287991035343815, 28.549039914553745, 27.92727558219046, 28.260391513494007, 30.24565374545384, 30.226704011672844, 30.56263076394418, 30.61966479201819, 31.82386957759751, 33.81702352560294, 31.879644866748485, 31.09926881950921, 29.37763995945207, 28.850188667424842, 29.642323469178912, 29.0896726900307, 29.150998332941302, 27.899396664668696, 26.7903141318645, 27.115537136167585, 25.494663322699452, 26.264311217034763, 26.775328072320516, 28.852461046695204, 29.92714364136602, 31.17775660265245, 28.556795985772503, 27.271189670546914, 27.56358524389892, 26.596689220125818, 26.278812017658154, 26.276364647854496, 26.52171123930951, 26.198563781362395, 26.800198379068956, 27.712287867088456, 27.20153315884971, 28.604822861625056 ],\r\n" + 
				"      \"fill\" : false,\r\n" + 
				"      \"lineTension\" : 0,\r\n" + 
				"      \"pointRadius\" : 0\r\n" + 
				"    } ]\r\n" + 
				"  },\r\n" + 
				"  \"options\" : {\r\n" + 
				"    \"scales\" : {\r\n" + 
				"      \"xAxes\" : [ {\r\n" + 
				"        \"type\" : \"time\",\r\n" + 
				"        \"ticks\" : {\r\n" + 
				"          \"source\" : \"labels\"\r\n" + 
				"        },\r\n" + 
				"        \"distribution\" : \"series\"\r\n" + 
				"      } ],\r\n" + 
				"      \"yAxes\" : [ {\r\n" + 
				"        \"scaleLabel\" : {\r\n" + 
				"          \"display\" : true,\r\n" + 
				"          \"labelString\" : \"Closing price ($)\"\r\n" + 
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
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setType("time")
								.setDistribution(DistributionType.SERIES)
								.setTicks(new Ticks()
										.setSource(TickSource.LABELS)
										)
								)
						.setYAxes(new AxesScale()
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Closing price ($)"))
								));
						config.setOptions(options);
				
		JsonRenderer renderer = new JsonRenderer();
				
		return renderer.toJson(config);
	}
	
	private static Data exampleData(){
		Data data = new Data();
		data.setDatasets(new ArrayList<Dataset>());
		
		data.setLabels(TextLabel.of("moment('2018-02-19T10:54:35.074',moment.ISO_8601), moment('2018-02-20T10:54:35.074',moment.ISO_8601), moment('2018-02-21T10:54:35.074',moment.ISO_8601), moment('2018-02-22T10:54:35.074',moment.ISO_8601), moment('2018-02-23T10:54:35.074',moment.ISO_8601), moment('2018-02-26T10:54:35.074',moment.ISO_8601), moment('2018-02-27T10:54:35.074',moment.ISO_8601), moment('2018-02-28T10:54:35.074',moment.ISO_8601), moment('2018-03-01T10:54:35.074',moment.ISO_8601), moment('2018-03-02T10:54:35.074',moment.ISO_8601), moment('2018-03-05T10:54:35.074',moment.ISO_8601), moment('2018-03-06T10:54:35.074',moment.ISO_8601), moment('2018-03-07T10:54:35.074',moment.ISO_8601), moment('2018-03-08T10:54:35.074',moment.ISO_8601), moment('2018-03-09T10:54:35.074',moment.ISO_8601), moment('2018-03-12T10:54:35.074',moment.ISO_8601), moment('2018-03-13T10:54:35.074',moment.ISO_8601), moment('2018-03-14T10:54:35.074',moment.ISO_8601), moment('2018-03-15T10:54:35.074',moment.ISO_8601), moment('2018-03-16T10:54:35.074',moment.ISO_8601), moment('2018-03-19T10:54:35.074',moment.ISO_8601), moment('2018-03-20T10:54:35.074',moment.ISO_8601), moment('2018-03-21T10:54:35.074',moment.ISO_8601), moment('2018-03-22T10:54:35.074',moment.ISO_8601), moment('2018-03-23T10:54:35.074',moment.ISO_8601), moment('2018-03-26T10:54:35.074',moment.ISO_8601), moment('2018-03-27T10:54:35.074',moment.ISO_8601), moment('2018-03-28T10:54:35.074',moment.ISO_8601), moment('2018-03-29T10:54:35.074',moment.ISO_8601), moment('2018-03-30T10:54:35.074',moment.ISO_8601), moment('2018-04-02T10:54:35.074',moment.ISO_8601), moment('2018-04-03T10:54:35.074',moment.ISO_8601), moment('2018-04-04T10:54:35.074',moment.ISO_8601), moment('2018-04-05T10:54:35.074',moment.ISO_8601), moment('2018-04-06T10:54:35.074',moment.ISO_8601), moment('2018-04-09T10:54:35.074',moment.ISO_8601), moment('2018-04-10T10:54:35.074',moment.ISO_8601), moment('2018-04-11T10:54:35.074',moment.ISO_8601), moment('2018-04-12T10:54:35.074',moment.ISO_8601), moment('2018-04-13T10:54:35.074',moment.ISO_8601), moment('2018-04-16T10:54:35.074',moment.ISO_8601), moment('2018-04-17T10:54:35.074',moment.ISO_8601), moment('2018-04-18T10:54:35.074',moment.ISO_8601), moment('2018-04-19T10:54:35.074',moment.ISO_8601)"));
		
		data.getDatasets().add(exampleDataSet(data.getLabels().size(),"Dataset 1",SimpleColor.RED_TRANSPARENT,SimpleColor.RED));
		return data;
	}
	
	public static Dataset exampleDataSet(int size, String label, Color backgroundColor, Color borderColor) {
		Dataset dataset = new Dataset();
		dataset.setData(DoubleValue.of(29.394123085959233, 28.830272107233185, 26.706018611341783, 25.739180693808617, 25.53365443375014, 26.273840321005682, 27.236981504660843, 26.239868433561696, 25.521699296922304, 27.065693664053466, 28.177752868033, 28.137429684612997, 30.30127958376518, 29.71254819202197, 31.116159773026606, 29.309380874619805, 27.83134224779929, 28.91617102859406, 28.456526976129012, 26.431893061047116, 27.54467622670617, 26.16556019711834, 27.287991035343815, 28.549039914553745, 27.92727558219046, 28.260391513494007, 30.24565374545384, 30.226704011672844, 30.56263076394418, 30.61966479201819, 31.82386957759751, 33.81702352560294, 31.879644866748485, 31.09926881950921, 29.37763995945207, 28.850188667424842, 29.642323469178912, 29.0896726900307, 29.150998332941302, 27.899396664668696, 26.7903141318645, 27.115537136167585, 25.494663322699452, 26.264311217034763, 26.775328072320516, 28.852461046695204, 29.92714364136602, 31.17775660265245, 28.556795985772503, 27.271189670546914, 27.56358524389892, 26.596689220125818, 26.278812017658154, 26.276364647854496, 26.52171123930951, 26.198563781362395, 26.800198379068956, 27.712287867088456, 27.20153315884971, 28.604822861625056))
			.setBackgroundColor(backgroundColor).setBorderColor(borderColor)
			.setBorderWidth(2)
			.setLabel(label)
			.setPointRadius(0)
			.setFill(false)
			.setLineTension(0)
			.setType(ChartType.LINE);
		return dataset;
	}
}
