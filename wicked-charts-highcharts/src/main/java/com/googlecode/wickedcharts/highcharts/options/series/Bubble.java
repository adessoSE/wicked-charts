/**
 *   Copyright 2012-2013 Wicked Charts (http://wicked-charts.googlecode.com)
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
