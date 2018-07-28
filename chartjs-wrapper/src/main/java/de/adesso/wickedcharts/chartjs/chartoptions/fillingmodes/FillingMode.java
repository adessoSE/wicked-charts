package de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes;

import java.io.Serializable;

/**
 * Defines the interface for the filling mode.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/charts/area.html">http://www.chartjs.org/docs/latest/charts/area.html</a>
 * @author SvenWirz
 */
public interface FillingMode {

	public Object getValue();
	public Class<?> getReturnType();
}
