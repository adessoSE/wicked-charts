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

import com.googlecode.wickedcharts.highcharts.options.color.ColorReference;
import com.googlecode.wickedcharts.highcharts.options.color.SimpleColor;

/**
 * Defines the configuration of the "dataLabels" option.
 * 
 * @see <a href=
 *      "http://api.highcharts.com/highcharts#plotOptions.column.dataLabels</a>
 *      and others
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 */
public class DataLabels implements Serializable {

	private static final long serialVersionUID = 1L;

	private HorizontalAlignment align;

	private ColorReference backgroundColor;

	private ColorReference borderColor;

	private Integer borderRadius;

	private Integer borderWidth;

	private ColorReference color;

	private Boolean enabled;

	private Function formatter;

	private Overflow overflow;

	private Integer padding;

	private Integer rotation;

	private Boolean shadow;

	private CssStyle style;

	private Integer x;

	private Integer y;

	private Integer distance;

	private ColorReference connectorColor;

	/**
	 * Empty constructor.
	 */
	public DataLabels() {

	}

	/**
	 * Convenience constructor.
	 */
	public DataLabels(final Boolean enabled) {
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

	public ColorReference getColor() {
		return this.color;
	}

	public ColorReference getConnectorColor() {
		return this.connectorColor;
	}

	public Integer getDistance() {
		return this.distance;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public Function getFormatter() {
		return this.formatter;
	}

	public Overflow getOverflow() {
		return this.overflow;
	}

	public Integer getPadding() {
		return this.padding;
	}

	public Integer getRotation() {
		return this.rotation;
	}

	public Boolean getShadow() {
		return this.shadow;
	}

	public CssStyle getStyle() {
		return this.style;
	}

	public Integer getBorderWidth() {
		return this.borderWidth;
	}

	public Integer getX() {
		return this.x;
	}

	public Integer getY() {
		return this.y;
	}

	public DataLabels setAlign(final HorizontalAlignment align) {
		this.align = align;
		return this;
	}

	public DataLabels setBackgroundColor(final Color color) {
		this.backgroundColor = new SimpleColor(color);
		return this;
	}

	public DataLabels setBackgroundColor(final ColorReference backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	public DataLabels setBorderColor(final Color color) {
		this.borderColor = new SimpleColor(color);
		return this;
	}

	public DataLabels setBorderColor(final ColorReference borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	public DataLabels setBorderRadius(final Integer borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}

	public DataLabels setColor(final Color color) {
		this.color = new SimpleColor(color);
		return this;
	}

	public DataLabels setColor(final ColorReference color) {
		this.color = color;
		return this;
	}

	public DataLabels setConnectorColor(final ColorReference connectorColor) {
		this.connectorColor = connectorColor;
		return this;
	}

	public DataLabels setDistance(final Integer distance) {
		this.distance = distance;
		return this;
	}

	public DataLabels setEnabled(final Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	public DataLabels setFormatter(final Function formatter) {
		this.formatter = formatter;
		return this;
	}

	public DataLabels setOverflow(final Overflow overflow) {
		this.overflow = overflow;
		return this;
	}

	public DataLabels setPadding(final Integer padding) {
		this.padding = padding;
		return this;
	}

	public DataLabels setRotation(final Integer rotation) {
		this.rotation = rotation;
		return this;
	}

	public DataLabels setShadow(final Boolean shadow) {
		this.shadow = shadow;
		return this;
	}

	public DataLabels setStyle(final CssStyle style) {
		this.style = style;
		return this;
	}

	public DataLabels setBorderWidth(final Integer vorderWidth) {
		this.borderWidth = vorderWidth;
		return this;
	}

	public DataLabels setX(final Integer x) {
		this.x = x;
		return this;
	}

	public DataLabels setY(final Integer y) {
		this.y = y;
		return this;
	}

}
