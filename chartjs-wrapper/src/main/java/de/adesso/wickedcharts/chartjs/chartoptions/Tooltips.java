package de.adesso.wickedcharts.chartjs.chartoptions;

/**
 * Defines the options for the chart tooltips
 */

import java.io.Serializable;


import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Tooltips implements Serializable{
	private static final long serialVersionUID = 1L;
	private TooltipPosition position;
	private TooltipMode mode;
	private Integer xPadding;
	private Integer yPadding;
	private Integer caretSize;
	private Color backgroundColor;
	private Color titleFontColor;
	private Color bodyFontColor;
	private Color borderColor;
	private Integer borderWidth;
	private Boolean intersect;
	private TooltipCallbacks callbacks;
	private FontStyle footerFontStyle;
	private Boolean enabled;
	private JavaScriptReference custom;
}
