package de.adesso.wickedcharts.showcase.configurations.gridlines;


import de.adesso.wickedcharts.chartjs.chartoptions.Title;

/**
 *
 * Chart configuration in order to not display the ticks.
 *
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
