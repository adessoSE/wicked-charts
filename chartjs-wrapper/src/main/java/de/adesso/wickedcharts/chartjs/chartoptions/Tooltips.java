package de.adesso.wickedcharts.chartjs.chartoptions;


import java.io.Serializable;


import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import lombok.experimental.Accessors;

/**
 * Defines the options for the chart tooltips
 *
 * @see <a
 *      href="http://www.chartjs.org/docs/latest/configuration/tooltip.html">http://www.chartjs.org/docs/latest/configuration/tooltip.html</a>
 */
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
	private Callback itemSort;
	private Callback filter;
	private String titleFontFamily;
	private Integer titleFontSize;
	private FontStyle titleFontStyle;
	private Integer titleSpacing;
	private Integer titleMarginBottom;
	private String bodyFontFamily;
	private Integer bodyFontSize;
	private FontStyle bodyFontStyle;
	private Integer bodySpacing;
	private String footerFontFamily;
	private Integer footerFontSize;
	private Color footerFontColor;
	private Integer footerSpacing;
	private Integer footerMarginTop;
	private Integer caretPadding;
	private Number cornerRadius;
	private Color multiKeyBackground;
	private Boolean displayColors;
	
	
	
}
