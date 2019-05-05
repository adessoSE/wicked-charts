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

/**
 * A {@link ColorReference} defined by RGBA values (red, green, blue, alpha).
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class RgbaColor extends ColorReference {

	private static final long serialVersionUID = 1L;

	private final Integer red;

	private final Integer green;

	private final Integer blue;

	private final Float alpha;

	/**
	 * Constructs a {@link RgbaColor} with RGB values. The alpha value is
	 * considered 1.
	 * 
	 * @param red
	 *          the red value (0-255)
	 * @param green
	 *          the green value (0-255)
	 * @param blue
	 *          the blue value (0-255)
	 */
	public RgbaColor(final Integer red, final Integer green, final Integer blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.alpha = 1f;
	}

	/**
	 * Constructs a {@link RgbaColor} with RGBA values.
	 * 
	 * @param red
	 *          the red value (0-255)
	 * @param green
	 *          the green value (0-255)
	 * @param blue
	 *          the blue value (0-255)
	 * @param alpha
	 *          the alpha value (0-1)
	 */
	public RgbaColor(final Integer red, final Integer green, final Integer blue, final Float alpha) {
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.alpha = alpha;
	}

	@Override
	protected ColorReference copy() {
		return new RgbaColor(this.red, this.green, this.blue, this.alpha);
	}

	public Float getAlpha() {
		return this.alpha;
	}

	public Integer getBlue() {
		return this.blue;
	}

	public Integer getGreen() {
		return this.green;
	}

	public Integer getRed() {
		return this.red;
	}

}
