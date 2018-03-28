package de.adesso.wickedcharts.chartjs.jackson.serializer;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;

public class IntegerValueSerializerTest {

	
	private JsonRenderer renderer;
	private IntegerValue testVal;
	
	@Before
	public void setUp() throws Exception{
		renderer = new JsonRenderer();
	}
	
	@Test
	public void testIntegerValue() {
		testVal = new IntegerValue(100);
		String json = renderer.toJson(testVal);
		assertEquals("100", json);
	}
	
	@Test
	public void testIntegerMaxValue() {
		testVal = new IntegerValue(Integer.MAX_VALUE);
		String json = renderer.toJson(testVal);
		assertEquals(new Integer(Integer.MAX_VALUE).toString(), json);
	}
	
	@Test
	public void testIntegerMinValue() {
		testVal = new IntegerValue(Integer.MIN_VALUE);
		String json = renderer.toJson(testVal);
		assertEquals(new Integer(Integer.MIN_VALUE).toString(), json);
	}
	
	
	@Test
	public void testNullValue() {
		testVal = new IntegerValue();
		String json = renderer.toJson(testVal);
		assertEquals("", json);
	}
}
