package de.adesso.wickedcharts.chartjs.jackson.serializer;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;

import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import de.adesso.wickedcharts.chartjs.chartoptions.*;

public class DateAndFormatSerializerTest {

	private JsonRenderer renderer;
	private DateAndFormat testObject;
	
	@Before
	public void setUp() throws Exception {
		renderer = new JsonRenderer();
	}

	@Test
	public void test() {
		String dateFormat = "MM/DD/YYYY";
		
		LocalDateTime date = LocalDateTime.of(2018, 01, 01, 0, 0);
		
		testObject = new DateAndFormat();
		testObject.setDate(date);
		testObject.setFormat(dateFormat);
		
		String json = renderer.toJson(testObject);
		assertEquals("moment('01/01/2018','MM/DD/YYYY')", json);
	}

}
