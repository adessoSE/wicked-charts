package de.adesso.wickedcharts.chartjs.chartoptions.colors;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * Defines an RGBA encoded color
 * @see <a href="http://www.chartjs.org/docs/latest/general/colors.html">http://www.chartjs.org/docs/latest/general/colors.html</a>
 *
 * @author SvenWirz
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class RgbaColor extends RgbColor implements Serializable {

	private float alpha;
	
	public RgbaColor(int red, int green, int blue, float alpha) {
		super(red, green, blue);
		this.alpha = alpha;
	}
}
