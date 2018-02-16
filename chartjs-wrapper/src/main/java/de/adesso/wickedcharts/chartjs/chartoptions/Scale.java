package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Scale implements Serializable{
	private static final long serialVersionUID = 1L;
	private Ticks ticks;
	private Boolean reverse;
}
