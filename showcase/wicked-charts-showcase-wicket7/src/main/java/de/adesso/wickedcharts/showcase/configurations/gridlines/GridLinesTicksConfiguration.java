package de.adesso.wickedcharts.showcase.configurations.gridlines;


@SuppressWarnings("serial")
public class GridLinesTicksConfiguration extends GridLinesBasicConfiguration {
	
	public GridLinesTicksConfiguration() {
		super();
		
		gridLines.setDisplay(true)
		.setDrawBorder(true)
		.setDrawOnChartArea(true)
		.setDrawTicks(false);
	}
}
