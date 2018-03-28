package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.chartoptions.label.Label;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.DoubleValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.StringValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.ValueType;
import lombok.experimental.Accessors;

/**
 * Defines all of the different options for the Ticks object
 *
 */
@Accessors(chain = true)
@lombok.Data
public class Ticks implements Serializable{
	private static final long serialVersionUID = 1L;
	// Cartesian Axes
	private Boolean autoSkip;
	private Number autoSkipPadding;
	private Number labelOffset;
	private Integer maxRotation;
	private Integer minRotation;
	private Boolean mirror;
	private Number padding;
	
	// Category Axes
	private Label labels;
	private ValueType min;
	private ValueType max;
	
	// Linear Axes
	private Boolean beginAtZero;
	private Number maxTicksLimit;
	private Number stepSize;
	private Number suggestedMax;
	private Number suggestedMin;
	
	// Radial - Linear
	private Color backdropColor;
	private Number backdropPaddingX;
	private Number backdropPaddingY;
	private Boolean showLabelBackdrop;
	
	// styling
	private Callback callback;
	private Boolean display;
	private Color fontColor;
	private String fontFamily;
	private Number fontSize;
	private String fontStyle;
	private Boolean reverse;
	private TickStyle minor;
	private TickStyle major;
	private TickSource source;
	
	public Ticks setMin(Integer min) {
		this.min = new IntegerValue(min);
		return this;
	}
	
	public Ticks setMin(Double min) {
		this.min = new DoubleValue(min);
		return this;
	}
	
	public Ticks setMin(String min) {
		this.min = new StringValue(min);
		return this;
	}
	
	public Ticks setMax(Integer max) {
		this.max = new IntegerValue(max);
		return this;
	}
	
	public Ticks setMax(Double max) {
		this.max = new DoubleValue(max);
		return this;
	}
	
	public Ticks setMax(String max) {
		this.max = new StringValue(max);
		return this;
	}
}
