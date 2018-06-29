package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Defines legend label configuration which is nested below the legend configuration.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/configuration/legend.html#legend-label-configuration">http://www.chartjs.org/docs/latest/configuration/legend.html#legend-label-configuration</a>
 *
 * @author SvenWirz
 */
@Accessors(chain = true)
@lombok.Data
public class LegendLabel implements Serializable{
	private static final long serialVersionUID = 1L;
	private boolean usePointStyle;
	private Color fontColor;
	private String fontFamily;
	private Integer fontSize;
	private FontStyle fontStyle;
	private Integer boxWidth;
	private Padding padding;
	private Callback generateLabels;
	private Callback filter;
}
