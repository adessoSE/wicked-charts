package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class TimeFormat {
	private String timeFormat;
	private String tooltipFormat;
}
