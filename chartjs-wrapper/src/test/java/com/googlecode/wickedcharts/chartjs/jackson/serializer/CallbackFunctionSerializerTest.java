package com.googlecode.wickedcharts.chartjs.jackson.serializer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.googlecode.wickedcharts.chartjs.chartoptions.CallbackFunction;
import com.googlecode.wickedcharts.chartjs.jackson.JsonRenderer;

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
