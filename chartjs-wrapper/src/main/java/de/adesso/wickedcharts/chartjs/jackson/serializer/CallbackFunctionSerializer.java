package de.adesso.wickedcharts.chartjs.jackson.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import de.adesso.wickedcharts.chartjs.chartoptions.CallbackFunction;

import java.io.IOException;

/**
 * Serializes a CallbackFunction object to JSON
 */
public class CallbackFunctionSerializer extends JsonSerializer<CallbackFunction> {

	@Override
	public void serialize(CallbackFunction value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException {
		gen.writeRawValue(value.getText());
	}

}
