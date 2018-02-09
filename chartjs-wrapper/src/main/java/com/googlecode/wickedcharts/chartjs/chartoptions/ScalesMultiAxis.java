package com.googlecode.wickedcharts.chartjs.chartoptions;

import java.util.List;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class ScalesMultiAxis {
	private List<AxesScale> yAxes;

}
