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
package de.adesso.wickedcharts.highcharts.options.interaction;

import java.util.ArrayList;
import java.util.List;

/**
 * This event can be reacted upon server side when a {@link SelectionFunction}
 * has been added to a chart. The event is fired when the user selects (zooms) a
 * portion of the chart.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class SelectionEvent extends BaseEvent {

	protected List<Selection> xAxes = new ArrayList<Selection>();

	protected List<Selection> yAxes = new ArrayList<Selection>();

	/**
	 * Returns information about which portions of which x-axes the user has
	 * selected (zoomed).
	 */
	public List<Selection> getxAxes() {
		return this.xAxes;
	}

	/**
	 * Returns information about which portions of which y-axes the user has
	 * selected (zoomed).
	 */
	public List<Selection> getyAxes() {
		return this.yAxes;
	}

	/**
	 * Returns true if the XAxis Zoom has been reset to the original zoom factor.
	 * 
	 * @return true if the zoom was reset to the original zoom factor.
	 */
	public boolean isXAxisZoomReset() {
		return this.xAxes.isEmpty();
	}

	/**
	 * Returns true if the YAxis Zoom has been reset to the original zoom factor.
	 * 
	 * @return true if the zoom was reset to the original zoom factor.
	 */
	public boolean isYAxisZoomReset() {
		return this.yAxes.isEmpty();
	}
}
