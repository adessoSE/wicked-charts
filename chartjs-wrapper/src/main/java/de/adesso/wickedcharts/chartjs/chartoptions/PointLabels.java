package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import lombok.experimental.Accessors;

/**
 * Used to configure the point labels that are shown on the perimeter of the scale.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/axes/radial/linear.html#point-label-options">http://www.chartjs.org/docs/latest/axes/radial/linear.html#point-label-options</a>
 *
 * @author SvenWirz
 */
@Accessors(chain = true)
@lombok.Data
public class PointLabels implements Serializable{
	private static final long serialVersionUID = 1L;
	private Callback callback;
	private Color fontColor;
	private String fontFamily;
	private Number fontSize;
	private FontStyle fontStyle;

}
