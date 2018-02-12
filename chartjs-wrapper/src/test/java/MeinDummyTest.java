import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.googlecode.wickedcharts.chartjs.ChartConfiguration;
import com.googlecode.wickedcharts.chartjs.chartoptions.ChartType;
import com.googlecode.wickedcharts.chartjs.chartoptions.Data;
import com.googlecode.wickedcharts.chartjs.chartoptions.Dataset;
import com.googlecode.wickedcharts.chartjs.chartoptions.Legend;
import com.googlecode.wickedcharts.chartjs.chartoptions.Options;
import com.googlecode.wickedcharts.chartjs.chartoptions.Position;
import com.googlecode.wickedcharts.chartjs.chartoptions.Title;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.Color;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import com.googlecode.wickedcharts.chartjs.jackson.JsonRenderer;

public class MeinDummyTest {
	public static void main(String[] args) throws JsonProcessingException {

		ChartConfiguration config = new ChartConfiguration().setType(ChartType.LINE).setData(dummyData());

		Options options = new Options().setLegend(new Legend().setPosition(Position.TOP)).setResponsive(true)
				.setTitle(new Title().setDisplay(true).setText("A Chart.js Bar Chart"));
		config.setOptions(options);

		JsonRenderer renderer = new JsonRenderer();

		System.out.println(renderer.toJson(config));
	}

	public static Data dummyData() {
		Data data = new Data();
		data.setDatasets(new ArrayList<Dataset>());

		data.setLabels(Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December"));

		data.getDatasets().add(randomDataSet(data.getLabels().size(),"Dataset 1",SimpleColor.RED_TRANSPARENT,SimpleColor.RED));
		data.getDatasets().add(randomDataSet(data.getLabels().size(),"Dataset 2",SimpleColor.BLUE_TRANSPARENT,SimpleColor.BLUE));
		return data;
	}
	
	public static Dataset randomDataSet(int size, String label, Color backgroundColor, Color borderColor) {
		List<Integer> dataList = new ArrayList<Integer>();
		Random rng = new Random();
		for (int i = 0; i < size; i++) {
			dataList.add(rng.nextInt(20));
		}

		Dataset dataset = new Dataset();
		dataset.setData(dataList)
			.setBackgroundColor(backgroundColor).setBorderColor(borderColor)
			.setBorderWidth(2)
			.setLabel(label);
		return dataset;
	}
}
