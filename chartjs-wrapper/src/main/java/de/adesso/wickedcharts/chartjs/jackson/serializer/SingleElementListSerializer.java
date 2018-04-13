package de.adesso.wickedcharts.chartjs.jackson.serializer;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import de.adesso.wickedcharts.chartjs.jackson.SingleElementListObjectMapper;

/**
 * Serializes a SingleElementList object to JSON.
 */
public class SingleElementListSerializer extends JsonSerializer<List<?>> {

	@Override
	public void serialize(List<?> value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		SingleElementListObjectMapper.getInstance().writeValue(gen, value);
	}
}
