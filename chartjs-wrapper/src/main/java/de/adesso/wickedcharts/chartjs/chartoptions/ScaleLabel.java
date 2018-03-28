package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import lombok.experimental.Accessors;

/**
 * Defines the scale label options
 * @see <a href="http://www.chartjs.org/docs/latest/axes/labelling.html#scale-title-configuration">http://www.chartjs.org/docs/latest/axes/labelling.html#scale-title-configuration</a>
 */
@Accessors(chain = true)
@lombok.Data
public class ScaleLabel implements Serializable{
	private static final long serialVersionUID = 1L;
	private Boolean display;
	private String labelString;
}
