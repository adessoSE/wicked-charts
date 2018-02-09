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
package com.googlecode.wickedcharts.highcharts.options;

import java.io.Serializable;

/**
 * Defines the location pf a pie chart
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#plotOptions.pie.center">http://api.highcharts.com/highcharts#plotOptions.pie.center</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Center implements Serializable {

	public enum Unit {

		PERCENT,

		PIXELS;
	}

	private static final long serialVersionUID = 1L;

	private final int x;

	private final int y;

	private final Unit unit;;

	public Center(final int x, final int y, final Unit unit) {
		this.x = x;
		this.y = y;
		this.unit = unit;
	}

	public Unit getUnit() {
		return this.unit;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

}
