package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

/**
 * Defines the properties of elements.
 *
 */
@Accessors(chain = true)
@lombok.Data
public class Element {
	private Point point;
	private Line line;
}
