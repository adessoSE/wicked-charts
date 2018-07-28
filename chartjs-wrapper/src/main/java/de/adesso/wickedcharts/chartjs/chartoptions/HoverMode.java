package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.LowercaseEnum;

import java.io.Serializable;

/**
 * Defines the different hover event types.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/general/interactions/modes.html#interaction-modes">http://www.chartjs.org/docs/latest/general/interactions/modes.html#interaction-modes</a>
 *
 * @author anedomansky
 * @author maximAtanasov
 */
public enum HoverMode implements LowercaseEnum, Serializable {
	INDEX,DATASET,POINT,X,Y,NEAREST;
}
