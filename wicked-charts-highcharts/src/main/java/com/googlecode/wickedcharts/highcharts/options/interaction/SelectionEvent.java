package com.googlecode.wickedcharts.highcharts.options.interaction;

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
public class SelectionEvent {

	private final List<Selection> xAxes = new ArrayList<Selection>();

	private final List<Selection> yAxes = new ArrayList<Selection>();

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

}
