package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import lombok.experimental.Accessors;

/**
 * Defines all properties for points.
 *
 */
@Accessors(chain = true)
@lombok.Data
public class Point implements Serializable{
	private static final long serialVersionUID = 1L;
	private String pointStyle;
	private SimpleColor backgroundColor;
	private SimpleColor borderColor;
	private Integer borderWidth;
	private Number radius;
	private Number hitRadius;
	private Number hoverRadius;
	private Integer hoverBorderWidth;
}
