
package de.adesso.wickedcharts.showcase.options.chartjs.legendposition;

import de.adesso.wickedcharts.chartjs.chartoptions.Legend;
import de.adesso.wickedcharts.chartjs.chartoptions.Position;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;

/**
 * Shows how to configure a chart with the legend position on the right
 *
 * @see <a href="http://www.chartjs.org/samples/latest/legend/positioning.html">http://www.chartjs.org/samples/latest/legend/positioning.html</a>
 *
 * @author SvenWirz
 */
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

