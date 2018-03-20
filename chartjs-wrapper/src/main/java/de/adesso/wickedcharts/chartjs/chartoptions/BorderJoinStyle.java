package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.JsonValueEnum;

public enum BorderJoinStyle implements JsonValueEnum {
	BEVEL("bevel"),
	ROUND("round"),
	MITER("miter");
	
	
	private String jsonValue;

	private BorderJoinStyle(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@Override
	public String getJsonValue() {
		return jsonValue;
	}
}
