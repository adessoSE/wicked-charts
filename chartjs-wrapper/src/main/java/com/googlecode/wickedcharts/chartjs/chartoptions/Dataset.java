package com.googlecode.wickedcharts.chartjs.chartoptions;

import java.util.List;

import com.googlecode.wickedcharts.chartjs.chartoptions.colors.Color;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Dataset {
	private String label;
	private Color backgroundColor;
	private Color borderColor;
	private Integer borderWidth;
	private List<? extends Number> data;
}
