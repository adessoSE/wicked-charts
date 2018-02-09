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
import java.util.HashMap;
import java.util.Map;

/**
 * Defines the date time label format for the axis.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#xAxis.dateTimeLabelFormats">http://api.highcharts.com/highcharts#xAxis.dateTimeLabelFormats</a>
 * 
 * @author Matthias Balke (matthias.balke@gmail.com)
 * 
 */
public class DateTimeLabelFormat implements Serializable {

	public enum DateTimeProperties {
		SECOND("second"),

		MINUTE("minute"),

		HOUR("hour"),

		DAY("day"),

		WEEK("week"),

		MONTH("month"),

		YEAR("year");

		private String code;

		private DateTimeProperties(final String code) {
			this.code = code;
		}

		public String toCode() {
			return this.code;
		}
	}

	private static final long serialVersionUID = 1L;

	private Map<DateTimeProperties, String> properties;

	public DateTimeLabelFormat() {
	}

	public Map<DateTimeProperties, String> getProperties() {
		if (this.properties == null) {
			return new HashMap<DateTimeProperties, String>();
		} else {
			return this.properties;
		}
	}

	public String getProperty(final DateTimeProperties key) {
		if (this.properties == null) {
			return null;
		} else {
			return this.properties.get(key);
		}
	}

	public DateTimeLabelFormat setProperty(final DateTimeProperties key, final String value) {
		if (this.properties == null) {
			this.properties = new HashMap<DateTimeProperties, String>();
		}
		this.properties.put(key, value);
		return this;
	}
}
