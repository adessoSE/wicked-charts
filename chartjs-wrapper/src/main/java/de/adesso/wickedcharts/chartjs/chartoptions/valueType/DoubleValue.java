package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class wraps Doubles in a DoubleValue object.
 * Wrapping Doubles in this way is needed so that we can accept Lists of Doubles
 * or a single Double when setting different attributes in the chart configuration.
 *
 * Example:
 * <pre>
 *	Dataset dataset1 = new Dataset()
 * 				.setData(DoubleValue.of(3.0));
 *
 * 	Dataset dataset2 = new Dataset()
 *   			.setData(DoubleValue.of(Arrays.asList(1.0 , 2.0, 3.0 , 4.0 , 5.0));
 * </pre>
 *
 *	@author SvenWirz
 */
@Accessors(chain = true)
@lombok.Data
@EqualsAndHashCode(callSuper = false)
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
