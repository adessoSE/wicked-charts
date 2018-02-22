package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;
import java.util.List;

import lombok.experimental.Accessors;

/**
 * Defines all properties for the option attribute.
 *
 */
@Accessors(chain = true)
@lombok.Data
public class Options implements Serializable{
	private static final long serialVersionUID = 1L;
	
	// responsive options
	private Boolean responsive;
	private Number responsiveAnimationDuration;
	private Boolean maintainAspectRatio;
	
	// event options
	private List<EventType> events;
	
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
	private Layout layout;
}

