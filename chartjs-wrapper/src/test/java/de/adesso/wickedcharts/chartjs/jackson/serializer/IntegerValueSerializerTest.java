package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerValueSerializerTest {

	
	private JsonRenderer renderer;
	private IntegerValue testVal;
	
	@BeforeEach
	void setUp() {
		renderer = new JsonRenderer();
	}
	
	@Test
	void testIntegerValue() {
		testVal = new IntegerValue(100);
		String json = renderer.toJson(testVal);
		assertEquals("100", json);
	}
	
	@Test
	void testIntegerMaxValue() {
		testVal = new IntegerValue(Integer.MAX_VALUE);
		String json = renderer.toJson(testVal);
		assertEquals(Integer.toString(Integer.MAX_VALUE), json);
	}
	
	@Test
	void testIntegerMinValue() {
		testVal = new IntegerValue(Integer.MIN_VALUE);
		String json = renderer.toJson(testVal);
		assertEquals(Integer.toString(Integer.MIN_VALUE), json);
	}
	
	
	@Test
	void testNullValue() {
		testVal = new IntegerValue();
		String json = renderer.toJson(testVal);
		assertEquals("", json);
	}
}
