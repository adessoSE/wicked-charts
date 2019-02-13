package de.adesso.wickedcharts.chartjs.jackson.serializer;


import de.adesso.wickedcharts.chartjs.chartoptions.valueType.DoubleValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoubleValueSerializerTest {
	
	private JsonRenderer renderer;
	private DoubleValue testVal;
	
	@BeforeEach
	void setUp() {
		renderer = new JsonRenderer();
	}
	
	@Test
	void testDoubleValue() {
		testVal = new DoubleValue(100.0);
		String json = renderer.toJson(testVal);
		assertEquals("100.0", json);
	}
	
	@Test
	void testDoubleMaxValue() {
		testVal = new DoubleValue(Double.MAX_VALUE);
		String json = renderer.toJson(testVal);
		assertEquals(Double.toString(Double.MAX_VALUE), json);
	}
	
	@Test
	void testDoubleMinValue() {
		testVal = new DoubleValue(Double.MIN_VALUE);
		String json = renderer.toJson(testVal);
		assertEquals(Double.toString(Double.MIN_VALUE), json);
}
	
	@Test
	void testNullValue() {
		testVal = new DoubleValue();
		String json = renderer.toJson(testVal);
		assertEquals("", json);
	}
}
