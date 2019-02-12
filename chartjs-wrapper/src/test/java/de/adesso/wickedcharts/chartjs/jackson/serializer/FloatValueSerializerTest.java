package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.chartoptions.valueType.FloatValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FloatValueSerializerTest {
	
	private JsonRenderer renderer;
	private FloatValue testVal;
	
	@BeforeEach
	void setUp() {
		renderer = new JsonRenderer();
	}

	@Test
	void testFloatValue() {
		testVal = new FloatValue(100.0f);
		String json = renderer.toJson(testVal);
		assertEquals("100.0", json);
	}
	
	@Test
	void testFloatMaxValue() {
		testVal = new FloatValue(Float.MAX_VALUE);
		String json = renderer.toJson(testVal);
		assertEquals(Float.toString(Float.MAX_VALUE), json);
	}
	
	@Test
	void testFloatMinValue() {
		testVal = new FloatValue(Float.MIN_VALUE);
		String json = renderer.toJson(testVal);
		assertEquals(Float.toString(Float.MIN_VALUE), json);
	}
	  
	@Test
	void testNullValue() {
		testVal = new FloatValue();
		String json = renderer.toJson(testVal);
		assertEquals("", json);
	}
}
