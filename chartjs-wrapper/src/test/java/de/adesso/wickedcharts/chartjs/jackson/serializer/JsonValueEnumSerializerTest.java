package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.ChartConfiguration;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import de.adesso.wickedcharts.chartjs.json.JsonValueEnum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class JsonValueEnumSerializerTest {
	
	public enum TestEnum implements JsonValueEnum {
		LOWERCASE("lowercase"),
		MIXED("miXeD"),
		UPPERCASE("UPPERCASE");

		private String jsonValue;
		
		private TestEnum(String jsonValue) {
			this.jsonValue = jsonValue;
		}
		
		@Override
		public String getJsonValue() {
			return jsonValue;
		}
	}
	
	public class TestChartConfiguration extends ChartConfiguration {
		
		private TestEnum testEnum;

		public TestEnum getTestEnum() {
			return testEnum;
		}

		void setTestEnum(TestEnum testEnum) {
			this.testEnum = testEnum;
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
	void testLowercase() {
		config.setTestEnum(TestEnum.LOWERCASE);
		
		String json = renderer.toJson(config);
		assertTrue(json.contains("lowercase"));
	}
	
	
	@Test
	void testMixed() {
		config.setTestEnum(TestEnum.MIXED);
		
		String json = renderer.toJson(config);
		assertTrue(json.contains("miXeD"));
	}
	
	
	@Test
	void testUppercase() {
		config.setTestEnum(TestEnum.UPPERCASE);
		
		String json = renderer.toJson(config);
		assertTrue(json.contains("UPPERCASE"));
	}
	

}
