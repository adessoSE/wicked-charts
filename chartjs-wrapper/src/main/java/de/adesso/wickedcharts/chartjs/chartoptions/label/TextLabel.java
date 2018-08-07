package de.adesso.wickedcharts.chartjs.chartoptions.label;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Defines simple textlabels for the axes .
 *
 *
 * @author SvenWirz
 */
public class TextLabel extends Label implements Serializable {
	private String text;
	
	public TextLabel(String text) {
		super();
		this.text = text;
	}
	
	public static List<TextLabel> of(String... texts) {
		return Arrays.stream(texts).map(TextLabel::new).collect(Collectors.toList());
	}
	
	public static List<TextLabel> of(List<String> textList) {
		return textList.stream().map(TextLabel::new).collect(Collectors.toList());
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
			return other.text == null;
		} else return text.equals(other.text);
	}
}
