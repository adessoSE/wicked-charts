package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class FloatValue extends ValueType {
	private Float value;

	public FloatValue() {
		
	}
	
	public FloatValue(Float integer) {
		this.value = integer;
	}

	public static List<FloatValue> of(List<Float> floatList) {
		return floatList.stream().map(floatVal -> new FloatValue(floatVal)).collect(Collectors.toList());
	}
	
	public static List<FloatValue> of(Float...floats) {
		return Arrays.stream(floats).map(floatVal -> new FloatValue(floatVal)).collect(Collectors.toList());
	}
}
