package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Defines the padding for the layout.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/configuration/layout.html?h=layout">http://www.chartjs.org/docs/latest/configuration/layout.html?h=layout</a>
 *
 * @author SvenWirz
 */
@Accessors(chain = true)
@lombok.Data
public class Layout implements Serializable {
	private Padding padding;
}
