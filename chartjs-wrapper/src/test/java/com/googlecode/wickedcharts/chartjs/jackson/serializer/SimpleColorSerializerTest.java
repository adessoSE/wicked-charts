package com.googlecode.wickedcharts.chartjs.jackson.serializer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import com.googlecode.wickedcharts.chartjs.jackson.JsonRenderer;

public class SimpleColorSerializerTest {

	private SimpleColor testColor;
	private JsonRenderer renderer;

	@Before
	public void setUp() throws Exception {
		renderer = new JsonRenderer();
	}

	@Test
	public void testRgbColor() {
		testColor = SimpleColor.BLUE;

		String json = renderer.toJson(testColor);
		assertTrue(json.contains("rgb(54,162,235)"));
	}

	@Test
	public void testRgbaColor() {
		testColor = SimpleColor.BLUE_TRANSPARENT;

		String json = renderer.toJson(testColor);
		assertTrue(json.contains("rgba(54,162,235,0.50)"));
	}

}
