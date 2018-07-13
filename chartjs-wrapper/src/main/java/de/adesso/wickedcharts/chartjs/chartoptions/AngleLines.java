package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Defines the options for angled lines.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/axes/radial/linear.html#angle-line-options">http://www.chartjs.org/docs/latest/axes/radial/linear.html#angle-line-options</a>
 *
 * @author SvenWirz
 */
@Accessors(chain = true)
@lombok.Data
public class AngleLines implements Serializable{
	private static final long serialVersionUID = 1L;
	private Boolean display;
	private Color color;
	private Number lineWidth;

}
