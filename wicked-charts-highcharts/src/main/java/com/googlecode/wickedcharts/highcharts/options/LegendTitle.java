package com.googlecode.wickedcharts.highcharts.options;

import java.io.Serializable;

/**
 *
 * @see <a href="http://api.highcharts.com/highcharts#legend.title">http://api.highcharts.com/highcharts#legend.title</a>
 * @author Bartłomiej Łopatka <bartlomiej.lopatka@gmail.com>
 *
 */
public class LegendTitle implements Serializable {

	private static final long serialVersionUID = 1L;

	private CssStyle style;
	
	private String text;

	public LegendTitle() {
	}

	public LegendTitle(String text) {
		this.text = text;
	}

	public CssStyle getStyle() {
		return style;
	}

	public LegendTitle setStyle(CssStyle style) {
		this.style = style;
		return this;
	}

	public String getText() {
		return text;
	}

	public LegendTitle setText(String text) {
		this.text = text;
		return this;
	}
	
	
}
