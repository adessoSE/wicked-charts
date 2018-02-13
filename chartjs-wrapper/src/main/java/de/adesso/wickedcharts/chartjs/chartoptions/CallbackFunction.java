package de.adesso.wickedcharts.chartjs.chartoptions;

import java.util.List;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class CallbackFunction extends Callback {


	private String text;

	public CallbackFunction(String text) {
		this.text = text;
	}
	
}
