package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import lombok.experimental.Accessors;

/**
 * Defines the filler plugin for area charts.
 *
 * @see <a
 *      href="http://www.chartjs.org/docs/latest/charts/area.html?h=filler">http://www.chartjs.org/docs/latest/charts/area.html?h=filler</a>
 *
 */
@Accessors(chain = true)
@lombok.Data
public class Filler implements Serializable{

	private static final long serialVersionUID = 1L;
	private Boolean propagate;
}
