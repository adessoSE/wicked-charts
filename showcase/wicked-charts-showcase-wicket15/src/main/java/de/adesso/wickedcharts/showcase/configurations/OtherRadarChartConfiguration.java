package de.adesso.wickedcharts.showcase.configurations;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextListLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import java.util.Arrays;

/**
 * Sample that displays different datasets on a radar.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/charts/radar.html">http://www.chartjs.org/samples/latest/charts/radar.html</a>
 *
 * @author SvenWirz
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
