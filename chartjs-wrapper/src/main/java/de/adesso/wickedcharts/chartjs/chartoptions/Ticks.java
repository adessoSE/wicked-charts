package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import lombok.experimental.Accessors;

/**
 * Defines attributes for the Tick option
 *
 */

@Accessors(chain = true)
@lombok.Data
public class Ticks implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer suggestedMin;
	private Integer suggestedMax;
	private Boolean autoSkip;
	private Integer maxRotation;
	private Integer stepSize;
	private Boolean beginAtZero;
	private Integer min;
	private Integer max;
	private Callback callback;
	private Boolean reverse;
	private TickStyle major;
	private TickSource source;
}
