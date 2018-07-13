package de.adesso.wickedcharts.chartjs.jackson.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import de.adesso.wickedcharts.chartjs.chartoptions.label.ConstLabel;

import java.io.IOException;

/**
 * Serializes a ConstLabel object to JSON
 */
public class ConstLabelSerializer extends JsonSerializer<ConstLabel> {

	private static final String FORMAT = "'%s'";
	@Override
	public void serialize(ConstLabel value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		gen.writeRawValue(String.format(FORMAT, value.getText()));
	}

}
