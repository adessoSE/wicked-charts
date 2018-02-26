package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.JsonValueEnum;

public enum PointStyle implements JsonValueEnum {
	CIRCLE("circle"),
	CROSS("cross"),
	CROSS_ROT("crossRot"),
	DASH("dash"),
	LINE("line"),
	RECT("rect"),
	RECT_ROUNDED("rectRounded"),
	RECT_ROT("rectRot"),
	STAR("star"),
	TRIANGLE("triangle");
	
	
	private String jsonValue;

	private PointStyle(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@Override
	public String getJsonValue() {
		return jsonValue;
	}
}
