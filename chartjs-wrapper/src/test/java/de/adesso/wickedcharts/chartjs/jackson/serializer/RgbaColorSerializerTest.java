package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.RgbaColor;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RgbaColorSerializerTest {

	private JsonRenderer renderer;
	private RgbaColor testColor;
	
	@BeforeEach
	void setUp() {
		renderer = new JsonRenderer();
		testColor = new RgbaColor(123,234,56,.7f);
	}

	@Test
	void testRgbaSerializer() {
		String json = renderer.toJson(testColor);
		assertTrue(json.contains("rgba(123,234,56,0.70)"));
	}

}
