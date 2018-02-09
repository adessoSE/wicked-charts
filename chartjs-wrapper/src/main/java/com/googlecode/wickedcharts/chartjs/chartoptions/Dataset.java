package com.googlecode.wickedcharts.chartjs.chartoptions;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.Color;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import com.googlecode.wickedcharts.chartjs.jackson.serializer.SingleElementListSerializer;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Dataset {
	private ChartType type;
	private String label;

	@JsonSerialize(using = SingleElementListSerializer.class)
	private List<? extends Color> backgroundColor;
	private Color borderColor;
	private Integer borderWidth;
	private List<? extends Number> data;
	private Boolean fill;
	private Integer stack;
	private String yAxisID;
	private String steppedLine;
	private String lineTension;
	private String cubicInterpolationMode;
	private List<String> borderDash;
	private List<String> pointRadius;
	private String pointHitRadius;
	private String pointHoverRadius;
	private boolean showLine = true;
	
	
	public Dataset setBackgroundColor(Color color) {
		this.backgroundColor = Arrays.asList(color);
		return this;
	}

	public Dataset setBackgroundColor(List<SimpleColor> asList) {
		this.backgroundColor = asList;
		return this;
	}
}
