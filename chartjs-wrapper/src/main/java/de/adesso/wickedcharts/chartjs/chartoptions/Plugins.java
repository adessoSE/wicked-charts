package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Plugins implements Serializable{
	private static final long serialVersionUID = 1L;
	private Filler filler;
	private SamplesFillerAnalyzer samples_filler_analyzer;
}
