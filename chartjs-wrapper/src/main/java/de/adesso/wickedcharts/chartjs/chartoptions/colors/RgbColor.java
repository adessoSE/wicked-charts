package de.adesso.wickedcharts.chartjs.chartoptions.colors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Defines an RGB encoded color
 *
 * @see <a href="http://www.chartjs.org/docs/latest/general/colors.html">http://www.chartjs.org/docs/latest/general/colors.html</a>
 *
 * @author SvenWirz
 */
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper=true)
public class RgbColor extends Color {
	private int red;
	private int green;
	private int blue;

}
