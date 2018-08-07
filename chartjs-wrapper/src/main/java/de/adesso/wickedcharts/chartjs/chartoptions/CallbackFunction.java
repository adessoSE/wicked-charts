package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Defines a callback function.
 *
 * @author SvenWirz
 */
@Accessors(chain = true)
@lombok.Data
@EqualsAndHashCode(callSuper=true)
public class CallbackFunction extends Callback implements Serializable {

	private static final long serialVersionUID = 1L;
	private String text;

	public CallbackFunction(String text) {
		this.text = text;
	}
	
}
