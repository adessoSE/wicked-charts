package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.StringValueColor;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


class StringValueColorSerializerTest {

	private JsonRenderer renderer;
	private StringValueColor testColor;

	@BeforeEach
	void setUp() {
		renderer = new JsonRenderer();
		testColor = new StringValueColor("pink");
	}

	@Test
	void testSingleStringValueColor() {
		String json = renderer.toJson(testColor);
		assertTrue(json.contains("'pink'"));
	}
	
	@Test
	void testStringValueColorList() {
		List<StringValueColor> testColorList = Arrays.asList(new StringValueColor("pink"), new StringValueColor("red"));
		String json = renderer.toJson(testColorList);
		assertTrue(json.contains("[ 'pink', 'red' ]"));
	}
}
