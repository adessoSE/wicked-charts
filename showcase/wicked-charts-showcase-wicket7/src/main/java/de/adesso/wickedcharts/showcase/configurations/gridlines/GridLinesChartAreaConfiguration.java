package de.adesso.wickedcharts.showcase.configurations.gridlines;


@SuppressWarnings("serial")
public class GridLinesChartAreaConfiguration extends GridLinesBasicConfiguration {
	
	public GridLinesChartAreaConfiguration() {
		super();
		
		gridLines.setDisplay(true)
		.setDrawBorder(true)
		.setDrawOnChartArea(false);
	}
}
