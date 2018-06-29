package de.adesso.wickedcharts.showcase.configurations;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * A sample that shows how configuring interpolation of lines in a line chart is configured.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/charts/line/interpolation-modes.html">http://www.chartjs.org/samples/latest/charts/line/interpolation-modes.html</a>
 *
 * @author maximAtanasov
 * @author anedomansky
 */
@SuppressWarnings("serial")
public class LineChartInterpolatedConfiguration extends ShowcaseConfiguration {
	public LineChartInterpolatedConfiguration() {
		super();
    	setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		List<IntegerValue> datasetsData = IntegerValue.of(randomIntegerList(7));
		
		Dataset dataset1 = new Dataset()
				.setLabel("Cubic interpolation (monotone)")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(datasetsData)
				.setFill(false)
				.setCubicInterpolationMode(CubicInterpolationMode.MONOTONE);
		
		Dataset dataset2 = new Dataset()
				.setLabel("Cubic interpolation (default)")
				.setBackgroundColor(SimpleColor.BLUE)
				.setBorderColor(SimpleColor.BLUE)
				.setData(datasetsData)
				.setFill(false);
				
		Dataset dataset3 = new Dataset()
				.setLabel("Linear interpolation")
				.setBackgroundColor(SimpleColor.GREEN)
				.setBorderColor(SimpleColor.GREEN)
				.setData(datasetsData)
				.setFill(false)
				.setLineTension(0);
				
		
		data.setDatasets(Arrays.asList(dataset1,dataset2, dataset3));
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Line Chart Interpolation"))
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
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Value"))))
				;
		setOptions(options);
	}
}
