package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class LegendLabel implements Serializable{
	private static final long serialVersionUID = 1L;
	private boolean usePointStyle;
	private Color fontColor;
	private String fontFamily;
	private Integer fontSize;
	private FontStyle fontStyle;
	private Integer boxWidth;
	private Padding padding;
	private Callback generateLabels;
	private Callback filter;
}
