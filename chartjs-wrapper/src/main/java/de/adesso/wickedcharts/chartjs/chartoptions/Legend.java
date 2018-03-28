package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import lombok.experimental.Accessors;

/**
 * Displays data about the datasets.
 *
 * @see <a
 *      href="http://www.chartjs.org/docs/latest/configuration/legend.html?h=legend">http://www.chartjs.org/docs/latest/configuration/legend.html?h=legend</a>
 *
 */
@Accessors(chain = true)
@lombok.Data
public class Legend implements Serializable{
	private static final long serialVersionUID = 1L;
	private Position position;
	private Boolean display;
	private LegendLabel labels;
	private Boolean fullWidth;
	private Callback onClick;
	private Callback onHover;
	private Boolean reverse;
}
