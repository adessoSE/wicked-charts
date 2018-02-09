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

import com.googlecode.wickedcharts.highcharts.options.color.ColorReference;
import com.googlecode.wickedcharts.highcharts.options.color.SimpleColor;

import java.awt.*;
import java.io.Serializable;

/**
 * Defines the configuration of the "legend" option.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * @see <a
 * href="http://api.highcharts.com/highcharts#legend">http://api.highcharts.com/highcharts#legend</a>
 */
public class Legend implements Serializable {

    private static final long serialVersionUID = 1L;

    private HorizontalAlignment align;

    private ColorReference backgroundColor;

    private ColorReference borderColor;

    private Integer borderRadius;

    private Integer borderWidth;

    private Boolean enabled;

    private Boolean floating;

    private Integer lineHeight;

    private Integer margin;

    private Boolean reversed;

    private Boolean rtl;

    private Boolean shadow;

    private VerticalAlignment verticalAlign;

    private Integer width;

    private Integer x;

    private Integer y;

    private Integer itemDistance;

    private LegendLayout layout;

    private CssStyle itemStyle;

    private CssStyle itemHoverStyle;

    private CssStyle itemHiddenStyle;

    private Integer itemMarginBottom;

    private Integer itemMarginTop;

    private Integer itemWidth;

    private String labelFormat;

    private Function labelFormatter;

    private Integer maxHeight;

    private Integer padding;

    private CssStyle style;

    private Integer symbolPadding;

    private Integer symbolWidth;

    private Integer symbolHeight;

    private LegendTitle title;

    private LegendNavigation navigation;

    private Boolean useHTML = false;

    public Legend() {

    }

    public Legend(final Boolean enabled) {
        this.enabled = enabled;
    }

    public HorizontalAlignment getAlign() {
        return this.align;
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

    public Boolean getEnabled() {
        return this.enabled;
    }

    public Boolean getFloating() {
        return this.floating;
    }

    public CssStyle getItemHiddenStyle() {
        return this.itemHiddenStyle;
    }

    public CssStyle getItemHoverStyle() {
        return this.itemHoverStyle;
    }

    public CssStyle getItemStyle() {
        return this.itemStyle;
    }

    public LegendLayout getLayout() {
        return this.layout;
    }

    public Integer getLineHeight() {
        return this.lineHeight;
    }

    public Integer getMargin() {
        return this.margin;
    }

    public Boolean getReversed() {
        return this.reversed;
    }

    public Boolean getRtl() {
        return this.rtl;
    }

    public Boolean getShadow() {
        return this.shadow;
    }

    public VerticalAlignment getVerticalAlign() {
        return this.verticalAlign;
    }

    public Integer getWidth() {
        return this.width;
    }

    public Integer getX() {
        return this.x;
    }

    public Integer getY() {
        return this.y;
    }

    public Legend setAlign(final HorizontalAlignment align) {
        this.align = align;
        return this;
    }

    public Legend setBackgroundColor(final Color color) {
        this.backgroundColor = new SimpleColor(color);
        return this;
    }

    public Legend setBackgroundColor(final ColorReference backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public Legend setBorderColor(final Color color) {
        this.borderColor = new SimpleColor(color);
        return this;
    }

    public Legend setBorderColor(final ColorReference borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Legend setBorderRadius(final Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public Legend setBorderWidth(final Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public Legend setEnabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Legend setFloating(final Boolean floating) {
        this.floating = floating;
        return this;
    }

    public Legend setItemHiddenStyle(final CssStyle itemHiddenStyle) {
        this.itemHiddenStyle = itemHiddenStyle;
        return this;
    }

    public Legend setItemHoverStyle(final CssStyle itemHoverStyle) {
        this.itemHoverStyle = itemHoverStyle;
        return this;
    }

    public Legend setItemStyle(final CssStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    public Legend setLayout(final LegendLayout layout) {
        this.layout = layout;
        return this;
    }

    public Legend setLineHeight(final Integer lineHeight) {
        this.lineHeight = lineHeight;
        return this;
    }

    public Legend setMargin(final Integer margin) {
        this.margin = margin;
        return this;
    }

    public Legend setReversed(final Boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    public Legend setRtl(final Boolean rtl) {
        this.rtl = rtl;
        return this;
    }

    public Legend setShadow(final Boolean shadow) {
        this.shadow = shadow;
        return this;
    }

    public Legend setVerticalAlign(final VerticalAlignment verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public Legend setWidth(final Integer width) {
        this.width = width;
        return this;
    }

    public Legend setX(final Integer x) {
        this.x = x;
        return this;
    }

    public Legend setY(final Integer y) {
        this.y = y;
        return this;
    }

    public Integer getSymbolPadding() {
        return symbolPadding;
    }

    public Legend setSymbolPadding(Integer symbolPadding) {
        this.symbolPadding = symbolPadding;
        return this;
    }

    public Integer getSymbolWidth() {
        return symbolWidth;
    }

    public Legend setSymbolWidth(Integer symbolWidth) {
        this.symbolWidth = symbolWidth;
        return this;
    }

    public Integer getSymbolHeight() {
        return symbolHeight;
    }

    public Legend setSymbolHeight(Integer symbolHeight) {
        this.symbolHeight = symbolHeight;
        return this;
    }

    public Integer getItemMarginBottom() {
        return itemMarginBottom;
    }

    public Legend setItemMarginBottom(Integer itemMarginBottom) {
        this.itemMarginBottom = itemMarginBottom;
        return this;
    }

    public Integer getItemMarginTop() {
        return itemMarginTop;
    }

    public Legend setItemMarginTop(Integer itemMarginTop) {
        this.itemMarginTop = itemMarginTop;
        return this;
    }

    public Integer getItemWidth() {
        return itemWidth;
    }

    public Legend setItemWidth(Integer itemWidth) {
        this.itemWidth = itemWidth;
        return this;
    }

    public String getLabelFormat() {
        return labelFormat;
    }

    public Legend setLabelFormat(String labelFormat) {
        this.labelFormat = labelFormat;
        return this;
    }

    public Function getLabelFormatter() {
        return labelFormatter;
    }

    public Legend setLabelFormatter(Function labelFormatter) {
        this.labelFormatter = labelFormatter;
        return this;
    }

    public Integer getMaxHeight() {
        return maxHeight;
    }

    public Legend setMaxHeight(Integer maxHeight) {
        this.maxHeight = maxHeight;
        return this;
    }

    public Integer getPadding() {
        return padding;
    }

    public Legend setPadding(Integer padding) {
        this.padding = padding;
        return this;
    }

    public CssStyle getStyle() {
        return style;
    }

    public Legend setStyle(CssStyle style) {
        this.style = style;
        return this;
    }

    public LegendTitle getTitle() {
        return title;
    }

    public Legend setTitle(LegendTitle title) {
        this.title = title;
        return this;
    }

    public LegendNavigation getNavigation() {
        return navigation;
    }

    public Legend setNavigation(LegendNavigation navigation) {
        this.navigation = navigation;
        return this;
    }

    public Boolean getUseHTML() {
        return useHTML;
    }

    public Legend setUseHTML(Boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    public Integer getItemDistance() {
        return itemDistance;
    }

    public void setItemDistance(Integer itemDistance) {
        this.itemDistance = itemDistance;
    }

}
