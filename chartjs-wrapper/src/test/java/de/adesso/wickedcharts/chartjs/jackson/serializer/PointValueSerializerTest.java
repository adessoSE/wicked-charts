package de.adesso.wickedcharts.chartjs.jackson.serializer;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.PointValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;

public class PointValueSerializerTest {
	
	private JsonRenderer renderer;
	private PointValue testVal;
	
	@Before
	public void setUp() throws Exception{
		renderer = new JsonRenderer();
	}
	
	@Test
	public void testIntegerValue() {
		testVal = new PointValue(100, 100);
		String json = renderer.toJson(testVal);
		assertEquals("100", json);
	}
	
	@Test
	public void testPointValueMaxValue() {
		testVal = new PointValue(Integer.MAX_VALUE, Integer.MAX_VALUE);
		String json = renderer.toJson(testVal);
		assertEquals(new Integer(Integer.MAX_VALUE).toString(), json);
	}
	
	
	@Test
	public void testPointValueValue() {
		testVal = new PointValue(Integer.MIN_VALUE, Integer.MIN_VALUE);
		String json = renderer.toJson(testVal);
		assertEquals(new Integer(Integer.MIN_VALUE).toString(), json);
	}
	
	@Test
	public void testNullValue() {
		testVal = new PointValue();
		String json = renderer.toJson(testVal);
		System.out.println(json);
		assertEquals("", json);
	}
}
