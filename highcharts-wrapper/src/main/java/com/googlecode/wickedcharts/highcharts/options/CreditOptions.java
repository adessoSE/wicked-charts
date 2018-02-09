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
 * Defines the configuration of the "credits" option.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#credits">http://api.highcharts.com/highcharts#credits</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class CreditOptions implements Serializable {

	private static final long serialVersionUID = 1L;

	private Boolean enabled;

	private String href;

	private String text;

	private CssStyle style;

	public Boolean getEnabled() {
		return this.enabled;
	}

	public String getHref() {
		return this.href;
	}

	public CssStyle getStyle() {
		return this.style;
	}

	public String getText() {
		return this.text;
	}

	public CreditOptions setEnabled(final Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	public CreditOptions setHref(final String href) {
		this.href = href;
		return this;
	}

	public CreditOptions setStyle(final CssStyle style) {
		this.style = style;
		return this;
	}

	public CreditOptions setText(final String text) {
		this.text = text;
		return this;
	}

}
