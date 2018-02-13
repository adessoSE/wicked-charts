package de.adesso.wickedcharts.showcase.configurations;

import java.util.Arrays;

import de.adesso.wickedcharts.chartjs.chartoptions.AxesScale;
import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.Element;
import de.adesso.wickedcharts.chartjs.chartoptions.Filler;
import de.adesso.wickedcharts.chartjs.chartoptions.IntegerValue;
import de.adesso.wickedcharts.chartjs.chartoptions.Line;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.Plugins;
import de.adesso.wickedcharts.chartjs.chartoptions.ScaleLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.Scales;
import de.adesso.wickedcharts.chartjs.chartoptions.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.Ticks;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

//Valid fill Parameters:
/*
	'false'
	'origin'
	'start'
	'end'
 Change the fill setting in the configuration to see changes*/ 

@SuppressWarnings("serial")
public class AreaLineBoundariesChartConfiguration extends ShowcaseConfiguration {
	public AreaLineBoundariesChartConfiguration() {
		super();
    	setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(TextLabel.createListOf("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("Dataset")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(randomIntegerList(7)))
					.setFill("end");
		
		data.setDatasets(Arrays.asList(dataset1));
		
		Options options = new Options()
				.setMaintainAspectRatio(true)
				.setSpanGaps(false)
				.setElements(new Element()
						.setLine(new Line()
								.setTension(0.000001)))
				.setPlugins(new Plugins().
						setFiller(new Filler().
								setPropagate(false)))
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Boundaries Chart"))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setDisplay(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Month"))
								.setTicks(new Ticks()
										.setAutoSkip(false)
										.setMaxRotation(0))))
				;
		setOptions(options);
	}
}
