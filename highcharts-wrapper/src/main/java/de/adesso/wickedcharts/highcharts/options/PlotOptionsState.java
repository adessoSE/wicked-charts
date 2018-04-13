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

import java.awt.Color;
import java.io.Serializable;

import de.adesso.wickedcharts.highcharts.options.color.ColorReference;
import de.adesso.wickedcharts.highcharts.options.color.SimpleColor;

/**
 * Defines the configuration of the "states" option.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#plotOptions.area.marker.states">http://api.highcharts.com/highcharts#plotOptions.area.marker.states</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class PlotOptionsState implements Serializable {

	private static final long serialVersionUID = 1L;

	private Boolean enabled;

	private ColorReference fillColor;

	private ColorReference lineColor;

	private ColorReference color;

	private Integer lineWidth;

	private Integer radius;

	private Symbol symbol;

	public Boolean getEnabled() {
		return this.enabled;
	}

	public ColorReference getFillColor() {
		return this.fillColor;
	}

	public ColorReference getLineColor() {
		return this.lineColor;
	}

	public Integer getLineWidth() {
		return this.lineWidth;
	}

	public Integer getRadius() {
		return this.radius;
	}

	public Symbol getSymbol() {
		return this.symbol;
	}

	public PlotOptionsState setEnabled(final Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	public PlotOptionsState setFillColor(final Color color) {
		this.fillColor = new SimpleColor(color);
		return this;
	}

	public PlotOptionsState setFillColor(final ColorReference fillColor) {
		this.fillColor = fillColor;
		return this;
	}

	public PlotOptionsState setLineColor(final Color color) {
		this.lineColor = new SimpleColor(color);
		return this;
	}

	public PlotOptionsState setLineColor(final ColorReference lineColor) {
		this.lineColor = lineColor;
		return this;
	}

	public PlotOptionsState setLineWidth(final Integer lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	public PlotOptionsState setRadius(final Integer radius) {
		this.radius = radius;
		return this;
	}

	public PlotOptionsState setSymbol(final Symbol symbol) {
		this.symbol = symbol;
		return this;
	}

	public PlotOptionsState setColor(ColorReference color) {
		this.color = color;
		return this;
	}

	public ColorReference getColor() {
		return color;
	}

}
