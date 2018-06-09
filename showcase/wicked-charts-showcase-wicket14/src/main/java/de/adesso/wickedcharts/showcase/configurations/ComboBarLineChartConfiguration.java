package de.adesso.wickedcharts.showcase.configurations;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import java.util.Arrays;
import de.adesso.wickedcharts.chartjs.chartoptions.*;

/**
 * 
 * A sample that shows how a combo bar-line chart configuration looks.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/charts/combo-bar-line.html">http://www.chartjs.org/samples/latest/charts/combo-bar-line.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class ComboBarLineChartConfiguration extends ShowcaseConfiguration {
	public ComboBarLineChartConfiguration() {
		super();
		setType(ChartType.BAR);
		Data data = new Data();
		Dataset dataset1 = new Dataset();
		dataset1.setType(ChartType.LINE)
				.setBorderColor(SimpleColor.BLUE)
				.setBorderWidth(2)
				.setFill(false)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setLabel("Dataset 1");
		
		Dataset dataset2 = new Dataset()
				.setType(ChartType.BAR)
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.WHITE)
				.setBorderWidth(2)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setLabel("Dataset 2");
		
		Dataset dataset3 = new Dataset()
				.setType(ChartType.BAR)
				.setBackgroundColor(SimpleColor.GREEN)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setLabel("Dataset 3");
		
		data.setDatasets(Arrays.asList(dataset1,dataset2,dataset3))
		.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		
		setData(data);
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Combo Bar Line Chart"))
				.setTooltips(new Tooltips()
						.setIntersect(true)
						.setMode(TooltipMode.INDEX));
		setOptions(options);
		
	}
}
