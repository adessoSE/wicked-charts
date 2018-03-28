package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
  * Defines the value type for use in time charts
  *
  * @see <a
  *      http://www.chartjs.org/docs/latest/axes/cartesian/time.html">http://www.chartjs.org/docs/latest/axes/cartesian/time.html</a>
  *
  */
@Accessors(chain = true)
@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class DateTimeValue extends ValueType implements Serializable {
	
	private LocalDateTime value;
	
	public DateTimeValue() {
	}

	public DateTimeValue(LocalDateTime value) {
		this.value = value;
	}
}
