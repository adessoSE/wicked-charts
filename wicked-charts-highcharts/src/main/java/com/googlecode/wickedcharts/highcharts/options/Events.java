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

import java.io.Serializable;

/**
 * Defines the configuration of the "events" option.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#chart.events">http://api.highcharts.com/highcharts#chart.events</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Events implements Serializable {

	private Function click;

	private Function addSeries;

	private Function load;

	private Function redraw;

	private Function selection;

	private Function mouseOut;

	private Function mouseOver;

	private Function select;

	private Function unselect;

	private Function update;

	private Function remove;

	public Function getMouseOut() {
		return mouseOut;
	}

	public Events setMouseOut(Function mouseOut) {
		this.mouseOut = mouseOut;
		return this;
	}

	public Function getMouseOver() {
		return mouseOver;
	}

	public Events setMouseOver(Function mouseOver) {
		this.mouseOver = mouseOver;
		return this;
	}

	public Function getSelect() {
		return select;
	}

	public Events setSelect(Function select) {
		this.select = select;
		return this;
	}

	public Function getUnselect() {
		return unselect;
	}

	public Events setUnselect(Function unselect) {
		this.unselect = unselect;
		return this;
	}

	public Function getUpdate() {
		return update;
	}

	public Events setUpdate(Function update) {
		this.update = update;
		return this;
	}

	public Function getRemove() {
		return remove;
	}

	public Events setRemove(Function remove) {
		this.remove = remove;
		return this;
	}

	public Function getAddSeries() {
		return this.addSeries;
	}

	public Function getClick() {
		return this.click;
	}

	public Function getLoad() {
		return this.load;
	}

	public Function getRedraw() {
		return this.redraw;
	}

	public Function getSelection() {
		return this.selection;
	}

	public Events setAddSeries(final Function addSeries) {
		this.addSeries = addSeries;
		return this;
	}

	public Events setClick(final Function click) {
		this.click = click;
		return this;
	}

	public Events setLoad(final Function load) {
		this.load = load;
		return this;
	}

	public Events setRedraw(final Function redraw) {
		this.redraw = redraw;
		return this;
	}

	public Events setSelection(final Function selection) {
		this.selection = selection;
		return this;
	}

}
