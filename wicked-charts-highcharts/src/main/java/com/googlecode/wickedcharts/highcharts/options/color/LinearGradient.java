/**
 *   Copyright 2012 Wicked Charts (http://wicked-charts.googlecode.com)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.googlecode.wickedcharts.highcharts.options.color;

import java.util.Arrays;
import java.util.List;

/**
 * A {@link ColorReference} defining a linear gradient with one or more changes
 * between colors.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class LinearGradient extends Gradient {

	public enum GradientDirection {
		HORIZONTAL, VERTICAL;
	}

	private static final long serialVersionUID = 1L;

	private final List<Number> linearGradient;

	/**
	 * Constructs a linear gradient with a predefined direction.
	 * 
	 * @param direction
	 *          the direction of the gradient.
	 */
	public LinearGradient(final GradientDirection direction) {
		switch (direction) {
			case HORIZONTAL:
				this.linearGradient = Arrays.asList(new Number[] { 0, 0, 0, 1 });
				break;
			case VERTICAL:
				this.linearGradient = Arrays.asList(new Number[] { 0, 0, 1, 0 });
				break;
			default:
				throw new IllegalArgumentException("Invalid GradientDirection: " + direction);
		}
	}

	private LinearGradient(final List<Number> linearGradient) {
		this.linearGradient = linearGradient;
	}

	/**
	 * Constructs a linear gradient with a custom direction. The direction is
	 * defined by a starting and ending point.
	 * 
	 * @param x1
	 *          x-axis percentage of the starting point of the gradient. Must be a
	 *          value between 0 and 1.
	 * @param y1
	 *          y-axis percentage of the starting point of the gradient. Must be a
	 *          value between 0 and 1.
	 * @param x2
	 *          x-axis percentage of the ending point of the gradient. Must be a
	 *          value between 0 and 1.
	 * @param y2
	 *          y-axis percentage of the ending point of the gradient. Must be a
	 *          value between 0 and 1.
	 */
	public LinearGradient(final Number x1, final Number y1, final Number x2, final Number y2) {
		this.linearGradient = Arrays.asList(new Number[] { x1, y1, x2, y2 });
	}

	@Override
	protected ColorReference copy() {
		LinearGradient copy = new LinearGradient(this.linearGradient);
		copy.setBrightness(getBrightness());
		copy.addStopsInternal(this.getStops());
		return copy;
	}

	public List<Number> getLinearGradient() {
		return this.linearGradient;
	}

}
