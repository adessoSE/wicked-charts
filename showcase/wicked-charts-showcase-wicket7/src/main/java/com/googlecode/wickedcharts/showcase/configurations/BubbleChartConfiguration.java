package com.googlecode.wickedcharts.showcase.configurations;

import java.util.Arrays;
import java.util.Random;

import com.googlecode.wickedcharts.chartjs.chartoptions.ChartType;
import com.googlecode.wickedcharts.chartjs.chartoptions.Data;
import com.googlecode.wickedcharts.chartjs.chartoptions.Dataset;
import com.googlecode.wickedcharts.chartjs.chartoptions.Options;
import com.googlecode.wickedcharts.chartjs.chartoptions.PointData2D;
import com.googlecode.wickedcharts.chartjs.chartoptions.Title;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import com.googlecode.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

@SuppressWarnings("serial")
public class BubbleChartConfiguration extends ShowcaseConfiguration {
	public BubbleChartConfiguration() {
		super();
		setType(ChartType.BUBBLE);

		Data data = new Data()
				.setLabels(Arrays.asList("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setBackgroundColor(SimpleColor.GREEN_TRANSPARENT)
				.setBorderColor(SimpleColor.YELLOW)
				.setData(Arrays.asList(new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100)),
						new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100)),
						new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100)),
						new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100)),
						new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100)),
						new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100)),
						new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100))))
				.setFill("false");
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second dataset")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setData(Arrays.asList(new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100)),
						new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100)),
						new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100)),
						new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100)),
						new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100)),
						new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100)),
						new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100))))
				.setFill("false");
		
		Dataset dataset3 = new Dataset()
				.setLabel("My Third dataset")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.YELLOW)
				.setData(Arrays.asList(new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100)),
						new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100)),
						new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100)),
						new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100)),
						new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100)),
						new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100)),
						new PointData2D().setX(randomDouble(100)).setY(randomDouble(100)).setR(randomDouble(100))))
				.setFill("false");
		
		data.setDatasets(Arrays.asList(dataset1,dataset2,dataset3));
		
		Options options = new Options()
				.setResponsive(true)
				.setAspectRatio((double)1)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Bubble Chart"))
				;
		setOptions(options);
		
		
	}
	
	private Double randomDouble(int bound) {
		Random random = new Random();
		return (double)random.nextInt(bound)+1;
	}
}
