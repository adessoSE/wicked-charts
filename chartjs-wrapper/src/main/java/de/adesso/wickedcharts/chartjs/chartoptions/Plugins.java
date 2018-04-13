package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import lombok.experimental.Accessors;

/**
 * Efficient way to customize or change the default behavior of a chart.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/developers/plugins.html?h=plugin">http://www.chartjs.org/docs/latest/developers/plugins.html?h=plugin</a>
 *
 * @author SvenWirz
 */
@Accessors(chain = true)
@lombok.Data
public class Plugins implements Serializable{
	private static final long serialVersionUID = 1L;
	private Filler filler;
	private SamplesFillerAnalyzer samples_filler_analyzer;
}
