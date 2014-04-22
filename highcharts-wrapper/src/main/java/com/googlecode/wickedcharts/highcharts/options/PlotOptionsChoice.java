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

import java.io.Serializable;

/**
 * Defines a choice between on or more {@link PlotOptions}
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#plotOptions">http://api.highcharts.com/highcharts#plotOptions</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class PlotOptionsChoice implements Serializable {

	private static final long serialVersionUID = 1L;

	private PlotOptions area;

	private PlotOptions areaspline;

	private PlotOptions bar;

	private PlotOptions column;

	private PlotOptions line;

	private PlotOptions pie;

	private PlotOptions scatter;

	private PlotOptions series;

	private PlotOptions spline;

	private PlotOptions candleStick;

	private PlotOptions gauge;

	private PlotOptions columnrange;

    private PlotOptions boxplot;

    private PlotOptions bubble;

	public PlotOptionsChoice() {

	}

	public PlotOptions getArea() {
		return this.area;
	}

	public PlotOptions getAreaspline() {
		return this.areaspline;
	}

	public PlotOptions getBar() {
		return this.bar;
	}

	public PlotOptions getCandleStick() {
		return this.candleStick;
	}

	public PlotOptions getColumn() {
		return this.column;
	}

	public PlotOptions getLine() {
		return this.line;
	}

	public PlotOptions getPie() {
		return this.pie;
	}

	public PlotOptions getScatter() {
		return this.scatter;
	}

	public PlotOptions getSeries() {
		return this.series;
	}

	public PlotOptions getSpline() {
		return this.spline;
	}

	public PlotOptionsChoice setArea(final PlotOptions area) {
		this.area = area;
		return this;
	}

	public PlotOptionsChoice setAreaspline(final PlotOptions areaspline) {
		this.areaspline = areaspline;
		return this;
	}

	public PlotOptionsChoice setBar(final PlotOptions bar) {
		this.bar = bar;
		return this;
	}

	public PlotOptionsChoice setCandleStick(final PlotOptions candleStick) {
		this.candleStick = candleStick;
		return this;
	}

	public PlotOptionsChoice setColumn(final PlotOptions column) {
		this.column = column;
		return this;
	}

	public PlotOptionsChoice setLine(final PlotOptions line) {
		this.line = line;
		return this;
	}

	public PlotOptionsChoice setPie(final PlotOptions pie) {
		this.pie = pie;
		return this;
	}

	public PlotOptionsChoice setScatter(final PlotOptions scatter) {
		this.scatter = scatter;
		return this;
	}

	public PlotOptionsChoice setSeries(final PlotOptions series) {
		this.series = series;
		return this;
	}

	public PlotOptionsChoice setSpline(final PlotOptions spline) {
		this.spline = spline;
		return this;
	}

	public PlotOptionsChoice setColumnrange(PlotOptions columnrange) {
		this.columnrange = columnrange;
		return this;
	}

	public PlotOptions getColumnrange() {
		return columnrange;
	}

	public PlotOptionsChoice setGauge(PlotOptions gauge) {
		this.gauge = gauge;
		return this;
	}

	public PlotOptions getGauge() {
		return gauge;
	}

	public PlotOptions getPlotOptions(SeriesType type) {
		switch (type) {
			case AREA:
				return this.area;
			case AREASPLINE:
				return this.areaspline;
			case BAR:
				return this.bar;
			case COLUMN:
				return this.column;
			case LINE:
				return this.line;
			case PIE:
				return this.pie;
			case SCATTER:
				return this.scatter;
			case SPLINE:
				return this.spline;
			case COLUMNRANGE:
				return this.columnrange;
			case GAUGE:
				return this.gauge;
			default:
				throw new IllegalArgumentException("Invalid SeriesType: " + type);
		}
	}

    public PlotOptions getBoxplot() {
        return boxplot;
    }

    public PlotOptionsChoice setBoxplot(PlotOptions boxplot) {
        this.boxplot = boxplot;
        return this;
    }

    public PlotOptions getBubble() {
        return bubble;
    }

    public void setBubble(PlotOptions bubble) {
        this.bubble = bubble;
    }

	public PlotOptionsChoice setPlotOptions(PlotOptions plotOptions, SeriesType type) {
		switch (type) {
			case AREA:
				this.area = plotOptions;
				break;
			case AREASPLINE:
				this.areaspline = plotOptions;
				break;
			case BAR:
				this.bar = plotOptions;
				break;
			case COLUMN:
				this.column = plotOptions;
				break;
			case LINE:
				this.line = plotOptions;
				break;
			case PIE:
				this.pie = plotOptions;
				break;
			case SCATTER:
				this.scatter = plotOptions;
				break;
			case SPLINE:
				this.spline = plotOptions;
				break;
			case COLUMNRANGE:
				this.columnrange = plotOptions;
				break;
			case GAUGE:
				this.gauge = plotOptions;
				break;
            case BUBBLE:
                this.bubble = plotOptions;
                break;
            case BOXPLOT:
                this.boxplot = plotOptions;
                break;
			default:
				throw new IllegalArgumentException("Invalid SeriesType: " + type);
		}
		return this;
	}

}
