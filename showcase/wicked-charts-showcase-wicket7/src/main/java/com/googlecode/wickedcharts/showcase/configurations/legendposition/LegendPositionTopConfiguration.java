
package com.googlecode.wickedcharts.showcase.configurations.legendposition;

import com.googlecode.wickedcharts.chartjs.chartoptions.Legend;
import com.googlecode.wickedcharts.chartjs.chartoptions.Position;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;

@SuppressWarnings("serial")
public class LegendPositionTopConfiguration extends LegendPositionChartBasicConfiguration {
	
	public LegendPositionTopConfiguration() {
		super();
		
		getData().getDatasets().get(0).setBackgroundColor(SimpleColor.RED_TRANSPARENT)
		.setBorderColor(SimpleColor.RED);
		
		getOptions().setLegend(new Legend().setPosition(Position.TOP));
		
		getOptions().getTitle().setText("Legend Position: Top");
	}
}

