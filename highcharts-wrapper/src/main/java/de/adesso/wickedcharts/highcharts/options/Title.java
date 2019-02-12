/**
 *   Copyright 2012-2019 Wicked Charts (http://github.com/adessoAG/wicked-charts)
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
 * Defines the configuration of the "title" option.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#title">http://api.highcharts.com/highcharts#title</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Title implements Serializable {

	private static final long serialVersionUID = 1L;

	private HorizontalAlignment align;

	private Boolean enabled;

	private Integer offset;

	private Integer rotation;

	private CssStyle style;

	private Boolean floating;

	private Integer margin;

	private String text;

	private VerticalAlignment verticalAlign;

	private Integer x;

	private Integer y;

	public Title() {

	}

	public Title(final String text) {
		this.text = text;
	}

	public HorizontalAlignment getAlign() {
		return this.align;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public Boolean getFloating() {
		return this.floating;
	}

	public Integer getMargin() {
		return this.margin;
	}

	public Integer getOffset() {
		return this.offset;
	}

	public Integer getRotation() {
		return this.rotation;
	}

	public CssStyle getStyle() {
		return this.style;
	}

	public String getText() {
		return this.text;
	}

	public VerticalAlignment getVerticalAlign() {
		return this.verticalAlign;
	}

	public Integer getX() {
		return this.x;
	}

	public Integer getY() {
		return this.y;
	}

	public Title setAlign(final HorizontalAlignment align) {
		this.align = align;
		return this;
	}

	public Title setEnabled(final Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	public Title setFloating(final Boolean floating) {
		this.floating = floating;
		return this;
	}

	public Title setMargin(final Integer margin) {
		this.margin = margin;
		return this;
	}

	public Title setOffset(final Integer offset) {
		this.offset = offset;
		return this;
	}

	public Title setRotation(final Integer rotation) {
		this.rotation = rotation;
		return this;
	}

	public Title setStyle(final CssStyle style) {
		this.style = style;
		return this;
	}

	public Title setText(final String text) {
		this.text = text;
		return this;
	}

	public Title setVerticalAlign(final VerticalAlignment verticalAlign) {
		this.verticalAlign = verticalAlign;
		return this;
	}

	public Title setX(final Integer x) {
		this.x = x;
		return this;
	}

	public Title setY(final Integer y) {
		this.y = y;
		return this;
	}

}
