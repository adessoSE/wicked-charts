package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
public class ConstValue extends ValueType implements Serializable {
	private final String value;
	
	public ConstValue(final String value) {
		this.value = value;
	}

	public static List<ConstValue> of(final List<String> constList) {
		List<ConstValue> resultList = new ArrayList<ConstValue>();
		for(String s : constList){
			resultList.add(new ConstValue(s));
		}
		return resultList;
	}
	
	public static List<ConstValue> of(final String...consts) {
		List<ConstValue> resultList = new ArrayList<ConstValue>();
		for(String s : consts){
			resultList.add(new ConstValue(s));
		}
		return resultList;		}
}
