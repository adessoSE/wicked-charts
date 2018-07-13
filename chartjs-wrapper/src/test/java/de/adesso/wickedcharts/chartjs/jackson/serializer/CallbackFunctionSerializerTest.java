package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.chartoptions.CallbackFunction;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CallbackFunctionSerializerTest {
	
	private JsonRenderer renderer;
	private CallbackFunction testCallbackFunction;
	
	@Before
	public void setUp() throws Exception {
		renderer = new JsonRenderer();
	}

	@Test
	public void testSerialization() {
		String functionName = "function foo(bar);";
		testCallbackFunction = new CallbackFunction(functionName);
		String json = renderer.toJson(testCallbackFunction);
		assertEquals(json,functionName);
	}
	
	

}
