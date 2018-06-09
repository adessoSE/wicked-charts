package de.adesso.wickedcharts.showcase.configurations;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.BoundaryFillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import java.util.Arrays;
import de.adesso.wickedcharts.chartjs.chartoptions.*;
/**
 * 
 * A sample that shows how the 'origin' fill option works
 *
 * @see <a href="http://www.chartjs.org/samples/latest/charts/area/line-boundaries.html">http://www.chartjs.org/samples/latest/charts/area/line-boundaries.html</a>
 *
 * @author anedomansky
 * @author maximAtanasov
 */
@SuppressWarnings("serial")
public class AreaLineBoundariesChartOriginConfiguration extends ShowcaseConfiguration {
	public AreaLineBoundariesChartOriginConfiguration() {
		super();
    	setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("Dataset")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(-40, 20, 30, -70, 12, 60, -30))
					.setFill(BoundaryFillingMode.ORIGIN);
		
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
						.setText("Chart.js Boundaries Chart - Origin"))
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
