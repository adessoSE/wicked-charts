package com.googlecode.wickedcharts.chartjs.chartoptions;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
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
	
	private String fill;
	//fill is now a String because in some charts attributes other than true/false are expected
	//when configuring a chart. Not setting this attribute = "fill: true"
	
	private Integer stack;
	
	@JsonProperty("yAxisID")
	private String yAxisID;
	
	private String pointStyle;
	private String steppedLine;
	private String lineTension;
	private String cubicInterpolationMode;
	private List<String> borderDash;
	private List<String> pointRadius;
	private String pointHitRadius;
	private String pointHoverRadius;
	private Double pointBorderWidth;
	private Boolean showLine;
	private Boolean hidden;
	
	public Dataset setBackgroundColor(Color color) {
		this.backgroundColor = Arrays.asList(color);
		return this;
	}

	public Dataset setBackgroundColor(List<SimpleColor> asList) {
		this.backgroundColor = asList;
		return this;
	}
}
