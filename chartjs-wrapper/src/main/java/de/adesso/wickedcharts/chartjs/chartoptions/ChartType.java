package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.JsonValueEnum;

import java.io.Serializable;

/**
 * Defines the type of the chart.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/developers/charts.html?h=charttype">http://www.chartjs.org/docs/latest/developers/charts.html?h=charttype</a>
 *
 * @author SvenWirz
 * @author anedomansky
 * @author maximAtanasov
 */
public enum ChartType implements JsonValueEnum, Serializable {
	LINE("line"),
	BAR("bar"),
	HORIZONTAL_BAR("horizontalBar"),
	STACKED_BAR("bar"),
	PIE("pie"),
	RADAR("radar"),
	SCATTER("scatter"),
	DOUGHNUT("doughnut"),
	POLAR_AREA("polarArea"),
	BUBBLE("bubble");
	
	private String jsonValue;

	private ChartType(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@Override
	public String getJsonValue() {
		return jsonValue;
	}
}
