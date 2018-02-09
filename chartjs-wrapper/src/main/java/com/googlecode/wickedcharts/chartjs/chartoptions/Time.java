package com.googlecode.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Time {
	private String format;
	private String round;
	private String unit;
	private int unitStepSize;
	private String tooltipFormat;
	private TimeDisplayFormats displayFormats;
}
