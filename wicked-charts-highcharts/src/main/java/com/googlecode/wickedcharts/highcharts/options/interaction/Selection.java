package com.googlecode.wickedcharts.highcharts.options.interaction;

import com.googlecode.wickedcharts.highcharts.options.Axis;

/**
 * Contains information about which portion of an axis the user has selected
 * when he zoomed in or out of a chart.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Selection {

	private Axis axis;

	private Number min;

	private Number max;

	/**
	 * Returns the {@link Axis} object of the axis this selection was made on.
	 */
	public Axis getAxis() {
		return this.axis;
	}

	public void setAxis(final Axis axis) {
		this.axis = axis;
	}

	/**
	 * Returns the current minimum value of the axis. The minimum value may change
	 * during a selection / zooming event.
	 */
	public Number getMin() {
		return this.min;
	}

	public void setMin(final Number min) {
		this.min = min;
	}

	/**
	 * Returns the current maximum value of the axis. The maximum value may change
	 * during a selection / zooming event.
	 */
	public Number getMax() {
		return this.max;
	}

	public void setMax(final Number max) {
		this.max = max;
	}
}