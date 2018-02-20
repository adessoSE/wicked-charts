package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import lombok.experimental.Accessors;

/**
 * Defines different properties for legend.
 *
 */
@Accessors(chain = true)
@lombok.Data
public class Legend implements Serializable{
	private static final long serialVersionUID = 1L;
	private Position position;
	private Boolean display;
	private LegendLabel labels;
}
