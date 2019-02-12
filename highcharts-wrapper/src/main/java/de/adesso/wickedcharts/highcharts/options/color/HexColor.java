/**
 *   Copyright 2012-2019 Wicked Charts (http://github.com/adessoAG/wicked-charts)
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
package de.adesso.wickedcharts.highcharts.options.color;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple {@link ColorReference} defined by a hex string.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class HexColor extends ColorReference {

	private static final long serialVersionUID = 1L;

	public static ColorReference fromString(final String color) {
		return new HexColor(color);
	}

	public static List<ColorReference> fromStrings(final String color1, final String... colors) {
		List<ColorReference> resultList = new ArrayList<ColorReference>();
		resultList.add(new HexColor(color1));
		for (String color : colors) {
			resultList.add(new HexColor(color));
		}
		return resultList;
	}

	private final String hexColor;

	/**
	 * Constructs a color reference by defining a hex color string.
	 * 
	 * @param hexColor
	 *          the hex color string (e.g. "#ffffff").
	 */
	public HexColor(final String hexColor) {
		this.hexColor = hexColor.toLowerCase();
		if (!hexColor.matches("^#[0-9a-fA-F]{6}$")) {
			throw new IllegalArgumentException("Invalid hex color format: " + hexColor
			    + ". A hex color must be of the format \"^#[0-9a-fA-F]{6}$\".");
		}
	}

	@Override
	protected ColorReference copy() {
		ColorReference copy = new HexColor(this.hexColor);
		copy.setBrightness(getBrightness());
		return copy;
	}

	public String getHexColor() {
		return this.hexColor;
	}

}
