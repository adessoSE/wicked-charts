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

import de.adesso.wickedcharts.highcharts.options.color.ColorReference;

/**
 * Configuration of a single crosshair (x or y).
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#tooltip.crosshairs">http://api.highcharts.com/highcharts#tooltip.crosshairs</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Crosshair implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer width;

	private ColorReference color;

	private GridLineDashStyle dashStyle;

	private Integer zIndex;

	public ColorReference getColor() {
		return this.color;
	}

	public GridLineDashStyle getDashStyle() {
		return this.dashStyle;
	}

	public Integer getWidth() {
		return this.width;
	}

	public Integer getzIndex() {
		return this.zIndex;
	}

	public Crosshair setColor(final ColorReference color) {
		this.color = color;
		return this;
	}

	public Crosshair setDashStyle(final GridLineDashStyle dashStyle) {
		this.dashStyle = dashStyle;
		return this;
	}

	public Crosshair setWidth(final Integer width) {
		this.width = width;
		return this;
	}

	public Crosshair setzIndex(final Integer zIndex) {
		this.zIndex = zIndex;
		return this;
	}

}
