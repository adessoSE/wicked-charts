package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.JsonValueEnum;

/**
 * An enum defining all point styles
 *
 * @see <a href="http://www.chartjs.org/docs/latest/configuration/elements.html#point-styles">http://www.chartjs.org/docs/latest/configuration/elements.html#point-styles</a>
 *
 * @author anedomansky
 * @author maximAtanasov
 */
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
