package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.JsonValueEnum;

public enum BoundsType implements JsonValueEnum{
	DATA("data"),
	TICKS("ticks");
	
	private String jsonValue;

	private BoundsType(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@Override
	public String getJsonValue() {
		return jsonValue;
	}

}
