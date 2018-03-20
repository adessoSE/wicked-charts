package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.JsonValueEnum;

public enum BorderCapStyle implements JsonValueEnum {
	BUTT("butt"),
	ROUND("round"),
	SQUARE("square");
	
	
	private String jsonValue;

	private BorderCapStyle(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@Override
	public String getJsonValue() {
		return jsonValue;
	}
}
