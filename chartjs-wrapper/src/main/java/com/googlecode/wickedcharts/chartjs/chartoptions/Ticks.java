package com.googlecode.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Ticks {
	private Integer suggestedMin;
	private Integer suggestedMax;
	private Boolean autoSkip;
	private Integer maxRotation;
	private Boolean beginAtZero;
	private Integer min;
	private Integer max;	
}



