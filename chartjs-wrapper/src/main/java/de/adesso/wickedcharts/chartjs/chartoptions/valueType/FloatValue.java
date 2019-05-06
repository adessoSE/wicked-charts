package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
public class FloatValue extends ValueType implements Serializable {
	private Float value;

	public FloatValue() {
		
	}
	
	public FloatValue(Float value) {
		this.value = value;
	}

	public static List<FloatValue> of(List<Float> floatList) {
		List<FloatValue> floatValues = new ArrayList<FloatValue>();
		for(Float f : floatList){
			floatValues.add(new FloatValue(f));
		}
		return floatValues;
	}
	
	public static List<FloatValue> of(Float...floats) {
		List<FloatValue> floatValues = new ArrayList<FloatValue>();
		for(Float f : floats){
			floatValues.add(new FloatValue(f));
		}
		return floatValues;
	}
}
