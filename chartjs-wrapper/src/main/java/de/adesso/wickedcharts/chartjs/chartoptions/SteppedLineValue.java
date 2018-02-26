package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.JsonValueEnum;

public enum SteppedLineValue implements JsonValueEnum {
	BEFORE("before"),
	AFTER("after");
	
	
	private String jsonValue;

	private SteppedLineValue(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@Override
	public String getJsonValue() {
		return jsonValue;
	}
}
