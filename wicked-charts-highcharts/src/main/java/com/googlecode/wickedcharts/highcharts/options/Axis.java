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
package com.googlecode.wickedcharts.highcharts.options;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.googlecode.wickedcharts.highcharts.options.color.ColorReference;
import com.googlecode.wickedcharts.highcharts.options.color.SimpleColor;

/**
 * Defines an Axis for a Highcharts chart.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#Axis">http://api.highcharts.com/highcharts#Axis</a>
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Axis implements Serializable {

	private static final long serialVersionUID = 1L;

	private AxisType type;

	private Title title;

	private List<String> categories;

	private Boolean allowDecimals;

	private ColorReference alternateGridColor;

	private DateTimeLabelFormat dateTimeLabelFormats;

	private Boolean endOnTick;

	@JsonIgnore
	private DummyOption events;

	private ColorReference gridLineColor;

	private GridLineDashStyle gridLineDashStyle;

	private Integer gridLineWidth;

	private String id;

	private Labels labels;

	private ColorReference lineColor;

	private Integer lineWidth;

	private Integer linkedTo;

	private Number max;

	private Float maxPadding;

	private Number min;

	private Float minPadding;

	private Integer minRange;

	private ColorReference minorGridLineColor;

	private GridLineDashStyle minorGridLineDashStyle;

	private Integer minorGridLineWidth;

	private ColorReference minorTickColor;

	private MinorTickInterval minorTickInterval;

	private Integer minorTickLength;

	private Integer minorTickWidth;

	private Integer offset;

	private Boolean opposite;

	private List<PlotBand> plotBands;

	private List<PlotLine> plotLines;

	private Boolean reversed;

	private Boolean showEmpty;

	private Boolean showFirstLabel;

	private Boolean showLastLabel;

	private Integer startOfWeek;

	private Boolean startOnTick;

	private ColorReference tickColor;

	private Float tickInterval;

	private Integer tickLength;

	private Integer tickPixelInterval;

	private TickPosition tickPosition;

	private Integer tickWidth;

	private TickmarkPlacement tickmarkPlacement;

	private Integer maxZoom;

	private StackLabels stackLabels;

	private TickPosition minorTickPosition;

	private GridlineInterpolation gridLineInterpolation;

	public Axis() {

	}

	public Axis(final AxisType type) {
		this.type = type;
	}

	public Boolean getAllowDecimals() {
		return this.allowDecimals;
	}

	public ColorReference getAlternateGridColor() {
		return this.alternateGridColor;
	}

	public List<String> getCategories() {
		return this.categories;
	}

	public DateTimeLabelFormat getDateTimeLabelFormats() {
		return this.dateTimeLabelFormats;
	}

	public Boolean getEndOnTick() {
		return this.endOnTick;
	}

	public DummyOption getEvents() {
		return this.events;
	}

	public ColorReference getGridLineColor() {
		return this.gridLineColor;
	}

	public GridLineDashStyle getGridLineDashStyle() {
		return this.gridLineDashStyle;
	}

	public Integer getGridLineWidth() {
		return this.gridLineWidth;
	}

	public String getId() {
		return this.id;
	}

	public Labels getLabels() {
		return this.labels;
	}

	public ColorReference getLineColor() {
		return this.lineColor;
	}

	public Integer getLineWidth() {
		return this.lineWidth;
	}

	public Integer getLinkedTo() {
		return this.linkedTo;
	}

	public Number getMax() {
		return this.max;
	}

	public Float getMaxPadding() {
		return this.maxPadding;
	}

	public Integer getMaxZoom() {
		return this.maxZoom;
	}

	public Number getMin() {
		return this.min;
	}

	public ColorReference getMinorGridLineColor() {
		return this.minorGridLineColor;
	}

	public GridLineDashStyle getMinorGridLineDashStyle() {
		return this.minorGridLineDashStyle;
	}

	public Integer getMinorGridLineWidth() {
		return this.minorGridLineWidth;
	}

	public ColorReference getMinorTickColor() {
		return this.minorTickColor;
	}

	public MinorTickInterval getMinorTickInterval() {
		return this.minorTickInterval;
	}

	public Integer getMinorTickLength() {
		return this.minorTickLength;
	}

	public Integer getMinorTickWidth() {
		return this.minorTickWidth;
	}

	public Float getMinPadding() {
		return this.minPadding;
	}

	public Integer getMinRange() {
		return this.minRange;
	}

	public Integer getOffset() {
		return this.offset;
	}

	public Boolean getOpposite() {
		return this.opposite;
	}

	public List<PlotBand> getPlotBands() {
		return this.plotBands;
	}

	public List<PlotLine> getPlotLines() {
		return this.plotLines;
	}

	public Boolean getReversed() {
		return this.reversed;
	}

	public Boolean getShowEmpty() {
		return this.showEmpty;
	}

	public Boolean getShowFirstLabel() {
		return this.showFirstLabel;
	}

	public Boolean getShowLastLabel() {
		return this.showLastLabel;
	}

	public StackLabels getStackLabels() {
		return this.stackLabels;
	}

	public Integer getStartOfWeek() {
		return this.startOfWeek;
	}

	public Boolean getStartOnTick() {
		return this.startOnTick;
	}

	public ColorReference getTickColor() {
		return this.tickColor;
	}

	public Float getTickInterval() {
		return this.tickInterval;
	}

	public Integer getTickLength() {
		return this.tickLength;
	}

	public TickmarkPlacement getTickmarkPlacement() {
		return this.tickmarkPlacement;
	}

	public Integer getTickPixelInterval() {
		return this.tickPixelInterval;
	}

	public TickPosition getTickPosition() {
		return this.tickPosition;
	}

	public Integer getTickWidth() {
		return this.tickWidth;
	}

	public Title getTitle() {
		return this.title;
	}

	public AxisType getType() {
		return this.type;
	}

	public Axis setAllowDecimals(final Boolean allowDecimals) {
		this.allowDecimals = allowDecimals;
		return this;
	}

	public Axis setAlternateGridColor(final Color color) {
		this.alternateGridColor = new SimpleColor(color);
		return this;
	}

	public Axis setAlternateGridColor(final ColorReference alternateGridColor) {
		this.alternateGridColor = alternateGridColor;
		return this;
	}

	public Axis setCategories(final List<String> categories) {
		this.categories = categories;
		return this;
	}

	public Axis setCategories(final String... categories) {
		this.categories = Arrays.asList(categories);
		return this;
	}

	public Axis setDateTimeLabelFormats(final DateTimeLabelFormat dateTimeLabelFormats) {
		this.dateTimeLabelFormats = dateTimeLabelFormats;
		return this;
	}

	public Axis setEndOnTick(final Boolean endOnTick) {
		this.endOnTick = endOnTick;
		return this;
	}

	public Axis setEvents(final DummyOption events) {
		this.events = events;
		return this;
	}

	public Axis setGridLineColor(final Color color) {
		this.gridLineColor = new SimpleColor(color);
		return this;
	}

	public Axis setGridLineColor(final ColorReference gridLineColor) {
		this.gridLineColor = gridLineColor;
		return this;
	}

	public Axis setGridLineDashStyle(final GridLineDashStyle gridLineDashStyle) {
		this.gridLineDashStyle = gridLineDashStyle;
		return this;
	}

	public Axis setGridLineWidth(final Integer gridLineWidth) {
		this.gridLineWidth = gridLineWidth;
		return this;
	}

	public Axis setId(final String id) {
		this.id = id;
		return this;
	}

	public Axis setLabels(final Labels labels) {
		this.labels = labels;
		return this;
	}

	public Axis setLineColor(final Color color) {
		this.lineColor = new SimpleColor(color);
		return this;
	}

	public Axis setLineColor(final ColorReference lineColor) {
		this.lineColor = lineColor;
		return this;
	}

	public Axis setLineWidth(final Integer lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	public Axis setLinkedTo(final Integer linkedTo) {
		this.linkedTo = linkedTo;
		return this;
	}

	public Axis setMax(final Number max) {
		this.max = max;
		return this;
	}

	public Axis setMaxPadding(final Float maxPadding) {
		this.maxPadding = maxPadding;
		return this;
	}

	public Axis setMaxZoom(final Integer maxZoom) {
		this.maxZoom = maxZoom;
		return this;
	}

	public Axis setMin(final Number min) {
		this.min = min;
		return this;
	}

	public Axis setMinorGridLineColor(final Color color) {
		this.minorGridLineColor = new SimpleColor(color);
		return this;
	}

	public Axis setMinorGridLineColor(final ColorReference minorGridLineColor) {
		this.minorGridLineColor = minorGridLineColor;
		return this;
	}

	public Axis setMinorGridLineDashStyle(final GridLineDashStyle minorGridLineDashStyle) {
		this.minorGridLineDashStyle = minorGridLineDashStyle;
		return this;
	}

	public Axis setMinorGridLineWidth(final Integer minorGridLineWidth) {
		this.minorGridLineWidth = minorGridLineWidth;
		return this;
	}

	public Axis setMinorTickColor(final Color color) {
		this.minorTickColor = new SimpleColor(color);
		return this;
	}

	public Axis setMinorTickColor(final ColorReference minorTickColor) {
		this.minorTickColor = minorTickColor;
		return this;
	}

	public Axis setMinorTickInterval(final MinorTickInterval minorTickInterval) {
		this.minorTickInterval = minorTickInterval;
		return this;
	}

	public Axis setMinorTickLength(final Integer minorTickLength) {
		this.minorTickLength = minorTickLength;
		return this;
	}

	public Axis setMinorTickWidth(final Integer minorTickWidth) {
		this.minorTickWidth = minorTickWidth;
		return this;
	}

	public Axis setMinPadding(final Float minPadding) {
		this.minPadding = minPadding;
		return this;
	}

	public Axis setMinRange(final Integer minRange) {
		this.minRange = minRange;
		return this;
	}

	public Axis setOffset(final Integer offset) {
		this.offset = offset;
		return this;
	}

	public Axis setOpposite(final Boolean opposite) {
		this.opposite = opposite;
		return this;
	}

	public Axis setPlotBands(final List<PlotBand> plotBands) {
		this.plotBands = plotBands;
		return this;
	}

	public Axis setPlotLines(final List<PlotLine> plotLines) {
		this.plotLines = plotLines;
		return this;
	}

	public Axis setReversed(final Boolean reversed) {
		this.reversed = reversed;
		return this;
	}

	public Axis setShowEmpty(final Boolean showEmpty) {
		this.showEmpty = showEmpty;
		return this;
	}

	public Axis setShowFirstLabel(final Boolean showFirstLabel) {
		this.showFirstLabel = showFirstLabel;
		return this;
	}

	public Axis setShowLastLabel(final Boolean showLastLabel) {
		this.showLastLabel = showLastLabel;
		return this;
	}

	public Axis setStackLabels(final StackLabels stackLabels) {
		this.stackLabels = stackLabels;
		return this;
	}

	public Axis setStartOfWeek(final Integer startOfWeek) {
		this.startOfWeek = startOfWeek;
		return this;
	}

	public Axis setStartOnTick(final Boolean startOnTick) {
		this.startOnTick = startOnTick;
		return this;
	}

	public Axis setTickColor(final Color color) {
		this.tickColor = new SimpleColor(color);
		return this;
	}

	public Axis setTickColor(final ColorReference tickColor) {
		this.tickColor = tickColor;
		return this;
	}

	public Axis setTickInterval(final Float tickInterval) {
		this.tickInterval = tickInterval;
		return this;
	}

	public Axis setTickLength(final Integer tickLength) {
		this.tickLength = tickLength;
		return this;
	}

	public Axis setTickmarkPlacement(final TickmarkPlacement tickmarkPlacement) {
		this.tickmarkPlacement = tickmarkPlacement;
		return this;
	}

	public Axis setTickPixelInterval(final Integer tickPixelInterval) {
		this.tickPixelInterval = tickPixelInterval;
		return this;
	}

	public Axis setTickPosition(final TickPosition tickPosition) {
		this.tickPosition = tickPosition;
		return this;
	}

	public Axis setTickWidth(final Integer tickWidth) {
		this.tickWidth = tickWidth;
		return this;
	}

	public Axis setTitle(final Title title) {
		this.title = title;
		return this;
	}

	public Axis setType(final AxisType type) {
		this.type = type;
		return this;
	}

	public Axis setMinorTickPosition(TickPosition minorTickPosition) {
		this.minorTickPosition = minorTickPosition;
		return this;
	}

	public TickPosition getMinorTickPosition() {
		return minorTickPosition;
	}

	public Axis addPlotBand(PlotBand plotBand) {
		if (this.plotBands == null) {
			this.plotBands = new ArrayList<PlotBand>();
		}
		this.plotBands.add(plotBand);
		return this;
	}

	public Axis addPlotLine(PlotLine plotLine) {
		if (this.plotLines == null) {
			this.plotLines = new ArrayList<PlotLine>();
		}
		this.plotLines.add(plotLine);
		return this;
	}

	public Axis setGridLineInterpolation(GridlineInterpolation gridLineInterpolation) {
		this.gridLineInterpolation = gridLineInterpolation;
		return this;
	}

	public GridlineInterpolation getGridLineInterpolation() {
		return gridLineInterpolation;
	}

}
