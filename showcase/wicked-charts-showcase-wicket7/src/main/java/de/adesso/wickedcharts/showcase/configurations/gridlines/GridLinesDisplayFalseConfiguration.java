package de.adesso.wickedcharts.showcase.configurations.gridlines;


import de.adesso.wickedcharts.chartjs.chartoptions.Title;

/**
 *
 * Chart configuration in order to not display grid lines.
 *
 */
@SuppressWarnings("serial")
public class GridLinesDisplayFalseConfiguration extends GridLinesBasicConfiguration {
	
	public GridLinesDisplayFalseConfiguration() {
		super();
		
		gridLines.setDisplay(false);
		getOptions().setTitle(new Title()
				.setDisplay(true)
				.setText("Gridlines - Display False"));
	}
}
