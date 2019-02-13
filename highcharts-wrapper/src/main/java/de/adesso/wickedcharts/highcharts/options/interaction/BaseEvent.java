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
package de.adesso.wickedcharts.highcharts.options.interaction;

public class BaseEvent {

	private String javascriptChartName;

	/**
	 * Sets the name of the javascript variable holding the Highcharts "chart"
	 * object.
	 * 
	 * @param javascriptChartName
	 *          the name of the javascript variable holding the Highcharts "chart"
	 *          object.
	 */
	public void setJavascriptChartName(final String javascriptChartName) {
		this.javascriptChartName = javascriptChartName;
	}

	/**
	 * Returns the name of the javascript variable holding the Highcharts "chart"
	 * object. The name of this variable can be used to create custom javascript
	 * on the server side when an event is fired via AJAX. The so created
	 * javascript can then be executed on the client.
	 * 
	 * @return the name of the javascript variable holding the Highcharts "chart"
	 *         object.
	 * @see <a href="http://api.highcharts.com/highcharts#Chart">http://api.highcharts.com/highcharts#Chart</a>
	 */
	public String getJavascriptChartName() {
		return this.javascriptChartName;
	}

}
