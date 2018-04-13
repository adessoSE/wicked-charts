package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import lombok.experimental.Accessors;

/**
 * Defines options for the axes.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/axes/?h=axes">http://www.chartjs.org/docs/latest/axes/?h=axes</a>
 *
 * @author anedomansky
 * @author maximAtanasov
 */
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
	private Number barPercentage;
	private Number categoryPercentage;
	private Number barThickness;
	private Number maxBarThickness;
	private Number weight;
	
	// Callbacks
	private Callback beforeUpdate;
	private Callback beforeSetDimensions;
	private Callback afterSetDimensions;
	private Callback beforeDataLimits;
	private Callback afterDataLimits;
	private Callback beforeBuildTicks;
	private Callback afterBuildTicks;
	private Callback beforeTickToLabelConversion;
	private Callback afterTickToLabelConversion;
	private Callback beforeCalculateTickRotation;
	private Callback afterCalculateTickRotation;
	private Callback beforeFit;
	private Callback afterFit;
	private Callback afterUpdate;
	private Boolean offset;
	private BoundsType bounds;
	private AngleLines angleLines;
	private PointLabels pointLabels;
	
	public AxesScale setBarPercentage(Double barPercentage) {
		if(barPercentage > 1.0) {
			this.barPercentage = 1.0;
		}
		else if(barPercentage < 0) {
			this.barPercentage = 0.0;
		}
		else {
			this.barPercentage = barPercentage;
		}
		return this;
	}
	
	public AxesScale setCategoryPercentage(Double categoryPercentage) {
		if(categoryPercentage > 1.0) {
			this.categoryPercentage = 1.0;
		}
		else if(categoryPercentage < 0) {
			this.categoryPercentage = 0.0;
		}
		else {
			this.categoryPercentage = categoryPercentage;
		}
		return this;
	}
}
