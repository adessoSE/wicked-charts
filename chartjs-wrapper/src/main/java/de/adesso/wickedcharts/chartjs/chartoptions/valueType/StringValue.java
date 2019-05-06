package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * This class wraps Strings in a StringValue object.
 * Wrapping Strings in this way is needed so that we can accept Lists of Strings
 * or a single String when setting different attributes in the chart configuration.
 *
 * @author SvenWirz
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = false)
public class StringValue extends ValueType implements Serializable {
	private String value;
	
	public StringValue() {}
	
	public StringValue(String value) {
		this.value = value;
	}

	public static List<StringValue> of(List<String> stringList) {
		List<StringValue> resultList = new ArrayList<StringValue>();
		for(String string : stringList){
			resultList.add(new StringValue(string));
		}
		return resultList;
	}
	
	public static List<StringValue> of(String...strings) {
		List<StringValue> resultList = new ArrayList<StringValue>();
		for(String string : strings){
			resultList.add(new StringValue(string));
		}
		return resultList;
	}
	
}
