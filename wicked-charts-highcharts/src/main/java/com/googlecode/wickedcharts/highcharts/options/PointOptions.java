package com.googlecode.wickedcharts.highcharts.options;

import java.io.Serializable;

/**
 * Defines the configuration of the "point" option.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#plotOptions.pie.point">http://api.highcharts.com/highcharts#plotOptions.pie.point</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class PointOptions implements Serializable {

	private static final long serialVersionUID = 1L;

	private Events events;

	public Events getEvents() {
		return this.events;
	}

	public PointOptions setEvents(final Events events) {
		this.events = events;
		return this;
	}

}
