package de.adesso.wickedcharts.showcase.options.chartjs.gridlines;


import de.adesso.wickedcharts.chartjs.chartoptions.Title;

/**
 *
 * Chart configuration in order to not display grid lines.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/scales/gridlines-display.html">http://www.chartjs.org/samples/latest/scales/gridlines-display.html</a>
 *
 * @author SvenWirz
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
