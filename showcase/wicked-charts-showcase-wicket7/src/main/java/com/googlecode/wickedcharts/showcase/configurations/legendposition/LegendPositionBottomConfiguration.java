
package com.googlecode.wickedcharts.showcase.configurations.legendposition;

import de.adesso.wickedcharts.chartjs.chartoptions.Legend;
import de.adesso.wickedcharts.chartjs.chartoptions.Position;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;

@SuppressWarnings("serial")
public class LegendPositionBottomConfiguration extends LegendPositionChartBasicConfiguration {
	
	public LegendPositionBottomConfiguration() {
		super();
		
		getData().getDatasets().get(0).setBackgroundColor(SimpleColor.GREEN_TRANSPARENT)
		.setBorderColor(SimpleColor.GREEN);
		
		getOptions().setLegend(new Legend().setPosition(Position.BOTTOM));
		
		getOptions().getTitle().setText("Legend Position: Bottom");
	}
}
