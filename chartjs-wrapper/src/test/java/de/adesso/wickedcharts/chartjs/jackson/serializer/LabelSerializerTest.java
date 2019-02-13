package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.chartoptions.label.*;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LabelSerializerTest {

	private JsonRenderer renderer;
	private Label testLabel;
	
	@BeforeEach
	void setUp() {
		renderer = new JsonRenderer();
	}

	@Test
	void testTextLabel() {
		testLabel = new TextLabel("foo");
		String json = renderer.toJson(testLabel);
		assertTrue(json.contains("foo"));
	}
	
	@Test
	void testTextListLabel() {
		testLabel = new TextListLabel("foo","bar");
		String json = renderer.toJson(testLabel);
		assertTrue(json.contains("[ \"foo\", \"bar\" ]"));
	}
	
	@Test
	void testNullTextListLabel() {
		testLabel = new TextListLabel();
		String json = renderer.toJson(testLabel);
		assertEquals("",json);
	}
	
	@Test
	void testConstLabel() {
		testLabel = new ConstLabel("foo");
		String json = renderer.toJson(testLabel);
		assertEquals("'foo'",json);
	}
	
	@Test
	void testDateTimeLabel() {
		testLabel = new DateTimeLabel(LocalDateTime.of(2019, 11, 12, 13, 14));
		String json = renderer.toJson(testLabel);
		assertEquals("moment('2019-11-12T13:14:00',moment.ISO_8601)",json);
	}
	
	
	
}
