package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import lombok.experimental.Accessors;

/**
 * Elements include: arc, lines, points, and rectangles.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/configuration/elements.html?h=element">http://www.chartjs.org/docs/latest/configuration/elements.html?h=element</a>
 *
 * @author SvenWirz
 */
@Accessors(chain = true)
@lombok.Data
public class Element implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Point point;
	private Line line;
}
