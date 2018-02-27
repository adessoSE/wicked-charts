package de.adesso.wickedcharts.chartjs.jackson.serializer;

import java.io.IOException;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.HexColor;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.RgbColor;

public class HexColorSerializer extends JsonSerializer<HexColor> {
	
	@Override
	public void serialize(HexColor color, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		jgen.writeRawValue(color.getValue());
	}

}
