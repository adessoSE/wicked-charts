package de.adesso.wickedcharts.chartjs.chartoptions;

import java.util.Arrays;
import java.util.List;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class TextListLabel extends Label {
	private List<String> textList;
	
	public TextListLabel() {
		super();
	}
	
	public TextListLabel(String...texts) {
		this.textList = Arrays.asList(texts);
	}
}
