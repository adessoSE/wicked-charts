package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.chartoptions.valueType.StringValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringValueSerializerTest {

	private JsonRenderer renderer;
	private StringValue testVal;
	
	@BeforeEach
	void setUp() {
		renderer = new JsonRenderer();
	}
	
	@Test
	void testStringValue() {
		testVal = new StringValue("100");
		String json = renderer.toJson(testVal);
		assertEquals("\"100\"", json);
	}
	
	@Test
	void testEmptyValue() {
		testVal = new StringValue("");
		String json = renderer.toJson(testVal);
		assertEquals("\"\"", json);
	}

	@Test
	void testNullValue() {
		testVal = new StringValue();
		String json = renderer.toJson(testVal);
		assertEquals("", json);
	}
}
