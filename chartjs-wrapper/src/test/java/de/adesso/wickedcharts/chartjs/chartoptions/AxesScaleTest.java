package de.adesso.wickedcharts.chartjs.chartoptions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;

public class AxesScaleTest {

	private JsonRenderer renderer;
	private AxesScale testObject;
	
	@Before
	public void setUp() throws Exception {
		renderer = new JsonRenderer();
		testObject = new AxesScale();
	}

	@Test
	public void testStackedSet() {
		testObject.setStacked(true);
		testObject.setDisplay(true);
		String json = renderer.toJson(testObject);
		
		assertTrue(json.contains("\"stacked\" : true"));
		assertTrue(json.contains("\"display\" : true"));
	}
	
	@Test
	public void testStackedNotSet() {
		String json = renderer.toJson(testObject);
		
		assertFalse(json.contains("\"stacked\" : "));
	}

}
