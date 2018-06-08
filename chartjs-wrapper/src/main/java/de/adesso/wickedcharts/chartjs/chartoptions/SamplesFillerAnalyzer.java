package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

import java.io.Serializable;

//TODO: Write Javadoc
@Accessors(chain = true)
@lombok.Data
public class SamplesFillerAnalyzer implements Serializable{
	private static final long serialVersionUID = 1L;
	private String target;
}
