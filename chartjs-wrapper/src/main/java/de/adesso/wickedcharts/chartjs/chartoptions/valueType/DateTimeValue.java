package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class DateTimeValue extends ValueType implements Serializable {
	
	private LocalDateTime value;
	
	public DateTimeValue() {
	}

	public DateTimeValue(LocalDateTime value) {
		this.value = value;
	}
}
