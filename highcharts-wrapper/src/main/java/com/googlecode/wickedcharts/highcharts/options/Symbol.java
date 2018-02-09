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
package com.googlecode.wickedcharts.highcharts.options;

import java.io.Serializable;

/**
 * Defines either a predefined symbol or a custom symbol represented by an URL.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#plotOptions.area.marker.symbol">http://api.highcharts.com/highcharts#plotOptions.area.marker.symbol</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Symbol implements Serializable {

	public enum PredefinedSymbol {

		CIRCLE("circle"),

		SQUARE("square"),

		DIAMOND("diamond"),

		TRIANGLE("triangle"),

		TRIANGLEDOWN("triangle-down");

		private final String code;

		private PredefinedSymbol(final String code) {
			this.code = code;
		}

		public String getCode() {
			return this.code;
		}
	}

	private static final long serialVersionUID = 1L;

	private PredefinedSymbol predefinedSymbol;

	private String url;

	public Symbol(final PredefinedSymbol predefinedSymbol) {
		this.predefinedSymbol = predefinedSymbol;
	}

	public Symbol(final String url) {
		this.url = url;

	}

	public PredefinedSymbol getPredefinedSymbol() {
		return this.predefinedSymbol;
	}

	public String getUrl() {
		return this.url;
	}

	public Symbol setPredefinedSymbol(final PredefinedSymbol predefinedSymbol) {
		this.predefinedSymbol = predefinedSymbol;
		return this;
	}

	public Symbol setUrl(final String url) {
		this.url = url;
		return this;
	}

}
