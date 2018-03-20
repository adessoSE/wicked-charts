package de.adesso.wickedcharts.chartjs.jackson.serializer;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;

import de.adesso.wickedcharts.chartjs.chartoptions.valueType.DateTimeValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;


public class DateTimeValueSerializerTest {


	private JsonRenderer renderer;
	private DateTimeValue testVal;
	
	@Before 
	public void setUp() throws Exception{
		renderer = new JsonRenderer();
	}
	
	@Test
	public void testNullValue() {
		testVal = new DateTimeValue();
		String json = renderer.toJson(testVal);
		assertEquals("", json);
	}
}
