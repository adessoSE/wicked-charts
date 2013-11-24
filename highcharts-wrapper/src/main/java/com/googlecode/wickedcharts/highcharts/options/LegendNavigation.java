package com.googlecode.wickedcharts.highcharts.options;

import java.io.Serializable;

import com.googlecode.wickedcharts.highcharts.options.color.ColorReference;

/**
 *
 * @see <a href="http://api.highcharts.com/highcharts#legend.navigation">http://api.highcharts.com/highcharts#legend.navigation</a>
 * @author Bartłomiej Łopatka <bartlomiej.lopatka@gmail.com>
 *
 */
public class LegendNavigation implements Serializable {

	private static final long serialVersionUID = 1L;

	private ColorReference activeColor;
	
	private Boolean animation;
	
	private Integer arrowSize;
	
	private ColorReference inactiveColor;
	
	private CssStyle style;

	public LegendNavigation() {
	}

	public ColorReference getActiveColor() {
		return activeColor;
	}

	public LegendNavigation setActiveColor(ColorReference activeColor) {
		this.activeColor = activeColor;
		return this;
	}

	public Boolean getAnimation() {
		return animation;
	}

	public LegendNavigation setAnimation(Boolean animation) {
		this.animation = animation;
		return this;
	}

	public Integer getArrowSize() {
		return arrowSize;
	}

	public LegendNavigation setArrowSize(Integer arrowSize) {
		this.arrowSize = arrowSize;
		return this;
	}

	public ColorReference getInactiveColor() {
		return inactiveColor;
	}

	public LegendNavigation setInactiveColor(ColorReference inactiveColor) {
		this.inactiveColor = inactiveColor;
		return this;
	}

	public CssStyle getStyle() {
		return style;
	}

	public LegendNavigation setStyle(CssStyle style) {
		this.style = style;
		return this;
	}
	
}
