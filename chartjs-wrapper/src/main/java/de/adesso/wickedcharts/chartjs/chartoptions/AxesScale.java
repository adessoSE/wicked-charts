package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class AxesScale implements Serializable{
	private static final long serialVersionUID = 1L;
	private Boolean stacked;
	private Boolean display;
	private ScaleLabel scaleLabel;
	private Boolean reverse;
	private String id;
	private Position position;
	private String type;
	private GridLines gridLines;
	private Ticks ticks;
	private Boolean beginAtZero;
	private TimeFormat time;
	private DistributionType distribution;
}
