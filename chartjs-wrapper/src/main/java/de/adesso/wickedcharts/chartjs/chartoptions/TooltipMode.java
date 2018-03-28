package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.LowercaseEnum;

/**
 * Enum that defines different tooltip modes
 * @see <a
 *      href="http://www.chartjs.org/docs/latest/general/interactions/modes.html#interaction-modes">http://www.chartjs.org/docs/latest/general/interactions/modes.html#interaction-modes</a>
 *
 */
public enum TooltipMode implements LowercaseEnum {
	INDEX,DATASET,POINT,X,Y,NEAREST;
}
