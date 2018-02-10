package com.googlecode.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Scale {
	private Ticks ticks;
	private Boolean reverse;
}
