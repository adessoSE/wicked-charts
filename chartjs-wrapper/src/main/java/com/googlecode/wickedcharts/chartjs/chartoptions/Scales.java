package com.googlecode.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Scales {
	private AxesScale xAxes;
	private AxesScale yAxes;
}
