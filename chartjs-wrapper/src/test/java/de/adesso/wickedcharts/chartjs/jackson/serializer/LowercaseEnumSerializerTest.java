package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.ChartConfiguration;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import de.adesso.wickedcharts.chartjs.json.LowercaseEnum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LowercaseEnumSerializerTest {

	public enum TestEnum implements LowercaseEnum {
		LOWERCASE,
		MIXED,
		UPPERCASE;
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

}
