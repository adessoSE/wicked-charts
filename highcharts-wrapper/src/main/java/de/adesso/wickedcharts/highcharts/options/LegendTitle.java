/**
 *   Copyright 2012-2019 Wicked Charts (http://github.com/adessoAG/wicked-charts)
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
 *
 * @see <a href="http://api.highcharts.com/highcharts#legend.title">http://api.highcharts.com/highcharts#legend.title</a>
 * @author Bartlomiej Lopatka - bartlomiej.lopatka@gmail.com
 *
 */
public class LegendTitle implements Serializable {

	private static final long serialVersionUID = 1L;

	private CssStyle style;
	
	private String text;

	public LegendTitle() {
	}

	public LegendTitle(String text) {
		this.text = text;
	}

	public CssStyle getStyle() {
		return style;
	}

	public LegendTitle setStyle(CssStyle style) {
		this.style = style;
		return this;
	}

	public String getText() {
		return text;
	}

	public LegendTitle setText(String text) {
		this.text = text;
		return this;
	}
	
	
}
