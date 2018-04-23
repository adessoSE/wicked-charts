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
package de.adesso.wickedcharts.highcharts.options;

import java.io.Serializable;

/**
 * Defines the configuration of the "point" option.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#plotOptions.pie.point">http://api.highcharts.com/highcharts#plotOptions.pie.point</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class PointOptions implements Serializable {

	private static final long serialVersionUID = 1L;

	private Events events;

	public Events getEvents() {
		return this.events;
	}

	public PointOptions setEvents(final Events events) {
		this.events = events;
		return this;
	}

}
