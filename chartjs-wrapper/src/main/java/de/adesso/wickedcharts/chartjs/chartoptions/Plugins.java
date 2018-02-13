package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Plugins {
	private Filler filler;
	SamplesFillerAnalyzer samples_filler_analyzer;
}
