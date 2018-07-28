package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.JsonValueEnum;

import java.io.Serializable;

/**
 * Determines how the end points of every element are drawn.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineCap">https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineCap</a>
 *
 * @author anedomansky
 * @author maximAtanasov
 */
public enum BorderCapStyle implements JsonValueEnum, Serializable {
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
