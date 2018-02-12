package com.googlecode.wickedcharts.chartjs.jackson.serializer;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.googlecode.wickedcharts.chartjs.chartoptions.colors.StringValueColor;
import com.googlecode.wickedcharts.chartjs.jackson.JsonRenderer;

public class StringValueColorSerializerTest {

	private JsonRenderer renderer;
	private StringValueColor testColor;
	private List<StringValueColor> testColorList;
	@Before
	public void setUp() throws Exception {
		renderer = new JsonRenderer();
		testColor = new StringValueColor("pink");
	}

	@Test
	public void testSingleStringValueColor() {
		String json = renderer.toJson(testColor);
		assertTrue(json.contains("'pink'"));
	}
	
	@Test
	public void testStringValueColorList() {
		testColorList = Arrays.asList(new StringValueColor("pink"), new StringValueColor("red"));
		String json = renderer.toJson(testColorList);
		assertTrue(json.contains("[ 'pink', 'red' ]"));
	}
}
