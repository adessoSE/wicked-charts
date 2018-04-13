package de.adesso.wickedcharts.showcase.configurations.gridlines;

import java.util.Arrays;

import de.adesso.wickedcharts.chartjs.chartoptions.AxesScale;
import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.GridLines;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.Scales;
import de.adesso.wickedcharts.chartjs.chartoptions.Ticks;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.StringValueColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;


/**
 *
 * Chart configuration for different grid line styles.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/scales/gridlines-style.html">http://www.chartjs.org/samples/latest/scales/gridlines-style.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class GridLineStylesConfiguration extends ShowcaseConfiguration {
	public GridLineStylesConfiguration() {
		super();
    	setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(Arrays.asList(10, 30, 39, 20, 25, 34, -10)))
				.setFill(false);
		
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second dataset")
				.setBackgroundColor(SimpleColor.BLUE)
				.setBorderColor(SimpleColor.BLUE)
				.setData(IntegerValue.of(Arrays.asList(18, 33, 22, 19, 11, 39, 30)))
				.setFill(false);
		
		data.setDatasets(Arrays.asList(dataset1,dataset2));

		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Gridlines - Styles"))
				.setScales(new Scales()
						.setYAxes(new AxesScale()
								.setGridLines(new GridLines()
										.setDrawBorder(true)
										.setColor(Arrays.asList(
												new StringValueColor("pink"),
												new StringValueColor("red"),
												new StringValueColor("orange"),
												new StringValueColor("yellow"),
												new StringValueColor("green"),
												new StringValueColor("blue"),
												new StringValueColor("indigo"),
												new StringValueColor("purple"))))
								.setTicks(new Ticks()
										.setMin(0)
										.setMax(100)
										.setStepSize(10))))
				;
		setOptions(options);
	}
}
