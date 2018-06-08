package de.adesso.wickedcharts.chartjs.jackson.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;

import java.io.IOException;

/**
 * Serializes a TextLabel object to JSON.
 */
public class TextLabelSerializer extends JsonSerializer<TextLabel> {

	@Override
	public void serialize(TextLabel value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		gen.writeString(value.getText());
	}

}
