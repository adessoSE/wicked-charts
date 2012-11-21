/**
 * Copyright 2012 Tom Hombergs (tom.hombergs@gmail.com)
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

import java.util.Arrays;
import java.util.List;

/**
 * A series containing of {@link Point}s.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#series.data">http://api.highcharts.com/highcharts#series.data</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class PointSeries extends Series<Point> {

	private static final long serialVersionUID = 1L;

	/**
	 * Adds a point with only a number.
	 * 
	 * @param y
	 *          the number.
	 */
	public PointSeries addNumberPoint(final Number y) {
		Point point = new Point(y);
		addPoint(point);
		return this;
	}

	/**
	 * Adds a list of point with only numbers.
	 * 
	 * @param values
	 *          the number values to add.
	 */
	public PointSeries addNumbers(final List<Number> values) {
		for (Number number : values) {
			addNumberPoint(number);
		}
		return this;
	}

	@Override
	public List<Point> getData() {
		return super.getData();
	}

	@Override
	public PointSeries setData(final List<Point> data) {
		super.setData(data);
		return this;
	}

	@Override
	public PointSeries setData(final Point... data) {
		super.setData(Arrays.asList(data));
		return this;
	}

	public PointSeries setNumberData(final List<Number> data) {
		for (Number number : data) {
			addPoint(new Point(number));
		}
		return this;
	}

	public PointSeries setNumberData(final Number... data) {
		for (Number number : data) {
			addPoint(new Point(number));
		}
		return this;
	}

}
