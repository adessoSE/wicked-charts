package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.JsonValueEnum;

public enum CubicInterpolationMode implements JsonValueEnum {
	DEFAULT("default"),
	MONOTONE("monotone");
	
	
	private String jsonValue;

	private CubicInterpolationMode(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@Override
	public String getJsonValue() {
		return jsonValue;
	}
}
