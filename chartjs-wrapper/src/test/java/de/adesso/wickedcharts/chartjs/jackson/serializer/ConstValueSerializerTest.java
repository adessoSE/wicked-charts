package de.adesso.wickedcharts.chartjs.jackson.serializer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.adesso.wickedcharts.chartjs.chartoptions.valueType.ConstValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;

public class ConstValueSerializerTest {
	
	private JsonRenderer renderer;
	private ConstValue testVal;
	
	@Before
	public void setUp() throws Exception{
		renderer = new JsonRenderer();
	}
	
	@Test
	public void testConstValue() {
		testVal = new ConstValue("100");
		String json = renderer.toJson(testVal);
		System.out.println(json);
		assertEquals("'100'", json);
	}
	
	@Test
	public void testEmptyValue() {
		testVal = new ConstValue("");
		String json = renderer.toJson(testVal);
		System.out.println(json);
		assertEquals("''", json);
	}
}