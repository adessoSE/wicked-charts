package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Padding {
	private Integer left;
	private Integer right;
	private Integer top;
	private Integer bottom;
}
