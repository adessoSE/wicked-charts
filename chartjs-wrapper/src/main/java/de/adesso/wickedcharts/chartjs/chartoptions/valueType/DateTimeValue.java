package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import java.io.Serializable;

import de.adesso.wickedcharts.chartjs.chartoptions.DateAndFormat;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class DateTimeValue extends ValueType implements Serializable {
	
	private DateAndFormat dateAndFormat;
	
	public DateTimeValue() {
	}

	public DateTimeValue(DateAndFormat dateAndFormat) {
		this.dateAndFormat = dateAndFormat;
	}
}
