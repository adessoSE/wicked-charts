package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

/**
 * Declares a Callback function.
 *
 */
@Accessors(chain = true)
@lombok.Data
public class CallbackFunction extends Callback {


	private String text;

	public CallbackFunction(String text) {
		this.text = text;
	}
	
}
