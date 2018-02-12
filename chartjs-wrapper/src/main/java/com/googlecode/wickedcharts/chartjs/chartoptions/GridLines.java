package com.googlecode.wickedcharts.chartjs.chartoptions;

import com.googlecode.wickedcharts.chartjs.chartoptions.colors.Color;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class GridLines {
	private boolean drawOnChartArea;
	private Color zeroLineColor; // TODO: check if change from rgbaColor to Color affects output
}
