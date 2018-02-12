package com.googlecode.wickedcharts.chartjs.chartoptions;

import com.googlecode.wickedcharts.chartjs.json.JsonValueEnum;

public enum ChartType implements JsonValueEnum {
	LINE("line"),
	BAR("bar"),
	HORIZONTAL_BAR("horizontalBar"),
	STACKED_BAR("bar"),
	PIE("pie"),
	RADAR("radar"),
	SCATTER("scatter"),
	DOUGHNUT("doughnut"),
	POLAR_AREA("polarArea")
	;
	
	private String jsonValue;

	private ChartType(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@Override
	public String getJsonValue() {
		return jsonValue;
	}
}
