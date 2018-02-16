package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

/**
 * Declares a Callback function.
 *
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
