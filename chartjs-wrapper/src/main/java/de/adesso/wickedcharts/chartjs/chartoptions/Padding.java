package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

/**
 * Generate space around a chart.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/configuration/layout.html#padding">http://www.chartjs.org/docs/latest/configuration/layout.html#padding</a>
 *
 * @author anedomansky
 * @author maximAtanasov
 */
@Accessors(chain = true)
@lombok.Data
public class Padding {
	private Integer left;
	private Integer right;
	private Integer top;
	private Integer bottom;
}
