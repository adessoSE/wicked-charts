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
public class InteractionEvent {

	private Options selectedChart;

	private Series<?> selectedSeries;

	private Point selectedPoint;

	/**
	 * Returns the {@link Options} of the chart which was interacted with.
	 * 
	 * @return the chart the user interacted with. This value must never be null.
	 */
	public Options getSelectedChart() {
		return selectedChart;
	}

	public void setSelectedChart(Options selectedChart) {
		this.selectedChart = selectedChart;
	}

	/**
	 * Returns the {@link Series} which was interacted with.
	 * 
	 * @return the {@link Series} the user interacted with. This value must never
	 *         be null.
	 */
	public Series<?> getSelectedSeries() {
		return selectedSeries;
	}

	public void setSelectedSeries(Series<?> selectedSeries) {
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
		return selectedPoint;
	}

	public void setSelectedPoint(Point selectedPoint) {
		this.selectedPoint = selectedPoint;
	}

}
