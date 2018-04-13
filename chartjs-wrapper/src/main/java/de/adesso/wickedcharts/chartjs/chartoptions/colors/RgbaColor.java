package de.adesso.wickedcharts.chartjs.chartoptions.colors;

import lombok.EqualsAndHashCode;

/**
 * Defines an RGBA encoded color
 * @see <a href="http://www.chartjs.org/docs/latest/general/colors.html">http://www.chartjs.org/docs/latest/general/colors.html</a>
 *
 * @author SvenWirz
 */
@lombok.Data
@EqualsAndHashCode(callSuper=false)
public class RgbaColor extends RgbColor {

	private float alpha;
	
	public RgbaColor(int red, int green, int blue, float alpha) {
		super(red, green, blue);
		this.alpha = alpha;
	}
}
