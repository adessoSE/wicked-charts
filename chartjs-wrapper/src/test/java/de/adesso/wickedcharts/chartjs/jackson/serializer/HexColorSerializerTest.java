package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.HexColor;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HexColorSerializerTest {

	private JsonRenderer renderer;
	private HexColor testColor;
	private String testString;

	@Before
	public void setUp() throws Exception {
		renderer = new JsonRenderer();
		testColor = new HexColor(123,234,56);
		testString = "#7BEA38";
	}

	@Test
	public void testHexSerializer() {
		String json = renderer.toJson(testColor);
		assertTrue(json.contains("#7BEA38"));
	}

	@Test
	public void testHexStringSerializer() {
		testColor = new HexColor(testString);
		String json = renderer.toJson(testColor);
		assertTrue(json.contains("#7BEA38"));
	}
}