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
package de.adesso.wickedcharts.highcharts.options.button;

import java.io.Serializable;

import de.adesso.wickedcharts.highcharts.options.HorizontalAlignment;
import de.adesso.wickedcharts.highcharts.options.VerticalAlignment;

public class Position implements Serializable {

	private Number x;

	private Number y;

	private HorizontalAlignment align;

	private VerticalAlignment verticalAlign;

	public Number getX() {
		return this.x;
	}

	public Position setX(final Number x) {
		this.x = x;
		return this;
	}

	public Number getY() {
		return this.y;
	}

	public Position setY(final Number y) {
		this.y = y;
		return this;
	}

	public HorizontalAlignment getAlign() {
		return this.align;
	}

	public Position setAlign(final HorizontalAlignment align) {
		this.align = align;
		return this;
	}

	public VerticalAlignment getVerticalAlign() {
		return this.verticalAlign;
	}

	public Position setVerticalAlign(final VerticalAlignment verticalAlign) {
		this.verticalAlign = verticalAlign;
		return this;
	}

}
