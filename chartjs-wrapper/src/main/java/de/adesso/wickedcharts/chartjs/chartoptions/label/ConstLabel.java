package de.adesso.wickedcharts.chartjs.chartoptions.label;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class ConstLabel extends Label {
	private final String text;
	
	public ConstLabel(final String text) {
		super();
		this.text = text;
	}
	
	public static List<ConstLabel> createListOf(String... texts) {
		return Arrays.stream(texts).map(textLabel -> new ConstLabel(textLabel)).collect(Collectors.toList());
	}
	
	public static List<ConstLabel> createListOf(List<String> textList) {
		return textList.stream().map(textLabel -> new ConstLabel(textLabel)).collect(Collectors.toList());
	}
}
