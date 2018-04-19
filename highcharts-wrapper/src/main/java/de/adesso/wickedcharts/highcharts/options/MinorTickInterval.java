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

/**
 * Defines the interval between two tick marks. Can be either a number or you
 * can let Highcharts decide the value (auto).
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class MinorTickInterval implements Serializable {

	private static final long serialVersionUID = 1L;

	private Number interval;

	private boolean auto;

	private boolean isNull;

	public MinorTickInterval() {

	}

	public boolean getAuto() {
		return this.auto;
	}

	public Number getInterval() {
		return this.interval;
	}

	public boolean isNull() {
		return this.isNull;
	}

	public MinorTickInterval setAuto(final boolean auto) {
		this.auto = auto;
		return this;
	}

	public MinorTickInterval setInterval(final Number interval) {
		this.interval = interval;
		return this;
	}

	/**
	 * Call this if you want to explicitly set the minorTickInterval to null to
	 * override a Highcharts default.
	 *
	 * @return a MinorTicksInterval object
	 */
	public MinorTickInterval setNull() {
		this.isNull = true;
		return this;
	}

}
