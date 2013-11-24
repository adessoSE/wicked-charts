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
 * Defines the options for the navigation of a chart.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#navigation">http://api.highcharts.com/highcharts#navigation</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Navigation implements Serializable {

	private static final long serialVersionUID = 1L;

	private ButtonOptions buttonOptions;

	private CssStyle menuItemHoverStyle;

	private CssStyle menuItemStyle;

	private CssStyle menuStyle;

	public ButtonOptions getButtonOptions() {
		return this.buttonOptions;
	}

	public CssStyle getMenuItemHoverStyle() {
		return this.menuItemHoverStyle;
	}

	public CssStyle getMenuItemStyle() {
		return this.menuItemStyle;
	}

	public CssStyle getMenuStyle() {
		return this.menuStyle;
	}

	public Navigation setButtonOptions(final ButtonOptions buttonOptions) {
		this.buttonOptions = buttonOptions;
		return this;
	}

	public Navigation setMenuItemHoverStyle(final CssStyle menuItemHoverStyle) {
		this.menuItemHoverStyle = menuItemHoverStyle;
		return this;
	}

	public Navigation setMenuItemStyle(final CssStyle menuItemStyle) {
		this.menuItemStyle = menuItemStyle;
		return this;
	}

	public Navigation setMenuStyle(final CssStyle menuStyle) {
		this.menuStyle = menuStyle;
		return this;
	}

}
