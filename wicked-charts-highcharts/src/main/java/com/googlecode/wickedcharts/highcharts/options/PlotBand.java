/**
 * Copyright 2012 Tom Hombergs (tom.hombergs@gmail.com)
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

import java.awt.Color;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.googlecode.wickedcharts.highcharts.options.color.ColorReference;
import com.googlecode.wickedcharts.highcharts.options.color.SimpleColor;

/**
 * Defines a colored band across a grid chart.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#Axis.plotBands">http://api.highcharts.com/highcharts#Axis.plotBands</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class PlotBand implements Serializable {

	private static final long serialVersionUID = 1L;

	private ColorReference color;

	@JsonIgnore
	private DummyOption events;

	private Number from;

	private Number to;

	private String id;

	private Labels label;

	private Integer zIndex;

	public ColorReference getColor() {
		return this.color;
	}

	public DummyOption getEvents() {
		return this.events;
	}

	public Number getFrom() {
		return this.from;
	}

	public String getId() {
		return this.id;
	}

	public Labels getLabel() {
		return this.label;
	}

	public Number getTo() {
		return this.to;
	}

	public Integer getzIndex() {
		return this.zIndex;
	}

	public PlotBand setColor(final Color color) {
		this.color = new SimpleColor(color);
		return this;
	}

	public PlotBand setColor(final ColorReference color) {
		this.color = color;
		return this;
	}

	public PlotBand setEvents(final DummyOption events) {
		this.events = events;
		return this;
	}

	public PlotBand setFrom(final Number from) {
		this.from = from;
		return this;
	}

	public PlotBand setId(final String id) {
		this.id = id;
		return this;
	}

	public PlotBand setLabel(final Labels label) {
		this.label = label;
		return this;
	}

	public PlotBand setTo(final Number to) {
		this.to = to;
		return this;
	}

	public PlotBand setzIndex(final Integer zIndex) {
		this.zIndex = zIndex;
		return this;
	}

}
