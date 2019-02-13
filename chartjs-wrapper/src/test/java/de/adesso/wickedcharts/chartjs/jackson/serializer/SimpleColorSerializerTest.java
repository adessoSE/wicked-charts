package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class SimpleColorSerializerTest {

	private SimpleColor testColor;
	private JsonRenderer renderer;

	@BeforeEach
	void setUp() {
		renderer = new JsonRenderer();
	}

	@Test
	void testRgbColor() {
		testColor = SimpleColor.BLUE;

		String json = renderer.toJson(testColor);
		assertTrue(json.contains("rgb(54,162,235)"));
	}

	@Test
	void testRgbaColor() {
		testColor = SimpleColor.BLUE_TRANSPARENT;

		String json = renderer.toJson(testColor);
		assertTrue(json.contains("rgba(54,162,235,0.50)"));
	}

}
