package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.chartoptions.label.*;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LabelSerializerTest {

	private JsonRenderer renderer;
	private Label testLabel;
	
	@Before
	public void setUp() throws Exception {
		renderer = new JsonRenderer();
	}

	@Test
	public void testTextLabel() {
		testLabel = new TextLabel("foo");
		String json = renderer.toJson(testLabel);
		assertTrue(json.contains("foo"));
	}
	
	@Test
	public void testTextListLabel() {
		testLabel = new TextListLabel("foo","bar");
		String json = renderer.toJson(testLabel);
		assertTrue(json.contains("[ \"foo\", \"bar\" ]"));
	}
	
	@Test
	public void testNullTextListLabel() {
		testLabel = new TextListLabel();
		String json = renderer.toJson(testLabel);
		assertEquals("",json);
	}
	
	@Test
	public void testConstLabel() {
		testLabel = new ConstLabel("foo");
		String json = renderer.toJson(testLabel);
		assertEquals("'foo'",json);
	}
	
	@Test
	public void testDateTimeLabel() {
		testLabel = new DateTimeLabel(LocalDateTime.of(2018, 11, 12, 13, 14));
		String json = renderer.toJson(testLabel);
		assertEquals("moment('2018-11-12T13:14:00',moment.ISO_8601)",json);
	}
	
	
	
}
