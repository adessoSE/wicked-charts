package com.googlecode.wickedcharts.chartjs.chartoptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class AxesScale {
	private Boolean display;
	private ScaleLabel scaleLabel;
	private Boolean stacked;
	private String type;
	private String distribution;
	private Time time;
}
