package com.googlecode.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Options {
	private Boolean responsive;
	private Legend legend;
	private Title title;
	private Tooltips tooltips;
	private Hover hover;
	private Scales scales;
	private Element elements;
}
