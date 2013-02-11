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
package com.googlecode.wickedcharts.highcharts.options.interaction;

import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.series.Point;
import com.googlecode.wickedcharts.highcharts.options.series.Series;

/**
 * This Event contains information about which Point or which series has been
 * interacted with.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class InteractionEvent extends BaseEvent {

	private Options selectedChart;

	private Series<?> selectedSeries;

	private Point selectedPoint;

	/**
	 * Returns the {@link Options} of the chart which was interacted with.
	 * 
	 * @return the chart the user interacted with. This value must never be null.
	 */
	public Options getSelectedChart() {
		return this.selectedChart;
	}

	public void setSelectedChart(final Options selectedChart) {
		this.selectedChart = selectedChart;
	}

	/**
	 * Returns the {@link Series} which was interacted with.
	 * 
	 * @return the {@link Series} the user interacted with. This value must never
	 *         be null.
	 */
	public Series<?> getSelectedSeries() {
		return this.selectedSeries;
	}

	public void setSelectedSeries(final Series<?> selectedSeries) {
		this.selectedSeries = selectedSeries;
	}

	/**
	 * Returns the {@link Point} which was interacted with.
	 * 
	 * @return the {@link Point} the user interacted with. This value may be null
	 *         if the user interacted with a {@link Series} and not directly with
	 *         a {@link Point}.
	 */
	public Point getSelectedPoint() {
		return this.selectedPoint;
	}

	public void setSelectedPoint(final Point selectedPoint) {
		this.selectedPoint = selectedPoint;
	}

}
