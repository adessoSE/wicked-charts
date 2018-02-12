package com.googlecode.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import com.googlecode.wickedcharts.chartjs.chartoptions.colors.Color;

import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@Accessors(chain = true)
@lombok.Data
public class GridLines implements Serializable {
	private Boolean display;
	private Boolean drawBorder;
	private Boolean drawOnChartArea;
	private Boolean drawTicks;
	private Color zeroLineColor; // TODO: check if change from rgbaColor to Color affects output
}
