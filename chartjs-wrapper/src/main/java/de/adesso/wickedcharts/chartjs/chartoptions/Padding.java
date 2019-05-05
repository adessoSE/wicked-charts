package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

import java.io.Serializable;

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
public class Padding implements Serializable {
	private Integer left;
	private Integer right;
	private Integer top;
	private Integer bottom;
}
