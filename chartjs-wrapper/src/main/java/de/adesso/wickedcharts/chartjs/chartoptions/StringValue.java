package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class StringValue extends ValueType {
	private String value;
	
	public StringValue() {}
	
	public StringValue(String value) {
		this.value = value;
	}
	
}
