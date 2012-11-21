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
package com.googlecode.wickedcharts.highcharts.options.color;

/**
 * A {@link ColorReference} referencing a color managed by Highcharts.
 * Highcharts provides a set colors accessible by an index.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class HighchartsColor extends ColorReference {

	private static final long serialVersionUID = 1L;

	private Integer highchartsIndex;

	/**
	 * Constructs a {@link ColorReference} to a color managed by Highcharts.
	 * 
	 * @param highchartsIndex
	 *          the index under which Highcharts manages the wanted color.
	 */
	public HighchartsColor(final Integer highchartsIndex) {
		this.setHighchartsIndex(highchartsIndex);
	}

	@Override
	protected ColorReference copy() {
		ColorReference copy = new HighchartsColor(this.highchartsIndex);
		copy.setBrightness(getBrightness());
		return copy;
	}

	public Integer getHighchartsIndex() {
		return this.highchartsIndex;
	}

	public HighchartsColor setHighchartsIndex(final Integer highchartsIndex) {
		this.highchartsIndex = highchartsIndex;
		return this;
	}

}
