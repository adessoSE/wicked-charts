package de.adesso.wickedcharts.chartjs.chartoptions.label;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Defines simple textlabels for the axes .
 *
 */
public class TextLabel extends Label {
	private String text;
	
	public TextLabel(String text) {
		super();
		this.text = text;
	}
	
	public static List<TextLabel> of(String... texts) {
		return Arrays.stream(texts).map(textLabel -> new TextLabel(textLabel)).collect(Collectors.toList());
	}
	
	public static List<TextLabel> of(List<String> textList) {
		return textList.stream().map(textLabel -> new TextLabel(textLabel)).collect(Collectors.toList());
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "TextLabel [text=" + text + "]";
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
		TextLabel other = (TextLabel) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}
	
	
}
