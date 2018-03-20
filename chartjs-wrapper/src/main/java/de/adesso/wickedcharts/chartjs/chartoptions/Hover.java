package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Hover implements Serializable{

	private static final long serialVersionUID = 1L;
	
	// interaction options
	private HoverMode mode;
	private Boolean intersect;
	private String axis;
	private Number animationDuration;
}
