package de.adesso.wickedcharts.chartjs.jackson.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;

public class IntegerValueSerializer extends JsonSerializer<IntegerValue> {

	@Override
	public void serialize(IntegerValue value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		if(value.getValue() != null)
			gen.writeNumber(value.getValue());
	}

}
