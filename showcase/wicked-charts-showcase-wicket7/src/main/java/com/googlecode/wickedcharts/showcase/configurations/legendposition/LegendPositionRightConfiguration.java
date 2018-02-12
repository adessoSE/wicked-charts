
package com.googlecode.wickedcharts.showcase.configurations.legendposition;

import com.googlecode.wickedcharts.chartjs.chartoptions.Legend;
import com.googlecode.wickedcharts.chartjs.chartoptions.Position;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;

@SuppressWarnings("serial")
public class LegendPositionRightConfiguration extends LegendPositionChartBasicConfiguration {
	
	public LegendPositionRightConfiguration() {
		super();
		
		getData().getDatasets().get(0).setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
		.setBorderColor(SimpleColor.BLUE);
		
		getOptions().setLegend(new Legend().setPosition(Position.RIGHT));
		
		getOptions().getTitle().setText("Legend Position: Right");
	}
}

