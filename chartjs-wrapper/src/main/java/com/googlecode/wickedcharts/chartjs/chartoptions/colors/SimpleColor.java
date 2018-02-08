package com.googlecode.wickedcharts.chartjs.chartoptions.colors;

public class SimpleColor extends Color {
	
	private Color color;
	
	private Class<? extends Color> colorClass;
	
	private SimpleColor(Color rgbColor, Class<? extends Color> clazz) {
		this.color = rgbColor;
		this.colorClass = clazz;
	}
	
	public Class<? extends Color> getColorClass() {
		return colorClass;
	}

	public void setColorClass(Class<? extends Color> colorClass) {
		this.colorClass = colorClass;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	// Specified Simple Colors

	public static final SimpleColor RED = new SimpleColor(new RgbColor(255,99,132), RgbColor.class);
	public static final SimpleColor GREEN = new SimpleColor(new RgbColor(75,192,192), RgbColor.class);
	public static final SimpleColor BLUE = new SimpleColor(new RgbColor(54,162,235), RgbColor.class);

	public static final SimpleColor RED_TRANSPARENT = new SimpleColor(new RgbaColor(255,99,132,0.5f), RgbaColor.class);
	public static final SimpleColor GREEN_TRANSPARENT = new SimpleColor(new RgbaColor(75,192,192,0.5f), RgbaColor.class);
	public static final SimpleColor BLUE_TRANSPARENT = new SimpleColor(new RgbaColor(54,162,235,0.5f), RgbaColor.class);
	
}
