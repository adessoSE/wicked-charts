package com.googlecode.wickedcharts.highcharts.options.color;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * {@link RadialGradient} color for chart objects.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class RadialGradient extends Gradient {

	private class RadialGradientCoordinates implements Serializable {

		private static final long serialVersionUID = 1L;

		private Number cx;

		private Number cy;

		private Number r;

		@SuppressWarnings("unused")
		public Number getCx() {
			return this.cx;
		}

		@SuppressWarnings("unused")
		public Number getCy() {
			return this.cy;
		}

		@SuppressWarnings("unused")
		public Number getR() {
			return this.r;
		}

	}

	private static final long serialVersionUID = 1L;

	private RadialGradientCoordinates radialGradient = new RadialGradientCoordinates();

	@Override
	protected ColorReference copy() {
		RadialGradient copy = new RadialGradient();
		copy.radialGradient = this.radialGradient;
		copy.setBrightness(getBrightness());
		copy.addStopsInternal(this.getStops());
		return copy;
	}

	@JsonIgnore
	public Number getCx() {
		return this.radialGradient.cx;
	}

	@JsonIgnore
	public Number getCy() {
		return this.radialGradient.cy;
	}

	@JsonIgnore
	public Number getR() {
		return this.radialGradient.r;
	}

	public RadialGradientCoordinates getRadialGradient() {
		return this.radialGradient;
	}

	/**
	 * Sets the horizontal coordinate of the center of the gradient.
	 * 
	 * @param cx
	 *          percentage of the width where to display the center of the
	 *          gradient. Must be a value between 0 and 1. 0 = left. 1 = right.
	 * @return this {@link RadialGradient} object for chaining.
	 */
	public RadialGradient setCx(final Number cx) {
		this.radialGradient.cx = cx;
		return this;
	}

	/**
	 * Sets the vertical coordinate of the center of the gradient.
	 * 
	 * @param cx
	 *          percentage of the heigth where to display the center of the
	 *          gradient. Must be a value between 0 and 1. 0 = top. 1 = bottom.
	 * @return this {@link RadialGradient} object for chaining.
	 */
	public RadialGradient setCy(final Number cy) {
		this.radialGradient.cy = cy;
		return this;
	}

	/**
	 * Sets the radius (= size) of the gradient.
	 * 
	 * @param r
	 *          percentage of the size of the object containing the gradient. Must
	 *          be a value between 0 and 1. 0 = small. 1 = spans the whole object.
	 * @return this {@link RadialGradient} object for chaining.
	 */
	public RadialGradient setR(final Number r) {
		this.radialGradient.r = r;
		return this;
	}

}
