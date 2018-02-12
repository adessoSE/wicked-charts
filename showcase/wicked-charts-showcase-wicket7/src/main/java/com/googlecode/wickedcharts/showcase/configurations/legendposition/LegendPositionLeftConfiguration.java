
package com.googlecode.wickedcharts.showcase.configurations.legendposition;

import com.googlecode.wickedcharts.chartjs.chartoptions.Legend;
import com.googlecode.wickedcharts.chartjs.chartoptions.Position;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;

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
