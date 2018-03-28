package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import lombok.experimental.Accessors;



/**
 * Enum that defines different tooltip callbacks
 * @see <a
 *      href="http://www.chartjs.org/docs/latest/configuration/tooltip.html#tooltip-callbacks">http://www.chartjs.org/docs/latest/configuration/tooltip.html#tooltip-callbacks</a>
 *
 */
@Accessors(chain = true)
@lombok.Data
public class TooltipCallbacks implements Serializable{
	private static final long serialVersionUID = 1L;
	private Callback beforeTitle;
	private Callback title;
	private Callback afterTitle;
	private Callback beforeBody;
	private Callback beforeLabel;
	private Callback label;
	private Callback labelColor;
	private Callback labelTextColor;
	private Callback afterLabel;
	private Callback afterBody;
	private Callback beforeFooter;
	private Callback footer;
	private Callback afterFooter;
}
