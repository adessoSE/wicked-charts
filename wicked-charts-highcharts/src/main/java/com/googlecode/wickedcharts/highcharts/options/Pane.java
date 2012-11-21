/**
 * Copyright 2012 Tom Hombergs (tom.hombergs@gmail.com)
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
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the configuration of the "pane" option.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#pane">http://api.highcharts.com/highcharts#pane</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 */
public class Pane implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer startAngle;

	private Integer endAngle;

	private Center center;

	private List<Background> background;

	public Pane() {

	}

	public Pane addBackground(final Background background) {
		if (this.background == null) {
			this.background = new ArrayList<Background>();
		}
		this.background.add(background);
		return this;
	}

	public List<Background> getBackground() {
		return this.background;
	}

	public Center getCenter() {
		return this.center;
	}

	public Integer getEndAngle() {
		return this.endAngle;
	}

	public Integer getStartAngle() {
		return this.startAngle;
	}

	public Pane setBackground(final List<Background> background) {
		this.background = background;
		return this;
	}

	public Pane setCenter(final Center center) {
		this.center = center;
		return this;
	}

	public Pane setEndAngle(final Integer endAngle) {
		this.endAngle = endAngle;
		return this;
	}

	public Pane setStartAngle(final Integer startAngle) {
		this.startAngle = startAngle;
		return this;
	}

}
