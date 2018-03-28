package de.adesso.wickedcharts.chartjs.chartoptions.label;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Defines constant textlabels for the axes .
 *
 */
public class ConstLabel extends Label {
	private final String text;
	
	public ConstLabel(final String text) {
		super();
		this.text = text;
	}
	
	public static List<ConstLabel> of(String... texts) {
		return Arrays.stream(texts).map(textLabel -> new ConstLabel(textLabel)).collect(Collectors.toList());
	}
	
	public static List<ConstLabel> of(List<String> textList) {
		return textList.stream().map(textLabel -> new ConstLabel(textLabel)).collect(Collectors.toList());
	}

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
