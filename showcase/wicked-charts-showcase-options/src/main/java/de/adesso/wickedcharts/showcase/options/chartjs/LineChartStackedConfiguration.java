package de.adesso.wickedcharts.showcase.options.chartjs;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.options.chartjs.base.ShowcaseConfiguration;

import java.util.Arrays;

/**
 * 
 * A sample that shows how a stacked line chart is configured.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/charts/area/line-stacked.html">http://www.chartjs.org/samples/latest/charts/area/line-stacked.html</a>
 *
 * @author maximAtanasov
 * @author anedomansky
 */
@SuppressWarnings("serial")
public class LineChartStackedConfiguration extends ShowcaseConfiguration{
	public LineChartStackedConfiguration() {
		super();
    	setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(randomIntegerList(7)));
		
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second dataset")
				.setBackgroundColor(SimpleColor.BLUE)
				.setBorderColor(SimpleColor.BLUE)
				.setData(IntegerValue.of(randomIntegerList(7)));
		
		Dataset dataset3 = new Dataset()
				.setLabel("My Third dataset")
				.setBackgroundColor(SimpleColor.GREEN)
				.setBorderColor(SimpleColor.GREEN)
				.setData(IntegerValue.of(randomIntegerList(7)));
		
		data.setDatasets(Arrays.asList(dataset1,dataset2, dataset3));
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Stacked Line Chart"))
				.setTooltips(new Tooltips()
						.setMode(TooltipMode.INDEX)
						.setIntersect(false))
				.setHover(new Hover()
						.setMode(HoverMode.NEAREST)
						.setIntersect(true))
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