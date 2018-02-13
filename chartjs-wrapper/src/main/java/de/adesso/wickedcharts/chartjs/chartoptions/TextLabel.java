package de.adesso.wickedcharts.chartjs.chartoptions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class TextLabel extends Label {
	private String text;
	
	public TextLabel() {
		super();
	}
	
	public TextLabel(String text) {
		super();
		this.text = text;
	}
	
	public static List<TextLabel> createListOf(String... texts) {
		return Arrays.stream(texts).map(textLabel -> new TextLabel(textLabel)).collect(Collectors.toList());
	}
	
	public static List<TextLabel> createListOf(List<String> textList) {
		return textList.stream().map(textLabel -> new TextLabel(textLabel)).collect(Collectors.toList());
	}
}
