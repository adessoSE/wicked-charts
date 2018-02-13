
package com.googlecode.wickedcharts.showcase.configurations.legendposition;

import de.adesso.wickedcharts.chartjs.chartoptions.Legend;
import de.adesso.wickedcharts.chartjs.chartoptions.Position;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;

@SuppressWarnings("serial")
public class LegendPositionLeftConfiguration extends LegendPositionChartBasicConfiguration {
	
	public LegendPositionLeftConfiguration() {
		super();
		
		getData().getDatasets().get(0).setBackgroundColor(SimpleColor.YELLOW_TRANSPARENT)
		.setBorderColor(SimpleColor.YELLOW);
		
		getOptions().setLegend(new Legend().setPosition(Position.LEFT));
		
		getOptions().getTitle().setText("Legend Position: Left");
	}
}
