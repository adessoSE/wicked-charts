package com.googlecode.wickedcharts.highcharts.options;

import java.io.Serializable;

import com.googlecode.wickedcharts.highcharts.options.color.ColorReference;

/**
 * Configuration of a single crosshair (x or y).
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#tooltip.crosshairs">http://api.highcharts.com/highcharts#tooltip.crosshairs</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Crosshair implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer width;

	private ColorReference color;

	private GridLineDashStyle dashStyle;

	private Integer zIndex;

	public ColorReference getColor() {
		return this.color;
	}

	public GridLineDashStyle getDashStyle() {
		return this.dashStyle;
	}

	public Integer getWidth() {
		return this.width;
	}

	public Integer getzIndex() {
		return this.zIndex;
	}

	public Crosshair setColor(final ColorReference color) {
		this.color = color;
		return this;
	}

	public Crosshair setDashStyle(final GridLineDashStyle dashStyle) {
		this.dashStyle = dashStyle;
		return this;
	}

	public Crosshair setWidth(final Integer width) {
		this.width = width;
		return this;
	}

	public Crosshair setzIndex(final Integer zIndex) {
		this.zIndex = zIndex;
		return this;
	}

}
