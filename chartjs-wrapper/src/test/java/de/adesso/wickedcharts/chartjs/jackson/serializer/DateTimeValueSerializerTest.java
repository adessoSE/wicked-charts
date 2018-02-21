package de.adesso.wickedcharts.chartjs.jackson.serializer;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.junit.Before;
import org.junit.Test;

import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.AbsoluteIndex;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.BooleanFillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.BoundaryFillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.FillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.RelativeIndex;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.DateTimeValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;

public class DateTimeValueSerializerTest {

	private JsonRenderer renderer;
	private DateTimeValue testVal;
	
	@Before
	public void setUp() throws Exception {
		renderer = new JsonRenderer();
	}
	
	@Test
	public void testNullValue() {
		testVal = new DateTimeValue();
		String json = renderer.toJson(testVal);
		assertEquals("",json);
	}
}
