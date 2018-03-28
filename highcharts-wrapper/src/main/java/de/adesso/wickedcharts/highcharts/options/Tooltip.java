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

import java.io.Serializable;

import de.adesso.wickedcharts.highcharts.options.color.ColorReference;

/**
 * Defines the configuration of the "tooltip" option.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#tooltip">http://api.highcharts.com/highcharts#tooltip</a>
 * 
 * @author Matthias Balke (matthias.balke@gmail.com)
 * 
 */
public class Tooltip implements Serializable {

	private static final long serialVersionUID = 1L;

	private Boolean animation;

	private ColorReference backgroundColor;

	private ColorReference borderColor;

	private Integer borderRadius;

	private Integer borderWidth;

	private Crosshair[] crosshairs;

	private Boolean enabled;

	private String footerFormat;

	private Function formatter;

	private String headerFormat;

	private String pointFormat;

	private Function positioner;

	private Boolean shadow;

	private Boolean shared;

	private Integer snap;

	private CssStyle style;

	private Boolean useHTML;

	private Integer valueDecimals;

	private Integer percentageDecimals;

	private String valuePrefix;

	private String valueSuffix;

	private String xDateFormat;

	private String percentageSuffix;

	private String percentagePrefix;

	private String totalSuffix;

	private String totalPrefix;

	private Integer totalDecimals;

	public Tooltip() {

	}

	public String getPercentageSuffix() {
		return percentageSuffix;
	}

	public Tooltip setPercentageSuffix(String percentageSuffix) {
		this.percentageSuffix = percentageSuffix;
		return this;
	}

	public String getPercentagePrefix() {
		return percentagePrefix;
	}

	public Tooltip setPercentagePrefix(String percentagePrefix) {
		this.percentagePrefix = percentagePrefix;
		return this;
	}

	public String getTotalSuffix() {
		return totalSuffix;
	}

	public Tooltip setTotalSuffix(String totalSuffix) {
		this.totalSuffix = totalSuffix;
		return this;
	}

	public String getTotalPrefix() {
		return totalPrefix;
	}

	public Tooltip setTotalPrefix(String totalPrefix) {
		this.totalPrefix = totalPrefix;
		return this;
	}

	public Integer getTotalDecimals() {
		return totalDecimals;
	}

	public Tooltip setTotalDecimals(Integer totalDecimals) {
		this.totalDecimals = totalDecimals;
		return this;
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

	public Crosshair[] getCrosshairs() {
		return this.crosshairs;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public String getFooterFormat() {
		return this.footerFormat;
	}

	public Function getFormatter() {
		return this.formatter;
	}

	public String getHeaderFormat() {
		return this.headerFormat;
	}

	public Integer getPercentageDecimals() {
		return this.percentageDecimals;
	}

	public String getPointFormat() {
		return this.pointFormat;
	}

	public Function getPositioner() {
		return this.positioner;
	}

	public Boolean getShadow() {
		return this.shadow;
	}

	public Boolean getShared() {
		return this.shared;
	}

	public Integer getSnap() {
		return this.snap;
	}

	public CssStyle getStyle() {
		return this.style;
	}

	public Boolean getUseHTML() {
		return this.useHTML;
	}

	public Integer getValueDecimals() {
		return this.valueDecimals;
	}

	public String getValuePrefix() {
		return this.valuePrefix;
	}

	public String getValueSuffix() {
		return this.valueSuffix;
	}

	public String getxDateFormat() {
		return this.xDateFormat;
	}

	public Tooltip setAnimation(final Boolean animation) {
		this.animation = animation;
		return this;
	}

	public Tooltip setBackgroundColor(final ColorReference backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	public Tooltip setBorderColor(final ColorReference borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	public Tooltip setBorderRadius(final Integer borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}

	public Tooltip setBorderWidth(final Integer borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	public Tooltip setEnabled(final Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	public Tooltip setFooterFormat(final String footerFormat) {
		this.footerFormat = footerFormat;
		return this;
	}

	public Tooltip setFormatter(final Function formatter) {
		this.formatter = formatter;
		return this;
	}

	public Tooltip setHeaderFormat(final String headerFormat) {
		this.headerFormat = headerFormat;
		return this;
	}

	public Tooltip setPercentageDecimals(final Integer percentageDecimals) {
		this.percentageDecimals = percentageDecimals;
		return this;
	}

	public Tooltip setPointFormat(final String pointFormat) {
		this.pointFormat = pointFormat;
		return this;
	}

	public Tooltip setPositioner(final Function positioner) {
		this.positioner = positioner;
		return this;
	}

	public Tooltip setShadow(final Boolean shadow) {
		this.shadow = shadow;
		return this;
	}

	public Tooltip setShared(final Boolean shared) {
		this.shared = shared;
		return this;
	}

	public Tooltip setSnap(final Integer snap) {
		this.snap = snap;
		return this;
	}

	public Tooltip setStyle(final CssStyle style) {
		this.style = style;
		return this;
	}

	public Tooltip setUseHTML(final Boolean useHTML) {
		this.useHTML = useHTML;
		return this;
	}

	public Tooltip setValueDecimals(final Integer valueDecimals) {
		this.valueDecimals = valueDecimals;
		return this;
	}

	public Tooltip setValuePrefix(final String valuePrefix) {
		this.valuePrefix = valuePrefix;
		return this;
	}

	public Tooltip setValueSuffix(final String valueSuffix) {
		this.valueSuffix = valueSuffix;
		return this;
	}

	public Tooltip setXCrosshair(final Crosshair crosshair) {
		if (this.getCrosshairs() == null) {
			this.crosshairs = new Crosshair[2];
		}
		this.getCrosshairs()[0] = crosshair;
		return this;
	}

	public Tooltip setxDateFormat(final String xDateFormat) {
		this.xDateFormat = xDateFormat;
		return this;
	}

	public Tooltip setYCrosshair(final Crosshair crosshair) {
		if (this.getCrosshairs() == null) {
			this.crosshairs = new Crosshair[2];
		}
		this.getCrosshairs()[1] = crosshair;
		return this;
	}

}
