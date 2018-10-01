
package de.adesso.wickedcharts.showcase.options.chartjs.legendposition;

import de.adesso.wickedcharts.chartjs.chartoptions.Legend;
import de.adesso.wickedcharts.chartjs.chartoptions.Position;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
/**
 * Shows how to configure a chart with the legend position at the bottom
 * @see <a href="http://www.chartjs.org/samples/latest/legend/positioning.html">http://www.chartjs.org/samples/latest/legend/positioning.html</a>
 *
 * @author SvenWirz
 */
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
