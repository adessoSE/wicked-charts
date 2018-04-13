package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * This class defines a constant ValueType using a final String.
 * Wrapping strings in this way is needed so that we can accept Lists of Strings
 * or a single string when setting different attributes in the chart configuration.
 *
 * @author SvenWirz
 */
@Accessors(chain = true)
@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class ConstValue extends ValueType {
	private final String value;
	
	public ConstValue(final String value) {
		this.value = value;
	}

	public static List<ConstValue> of(final List<String> constList) {
		return constList.stream().map(string -> new ConstValue(string)).collect(Collectors.toList());
	}
	
	public static List<ConstValue> of(final String...consts) {
		return Arrays.stream(consts).map(string -> new ConstValue(string)).collect(Collectors.toList());
	}
}
