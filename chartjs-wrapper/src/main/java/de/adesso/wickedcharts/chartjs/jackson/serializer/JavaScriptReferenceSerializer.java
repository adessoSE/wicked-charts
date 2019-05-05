package de.adesso.wickedcharts.chartjs.jackson.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import de.adesso.wickedcharts.chartjs.chartoptions.JavaScriptReference;

import java.io.IOException;

/**
 * Serializes a JavaScriptReference object to JSON
 */
public class JavaScriptReferenceSerializer extends JsonSerializer<JavaScriptReference> {

	@Override
	public void serialize(JavaScriptReference value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException {
		gen.writeRawValue(value.getRef());
	}
}
