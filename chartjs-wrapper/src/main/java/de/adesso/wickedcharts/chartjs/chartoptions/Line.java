package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.FillingModeLine;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * Defines the line dataset properties.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/charts/line.html?h=line">http://www.chartjs.org/docs/latest/charts/line.html?h=line</a>
 *
 * @author SvenWirz
 * @author anedomansky
 * @author maximAtanasov
 */
@Accessors(chain = true)
@lombok.Data
public class Line implements Serializable{

	private static final long serialVersionUID = 1L;
	private Number tension;
	private Color backgroundColor;
	private Number borderWidth;
	private Color borderColor;
	private BorderCapStyle borderCapStyle;
	private List<Number> borderDash;
	private Number borderDashOffset;
	private String borderJoinStyle;
	private Boolean capBezierPoints;
	private FillingModeLine fill;
	private Boolean stepped;
}
