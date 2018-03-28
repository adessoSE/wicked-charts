package de.adesso.wickedcharts.chartjs.jackson.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.StringValueColor;

/**
 * Serializes a StringValueColor object to JSON.
 */
public class StringValueColorSerializer extends JsonSerializer<StringValueColor> {

	private static final String FORMAT = "'%s'";
	
	@Override
	public void serialize(StringValueColor value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		gen.writeRawValue(String.format(FORMAT, value.getColorname()));
	}

}
