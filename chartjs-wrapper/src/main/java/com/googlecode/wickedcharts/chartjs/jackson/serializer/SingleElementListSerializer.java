package com.googlecode.wickedcharts.chartjs.jackson.serializer;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.googlecode.wickedcharts.chartjs.jackson.SingleElementListObjectMapper;

public class SingleElementListSerializer extends JsonSerializer<List<?>> {

	
	@Override
	public void serialize(List<?> value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		if (!serializers.getConfig().isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) {
			SingleElementListObjectMapper.getInstance().enable(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED).writeValue(gen, value);
		} else {
			gen.writeObject(value);
		}
	}
}
