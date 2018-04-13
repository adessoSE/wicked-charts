package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import lombok.experimental.Accessors;

/**
 * Defines the arc for polar area, doughnut and pie charts.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/configuration/elements.html#arc-configuration">http://www.chartjs.org/docs/latest/configuration/elements.html#arc-configuration</a>
 *
 * @author anedomansky
 * @author maximAtanasov
 */
@Accessors(chain = true)
@lombok.Data
public class Arc extends Element {
	private Number borderWidth;
	private Color backgroundColor;
	private Color borderColor;
}
