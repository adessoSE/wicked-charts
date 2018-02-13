package de.adesso.wickedcharts.showcase.configurations;

import java.util.Arrays;

import de.adesso.wickedcharts.chartjs.chartoptions.Animation;
import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.Legend;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.Position;
import de.adesso.wickedcharts.chartjs.chartoptions.Scale;
import de.adesso.wickedcharts.chartjs.chartoptions.Ticks;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

@SuppressWarnings("serial")
public class PolarAreaChartConfiguration extends ShowcaseConfiguration {
	public PolarAreaChartConfiguration() {
		super();
		setType(ChartType.POLAR_AREA);

		Data data = new Data();

		Dataset dataset = new Dataset()
				.setData(this.randomIntegerList(5))
				.setBackgroundColor(
						Arrays.asList(SimpleColor.RED_TRANSPARENT,SimpleColor.ORANGE_TRANSPARENT,
								SimpleColor.YELLOW_TRANSPARENT, SimpleColor.GREEN_TRANSPARENT, 
								SimpleColor.BLUE_TRANSPARENT))
				.setLabel("Dataset 1");

		data.setDatasets(Arrays.asList(dataset)).setLabels(Arrays.asList("Red", "Orange", "Yellow", "Green", "Blue"));
		
		setData(data);
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("ChartJs Polar Area Chart"))
				.setLegend(new Legend()
						.setPosition(Position.RIGHT))
				.setScale(new Scale()
						.setTicks(new Ticks()
								.setBeginAtZero(true))
						.setReverse(false))
				.setAnimation(new Animation()
						.setAnimateScale(true)
						.setAnimateRotate(false));
		setOptions(options);
		
	}
}
