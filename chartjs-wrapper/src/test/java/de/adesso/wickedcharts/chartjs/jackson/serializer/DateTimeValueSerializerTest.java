package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.chartoptions.valueType.DateTimeValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateTimeValueSerializerTest {


	private JsonRenderer renderer;

	@BeforeEach
	void setUp() {
		renderer = new JsonRenderer();
	}
	
	@Test
	void testNullValue() {
		DateTimeValue testVal = new DateTimeValue();
		String json = renderer.toJson(testVal);
		assertEquals("", json);
	}
}
