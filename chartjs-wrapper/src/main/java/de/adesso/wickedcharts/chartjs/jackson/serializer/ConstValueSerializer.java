package de.adesso.wickedcharts.chartjs.jackson.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.ConstValue;

import java.io.IOException;
/**
 * Serializes a ConstValue object to JSON
 */
public class ConstValueSerializer extends JsonSerializer<ConstValue> {

	private static final String FORMAT = "'%s'";
	
	@Override
	public void serialize(ConstValue value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		gen.writeRawValue(String.format(FORMAT, value.getValue()));
		
	}

}
