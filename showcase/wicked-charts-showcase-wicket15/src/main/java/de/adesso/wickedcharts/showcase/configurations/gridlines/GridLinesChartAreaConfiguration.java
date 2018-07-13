package de.adesso.wickedcharts.showcase.configurations.gridlines;


import de.adesso.wickedcharts.chartjs.chartoptions.Title;

/**
 *
 * Chart configuration for the area chart grid line layout.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/scales/gridlines-display.html">http://www.chartjs.org/samples/latest/scales/gridlines-display.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class GridLinesChartAreaConfiguration extends GridLinesBasicConfiguration {
	
	public GridLinesChartAreaConfiguration() {
		super();
		
		gridLines.setDisplay(true)
		.setDrawBorder(true)
		.setDrawOnChartArea(false);
		getOptions().setTitle(new Title()
				.setDisplay(true)
				.setText("Gridlines - Chart Area"));
	}
}
