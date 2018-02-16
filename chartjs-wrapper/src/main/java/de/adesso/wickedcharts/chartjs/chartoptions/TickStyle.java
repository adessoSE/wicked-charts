package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import lombok.experimental.Accessors;

/**
 * Defines attributes for the tickStyle option inside Ticks
 */

@Accessors(chain = true)
@lombok.Data
public class TickStyle {
	private String fontStyle;
	private Color fontColor;
}
