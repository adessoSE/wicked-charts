package de.adesso.wickedcharts.chartjs.jackson.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import de.adesso.wickedcharts.chartjs.chartoptions.label.TextListLabel;

public class TextListLabelSerializer extends JsonSerializer<TextListLabel> {

	@Override
	public void serialize(TextListLabel value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		if(null != value && null != value.getTextList() && !value.getTextList().isEmpty() ) {
			gen.writeObject(value.getTextList());
		}
		else {
			gen.writeRawValue("");
		}
	}

}
