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

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract parent class for Gradient ColorReferences.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public abstract class Gradient extends ColorReference {

	private static final long serialVersionUID = 1L;

	private final List<List<Object>> stops = new ArrayList<List<Object>>();

	public Gradient() {
		super();
	}

	public Gradient addStop(final Number percentage, final ColorReference color) {
		List<Object> stopList = new ArrayList<Object>();
		stopList.add(percentage);
		stopList.add(color);
		this.getStops().add(stopList);
		return this;
	}

	protected Gradient addStopsInternal(final List<List<Object>> stops) {
		this.getStops().addAll(stops);
		return this;
	}

	@Override
	public ColorReference brighten(final Float brightness) {
		Gradient copy = (Gradient) copy();
		for (List<Object> stop : copy.stops) {
			ColorReference color = (ColorReference) stop.get(1);
			Float newBrightness = color.getBrightness();
			if (newBrightness == null) {
				newBrightness = brightness;
			} else {
				newBrightness += brightness;
			}
			color.setBrightness(newBrightness);
		}
		return copy;
	}

	public List<List<Object>> getStops() {
		return this.stops;
	}

}