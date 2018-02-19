package de.adesso.wickedcharts.chartjs.jackson.serializer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.AbsoluteIndex;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.BooleanFillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.BoundaryFillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.FillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.RelativeIndex;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.DoubleValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.FloatValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;

public class DoubleValueSerializerTest {

	private JsonRenderer renderer;
	private DoubleValue testVal;
	
	@Before
	public void setUp() throws Exception {
		renderer = new JsonRenderer();
	}

	@Test
	public void testDoubleValue() {
		testVal = new DoubleValue(100.0);
		String json = renderer.toJson(testVal);
		assertEquals("100.0",json);
	}
	
	@Test
	public void testDoubleMaxValue() {
		testVal = new DoubleValue(Double.MAX_VALUE);
		String json = renderer.toJson(testVal);
		assertEquals(new Double(Double.MAX_VALUE).toString(),json);
	}
	
	@Test
	public void testFloatMinValue() {
		testVal = new DoubleValue(Double.MIN_VALUE);
		String json = renderer.toJson(testVal);
		assertEquals(new Double(Double.MIN_VALUE).toString(),json);
	}
	
	//@Test
	public void testNullValue() {
		testVal = new DoubleValue();
		String json = renderer.toJson(testVal);
		assertEquals("",json);
	}
}
