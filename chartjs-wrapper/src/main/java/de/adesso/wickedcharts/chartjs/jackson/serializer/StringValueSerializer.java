package de.adesso.wickedcharts.chartjs.jackson.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.StringValue;

import java.io.IOException;

/**
 * Serializes a StringValue object to JSON.
 */
public class StringValueSerializer extends JsonSerializer<StringValue> {

	@Override
	public void serialize(StringValue value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException {
		if(value.getValue() != null) {
			gen.writeString(value.getValue());
		}
		
	}

}
