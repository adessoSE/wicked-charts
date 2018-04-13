package de.adesso.wickedcharts.chartjs.jackson.serializer;

import java.io.IOException;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.HexColor;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.RgbColor;

/**
 * Serializes a HexColor object to JSON
 */
public class HexColorSerializer extends JsonSerializer<HexColor> {

	private static final String HEX = "'#%02X%02X%02X'";

	@Override
	public void serialize(HexColor color, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		jgen.writeRawValue(String.format(HEX, color.getRed(), color.getGreen(), color.getBlue()));
	}
}