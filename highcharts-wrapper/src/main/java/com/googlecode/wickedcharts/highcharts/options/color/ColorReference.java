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

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.googlecode.wickedcharts.highcharts.json.Nullable;

/**
 * Reference to a color used in a chart.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public abstract class ColorReference implements Serializable, Nullable {

	private static final long serialVersionUID = 1L;

	@JsonIgnore
	private Float brightness;

	/**
	 * Brightens this color by the amount given. Returns a copy of this color
	 * object not this object itself.
	 * 
	 * @param brightness
	 *          the amount to brighten (between 0 and 1).
	 * @return a copy of this color object, brightened by the given amount.
	 */
	public ColorReference brighten(final Float brightness) {
		ColorReference copy = copy();
		if (copy.brightness == null) {
			copy.brightness = brightness;
		} else {
			copy.brightness += brightness;
		}
		return copy;
	}

	protected abstract ColorReference copy();

	public Float getBrightness() {
		return this.brightness;
	}

	@Override
	public boolean isNull() {
		return false;
	}

	public ColorReference setBrightness(final Float brightness) {
		this.brightness = brightness;
		return this;
	}

}
