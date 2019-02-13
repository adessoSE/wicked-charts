package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.*;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FillingModeSerializerTest {

	private JsonRenderer renderer;
	private FillingMode testObject;
	
	@BeforeEach
	void setUp() {
		renderer = new JsonRenderer();
	}

	@Test
	void testBoundaryFillingModeStart() {
		testObject = BoundaryFillingMode.START;
		String json = renderer.toJson(testObject);
		assertEquals("'start'",json);
	}
	
	@Test
	void testBoundaryFillingModeOrigin() {
		testObject = BoundaryFillingMode.ORIGIN;
		String json = renderer.toJson(testObject);
		assertEquals("'origin'",json);
	}
	
	@Test
	void testBoundaryFillingModeEnd() {
		testObject = BoundaryFillingMode.END;
		String json = renderer.toJson(testObject);
		assertEquals("'end'",json);
	}
	
	@Test
	void testBooleanFillingModeTrue() {
		testObject = BooleanFillingMode.FALSE;
		String json = renderer.toJson(testObject);
		assertEquals("false",json);
	}
	
	@Test
	void testAbsoluteIndex() {
		testObject = new AbsoluteIndex(1);
		String json = renderer.toJson(testObject);
		assertEquals("1",json);
	}
	
	@Test
	void testRelativeIndex() {
		testObject = new RelativeIndex("-1");
		String json = renderer.toJson(testObject);
		assertEquals("'-1'",json);
	}

}
