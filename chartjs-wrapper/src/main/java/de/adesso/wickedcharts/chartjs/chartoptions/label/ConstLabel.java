package de.adesso.wickedcharts.chartjs.chartoptions.label;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Defines constant textlabels for the axes .
 *
 * @author SvenWirz
 */
public class ConstLabel extends Label implements Serializable {
	private final String text;
	
	public ConstLabel(final String text) {
		super();
		this.text = text;
	}
	
	public static List<ConstLabel> of(String... texts) {
		List<ConstLabel> resultList = new ArrayList<ConstLabel>();
		for(String text : texts){
			resultList.add(new ConstLabel(text));
		}
		return resultList;
	}
	
	public static List<ConstLabel> of(List<String> textList) {
		List<ConstLabel> resultList = new ArrayList<ConstLabel>();
		for(String text : textList){
			resultList.add(new ConstLabel(text));
		}
		return resultList;	}

	public String getText() {
		return text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConstLabel other = (ConstLabel) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ConstLabel [text=" + text + "]";
	}
}
