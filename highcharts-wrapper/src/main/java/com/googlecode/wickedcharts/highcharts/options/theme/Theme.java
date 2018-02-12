/**
 * Copyright 2012-2013 Wicked Charts (http://wicked-charts.googlecode.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.wickedcharts.highcharts.options.theme;

import java.io.Serializable;

import com.googlecode.wickedcharts.highcharts.options.color.ColorReference;

/**
 * Defined options for the a theme.
 * 
 * @author Jean-Philippe Signorino
 * 
 */
public class Theme implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long strokeWidth;

	private ColorReference stroke;

	private ColorReference fill;
	
	private ThemeStates states;

	public Long getStrokeWidth() {
		return strokeWidth;
	}
	
	public Theme setStrokeWidth(Long strokeWidth) {
		this.strokeWidth = strokeWidth;
		return this;
	}
	
	public ColorReference getFill() {
		return fill;
	}

	public ColorReference getStroke() {
		return stroke;
	}

	public ThemeStates getStates() {
		return states;
	}
	
	public Theme setFill(ColorReference fill) {
		this.fill = fill;
		return this;
	}

	
	public Theme setStroke(ColorReference stroke) {
		this.stroke = stroke;
		return this;
	}
	
	public Theme setStates(ThemeStates states) {
		this.states = states;
		return this;
	}
	

}
