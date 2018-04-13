package de.adesso.wickedcharts.showcase.configurations;

import java.util.Arrays;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.PointValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

/**
 * A sample that shows how a logarithmic scatter chart configuration looks.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/scales/logarithmic/scatter.html">http://www.chartjs.org/samples/latest/scales/logarithmic/scatter.html</a>
 *
 * @author maximAtanasov
 * @author anedomansky
 */
@SuppressWarnings("serial")
public class LogarithmicScatterChartConfiguration extends ShowcaseConfiguration {
	public LogarithmicScatterChartConfiguration() {
		super();
    	setType(ChartType.SCATTER);
		
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED) 
				.setData(Arrays.asList(
						new PointValue(4,14),
						new PointValue(40,42),
						new PointValue(23,42),
						new PointValue(40,22),
						new PointValue(80,12),
						new PointValue(30,32)))
				.setFill(false);
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second dataset")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.BLUE) 
				.setData(Arrays.asList(
						new PointValue(7,56),
						new PointValue(15,54),
						new PointValue(46,34),
						new PointValue(36,42),
						new PointValue(78,64),
						new PointValue(12,48)))
				.setFill(false);
		
		data.setDatasets(Arrays.asList(dataset1,dataset2));
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Logarithmic Scatter Chart"))
				.setTooltips(new Tooltips()
						.setMode(TooltipMode.INDEX)
						.setIntersect(false))
				.setHover(new Hover()
						.setMode(HoverMode.NEAREST)
						.setIntersect(true))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setDisplay(true)
								.setType("logarithmic")
								.setPosition(Position.BOTTOM)
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Frequency")))
						.setYAxes(new AxesScale()
								.setDisplay(true)
								.setType("linear")
								.setScaleLabel(new ScaleLabel()
										.setDisplay(true)
										.setLabelString("Voltage"))))
				;
		setOptions(options);
	}
}
