package de.adesso.wickedcharts.showcase.configurations;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.AbsoluteIndex;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.BoundaryFillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.RelativeIndex;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import java.util.Arrays;
import de.adesso.wickedcharts.chartjs.chartoptions.*;
/**
 * 
 * A sample that shows how a chart with different datasets can be configured.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/charts/area/line-datasets.html">http://www.chartjs.org/samples/latest/charts/area/line-datasets.html</a>
 *
 * @author maximAtanasov
 * @author anedomansky
 */
@SuppressWarnings("serial")
public class LineChartAreaDatasetConfiguration extends ShowcaseConfiguration {
	public LineChartAreaDatasetConfiguration() {
		super();
    	setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset0 = new Dataset()
				.setLabel("D0 (hidden), Fill: undefined")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setFill(BoundaryFillingMode.UNDEFINED)
				.setHidden(true);
		
		
		Dataset dataset1 = new Dataset()
				.setLabel("D1 Fill: -1")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setFill(new RelativeIndex("-1"));
		
		
		Dataset dataset2 = new Dataset()
				.setLabel("D2 (hidden) Fill: 1")
				.setBackgroundColor(SimpleColor.ORANGE_TRANSPARENT)
				.setBorderColor(SimpleColor.ORANGE)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setHidden(true)
				.setFill(new AbsoluteIndex(1));
		
		Dataset dataset3 = new Dataset()
				.setLabel("D3 Fill: -1")
				.setBackgroundColor(SimpleColor.YELLOW_TRANSPARENT)
				.setBorderColor(SimpleColor.YELLOW)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setFill(false);
		
		
		Dataset dataset4 = new Dataset()
				.setLabel("D4 Fill: -1")
				.setBackgroundColor(SimpleColor.GREEN_TRANSPARENT)
				.setBorderColor(SimpleColor.GREEN)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setFill(new RelativeIndex("-1"));
		
		Dataset dataset5 = new Dataset()
				.setLabel("D5 Fill: +2")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setFill(new RelativeIndex("+2"));
		
		
		Dataset dataset6 = new Dataset()
				.setLabel("D6 Fill: false")
				.setBackgroundColor(SimpleColor.GREY_TRANSPARENT)
				.setBorderColor(SimpleColor.GREY)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setFill(false);
		
		Dataset dataset7 = new Dataset()
				.setLabel("D7 Fill: 8")
				.setBackgroundColor(SimpleColor.PURPLE_TRANSPARENT)
				.setBorderColor(SimpleColor.PURPLE)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setFill(new AbsoluteIndex(8));
		
		
		Dataset dataset8 = new Dataset()
				.setLabel("D8 (hidden) Fill: end")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setHidden(true)
				.setFill(BoundaryFillingMode.END);
		
		data.setDatasets(Arrays.asList(dataset0, dataset1, dataset2, dataset3, dataset4, 
				dataset5, dataset6, dataset7, dataset8));
		
		Options options = new Options()
				.setMaintainAspectRatio(true)
				.setSpanGaps(false)
				.setElements(new Element()
						.setLine(new Line()
								.setTension(0.000001)))
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Line Dataset Chart"))
				.setTooltips(new Tooltips()
						.setMode(TooltipMode.INDEX)
						.setIntersect(false))
				.setHover(new Hover()
						.setMode(HoverMode.NEAREST)
						.setIntersect(true))
				.setPlugins(new Plugins()
						.setFiller(new Filler()
								.setPropagate(false))
						.setSamples_filler_analyzer(new SamplesFillerAnalyzer()
								.setTarget("chart-analyzer")))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setDisplay(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Month")))
						.setYAxes(new AxesScale()
								.setDisplay(true)
								.setStacked(true)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Value"))))
				;
		setOptions(options);
	}
}
