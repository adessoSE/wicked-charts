/**
 *   Copyright 2012-2018 Wicked Charts (http://github.com/adessoAG/wicked-charts)
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
package de.adesso.wickedcharts.highcharts.options.series;

import java.io.Serializable;

/**
 * A coordinate with one X value and to Y values to display a range between the
 * two y values.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 * @param <X>
 *          Type of x coordinate
 * @param <Y1>
 *          Type of y1 coordinate
 * @param <Y2>
 *          Type of y2 coordinate
 */
public class RangeCoordinate<X, Y1, Y2> implements Serializable {

	private static final long serialVersionUID = 1L;

	private X x;

	private Y1 y1;

	private Y2 y2;

	public RangeCoordinate(final X x, final Y1 y1, final Y2 y2) {
		this.x = x;
		this.y2 = y2;
		this.y1 = y1;
	}

	public X getX() {
		return this.x;
	}

	public Y1 getY1() {
		return this.y1;
	}

	public Y2 getY2() {
		return this.y2;
	}

	public RangeCoordinate<X, Y1, Y2> setX(final X x) {
		this.x = x;
		return this;
	}

	public RangeCoordinate<X, Y1, Y2> setY1(final Y1 y1) {
		this.y1 = y1;
		return this;
	}

	public RangeCoordinate<X, Y1, Y2> setY2(final Y2 y2) {
		this.y2 = y2;
		return this;
	}

}
