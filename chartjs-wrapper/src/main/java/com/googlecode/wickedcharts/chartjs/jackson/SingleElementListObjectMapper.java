package com.googlecode.wickedcharts.chartjs.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SingleElementListObjectMapper {
	
	
	private static final ObjectMapper MAPPER = new ObjectMapper();
	
	private SingleElementListObjectMapper() {
	}

	public static ObjectMapper getInstance() {
		return MAPPER;
	}
	

}
