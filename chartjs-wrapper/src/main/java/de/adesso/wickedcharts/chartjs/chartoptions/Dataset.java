package de.adesso.wickedcharts.chartjs.chartoptions;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.BooleanFillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.FillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.ValueType;
import de.adesso.wickedcharts.chartjs.jackson.serializer.SingleElementListSerializer;
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
	private List<? extends ValueType> data;
	private FillingMode fill;
	private Integer stack;
	
	@JsonProperty("yAxisID")
	private String yAxisID;
	
	private String pointStyle;
	private String steppedLine;
	private Integer lineTension;
	private String cubicInterpolationMode;
	private List<String> borderDash;
	
	@JsonSerialize(using = SingleElementListSerializer.class)
	private List<Integer> pointRadius;
	
	private String pointHitRadius;
	private String pointHoverRadius;
	private Double pointBorderWidth;
	private Boolean showLine;
	private Boolean hidden;
	private Color hoverBackgroundColor;
	private Color hoverBorderColor;
	private Color pointBackgroundColor;
	private Double hoverBorderWidth;
	
	public Dataset setBackgroundColor(Color color) {
		this.backgroundColor = Arrays.asList(color);
		return this;
	}

	public Dataset setBackgroundColor(List<SimpleColor> asList) {
		this.backgroundColor = asList;
		return this;
	}
	
	public Dataset setPointRadius(Integer value) {
		this.pointRadius = Arrays.asList(value);
		return this;
	}
	
	public Dataset setPointRadius(List<Integer> list) {
		this.pointRadius = list;
		return this;
	}
	
	public Dataset setFill(Boolean value) {
		if(value) {
			this.fill = null;
		} else {
			this.fill = BooleanFillingMode.FALSE;
		}
		return this;
	}
	
	public Dataset setFill(FillingMode fill) {
		this.fill = fill;
		return this;
	}
	
	
}
