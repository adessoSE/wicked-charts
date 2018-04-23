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
package de.adesso.wickedcharts.highcharts.options.button;

import java.io.Serializable;

/**
 * Options for configuring the "Reset Zoom" Button.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * @see <a
 *      href="http://api.highcharts.com/highcharts#chart.resetZoomButton">http://api.highcharts.com/highcharts#chart.resetZoomButton</a>
 * 
 */
public class Button implements Serializable {

	private Position position;

	private String relativeTo;

	private ButtonTheme theme;

	public Button setPosition(final Position position) {
		this.position = position;
		return this;
	}

	public Position getPosition() {
		return this.position;
	}

	public Button setRelativeTo(final String relativeTo) {
		this.relativeTo = relativeTo;
		return this;
	}

	public String getRelativeTo() {
		return this.relativeTo;
	}

	public Button setTheme(final ButtonTheme theme) {
		this.theme = theme;
		return this;
	}

	public ButtonTheme getTheme() {
		return this.theme;
	}

}
