package com.googlecode.wickedcharts.chartjs.jackson.serializer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.googlecode.wickedcharts.chartjs.chartoptions.colors.RgbaColor;
import com.googlecode.wickedcharts.chartjs.jackson.JsonRenderer;

public class RgbaColorSerializerTest {

	private JsonRenderer renderer;
	private RgbaColor testColor;
	
	@Before
	public void setUp() throws Exception {
		renderer = new JsonRenderer();
		testColor = new RgbaColor(123,234,56,.7f);
	}

	@Test
	public void testRgbaSerializer() {
		String json = renderer.toJson(testColor);
		assertTrue(json.contains("rgba(123,234,56,0.70)"));
	}

}
