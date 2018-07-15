package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.*;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FillingModeSerializerTest {

	private JsonRenderer renderer;
	private FillingMode testObject;
	
	@Before
	public void setUp() throws Exception {
		renderer = new JsonRenderer();
	}

	@Test
	public void testBoundaryFillingModeStart() {
		testObject = BoundaryFillingMode.START;
		String json = renderer.toJson(testObject);
		assertEquals("'start'",json);
	}
	
	@Test
	public void testBoundaryFillingModeOrigin() {
		testObject = BoundaryFillingMode.ORIGIN;
		String json = renderer.toJson(testObject);
		assertEquals("'origin'",json);
	}
	
	@Test
	public void testBoundaryFillingModeEnd() {
		testObject = BoundaryFillingMode.END;
		String json = renderer.toJson(testObject);
		assertEquals("'end'",json);
	}
	
	@Test
	public void testBooleanFillingModeTrue() {
		testObject = BooleanFillingMode.FALSE;
		String json = renderer.toJson(testObject);
		assertEquals("false",json);
	}
	
	@Test
	public void testAbsoluteIndex() {
		testObject = new AbsoluteIndex(1);
		String json = renderer.toJson(testObject);
		assertEquals("1",json);
	}
	
	@Test
	public void testRelativeIndex() {
		testObject = new RelativeIndex("-1");
		String json = renderer.toJson(testObject);
		assertEquals("'-1'",json);
	}

}
