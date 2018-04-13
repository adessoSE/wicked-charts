package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * This class defines a DateTimeValue object that can be used in charts that use different options related to time.
 * It acts as a wrapper around the standard LocalDateTime in Java.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/axes/cartesian/time.html">http://www.chartjs.org/docs/latest/axes/cartesian/time.html</a>
 * @author SvenWirz
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
