package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class DoubleValue extends ValueType {
	private Double value;
	
	public DoubleValue() {
		
	}

	public DoubleValue(Double doubleVal) {
		this.value = doubleVal;
	}
	
	public static List<DoubleValue> of(List<Double> doubleList) {
		return doubleList.stream().map(doubleVal -> new DoubleValue(doubleVal)).collect(Collectors.toList());
	}
	
	public static List<DoubleValue> of(Double...doubles) {
		return Arrays.stream(doubles).map(doubleVal -> new DoubleValue(doubleVal)).collect(Collectors.toList());
	}
}
