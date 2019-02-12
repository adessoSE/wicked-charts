package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.chartoptions.CallbackFunction;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CallbackFunctionSerializerTest {
	
	private JsonRenderer renderer;

	@BeforeEach
	void setUp() {
		renderer = new JsonRenderer();
	}

	@Test
	void testSerialization() {
		String functionName = "function foo(bar);";
		CallbackFunction testCallbackFunction = new CallbackFunction(functionName);
		String json = renderer.toJson(testCallbackFunction);
		assertEquals(json,functionName);
	}
	
	

}
