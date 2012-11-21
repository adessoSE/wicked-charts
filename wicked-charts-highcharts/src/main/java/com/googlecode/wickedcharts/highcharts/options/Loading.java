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
package com.googlecode.wickedcharts.highcharts.options;

import java.io.Serializable;

/**
 * Defines the "loading" option.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#loading">http://api.highcharts.com/highcharts#loading</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Loading implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer hideDuration;

	private CssStyle labelStyle;

	private Integer showDuration;

	private CssStyle style;

	public Integer getHideDuration() {
		return this.hideDuration;
	}

	public CssStyle getLabelStyle() {
		return this.labelStyle;
	}

	public Integer getShowDuration() {
		return this.showDuration;
	}

	public CssStyle getStyle() {
		return this.style;
	}

	public Loading setHideDuration(final Integer hideDuration) {
		this.hideDuration = hideDuration;
		return this;
	}

	public Loading setLabelStyle(final CssStyle labelStyle) {
		this.labelStyle = labelStyle;
		return this;
	}

	public Loading setShowDuration(final Integer showDuration) {
		this.showDuration = showDuration;
		return this;
	}

	public Loading setStyle(final CssStyle style) {
		this.style = style;
		return this;
	}

}
