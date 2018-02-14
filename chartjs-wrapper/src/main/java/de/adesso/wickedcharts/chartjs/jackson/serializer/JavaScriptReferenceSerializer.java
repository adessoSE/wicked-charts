package de.adesso.wickedcharts.chartjs.jackson.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import de.adesso.wickedcharts.chartjs.chartoptions.JavaScriptReference;

public class JavaScriptReferenceSerializer extends JsonSerializer<JavaScriptReference> {

	@Override
	public void serialize(JavaScriptReference value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		gen.writeRawValue(value.getRef());
	}

}
