package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
  * Defines the value type for integers
  *
  */
@Accessors(chain = true)
@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class IntegerValue extends ValueType {
	private Integer value;

	public IntegerValue() {
		
	}
	
	public IntegerValue(Integer integer) {
		this.value = integer;
	}

	public static List<IntegerValue> of(List<Integer> integerList) {
		return integerList.stream().map(integer -> new IntegerValue(integer)).collect(Collectors.toList());
	}
	
	public static List<IntegerValue> of(Integer...integers) {
		return Arrays.stream(integers).map(integer -> new IntegerValue(integer)).collect(Collectors.toList());
	}
}
