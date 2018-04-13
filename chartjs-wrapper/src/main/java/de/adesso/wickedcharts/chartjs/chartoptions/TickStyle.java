package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import lombok.experimental.Accessors;

/**
 * Defines the tick styles
 *
 * @see <a href="http://www.chartjs.org/docs/latest/axes/styling.html#minor-tick-configuration">http://www.chartjs.org/docs/latest/axes/styling.html#minor-tick-configuration</a>
 *
 * @author SvenWirz
 */

@Accessors(chain = true)
@lombok.Data
public class TickStyle implements Serializable{
	private static final long serialVersionUID = 1L;
	private FontStyle fontStyle;
	private Color fontColor;
	private Callback callback;
	private String fontFamily;
	private Number fontSize;
}
