package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.JsonValueEnum;

/**
 * 'default' : Uses a custom weighted cubic interpolation, which produces pleasant curves for all types of datasets.
 * 'monotone' : More suited to y = f(x) datasets : it preserves monotonicity (or piecewise monotonicity) of the dataset being interpolated, and ensures local extremums (if any) stay at input data points.
 * If left untouched (undefined), the global options.elements.line.cubicInterpolationMode property is used.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/charts/line.html#cubicinterpolationmode">http://www.chartjs.org/docs/latest/charts/line.html#cubicinterpolationmode</a>
 *
 * @author anedomansky
 * @author maximAtanasov
 */
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
