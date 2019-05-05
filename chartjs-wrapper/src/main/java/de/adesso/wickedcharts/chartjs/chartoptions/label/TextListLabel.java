package de.adesso.wickedcharts.chartjs.chartoptions.label;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Defines a list of textlabels for the axes .
 *
 * @author SvenWirz
 */
public class TextListLabel extends Label implements Serializable {
	private List<String> textList;
	
	public TextListLabel(String...texts) {
		this.textList = Arrays.asList(texts);
	}

	public List<String> getTextList() {
		return textList;
	}

	public void setTextList(List<String> textList) {
		this.textList = textList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((textList == null) ? 0 : textList.hashCode());
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
		TextListLabel other = (TextListLabel) obj;
		if (textList == null) {
			if (other.textList != null)
				return false;
		} else if (!textList.equals(other.textList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TextListLabel [textList=" + textList + "]";
	}
	
	
}
