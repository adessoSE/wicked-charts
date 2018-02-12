package com.googlecode.wickedcharts.chartjs.chartoptions.colors;

@lombok.Data
public class RgbaColor extends RgbColor {

	private float alpha;
	
	public RgbaColor(int red, int green, int blue, float alpha) {
		super(red, green, blue);
		this.alpha = alpha;
	}

	
}
