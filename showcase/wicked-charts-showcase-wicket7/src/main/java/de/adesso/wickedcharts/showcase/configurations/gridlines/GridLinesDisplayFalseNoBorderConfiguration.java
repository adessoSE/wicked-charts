package de.adesso.wickedcharts.showcase.configurations.gridlines;

import de.adesso.wickedcharts.chartjs.chartoptions.Title;

/**
 *
 * Chart configuration in order to not display grid lines and axes.
 *
 */
@SuppressWarnings("serial")
public class GridLinesDisplayFalseNoBorderConfiguration extends GridLinesBasicConfiguration {
	
	public GridLinesDisplayFalseNoBorderConfiguration() {
		super();
		
		gridLines.setDisplay(false)
		.setDrawBorder(false);
		getOptions().setTitle(new Title()
				.setDisplay(true)
				.setText("Gridlines - Display False No Border"));
	}
}
