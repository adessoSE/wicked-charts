package de.adesso.wickedcharts.showcase.configurations;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;
import de.adesso.wickedcharts.chartjs.chartoptions.*;
import java.util.Arrays;

/**
 * 
 * A sample that shows how a doughnut configuration looks.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/charts/doughnut.html">http://www.chartjs.org/samples/latest/charts/doughnut.html</a>
 *
 * @author maximAtanasov
 * @author anedomansky
 */
@SuppressWarnings("serial")
public class DoughnutChartConfiguration extends ShowcaseConfiguration {
	public DoughnutChartConfiguration() {
		super();
		setType(ChartType.DOUGHNUT);

		Data data = new Data();

		Dataset dataset = new Dataset()
				.setData(IntegerValue.of(randomIntegerList(5)))
				.setBackgroundColor(
						Arrays.asList(SimpleColor.RED,SimpleColor.ORANGE, SimpleColor.YELLOW, SimpleColor.GREEN, SimpleColor.BLUE))
				.setLabel("Dataset 1");

		data.setDatasets(Arrays.asList(dataset)).setLabels(TextLabel.of("Red", "Orange", "Yellow", "Green", "Blue"));
		
		setData(data);
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("ChartJs Doughnut Chart"))
				.setLegend(new Legend()
						.setPosition(Position.TOP))
				.setAnimation(new Animation()
						.setAnimateScale(true)
						.setAnimateRotate(true));
		setOptions(options);
		
	}
}
