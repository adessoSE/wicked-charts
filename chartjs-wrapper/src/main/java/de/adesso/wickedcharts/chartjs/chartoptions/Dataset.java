package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;
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

/**
 * Defines the options for the dataset object.
 *
 * @see <a
 *      href="http://www.chartjs.org/docs/latest/?h=dataset">http://www.chartjs.org/docs/latest/?h=dataset</a>
 *
 */
@Accessors(chain = true)
@lombok.Data
public class Dataset implements Serializable{

	private static final long serialVersionUID = 1L;
	private ChartType type;
	private String label;


	@JsonSerialize(using = SingleElementListSerializer.class)
	private List<? extends Color> backgroundColor;
	
	private Color borderColor;
	private Integer borderWidth;
	private List<? extends ValueType> data;
	private FillingMode fill;
	private String stack;
	
	@JsonProperty("yAxisID")
	private String yAxisID;
	
	@JsonProperty("xAxisID")
	private String xAxisID;
	
	private PointStyle pointStyle;
	private SteppedLineValue steppedLine;
	private Integer lineTension;
	private CubicInterpolationMode cubicInterpolationMode;
	private List<String> borderDash;
	private Number borderDashOffset;
	
	@JsonSerialize(using = SingleElementListSerializer.class)
	private List<? extends Number> pointRadius;
	
	@JsonSerialize(using = SingleElementListSerializer.class)
	private List<? extends Number> pointHitRadius;
	
	@JsonSerialize(using = SingleElementListSerializer.class)
	private List<? extends Number> pointHoverRadius;
	
	@JsonSerialize(using = SingleElementListSerializer.class)
	private List<? extends Number> pointBorderWidth;
	
	private Boolean showLine;
	private Boolean spanGaps;
	private Boolean hidden;
	
	@JsonSerialize(using = SingleElementListSerializer.class)
	private List<? extends Color> hoverBackgroundColor;
	
	@JsonSerialize(using = SingleElementListSerializer.class)
	private List<? extends Color> hoverBorderColor;
	
	@JsonSerialize(using = SingleElementListSerializer.class)
	private List<? extends Color> pointBackgroundColor;
	
	@JsonSerialize(using = SingleElementListSerializer.class)
	private List<? extends Color> pointBorderColor;
	
	@JsonSerialize(using = SingleElementListSerializer.class)
	private List<? extends Color> pointHoverBackgroundColor;
	
	@JsonSerialize(using = SingleElementListSerializer.class)
	private List<? extends Color> pointHoverBorderColor;
	
	private Double hoverBorderWidth;
	private BorderCapStyle borderCapStyle;
	private BorderJoinStyle borderJoinStyle;
	private Position borderSkipped;
	
	public Dataset setHoverBorderColor(Color color) {
		this.hoverBorderColor = Arrays.asList(color);
		return this;
	}

	public Dataset setHoverBorderColor(List<? extends Color> asList) {
		this.hoverBorderColor = asList;
		return this;
	}
	
	public Dataset setHoverBackgroundColor(Color color) {
		this.hoverBackgroundColor = Arrays.asList(color);
		return this;
	}

	public Dataset setHoverBackgroundColor(List<? extends Color> asList) {
		this.hoverBackgroundColor = asList;
		return this;
	}
	
	public Dataset setPointHoverBorderColor(Color color) {
		this.pointHoverBorderColor = Arrays.asList(color);
		return this;
	}

	public Dataset setPointHoverBorderColor(List<? extends Color> asList) {
		this.pointHoverBorderColor = asList;
		return this;
	}
	
	public Dataset setPointHoverBackgroundColor(Color color) {
		this.pointHoverBackgroundColor = Arrays.asList(color);
		return this;
	}

	public Dataset setPointHoverBackgroundColor(List<? extends Color> asList) {
		this.pointHoverBackgroundColor = asList;
		return this;
	}
	
	public Dataset setPointBorderColor(Color color) {
		this.pointBorderColor = Arrays.asList(color);
		return this;
	}

	public Dataset setPointBorderColor(List<? extends Color> asList) {
		this.pointBorderColor = asList;
		return this;
	}
	
	public Dataset setPointBackgroundColor(Color color) {
		this.pointBackgroundColor = Arrays.asList(color);
		return this;
	}

	public Dataset setPointBackgroundColor(List<? extends Color> asList) {
		this.pointBackgroundColor = asList;
		return this;
	}
	
	public Dataset setPointBorderWidth(Number value) {
		this.pointBorderWidth = Arrays.asList(value);
		return this;
	}
	
	public Dataset setPointBorderWidth(List<? extends Number> list) {
		this.pointBorderWidth = list;
		return this;
	}
	
	public Dataset setPointHoverRadius(Number value) {
		this.pointHoverRadius = Arrays.asList(value);
		return this;
	}
	
	public Dataset setPointHoverRadius(List<? extends Number> list) {
		this.pointHoverRadius = list;
		return this;
	}
	
	public Dataset setPointHitRadius(Number value) {
		this.pointHitRadius = Arrays.asList(value);
		return this;
	}
	
	public Dataset setPointHitRadius(List<? extends Number> list) {
		this.pointHitRadius = list;
		return this;
	}
	
	public Dataset setBackgroundColor(Color color) {
		this.backgroundColor = Arrays.asList(color);
		return this;
	}

	public Dataset setBackgroundColor(List<? extends Color> asList) {
		this.backgroundColor = asList;
		return this;
	}
	
	public Dataset setPointRadius(Number value) {
		this.pointRadius = Arrays.asList(value);
		return this;
	}
	
	public Dataset setPointRadius(List<? extends Number> list) {
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
