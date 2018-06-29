package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Defines the scale used in the radar chart
 *
 * @see <a href="http://www.chartjs.org/docs/latest/charts/radar.html#scale-options">http://www.chartjs.org/docs/latest/charts/radar.html#scale-options</a>
 *
 * @author SvenWirz
 */
@Accessors(chain = true)
@lombok.Data
public class Scale implements Serializable{
	private static final long serialVersionUID = 1L;
	private Ticks ticks;
	private Boolean reverse;
}
