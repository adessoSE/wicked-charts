package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DatasetSerializerTest {
	private JsonRenderer renderer;
	private Dataset testData;
	
	@BeforeEach
	void setUp() {
		renderer = new JsonRenderer();
	}	
	
	@Test
	void testYaxisID() {
		testData = new Dataset();
		testData.setYAxisID("axis-1");
		String json = renderer.toJson(testData);
		assertTrue(json.contains("yAxisID"));
	}

	@Test
	void testXaxisID() {
		testData = new Dataset();
		testData.setXAxisID("axis-1");
		String json = renderer.toJson(testData);
		assertTrue(json.contains("xAxisID"));
	}
}
