package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class wraps Floats in a FloatValue object.
 * Wrapping Floats in this way is needed so that we can accept Lists of Floats
 * or a single Float when setting different attributes in the chart configuration.
 *
 * Example:
 * <pre>
 *	Dataset dataset1 = new Dataset()
 * 				.setData(FloatValue.of(3.0f));
 *
 * 	Dataset dataset2 = new Dataset()
 *   			.setData(FloatValue.of(Arrays.asList(1.0f ,2.0f ,3.0f ,4.0f ,5.0f ));
 * </pre>
 * @author SvenWirz
 */
@Accessors(chain = true)
@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class FloatValue extends ValueType {
	private Float value;

	public FloatValue() {
		
	}
	
	public FloatValue(Float value) {
		this.value = value;
	}

	public static List<FloatValue> of(List<Float> floatList) {
		return floatList.stream().map(floatVal -> new FloatValue(floatVal)).collect(Collectors.toList());
	}
	
	public static List<FloatValue> of(Float...floats) {
		return Arrays.stream(floats).map(floatVal -> new FloatValue(floatVal)).collect(Collectors.toList());
	}
}
