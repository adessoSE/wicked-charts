package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.RgbColor;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RgbColorSerializerTest {

	private JsonRenderer renderer;
	private RgbColor testColor;
	
	@Before
	public void setUp() throws Exception {
		renderer = new JsonRenderer();
		testColor = new RgbColor(234,56,7);
	}
	
	@Test
	public void testRgbaSerializer() {
		String json = renderer.toJson(testColor);
		
		assertTrue(json.contains("rgb(234,56,7)"));
	}


}
