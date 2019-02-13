package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.RgbColor;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RgbColorSerializerTest {

	private JsonRenderer renderer;
	private RgbColor testColor;
	
	@BeforeEach
	void setUp() {
		renderer = new JsonRenderer();
		testColor = new RgbColor(234,56,7);
	}
	
	@Test
	void testRgbaSerializer() {
		String json = renderer.toJson(testColor);
		
		assertTrue(json.contains("rgb(234,56,7)"));
	}


}
