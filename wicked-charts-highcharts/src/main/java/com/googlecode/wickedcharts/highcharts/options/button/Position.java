package com.googlecode.wickedcharts.highcharts.options.button;

import java.io.Serializable;

import com.googlecode.wickedcharts.highcharts.options.HorizontalAlignment;
import com.googlecode.wickedcharts.highcharts.options.VerticalAlignment;

public class Position implements Serializable {

	private Number x;

	private Number y;

	private HorizontalAlignment align;

	private VerticalAlignment verticalAlign;

	public Number getX() {
		return this.x;
	}

	public Position setX(final Number x) {
		this.x = x;
		return this;
	}

	public Number getY() {
		return this.y;
	}

	public Position setY(final Number y) {
		this.y = y;
		return this;
	}

	public HorizontalAlignment getAlign() {
		return this.align;
	}

	public Position setAlign(final HorizontalAlignment align) {
		this.align = align;
		return this;
	}

	public VerticalAlignment getVerticalAlign() {
		return this.verticalAlign;
	}

	public Position setVerticalAlign(final VerticalAlignment verticalAlign) {
		this.verticalAlign = verticalAlign;
		return this;
	}

}
