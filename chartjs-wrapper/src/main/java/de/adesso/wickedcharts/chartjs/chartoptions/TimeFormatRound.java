package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.LowercaseEnum;

import java.io.Serializable;

/**
 * Defines the time display formats.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/axes/cartesian/time.html#display-formats">http://www.chartjs.org/docs/latest/axes/cartesian/time.html#display-formats</a>
 *
 * @author SvenWirz
 */
public enum TimeFormatRound implements LowercaseEnum, Serializable {
	DAY, MILLISECOND, SECOND, MINUTE, HOUR, WEEK, MONTH, QUARTER, YEAR;
}