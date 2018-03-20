package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Arc extends Element {
	private Number borderWidth;
	private Color backgroundColor;
	private Color borderColor;
}
