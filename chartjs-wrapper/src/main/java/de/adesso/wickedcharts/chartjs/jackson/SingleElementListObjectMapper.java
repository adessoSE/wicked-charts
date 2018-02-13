package de.adesso.wickedcharts.chartjs.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class SingleElementListObjectMapper {
	
	
	private static final ObjectMapper MAPPER = new ObjectMapper().enable(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
	
	private SingleElementListObjectMapper() {
	}

	public static ObjectMapper getInstance() {
		return MAPPER;
	}
	

}
