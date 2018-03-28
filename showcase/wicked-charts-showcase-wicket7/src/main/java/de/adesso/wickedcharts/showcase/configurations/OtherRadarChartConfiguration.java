package de.adesso.wickedcharts.showcase.configurations;

import java.util.Arrays;

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
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextListLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

/**
 * Sample that displays different datasets on a radar.
 *
 */
@SuppressWarnings("serial")
public class OtherRadarChartConfiguration extends ShowcaseConfiguration {
	public OtherRadarChartConfiguration() {
		super();
    	setType(ChartType.RADAR);
		
		Data data = new Data()
				.setLabels(Arrays.asList(
						new TextListLabel("Eating", "Dinner"),
						new TextListLabel("Drining", "Water"),
						new TextLabel("Sleeping"),
						new TextListLabel("Designing","Graphics"),
						new TextLabel("Coding"),
						new TextLabel("Cycling"),
						new TextLabel("Running")
						));
		setData(data);
		
		Dataset dataset0 = new Dataset()
				.setLabel("My First dataset")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setPointBackgroundColor(SimpleColor.RED)
				.setData(IntegerValue.of(randomIntegerList(7)));
		
		
		Dataset dataset1 = new Dataset()
				.setLabel("My second dataset")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE)
				.setPointBackgroundColor(SimpleColor.BLUE)
				.setData(IntegerValue.of(randomIntegerList(7)));
		
		data.setDatasets(Arrays.asList(dataset0, dataset1));
		
		Options options = new Options()
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Radar Chart"))
				.setLegend(new Legend()
						.setPosition(Position.TOP))
				.setScale(new Scale()
						.setTicks(new Ticks()
								.setBeginAtZero(true)));
		setOptions(options);
	}
}
