package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.JsonValueEnum;

import java.io.Serializable;

/**
 * An enum to define if a line is stepped or not.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/charts/line.html#stepped-line">http://www.chartjs.org/docs/latest/charts/line.html#stepped-line</a>
 *
 * @author anedomansky
 * @author maximAtanasov
 */
public enum SteppedLineValue implements JsonValueEnum, Serializable {
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
