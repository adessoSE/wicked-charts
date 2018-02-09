package com.googlecode.wickedcharts.chartjs;

import com.googlecode.wickedcharts.chartjs.chartoptions.ChartType;
import com.googlecode.wickedcharts.chartjs.chartoptions.Data;
import com.googlecode.wickedcharts.chartjs.chartoptions.Options;

import lombok.experimental.Accessors;


@Accessors(chain = true)
@lombok.Data
public class ChartConfiguration {
	private ChartType type;
	private Data data;
	private Options options;
}
