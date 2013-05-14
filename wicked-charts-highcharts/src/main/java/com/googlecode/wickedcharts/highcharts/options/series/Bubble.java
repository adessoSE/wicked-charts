package com.googlecode.wickedcharts.highcharts.options.series;

import java.io.Serializable;

/**
 * A point in a bubble chart.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Bubble implements Serializable {

	private static final long serialVersionUID = 1L;

	private Number x;

	private Number y;

	private Number size;

	/**
	 * Constructs a new bubble in a bubble chart.
	 * 
	 * @param x
	 *          the x value of the center of the bubble
	 * @param y
	 *          the y value of the center of the bubble
	 * @param size
	 *          the size of the bubble
	 */
	public Bubble(Number x, Number y, Number size) {
		this.x = x;
		this.y = y;
		this.size = size;

	}

	public Number getX() {
		return x;
	}

	public void setX(Number x) {
		this.x = x;
	}

	public Number getY() {
		return y;
	}

	public void setY(Number y) {
		this.y = y;
	}

	public Number getSize() {
		return size;
	}

	public void setSize(Number size) {
		this.size = size;
	}

}
