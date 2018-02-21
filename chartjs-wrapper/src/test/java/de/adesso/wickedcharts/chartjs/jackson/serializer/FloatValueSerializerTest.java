package de.adesso.wickedcharts.chartjs.jackson.serializer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.AbsoluteIndex;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.BooleanFillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.BoundaryFillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.FillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.RelativeIndex;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.FloatValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;

public class FloatValueSerializerTest {

	private JsonRenderer renderer;
	private FloatValue testVal;
	
	@Before
	public void setUp() throws Exception {
		renderer = new JsonRenderer();
	}

	@Test
	public void testFloatValue() {
		testVal = new FloatValue(100.0f);
		String json = renderer.toJson(testVal);
		assertEquals("100.0",json);
	}
	
	@Test
	public void testFloatMaxValue() {
		testVal = new FloatValue(Float.MAX_VALUE);
		String json = renderer.toJson(testVal);
		assertEquals(new Float(Float.MAX_VALUE).toString(),json);
	}
	
	@Test
	public void testFloatMinValue() {
		testVal = new FloatValue(Float.MIN_VALUE);
		String json = renderer.toJson(testVal);
		assertEquals(new Float(Float.MIN_VALUE).toString(),json);
	}
	
	@Test
	public void testNullValue() {
		testVal = new FloatValue();
		String json = renderer.toJson(testVal);
		assertEquals("",json);
	}
}
