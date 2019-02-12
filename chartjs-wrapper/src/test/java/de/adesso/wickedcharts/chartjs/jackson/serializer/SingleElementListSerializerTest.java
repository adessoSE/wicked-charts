package de.adesso.wickedcharts.chartjs.jackson.serializer;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import de.adesso.wickedcharts.chartjs.ChartConfiguration;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SingleElementListSerializerTest {

	public class TestChartConfiguration extends ChartConfiguration {
		
		@JsonSerialize(using = SingleElementListSerializer.class)
		private List<String> listElement;

		public List<String> getListElement() {
			return listElement;
		}

		void setListElement(List<String> listElement) {
			this.listElement = listElement;
		}

		
	}
	
	private TestChartConfiguration config;
	private JsonRenderer renderer;

	
	@BeforeEach
	void setUp() {
		config = new TestChartConfiguration();
		renderer = new JsonRenderer();
	}
	
	@Test
	void testSingleElement() {
		config.setListElement(Collections.singletonList("Eins"));
		
		String json = renderer.toJson(config);
		assertTrue(json.contains("\"listElement\" : \"Eins\""));
	}
	
	
	@Test
	void testMoreElements() {
		config.setListElement(Arrays.asList("Eins","Zwei"));
		
		String json = renderer.toJson(config);
		assertTrue(json.contains("\"listElement\" : [ \"Eins\", \"Zwei\" ]"));
	}

}
