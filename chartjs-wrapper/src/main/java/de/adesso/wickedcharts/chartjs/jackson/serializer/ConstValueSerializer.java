package de.adesso.wickedcharts.chartjs.jackson.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import de.adesso.wickedcharts.chartjs.chartoptions.valueType.ConstValue;

public class ConstValueSerializer extends JsonSerializer<ConstValue> {

	private static final String FORMAT = "'%s'";
	
	@Override
	public void serialize(ConstValue value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		gen.writeRawValue(String.format(FORMAT, value.getValue()));
		
	}

}
