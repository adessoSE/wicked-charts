package com.googlecode.wickedcharts.showcase.configurations.legendposition;

import com.googlecode.wickedcharts.chartjs.chartoptions.Legend;
import com.googlecode.wickedcharts.chartjs.chartoptions.Position;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;

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
