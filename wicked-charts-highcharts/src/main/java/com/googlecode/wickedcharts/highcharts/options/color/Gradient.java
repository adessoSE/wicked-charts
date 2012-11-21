package com.googlecode.wickedcharts.highcharts.options.color;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract parent class for Gradient ColorReferences.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public abstract class Gradient extends ColorReference {

	private static final long serialVersionUID = 1L;

	private final List<List<Object>> stops = new ArrayList<List<Object>>();

	public Gradient() {
		super();
	}

	public Gradient addStop(final Number percentage, final ColorReference color) {
		List<Object> stopList = new ArrayList<Object>();
		stopList.add(percentage);
		stopList.add(color);
		this.getStops().add(stopList);
		return this;
	}

	protected Gradient addStopsInternal(final List<List<Object>> stops) {
		this.getStops().addAll(stops);
		return this;
	}

	@Override
	public ColorReference brighten(final Float brightness) {
		Gradient copy = (Gradient) copy();
		for (List<Object> stop : copy.stops) {
			ColorReference color = (ColorReference) stop.get(1);
			Float newBrightness = color.getBrightness();
			if (newBrightness == null) {
				newBrightness = brightness;
			} else {
				newBrightness += brightness;
			}
			color.setBrightness(newBrightness);
		}
		return copy;
	}

	public List<List<Object>> getStops() {
		return this.stops;
	}

}