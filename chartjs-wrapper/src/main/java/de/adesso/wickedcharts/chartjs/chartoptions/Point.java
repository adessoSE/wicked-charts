package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Point {
	private String pointStyle;
	private SimpleColor backgroundColor;
	private SimpleColor borderColor;
	private Double borderWidth;
	private Double radius;
}
