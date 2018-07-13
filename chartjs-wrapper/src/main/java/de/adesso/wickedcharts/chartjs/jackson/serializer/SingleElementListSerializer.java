package de.adesso.wickedcharts.chartjs.jackson.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import de.adesso.wickedcharts.chartjs.jackson.SingleElementListObjectMapper;

import java.io.IOException;
import java.util.List;

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
