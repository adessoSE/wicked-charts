package com.googlecode.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class AxesScale {
	private Boolean display;
	private ScaleLabel scaleLabel;
	private Boolean stacked;
	private String id;
	private String position;
	private String type;
	private GridLines gridLines;
}
