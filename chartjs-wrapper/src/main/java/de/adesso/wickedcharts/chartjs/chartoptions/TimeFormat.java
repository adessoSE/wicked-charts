package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

/**
 * Contains attributes for the timeFormat option
 */

@Accessors(chain = true)
@lombok.Data
public class TimeFormat {
	private String format;
	private String timeFormat;
	private String tooltipFormat;
	private TimeFormatRound round;
}
