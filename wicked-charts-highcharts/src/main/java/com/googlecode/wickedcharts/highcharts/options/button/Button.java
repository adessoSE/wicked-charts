package com.googlecode.wickedcharts.highcharts.options.button;

import java.io.Serializable;

/**
 * Options for configuring the "Reset Zoom" Button.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * @see <a
 *      href="http://api.highcharts.com/highcharts#chart.resetZoomButton">http://api.highcharts.com/highcharts#chart.resetZoomButton</a>
 * 
 */
public class Button implements Serializable {

	private Position position;

	private String relativeTo;

	private ButtonTheme theme;

	public Button setPosition(final Position position) {
		this.position = position;
		return this;
	}

	public Position getPosition() {
		return this.position;
	}

	public Button setRelativeTo(final String relativeTo) {
		this.relativeTo = relativeTo;
		return this;
	}

	public String getRelativeTo() {
		return this.relativeTo;
	}

	public Button setTheme(final ButtonTheme theme) {
		this.theme = theme;
		return this;
	}

	public ButtonTheme getTheme() {
		return this.theme;
	}

}
