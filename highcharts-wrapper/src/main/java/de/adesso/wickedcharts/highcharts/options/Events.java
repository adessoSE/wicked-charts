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

/**
 * Defines the configuration of the "events" option.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#chart.events">http://api.highcharts.com/highcharts#chart.events</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Events implements Serializable {

  private static final long serialVersionUID = 1L;

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
	
	private Function legendItemClick;
	
	private Function checkboxClick;
	
	private Function hide;
	
	private Function show;
	
	private Function afterSetExtremes;
	
	private Function setExtremes;

	public Function getMouseOut() {
		return this.mouseOut;
	}

	public Events setMouseOut(Function mouseOut) {
		this.mouseOut = mouseOut;
		return this;
	}

	public Function getMouseOver() {
		return this.mouseOver;
	}

	public Events setMouseOver(Function mouseOver) {
		this.mouseOver = mouseOver;
		return this;
	}

	public Function getSelect() {
		return this.select;
	}

	public Events setSelect(Function select) {
		this.select = select;
		return this;
	}

	public Function getUnselect() {
		return this.unselect;
	}

	public Events setUnselect(Function unselect) {
		this.unselect = unselect;
		return this;
	}

	public Function getUpdate() {
		return this.update;
	}

	public Events setUpdate(Function update) {
		this.update = update;
		return this;
	}

	public Function getRemove() {
		return this.remove;
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
	
	public Function getLegendItemClick() {
		return this.legendItemClick;
	}

	public Events setLegendItemClick(final Function legendItemClick) {
		this.legendItemClick = legendItemClick;
		return this;
	}

	public Function getCheckboxClick() {
		return checkboxClick;
	}

	public Events setCheckboxClick(Function checkboxClick) {
		this.checkboxClick = checkboxClick;
		return this;
	}

	public Function getHide() {
		return hide;
	}

	public Events setHide(Function hide) {
		this.hide = hide;
		return this;
	}

	public Function getShow() {
		return show;
	}

	public Events setShow(Function show) {
		this.show = show;
		return this;
	}

	public Function getAfterSetExtremes() {
		return afterSetExtremes;
	}

	public Events setAfterSetExtremes(Function afterSetExtremes) {
		this.afterSetExtremes = afterSetExtremes;
		return this;
	}

	public Function getSetExtremes() {
		return setExtremes;
	}

	public Events setSetExtremes(Function setExtremes) {
		this.setExtremes = setExtremes;
		return this;
	}
}
