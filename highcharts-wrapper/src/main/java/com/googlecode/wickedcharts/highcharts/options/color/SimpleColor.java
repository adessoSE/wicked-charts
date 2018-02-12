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
package com.googlecode.wickedcharts.highcharts.options.color;

import java.awt.Color;

/**
 * A simple {@link ColorReference} defined by a {@link Color} object.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class SimpleColor extends ColorReference {

	private Color color;

	private static final long serialVersionUID = 1L;

	public SimpleColor(final Color color) {
		this.color = color;
	}

	@Override
	protected ColorReference copy() {
		ColorReference copy = new SimpleColor(this.color);
		copy.setBrightness(getBrightness());
		return copy;
	}

	public Color getColor() {
		return this.color;
	}

	public SimpleColor setColor(final Color color) {
		this.color = color;
		return this;
	}

}
