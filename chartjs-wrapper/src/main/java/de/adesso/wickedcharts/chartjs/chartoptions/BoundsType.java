package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.JsonValueEnum;

import java.io.Serializable;

/**
 * Defines the bounds property which controls the scale boundary strategy.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/axes/cartesian/time.html#scale-bounds">http://www.chartjs.org/docs/latest/axes/cartesian/time.html#scale-bounds</a>
 *
 * @author SvenWirz
 */
public enum BoundsType implements JsonValueEnum, Serializable {
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
