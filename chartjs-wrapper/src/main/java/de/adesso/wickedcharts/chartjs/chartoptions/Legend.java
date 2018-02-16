package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

/**
 * Defines different properties for legend.
 *
 */
@Accessors(chain = true)
@lombok.Data
public class Legend {
	private Position position;
	private Boolean display;
	private LegendLabel labels;
}
