
package de.adesso.wickedcharts.chartjs.jackson.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import de.adesso.wickedcharts.chartjs.chartoptions.Label;
import de.adesso.wickedcharts.chartjs.jackson.SingleElementListObjectMapper;

public class LabelSerializer extends JsonSerializer<Label> {

	@Override
	public void serialize(Label value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		SingleElementListObjectMapper.getInstance().writeValue(gen, value.getTextList());
	}

}