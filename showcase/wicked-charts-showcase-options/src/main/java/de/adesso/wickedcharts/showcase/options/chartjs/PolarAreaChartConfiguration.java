package de.adesso.wickedcharts.showcase.options.chartjs;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.options.chartjs.base.ShowcaseConfiguration;

import java.util.Arrays;

/**
 * Sample that distributes data in a polar area chart.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/charts/polar-area.html">http://www.chartjs.org/samples/latest/charts/polar-area.html</a>
 *
 * @author maximAtanasov
 * @author anedomansky
 */
@SuppressWarnings("serial")
public class PolarAreaChartConfiguration extends ShowcaseConfiguration {
	public PolarAreaChartConfiguration() {
		super();
		setType(ChartType.POLAR_AREA);

		Data data = new Data();

		Dataset dataset = new Dataset()
				.setData(IntegerValue.of(randomIntegerList(5)))
				.setBackgroundColor(
						Arrays.asList(SimpleColor.RED_TRANSPARENT,SimpleColor.ORANGE_TRANSPARENT,
								SimpleColor.YELLOW_TRANSPARENT, SimpleColor.GREEN_TRANSPARENT, 
								SimpleColor.BLUE_TRANSPARENT))
				.setLabel("Dataset 1");

		data.setDatasets(Arrays.asList(dataset)).setLabels(TextLabel.of("Red", "Orange", "Yellow", "Green", "Blue"));
		
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
