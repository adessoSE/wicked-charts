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
package com.googlecode.wickedcharts.highcharts.options.series;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.googlecode.wickedcharts.highcharts.options.Center;
import com.googlecode.wickedcharts.highcharts.options.DataLabels;
import com.googlecode.wickedcharts.highcharts.options.GridLineDashStyle;
import com.googlecode.wickedcharts.highcharts.options.Marker;
import com.googlecode.wickedcharts.highcharts.options.PixelOrPercent;
import com.googlecode.wickedcharts.highcharts.options.PointPlacement;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.StatesChoice;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.color.ColorReference;
import com.googlecode.wickedcharts.highcharts.options.color.SimpleColor;

/**
 * Defines the configuration of the "series" option.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#series">http://api.highcharts.com/highcharts#series</a>
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public abstract class Series<D> implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private SeriesType type;

	private List<D> data;

	private Integer legendIndex;

	private String stack;

	private Integer xAxis;

	private Integer yAxis;

	private Marker marker;

	private PixelOrPercent size;

	private Boolean showInLegend;

	private DataLabels dataLabels;

	private ColorReference color;

	private Center center;

	private PixelOrPercent innerSize;

	private Number pointInterval;

	private Number pointStart;

	private PointPlacement pointPlacement;

	private Tooltip tooltip;

	private GridLineDashStyle dashStyle;

	private StatesChoice states;

	private Boolean enableMouseTracking;

	private Integer wickedChartsId;

	/**
	 * Sets the Wicked Charts specific ID for this Point.
	 */
	public void setWickedChartsId(Integer wickedChartsId) {
		this.wickedChartsId = wickedChartsId;
	}

	/**
	 * Retrieves the Wicked Charts specific ID for this Point.
	 */
	public Integer getWickedChartsId() {
		return wickedChartsId;
	}

	/**
	 * Adds a point to this series.
	 * 
	 * @param point
	 *          the point to add.
	 */
	public Series<D> addPoint(final D point) {
		if (this.data == null) {
			this.data = new ArrayList<D>();
		}
		this.data.add(point);
		return this;
	}

	public Center getCenter() {
		return this.center;
	}

	public ColorReference getColor() {
		return this.color;
	}

	public List<D> getData() {
		return this.data;
	}

	public DataLabels getDataLabels() {
		return this.dataLabels;
	}

	public PixelOrPercent getInnerSize() {
		return this.innerSize;
	}

	public Integer getLegendIndex() {
		return this.legendIndex;
	}

	public Marker getMarker() {
		return this.marker;
	}

	public String getName() {
		return this.name;
	}

	public Number getPointInterval() {
		return this.pointInterval;
	}

	public PointPlacement getPointPlacement() {
		return this.pointPlacement;
	}

	public Number getPointStart() {
		return this.pointStart;
	}

	public Boolean getShowInLegend() {
		return this.showInLegend;
	}

	public PixelOrPercent getSize() {
		return this.size;
	}

	public String getStack() {
		return this.stack;
	}

	public SeriesType getType() {
		return this.type;
	}

	public Integer getxAxis() {
		return this.xAxis;
	}

	public Integer getyAxis() {
		return this.yAxis;
	}

	public Series<D> setCenter(final Center center) {
		this.center = center;
		return this;
	}

	public Series<D> setColor(final Color color) {
		this.color = new SimpleColor(color);
		return this;
	}

	public Series<D> setColor(final ColorReference color) {
		this.color = color;
		return this;
	}

	public Series<D> setData(final D... data) {
		this.data = Arrays.asList(data);
		return this;
	}

	public Series<D> setData(final List<D> data) {
		this.data = data;
		return this;
	}

	public Series<D> setDataLabels(final DataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	public Series<D> setInnerSize(final PixelOrPercent innerSize) {
		this.innerSize = innerSize;
		return this;
	}

	public Series<D> setLegendIndex(final Integer legendIndex) {
		this.legendIndex = legendIndex;
		return this;
	}

	public Series<D> setMarker(final Marker marker) {
		this.marker = marker;
		return this;
	}

	public Series<D> setName(final String name) {
		this.name = name;
		return this;
	}

	public Series<D> setPointInterval(final Number pointInterval) {
		this.pointInterval = pointInterval;
		return this;
	}

	public Series<D> setPointPlacement(final PointPlacement pointPlacement) {
		this.pointPlacement = pointPlacement;
		return this;
	}

	public Series<D> setPointStart(final Number pointStart) {
		this.pointStart = pointStart;
		return this;
	}

	public Series<D> setShowInLegend(final Boolean showInLegend) {
		this.showInLegend = showInLegend;
		return this;
	}

	public Series<D> setSize(final PixelOrPercent size) {
		this.size = size;
		return this;
	}

	public Series<D> setStack(final String stack) {
		this.stack = stack;
		return this;
	}

	public Series<D> setType(final SeriesType type) {
		this.type = type;
		return this;
	}

	/**
	 * Zero-based index of the X-Axis this series should be connected to.
	 */
	public Series<D> setxAxis(final Integer xAxis) {
		this.xAxis = xAxis;
		return this;
	}

	/**
	 * Zero-based index of the Y-Axis this series should be connected to.
	 */
	public Series<D> setyAxis(final Integer yAxis) {
		this.yAxis = yAxis;
		return this;
	}

	public Series<D> setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
		return this;
	}

	public Tooltip getTooltip() {
		return tooltip;
	}

	public Series<D> setDashStyle(GridLineDashStyle dashStyle) {
		this.dashStyle = dashStyle;
		return this;
	}

	public GridLineDashStyle getDashStyle() {
		return dashStyle;
	}

	public Series<D> setStates(StatesChoice states) {
		this.states = states;
		return this;
	}

	public StatesChoice getStates() {
		return states;
	}

	public Series<D> setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
		return this;
	}

	public Boolean getEnableMouseTracking() {
		return enableMouseTracking;
	}

}
