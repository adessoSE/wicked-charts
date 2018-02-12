package com.googlecode.wickedcharts.chartjs.jackson.serializer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.googlecode.wickedcharts.chartjs.ChartConfiguration;
import com.googlecode.wickedcharts.chartjs.jackson.JsonRenderer;
import com.googlecode.wickedcharts.chartjs.json.LowercaseEnum;

public class LowercaseEnumSerializerTest {

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

		public void setTestEnum(TestEnum testEnum) {
			this.testEnum = testEnum;
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
	public void testLowercase() {
		config.setTestEnum(TestEnum.LOWERCASE);
		
		String json = renderer.toJson(config);
		assertTrue(json.contains("lowercase"));
	}

}
