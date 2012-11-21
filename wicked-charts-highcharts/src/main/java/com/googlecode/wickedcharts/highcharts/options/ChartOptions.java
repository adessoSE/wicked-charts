/**
 *   Copyright 2012 Wicked Charts (http://wicked-charts.googlecode.com)
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
import java.util.List;

import com.googlecode.wickedcharts.highcharts.options.CssStyle;
import com.googlecode.wickedcharts.highcharts.options.Events;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.ZoomType;
import com.googlecode.wickedcharts.highcharts.options.color.ColorReference;
import com.googlecode.wickedcharts.highcharts.options.color.SimpleColor;

/**
 * Defines the configuration of the "chart" option.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#chart">http://api.highcharts.com/highcharts#chart</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 */
public class ChartOptions implements Serializable {

  private static final long serialVersionUID = 1L;

  private String renderTo;

  private Boolean animation;

  private ColorReference backgroundColor;

  private Integer height;

  private String className;

  private Boolean alignTicks;

  private ColorReference borderColor;

  private Integer borderRadius;

  private Integer borderWidth;

  private SeriesType type;

  private SeriesType defaultSeriesType;

  private Boolean ignoreHiddenSeries;

  private Boolean inverted;

  private List<Integer> margin;

  private Integer marginTop;

  private Integer marginRight;

  private Integer marginBottom;

  private Integer marginLeft;

  private ColorReference plotBackgroundColor;

  private String plotBackgroundImage;

  private ColorReference plotBorderColor;

  private Integer plotBorderWidth;

  private Boolean plotShadow;

  private Boolean reflow;

  // TODO: must be a shadow object instead of boolean. see
  // http://api.highcharts.com/highcharts#chart.shadow
  private Boolean shadow;

  private Boolean polar;

  private Boolean showAxes;

  private Integer spacingTop;

  private Integer spacingRight;

  private Integer spacingBottom;

  private Integer spacingLeft;

  private Integer width;

  private ZoomType zoomType;

  private CssStyle style;

  private Events events;

  public ChartOptions() {

  }

  public ChartOptions(final SeriesType chartType) {
    this.type = chartType;
  }

  public Boolean getAlignTicks() {
    return this.alignTicks;
  }

  public Boolean getAnimation() {
    return this.animation;
  }

  public ColorReference getBackgroundColor() {
    return this.backgroundColor;
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

  public String getClassName() {
    return this.className;
  }

  public SeriesType getDefaultSeriesType() {
    return this.defaultSeriesType;
  }

  public Integer getHeight() {
    return this.height;
  }

  public Boolean getIgnoreHiddenSeries() {
    return this.ignoreHiddenSeries;
  }

  public Boolean getInverted() {
    return this.inverted;
  }

  public Integer getMarginTop() {
    return this.marginTop;
  }

  public List<Integer> getMargin() {
    return this.margin;
  }

  public Integer getMarginBottom() {
    return this.marginBottom;
  }

  public Integer getMarginLeft() {
    return this.marginLeft;
  }

  public Integer getMarginRight() {
    return this.marginRight;
  }

  public ColorReference getPlotBackgroundColor() {
    return this.plotBackgroundColor;
  }

  public String getPlotBackgroundImage() {
    return this.plotBackgroundImage;
  }

  public ColorReference getPlotBorderColor() {
    return this.plotBorderColor;
  }

  public Integer getPlotBorderWidth() {
    return this.plotBorderWidth;
  }

  public Boolean getPlotShadow() {
    return this.plotShadow;
  }

  public Boolean getPolar() {
    return this.polar;
  }

  public Boolean getReflow() {
    return this.reflow;
  }

  public String getRenderTo() {
    return this.renderTo;
  }

  public Boolean getShadow() {
    return this.shadow;
  }

  public Boolean getShowAxes() {
    return this.showAxes;
  }

  public Integer getSpacingBottom() {
    return this.spacingBottom;
  }

  public Integer getSpacingLeft() {
    return this.spacingLeft;
  }

  public Integer getSpacingRight() {
    return this.spacingRight;
  }

  public Integer getSpacingTop() {
    return this.spacingTop;
  }

  public CssStyle getStyle() {
    return this.style;
  }

  public SeriesType getType() {
    return this.type;
  }

  public Integer getWidth() {
    return this.width;
  }

  public ZoomType getZoomType() {
    return this.zoomType;
  }

  public ChartOptions setAlignTicks(final Boolean alignTicks) {
    this.alignTicks = alignTicks;
    return this;
  }

  public ChartOptions setAnimation(final Boolean animation) {
    this.animation = animation;
    return this;
  }

  public ChartOptions setBackgroundColor(final Color color) {
    this.backgroundColor = new SimpleColor(color);
    return this;
  }

  public ChartOptions setBackgroundColor(final ColorReference backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  public ChartOptions setBorderColor(final Color color) {
    this.borderColor = new SimpleColor(color);
    return this;
  }

  public ChartOptions setBorderColor(final ColorReference borderColor) {
    this.borderColor = borderColor;
    return this;
  }

  public ChartOptions setBorderRadius(final Integer borderRadius) {
    this.borderRadius = borderRadius;
    return this;
  }

  public ChartOptions setBorderWidth(final Integer borderWidth) {
    this.borderWidth = borderWidth;
    return this;
  }

  public ChartOptions setClassName(final String className) {
    this.className = className;
    return this;
  }

  public ChartOptions setDefaultSeriesType(final SeriesType defaultSeriesType) {
    this.defaultSeriesType = defaultSeriesType;
    return this;
  }

  public ChartOptions setHeight(final Integer height) {
    this.height = height;
    return this;
  }

  public ChartOptions setIgnoreHiddenSeries(final Boolean ignoreHiddenSeries) {
    this.ignoreHiddenSeries = ignoreHiddenSeries;
    return this;
  }

  public ChartOptions setInverted(final Boolean inverted) {
    this.inverted = inverted;
    return this;
  }

  public ChartOptions setMarginTop(final Integer marginTop) {
    this.marginTop = marginTop;
    return this;
  }

  public ChartOptions setMargin(final List<Integer> margin) {
    this.margin = margin;
    return this;
  }

  public ChartOptions setMarginBottom(final Integer marginBottom) {
    this.marginBottom = marginBottom;
    return this;
  }

  public ChartOptions setMarginLeft(final Integer marginLeft) {
    this.marginLeft = marginLeft;
    return this;
  }

  public ChartOptions setMarginRight(final Integer marginRight) {
    this.marginRight = marginRight;
    return this;
  }

  public ChartOptions setPlotBackgroundColor(final Color color) {
    this.plotBackgroundColor = new SimpleColor(color);
    return this;
  }

  public ChartOptions setPlotBackgroundColor(final ColorReference plotBackgroundColor) {
    this.plotBackgroundColor = plotBackgroundColor;
    return this;
  }

  public ChartOptions setPlotBackgroundImage(final String plotBackgroundImage) {
    this.plotBackgroundImage = plotBackgroundImage;
    return this;
  }

  public ChartOptions setPlotBorderColor(final Color color) {
    this.plotBorderColor = new SimpleColor(color);
    return this;
  }

  public ChartOptions setPlotBorderColor(final ColorReference plotBorderColor) {
    this.plotBorderColor = plotBorderColor;
    return this;
  }

  public ChartOptions setPlotBorderWidth(final Integer plotBorderWidth) {
    this.plotBorderWidth = plotBorderWidth;
    return this;
  }

  public ChartOptions setPlotShadow(final Boolean plotShadow) {
    this.plotShadow = plotShadow;
    return this;
  }

  public ChartOptions setPolar(final Boolean polar) {
    this.polar = polar;
    return this;
  }

  public ChartOptions setReflow(final Boolean reflow) {
    this.reflow = reflow;
    return this;
  }

  public ChartOptions setRenderTo(final String renderTo) {
    this.renderTo = renderTo;
    return this;
  }

  public ChartOptions setShadow(final Boolean shadow) {
    this.shadow = shadow;
    return this;
  }

  public ChartOptions setShowAxes(final Boolean showAxes) {
    this.showAxes = showAxes;
    return this;
  }

  public ChartOptions setSpacingBottom(final Integer spacingBottom) {
    this.spacingBottom = spacingBottom;
    return this;
  }

  public ChartOptions setSpacingLeft(final Integer spacingLeft) {
    this.spacingLeft = spacingLeft;
    return this;
  }

  public ChartOptions setSpacingRight(final Integer spacingRight) {
    this.spacingRight = spacingRight;
    return this;
  }

  public ChartOptions setSpacingTop(final Integer spacingTop) {
    this.spacingTop = spacingTop;
    return this;
  }

  public ChartOptions setStyle(final CssStyle style) {
    this.style = style;
    return this;
  }

  public ChartOptions setType(final SeriesType type) {
    this.type = type;
    return this;
  }

  public ChartOptions setWidth(final Integer width) {
    this.width = width;
    return this;
  }

  public ChartOptions setZoomType(final ZoomType zoomType) {
    this.zoomType = zoomType;
    return this;
  }

  public void setEvents(Events events) {
    this.events = events;
  }

  public Events getEvents() {
    return events;
  }

}
