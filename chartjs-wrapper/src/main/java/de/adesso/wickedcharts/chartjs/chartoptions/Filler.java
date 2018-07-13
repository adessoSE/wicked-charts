package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Defines the filler plugin for area charts.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/charts/area.html?h=filler">http://www.chartjs.org/docs/latest/charts/area.html?h=filler</a>
 *
 * @author anedomansky
 * @author maximAtanasov
 * @author SvenWirz
 */
@Accessors(chain = true)
@lombok.Data
public class Filler implements Serializable{

	private static final long serialVersionUID = 1L;
	private Boolean propagate;
}
