package de.adesso.wickedcharts.showcase.configurations.gridlines;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import java.util.Arrays;

/**
 *
 * Chart configuration for the basic grid line layout.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/scales/gridlines-display.html">http://www.chartjs.org/samples/latest/scales/gridlines-display.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class GridLinesBasicConfiguration extends ShowcaseConfiguration {
	
	protected GridLines gridLines;
	
	public GridLinesBasicConfiguration() {
		super();
    	setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(10, 30, 39, 20, 25, 34, -10))
				.setFill(false);
		
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second dataset")
				.setBackgroundColor(SimpleColor.BLUE)
				.setBorderColor(SimpleColor.BLUE)
				.setData(IntegerValue.of(Arrays.asList(18, 33, 22, 19, 11, 39, 30)))
				.setFill(false);
		
		data.setDatasets(Arrays.asList(dataset1,dataset2));

		gridLines = new GridLines()
				.setDisplay(true);
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Gridlines - Basic"))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setGridLines(gridLines))
						.setYAxes(new AxesScale()
								.setGridLines(gridLines)
								.setTicks(new Ticks()
										.setMin(0)
										.setMax(100)
										.setStepSize(10))))
				;
		setOptions(options);
	}
}
