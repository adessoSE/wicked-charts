/**
 *   Copyright 2012 Wicked Charts (http://wicked-charts.googlecode.com)
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

import com.googlecode.wickedcharts.highcharts.options.util.CssPropertyNameSanitizer;

/**
 * Option to allow CSS styles in a chart.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#chart.style">http://api.highcharts.com/highcharts#chart.style</a>
 * @author Matthias Balke <matthias.balke@gmail.com>
 * 
 */
public class CssStyle implements Serializable {

	private static final long serialVersionUID = 1L;

	private Map<String, String> properties;

	public CssStyle() {
	}

	public Map<String, String> getProperties() {
		if (this.properties == null) {
			return new HashMap<String, String>();
		} else {
			return this.properties;
		}
	}

	public String getProperty(final String key) {
		if (this.properties == null) {
			return null;
		} else {
			return this.properties.get(key);
		}
	}

	/**
	 * Sets a CSS property.
	 * 
	 * @param key
	 *          the name of the property. Note that hyphen notation ("-") is
	 *          automatically converted into camel case notation since the
	 *          property name is used as key in a JSON object. Highcharts will
	 *          evaluate it as if it were hyphen notation.
	 * @param value
	 *          the value of the CSS property.
	 * @return this for chaining.
	 */
	public CssStyle setProperty(final String key, final String value) {
		if (this.properties == null) {
			this.properties = new HashMap<String, String>();
		}
		CssPropertyNameSanitizer sanitizer = CssPropertyNameSanitizer.getInstance();
		this.properties.put(sanitizer.sanitizeCssPropertyName(key), value);
		return this;
	}

}
