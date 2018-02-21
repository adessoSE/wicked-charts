package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.chartoptions.label.Label;
import lombok.experimental.Accessors;

/**
 * Defines attributes for the Tick option
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
	private Integer min;
	private Integer max;
	
	// Linear Axes
	private Boolean beginAtZero;
	//min
	//max
	private Number maxTicksLimit;
	private Integer stepSize;
	private Integer suggestedMax;
	private Integer suggestedMin;
	
	// Logarithmic Axes
	//min
	//max
	
	// Radial - Linear
	private Color backdropColor;
	private Number backdropPaddingX;
	private Number backdropPaddingY;
	// beginAtZero
	// min
	// max
	// maxTicksLimit
	// stepsize
	// suggestedMax
	// suggestedMin
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
}
