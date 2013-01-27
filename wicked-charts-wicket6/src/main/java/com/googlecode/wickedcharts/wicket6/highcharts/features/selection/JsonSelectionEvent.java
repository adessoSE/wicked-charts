package com.googlecode.wickedcharts.wicket6.highcharts.features.selection;

import java.util.ArrayList;
import java.util.List;

/**
 * Helper class that is used as a container for deserialized JSON.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class JsonSelectionEvent {

	private final List<JsonSelection> xAxes = new ArrayList<JsonSelection>();

	private final List<JsonSelection> yAxes = new ArrayList<JsonSelection>();

	public List<JsonSelection> getxAxes() {
		return this.xAxes;
	}

	public List<JsonSelection> getyAxes() {
		return this.yAxes;
	}
}
