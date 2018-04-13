package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.LowercaseEnum;

/**
 * Defines the time display formats.
 *
 * @see <a http://www.chartjs.org/docs/latest/axes/cartesian/time.html#display-formats">http://www.chartjs.org/docs/latest/axes/cartesian/time.html#display-formats</a>
 *
 * @author SvenWirz
 */
public enum TimeFormatRound implements LowercaseEnum {
	DAY, MILLISECOND, SECOND, MINUTE, HOUR, WEEK, MONTH, QUARTER, YEAR;
}