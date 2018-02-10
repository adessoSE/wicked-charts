package com.googlecode.wickedcharts.chartjs.chartoptions;

import com.googlecode.wickedcharts.chartjs.chartoptions.colors.RgbaColor;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class GridLines {
	private boolean drawOnChartArea;
	private RgbaColor zeroLineColor;
}
