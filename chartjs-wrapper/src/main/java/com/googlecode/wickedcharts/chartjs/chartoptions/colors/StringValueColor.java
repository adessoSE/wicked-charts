
package com.googlecode.wickedcharts.chartjs.chartoptions.colors;

public class StringValueColor extends Color {

	private String colorname;
	
	public String getColorname() {
		return colorname;
	}

	public void setColorname(String colorname) {
		this.colorname = colorname;
	}

	public StringValueColor(String string) {
		this.colorname = string;
	}
	
}
