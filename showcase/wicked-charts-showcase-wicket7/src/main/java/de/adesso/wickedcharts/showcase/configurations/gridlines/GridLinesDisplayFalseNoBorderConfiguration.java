package de.adesso.wickedcharts.showcase.configurations.gridlines;

@SuppressWarnings("serial")
public class GridLinesDisplayFalseNoBorderConfiguration extends GridLinesBasicConfiguration {
	
	public GridLinesDisplayFalseNoBorderConfiguration() {
		super();
		
		gridLines.setDisplay(false)
		.setDrawBorder(false);
	}
}
