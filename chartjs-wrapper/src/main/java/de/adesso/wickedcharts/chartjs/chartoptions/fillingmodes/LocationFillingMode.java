package de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes;

import java.io.Serializable;

/**
 * Defines the the filling mode in the line element.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/charts/area.html">http://www.chartjs.org/docs/latest/charts/area.html</a>
 * @author SvenWirz
 */
public enum LocationFillingMode implements FillingModeLine, Serializable {
	ZERO("zero"),
	TOP("top"),
	BOTTOM("bottom");
	
	private String value;
	
	private LocationFillingMode(String value) {
		this.value = value;
	}
	
	@Override
	public String getValue() {
		return value;
	}

	@Override
	public Class<?> getReturnType() {
		return String.class;
	}
	
}
