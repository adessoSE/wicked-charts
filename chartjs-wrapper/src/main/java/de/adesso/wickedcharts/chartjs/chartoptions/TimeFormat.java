package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class TimeFormat implements Serializable{
	private static final long serialVersionUID = 1L;
	private String format;
	private String timeFormat;
	private String tooltipFormat;
	private TimeFormatRound round;
}
