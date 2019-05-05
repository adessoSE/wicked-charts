/*
 *   Copyright 2012-2019 Wicked Charts (http://github.com/adessoAG/wicked-charts)
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
package de.adesso.wickedcharts.highcharts.options.interaction;

import de.adesso.wickedcharts.highcharts.options.Axis;

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
	 * @return the {@link Axis} object of the axis this selection was made on.
	 */
	public Axis getAxis() {
		return this.axis;
	}

	public void setAxis(final Axis axis) {
		this.axis = axis;
	}

	/**
	 * @return  the current minimum value of the axis. The minimum value may change
	 * during a selection / zooming event.
	 */
	public Number getMin() {
		return this.min;
	}

	public void setMin(final Number min) {
		this.min = min;
	}

	/**
	 * @return  the current maximum value of the axis. The maximum value may change
	 * during a selection / zooming event.
	 */
	public Number getMax() {
		return this.max;
	}

	public void setMax(final Number max) {
		this.max = max;
	}
}