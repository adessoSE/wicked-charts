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
 * A series containing simple numbers.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#series.type">http://api.highcharts.com/highcharts#series.type</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 */
public class SimpleSeries extends Series<Number> {

	private static final long serialVersionUID = 1L;

	@Override
	public List<Number> getData() {
		return super.getData();
	}

	@Override
	public SimpleSeries setData(final List<Number> data) {
		super.setData(data);
		return this;
	}

	@Override
	public SimpleSeries setData(final Number... data) {
		super.setData(Arrays.asList(data));
		return this;
	}

}
