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
 * 
 * @author Matthias Balke (matthias.balke@gmail.com)
 * 
 * @param <T>
 *          Type of x coordinate
 * @param <U>
 *          Type of y coordinate
 */
public class Coordinate<T, U> implements Serializable {

	private static final long serialVersionUID = 1L;

	private T x;

	private U y;

	public Coordinate(final T x, final U y) {
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return this.x;
	}

	public U getY() {
		return this.y;
	}

	public Coordinate<T, U> setX(final T x) {
		this.x = x;
		return this;
	}

	public Coordinate<T, U> setY(final U y) {
		this.y = y;
		return this;
	}

}
