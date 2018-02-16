package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

/**
 * Contains attributes for the 'Title' option of a chart
 */

@Accessors(chain = true)
@lombok.Data
public class Title {
	private Boolean display;
	private String text;
}
