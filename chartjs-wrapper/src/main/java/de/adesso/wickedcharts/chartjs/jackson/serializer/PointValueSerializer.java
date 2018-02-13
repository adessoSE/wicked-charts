package de.adesso.wickedcharts.chartjs.jackson.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import de.adesso.wickedcharts.chartjs.chartoptions.PointValue;

public class PointValueSerializer extends JsonSerializer<PointValue> {

	
	@Override
	public void serialize(PointValue value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {

		gen.writeStartObject();
		gen.writeObjectField("x", value.getX());
		gen.writeObjectField("y", value.getY());
		gen.writeEndObject();
	}

}
