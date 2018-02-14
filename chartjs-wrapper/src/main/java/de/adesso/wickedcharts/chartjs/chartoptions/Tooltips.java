package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Tooltips {
	private Position position;
	private TooltipMode mode;
	private Integer yPadding;
	private Integer xPadding;
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
