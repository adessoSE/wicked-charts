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
package com.googlecode.wickedcharts.highcharts.options;

/**
 * Defines an X-Axis for a Highcharts chart.
 * 
 * <p/>
 * DEPRECATED: use {@link Axis} instead.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#Axis">http://api.highcharts.com/highcharts#Axis</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
@Deprecated
public class XAxis extends Axis {

	private static final long serialVersionUID = 1L;

	public XAxis() {

	}

	public XAxis(final AxisType type) {
		super(type);
	}

}
