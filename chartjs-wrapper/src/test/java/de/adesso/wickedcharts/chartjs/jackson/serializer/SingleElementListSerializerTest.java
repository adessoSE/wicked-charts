package de.adesso.wickedcharts.chartjs.jackson.serializer;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import de.adesso.wickedcharts.chartjs.ChartConfiguration;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import de.adesso.wickedcharts.chartjs.jackson.serializer.SingleElementListSerializer;

public class SingleElementListSerializerTest {

	public class TestChartConfiguration extends ChartConfiguration {
		
		@JsonSerialize(using = SingleElementListSerializer.class)
		private List<String> listElement;

		public List<String> getListElement() {
			return listElement;
		}

		public void setListElement(List<String> listElement) {
			this.listElement = listElement;
		}

		
	}
	
	private TestChartConfiguration config;
	private JsonRenderer renderer;

	
	@Before
	public void setUp() throws Exception {
		config = new TestChartConfiguration();
		renderer = new JsonRenderer();
	}
	
	@Test
	public void testSingleElement() {
		config.setListElement(Arrays.asList("Eins"));
		
		String json = renderer.toJson(config);
		assertTrue(json.contains("\"listElement\" : \"Eins\""));
	}
	
	
	@Test
	public void testMoreElements() {
		config.setListElement(Arrays.asList("Eins","Zwei"));
		
		String json = renderer.toJson(config);
		assertTrue(json.contains("\"listElement\" : [ \"Eins\", \"Zwei\" ]"));
	}

}
