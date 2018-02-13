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
package de.adesso.wickedcharts.highcharts.options;

import java.awt.*;
import java.io.Serializable;
import java.util.List;

import de.adesso.wickedcharts.highcharts.options.color.ColorReference;
import de.adesso.wickedcharts.highcharts.options.color.SimpleColor;

/**
 * Defines the configuration of the "plotOptions" option.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * @see <a
 * href="http://api.highcharts.com/highcharts#plotOptions">http://api.highcharts.com/highcharts#plotOptions</a>
 */
public class PlotOptions implements Serializable {

    private static final long serialVersionUID = 1L;

    private PixelOrPercent neckWidth;

    private PixelOrPercent neckHeight;

    private Boolean allowPointSelect;

    private Boolean animation;

    private ColorReference borderColor;

    private Integer borderRadius;

    private Integer borderWidth;

    private ColorReference color;

    private List<ColorReference> colors;

    private Boolean colorByPoint;

    private Integer cropThreshold;

    private Cursor cursor;

    private DataLabels dataLabels;

    private Boolean enableMouseTracking;

    private Events events;

    private Float groupPadding;

    private String id;

    private Integer minPointLength;

    private PointOptions point;

    private Integer pointInterval;

    private Float pointPadding;

    private Float maxPointWidth;

    private Long pointStart;

    private Integer pointWidth;

    private Boolean selected;

    private Boolean shadow;

    private Boolean showCheckbox;

    private Boolean showInLegend;

    private Stacking stacking;

    private PlotOptionsStateChoice states;

    private Boolean stickyTracking;

    private Tooltip tooltip;

    private Integer turboThreshold;

    private Boolean visible;

    private Integer zIndex;

    private Boolean connectNulls;

    private GridLineDashStyle dashStyle;

    private ColorReference fillColor;

    private Float fillOpacity;

    private ColorReference lineColor;

    private Integer lineWidth;

    private Marker marker;

    private Integer threshold;

    private Boolean trackByArea;

    private Boolean step;

    private Center center;

    private PixelOrPercent innerSize;

    private PixelOrPercent size;

    private Integer slicedOffset;

    private PointPlacement pointPlacement;

    private Integer medianWidth;

    private Integer whiskerWidth;

    private Integer whiskerLength;

    private Integer stemWidth;

    public PixelOrPercent getNeckWidth() {
        return neckWidth;
    }

    public PixelOrPercent getNeckHeight() {
        return neckHeight;
    }

    public Boolean getAllowPointSelect() {
        return this.allowPointSelect;
    }

    public Boolean getAnimation() {
        return this.animation;
    }

    public ColorReference getBorderColor() {
        return this.borderColor;
    }

    public Integer getBorderRadius() {
        return this.borderRadius;
    }

    public Integer getBorderWidth() {
        return this.borderWidth;
    }

    public Center getCenter() {
        return this.center;
    }

    public ColorReference getColor() {
        return this.color;
    }

    public Boolean getColorByPoint() {
        return this.colorByPoint;
    }

    public Boolean getConnectNulls() {
        return this.connectNulls;
    }

    public Integer getCropThreshold() {
        return this.cropThreshold;
    }

    public Cursor getCursor() {
        return this.cursor;
    }

    public GridLineDashStyle getDashStyle() {
        return this.dashStyle;
    }

    public DataLabels getDataLabels() {
        return this.dataLabels;
    }

    public Boolean getEnableMouseTracking() {
        return this.enableMouseTracking;
    }

    public Events getEvents() {
        return this.events;
    }

    public ColorReference getFillColor() {
        return this.fillColor;
    }

    public Float getFillOpacity() {
        return this.fillOpacity;
    }

    public Float getGroupPadding() {
        return this.groupPadding;
    }

    public String getId() {
        return this.id;
    }

    public PixelOrPercent getInnerSize() {
        return this.innerSize;
    }

    public ColorReference getLineColor() {
        return this.lineColor;
    }

    public Integer getLineWidth() {
        return this.lineWidth;
    }

    public Marker getMarker() {
        return this.marker;
    }

    public Integer getMinPointLength() {
        return this.minPointLength;
    }

    public PointOptions getPoint() {
        return this.point;
    }

    public Integer getPointInterval() {
        return this.pointInterval;
    }

    public Float getPointPadding() {
        return this.pointPadding;
    }

    public Float getMaxPointWidth() {
        return this.maxPointWidth;
    }

    public PointPlacement getPointPlacement() {
        return this.pointPlacement;
    }

    public Long getPointStart() {
        return this.pointStart;
    }

    public Integer getPointWidth() {
        return this.pointWidth;
    }

    public Boolean getSelected() {
        return this.selected;
    }

    public Boolean getShadow() {
        return this.shadow;
    }

    public Boolean getShowCheckbox() {
        return this.showCheckbox;
    }

    public Boolean getShowInLegend() {
        return this.showInLegend;
    }

    public PixelOrPercent getSize() {
        return this.size;
    }

    public Integer getSlicedOffset() {
        return this.slicedOffset;
    }

    public Stacking getStacking() {
        return this.stacking;
    }

    public PlotOptionsStateChoice getStates() {
        return this.states;
    }

    public Boolean getStep() {
        return this.step;
    }

    public Boolean getStickyTracking() {
        return this.stickyTracking;
    }

    public Integer getThreshold() {
        return this.threshold;
    }

    public Tooltip getTooltip() {
        return this.tooltip;
    }

    public Boolean getTrackByArea() {
        return this.trackByArea;
    }

    public Integer getTurboThreshold() {
        return this.turboThreshold;
    }

    public Boolean getVisible() {
        return this.visible;
    }

    public Integer getzIndex() {
        return this.zIndex;
    }

    public PlotOptions setNeckWidth(PixelOrPercent neckWidth) {
        this.neckWidth = neckWidth;
        return this;
    }

    public PlotOptions setNeckHeight(PixelOrPercent neckHeight) {
        this.neckHeight = neckHeight;
        return this;
    }

    public PlotOptions setAllowPointSelect(final Boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public PlotOptions setAnimation(final Boolean animation) {
        this.animation = animation;
        return this;
    }

    public PlotOptions setBorderColor(final Color color) {
        this.borderColor = new SimpleColor(color);
        return this;
    }

    public PlotOptions setBorderColor(final ColorReference borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public PlotOptions setBorderRadius(final Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public PlotOptions setBorderWidth(final Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public PlotOptions setCenter(final Center center) {
        this.center = center;
        return this;
    }

    public PlotOptions setColor(final Color color) {
        this.color = new SimpleColor(color);
        return this;
    }

    public PlotOptions setColor(final ColorReference color) {
        this.color = color;
        return this;
    }

    public PlotOptions setColorByPoint(final Boolean colorByPoint) {
        this.colorByPoint = colorByPoint;
        return this;
    }

    public PlotOptions setConnectNulls(final Boolean connectNulls) {
        this.connectNulls = connectNulls;
        return this;
    }

    public PlotOptions setCropThreshold(final Integer cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public PlotOptions setCursor(final Cursor cursor) {
        this.cursor = cursor;
        return this;
    }

    public PlotOptions setDashStyle(final GridLineDashStyle dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public PlotOptions setDataLabels(final DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public PlotOptions setEnableMouseTracking(final Boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public PlotOptions setEvents(final Events events) {
        this.events = events;
        return this;
    }

    public PlotOptions setFillColor(final Color color) {
        this.fillColor = new SimpleColor(color);
        return this;
    }

    public PlotOptions setFillColor(final ColorReference fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public PlotOptions setFillOpacity(final Float fillOpacity) {
        this.fillOpacity = fillOpacity;
        return this;
    }

    public PlotOptions setGroupPadding(final Float groupPadding) {
        this.groupPadding = groupPadding;
        return this;
    }

    public PlotOptions setId(final String id) {
        this.id = id;
        return this;
    }

    public PlotOptions setInnerSize(final PixelOrPercent innerSize) {
        this.innerSize = innerSize;
        return this;
    }

    public PlotOptions setLineColor(final Color color) {
        this.lineColor = new SimpleColor(color);
        return this;
    }

    public PlotOptions setLineColor(final ColorReference lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public PlotOptions setLineWidth(final Integer lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public PlotOptions setMarker(final Marker marker) {
        this.marker = marker;
        return this;
    }

    public PlotOptions setMinPointLength(final Integer minPointLength) {
        this.minPointLength = minPointLength;
        return this;
    }

    public PlotOptions setPoint(final PointOptions point) {
        this.point = point;
        return this;
    }

    public PlotOptions setPointInterval(final Integer pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public PlotOptions setPointPadding(final Float pointPadding) {
        this.pointPadding = pointPadding;
        return this;
    }

    public PlotOptions setMaxPointWidth(final Float maxPointWidth){
        this.maxPointWidth = maxPointWidth;
        return this;
    }

    public PlotOptions setPointPlacement(final PointPlacement pointPlacement) {
        this.pointPlacement = pointPlacement;
        return this;
    }

    public PlotOptions setPointStart(final Long pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public PlotOptions setPointWidth(final Integer pointWidth) {
        this.pointWidth = pointWidth;
        return this;
    }

    public PlotOptions setSelected(final Boolean selected) {
        this.selected = selected;
        return this;
    }

    public PlotOptions setShadow(final Boolean shadow) {
        this.shadow = shadow;
        return this;
    }

    public PlotOptions setShowCheckbox(final Boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public PlotOptions setShowInLegend(final Boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public PlotOptions setSize(final PixelOrPercent size) {
        this.size = size;
        return this;
    }

    public PlotOptions setSlicedOffset(final Integer slicedOffset) {
        this.slicedOffset = slicedOffset;
        return this;
    }

    public PlotOptions setStacking(final Stacking stacking) {
        this.stacking = stacking;
        return this;
    }

    public PlotOptions setStates(final PlotOptionsStateChoice states) {
        this.states = states;
        return this;
    }

    public PlotOptions setStep(final Boolean step) {
        this.step = step;
        return this;
    }

    public PlotOptions setStickyTracking(final Boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public PlotOptions setThreshold(final Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    public PlotOptions setTooltip(final Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public PlotOptions setTrackByArea(final Boolean trackByArea) {
        this.trackByArea = trackByArea;
        return this;
    }

    public PlotOptions setTurboThreshold(final Integer turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public PlotOptions setVisible(final Boolean visible) {
        this.visible = visible;
        return this;
    }

    public PlotOptions setzIndex(final Integer zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public Integer getMedianWidth() {
        return medianWidth;
    }

    public PlotOptions setMedianWidth(Integer medianWidth) {
        this.medianWidth = medianWidth;
        return this;
    }

    public Integer getWhiskerWidth() {
        return whiskerWidth;
    }

    public PlotOptions setWhiskerWidth(Integer whiskerWidth) {
        this.whiskerWidth = whiskerWidth;
        return this;
    }

    public Integer getStemWidth() {
        return stemWidth;
    }

    public PlotOptions setStemWidth(Integer stemWidth) {
        this.stemWidth = stemWidth;
        return this;
    }

    public List<ColorReference> getColors() {
        return colors;
    }

    public PlotOptions setColors(List<ColorReference> colors) {
        this.colors = colors;
        return this;
    }

    public Integer getWhiskerLength() {
        return whiskerLength;
    }

    public PlotOptions setWhiskerLength(Integer whiskerLength) {
        this.whiskerLength = whiskerLength;
        return this;
    }

}
