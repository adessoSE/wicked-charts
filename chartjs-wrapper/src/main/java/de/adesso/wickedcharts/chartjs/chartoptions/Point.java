package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import lombok.experimental.Accessors;

/**
 * Represents the points in a line chart or a bubble chart.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/configuration/elements.html#point-configuration">http://www.chartjs.org/docs/latest/configuration/elements.html#point-configuration</a>
 *
 * @author SvenWirz
 * @author anedomansky
 * @author maximAtanasov
 */
@Accessors(chain = true)
@lombok.Data
public class Point implements Serializable{
	private static final long serialVersionUID = 1L;
	private PointStyle pointStyle;
	private SimpleColor backgroundColor;
	private SimpleColor borderColor;
	private Integer borderWidth;
	private Number radius;
	private Number hitRadius;
	private Number hoverRadius;
	private Integer hoverBorderWidth;
}
