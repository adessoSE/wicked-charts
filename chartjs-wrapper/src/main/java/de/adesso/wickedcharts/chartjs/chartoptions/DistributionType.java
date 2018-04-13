package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.LowercaseEnum;

/**
 * Controls the data distribution along the scale.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/axes/cartesian/time.html#scale-distribution">http://www.chartjs.org/docs/latest/axes/cartesian/time.html#scale-distribution</a>
 *
 * @author SvenWirz
 */
public enum DistributionType implements LowercaseEnum {
	SERIES,
	LINEAR;
}
