package com.googlecode.wickedcharts.chartjs.chartoptions;

import com.googlecode.wickedcharts.chartjs.json.JsonValueEnum;

public enum ChartType implements JsonValueEnum {
	LINE("line"),
	BAR("bar"),
	HORIZONTAL_BAR("horizontalBar"),
	PIE("pie");
	
	private String jsonValue;

	private ChartType(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@Override
	public String getJsonValue() {
		return jsonValue;
	}
}
