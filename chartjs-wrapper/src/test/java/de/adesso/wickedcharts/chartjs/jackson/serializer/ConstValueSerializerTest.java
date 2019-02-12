package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.chartoptions.valueType.ConstValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstValueSerializerTest {

	
	private JsonRenderer renderer;
	private ConstValue testVal;
	
	@BeforeEach
	void setUp() {
		renderer = new JsonRenderer();
	}
	
	@Test
	void testConstValue() {
		testVal = new ConstValue("100");
		String json = renderer.toJson(testVal);
		assertEquals("'100'", json);
	}
	
	@Test
	void testEmptyValue() {
		testVal = new ConstValue("");
		String json = renderer.toJson(testVal);
		assertEquals("''",json);
	}
}
