package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
  * Defines the value type for strings
  *
  */
@Accessors(chain = true)
@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class StringValue extends ValueType {
	private String value;
	
	public StringValue() {}
	
	public StringValue(String value) {
		this.value = value;
	}

	public static List<StringValue> of(List<String> stringList) {
		return stringList.stream().map(string -> new StringValue(string)).collect(Collectors.toList());
	}
	
	public static List<StringValue> of(String...strings) {
		return Arrays.stream(strings).map(string -> new StringValue(string)).collect(Collectors.toList());
	}
	
}
