package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class wraps Integers in a IntegerValue object.
 * Wrapping Integers in this way is needed so that we can accept Lists of Integers
 * or a single Integer when setting different attributes in the chart configuration.
 *
 * Example:
 * <pre>
 *	Dataset dataset1 = new Dataset()
 * 				.setData(IntegerValue.of(3));
 *
 * 	Dataset dataset2 = new Dataset()
 *   			.setData(IntegerValue.of(Arrays.asList(1 ,2 ,3 ,4 ,5 ));
 * </pre>
 * @author SvenWirz
 */
@Accessors(chain = true)
@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class IntegerValue extends ValueType implements Serializable {
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
