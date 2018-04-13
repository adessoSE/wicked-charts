package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

/**
 * Defines a callback function.
 *
 * @author SvenWirz
 */
@Accessors(chain = true)
@lombok.Data
public class CallbackFunction extends Callback {

	private static final long serialVersionUID = 1L;
	private String text;

	public CallbackFunction(String text) {
		this.text = text;
	}
	
}
