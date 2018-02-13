package de.adesso.wickedcharts.chartjs.jackson.serializer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.adesso.wickedcharts.chartjs.chartoptions.Label;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;

public class LabelSerializerTest {

	private JsonRenderer renderer;
	private Label testLabel;
	
	@Before
	public void setUp() throws Exception {
		renderer = new JsonRenderer();
	}

	@Test
	public void testSingleElement() {
		testLabel = new Label("foo");
		String json = renderer.toJson(testLabel);
		assertTrue(json.contains("foo"));
	}
	
	@Test
	public void testMultipleElements() {
		testLabel = new Label("foo","bar");
		String json = renderer.toJson(testLabel);
		assertTrue(json.contains("[ \"foo\", \"bar\" ]"));
	}

}
