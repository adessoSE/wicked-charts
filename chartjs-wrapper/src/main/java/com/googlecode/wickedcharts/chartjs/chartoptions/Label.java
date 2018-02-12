package com.googlecode.wickedcharts.chartjs.chartoptions;

import java.util.Arrays;
import java.util.List;

public class Label {
	
	private List<String> textList;

	public Label() {
	}

	public Label(String text) {
		this.textList = Arrays.asList(text);
	}
	
	public Label(List<String> text) {
		this.textList = text;
	}
	
	public Label(String...strings) {
		this.textList = Arrays.asList(strings);
	}

	public List<String> getTextList() {
		return textList;
	}

	public Label setTextList(List<String> textList) {
		this.textList = textList;
		return this;
	}

	public Label setTextList(String text) {
		this.textList = Arrays.asList(text);
		return this;
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
		Label other = (Label) obj;
		if (textList == null) {
			if (other.textList != null)
				return false;
		} else if (!textList.equals(other.textList))
			return false;
		return true;
	}
	
	
	

}
