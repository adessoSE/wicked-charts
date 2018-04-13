package de.adesso.wickedcharts.showcase.configurations.gridlines;


import de.adesso.wickedcharts.chartjs.chartoptions.Title;

/**
 *
 * Chart configuration in order to not display the ticks.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/scales/gridlines-display.html">http://www.chartjs.org/samples/latest/scales/gridlines-display.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class GridLinesTicksConfiguration extends GridLinesBasicConfiguration {
	
	public GridLinesTicksConfiguration() {
		super();
		
		gridLines.setDisplay(true)
		.setDrawBorder(true)
		.setDrawOnChartArea(true)
		.setDrawTicks(false);
		getOptions().setTitle(new Title()
				.setDisplay(true)
				.setText("Gridlines - Ticks"));
	}
}
