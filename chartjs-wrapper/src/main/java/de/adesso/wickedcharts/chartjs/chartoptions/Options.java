package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Options implements Serializable{
	private static final long serialVersionUID = 1L;
	private Boolean responsive;
	private Boolean maintainAspectRatio;
	private Boolean spanGaps;
	private Legend legend;
	private Title title;
	private Tooltips tooltips;
	private Hover hover;
	private Scales scales;
	private Scale scale;
	private Element elements;
	private Plugins plugins;
	private Animation animation;
	private Filler filler;
	private Double aspectRatio;
	private Position position;
}
