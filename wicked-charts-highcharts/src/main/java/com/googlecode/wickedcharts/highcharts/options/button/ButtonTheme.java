package com.googlecode.wickedcharts.highcharts.options.button;

import java.io.Serializable;

import com.googlecode.wickedcharts.highcharts.options.StatesChoice;
import com.googlecode.wickedcharts.highcharts.options.color.ColorReference;

/**
 * Theme for a button.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class ButtonTheme implements Serializable {

	private ColorReference fill;

	private ColorReference stroke;

	private Integer r;

	private StatesChoice states;

	public ButtonTheme setStates(final StatesChoice states) {
		this.states = states;
		return this;
	}

	public StatesChoice getStates() {
		return this.states;
	}

	public ButtonTheme setR(final Integer r) {
		this.r = r;
		return this;
	}

	public Integer getR() {
		return this.r;
	}

	public ButtonTheme setStroke(final ColorReference stroke) {
		this.stroke = stroke;
		return this;
	}

	public ColorReference getStroke() {
		return this.stroke;
	}

	public ButtonTheme setFill(final ColorReference fill) {
		this.fill = fill;
		return this;
	}

	public ColorReference getFill() {
		return this.fill;
	}

}
