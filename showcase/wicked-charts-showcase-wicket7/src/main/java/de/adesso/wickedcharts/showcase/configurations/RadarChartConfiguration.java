package de.adesso.wickedcharts.showcase.configurations;

import java.util.Arrays;



import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.Element;
import de.adesso.wickedcharts.chartjs.chartoptions.Filler;
import de.adesso.wickedcharts.chartjs.chartoptions.Line;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.Plugins;
import de.adesso.wickedcharts.chartjs.chartoptions.SamplesFillerAnalyzer;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.AbsoluteIndex;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.BoundaryFillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.RelativeIndex;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

/**
 * Sample that displays different datasets on a radar.
 *
 */
@SuppressWarnings("serial")
public class RadarChartConfiguration extends ShowcaseConfiguration {
	public RadarChartConfiguration() {
		super();
    	setType(ChartType.RADAR);
		
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset0 = new Dataset()
				.setLabel("D0")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(Arrays.asList(1, 2, 3, 1, 2, 1, 2)))
				.setFill(BoundaryFillingMode.UNDEFINED);
		
		
		Dataset dataset1 = new Dataset()
				.setLabel("D1 (hidden) Fill: -1")
				.setBackgroundColor(SimpleColor.ORANGE_TRANSPARENT)
				.setBorderColor(SimpleColor.ORANGE)
				.setData(IntegerValue.of(Arrays.asList(5, 4, 3, 5, 4, 3, 5)))
				.setHidden(true)
				.setFill(new RelativeIndex("-1"));
		
		Dataset dataset2 = new Dataset()
				.setLabel("D2 Fill: 1")
				.setBackgroundColor(SimpleColor.YELLOW)
				.setBorderColor(SimpleColor.YELLOW_TRANSPARENT)
				.setData(IntegerValue.of(Arrays.asList(10, 8, 12, 6, 13, 10, 9)))
				.setFill(new AbsoluteIndex(1));
		
		
		Dataset dataset3 = new Dataset()
				.setLabel("D3 Fill: False")
				.setBackgroundColor(SimpleColor.GREEN_TRANSPARENT)
				.setBorderColor(SimpleColor.GREEN)
				.setData(IntegerValue.of(Arrays.asList(20, 18, 22, 16, 23, 20, 19)))
				.setFill(false);
		
		Dataset dataset4 = new Dataset()
				.setLabel("D4 Fill: -1")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE)
				.setData(IntegerValue.of(Arrays.asList(30, 28, 32, 26, 33, 30, 29)))
				.setFill(new RelativeIndex("-1"));
		
		
		Dataset dataset5 = new Dataset()
				.setLabel("D5 Fill: -1")
				.setBackgroundColor(SimpleColor.PURPLE_TRANSPARENT)
				.setBorderColor(SimpleColor.PURPLE)
				.setData(IntegerValue.of(Arrays.asList(40, 38, 42, 36, 43, 40, 39)))
				.setFill(new RelativeIndex("-1"));		
		
		data.setDatasets(Arrays.asList(dataset0, dataset1, dataset2, dataset3, dataset4, dataset5));
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Radar Chart"))
				.setMaintainAspectRatio(true)
				.setSpanGaps(false)
				.setElements(new Element()
						.setLine(new Line()
								.setTension(0.000001)))
				.setPlugins(new Plugins()
						.setFiller(new Filler()
								.setPropagate(false))
						.setSamples_filler_analyzer(new SamplesFillerAnalyzer()
								.setTarget("chart-analyzer")))
				;
		setOptions(options);
	}
}
