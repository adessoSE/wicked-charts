package de.adesso.wickedcharts.chartjs.jackson.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.RgbColor;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.RgbaColor;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;

import java.io.IOException;

/**
 * Serializes a SimpleColor object to JSON.
 */
public class SimpleColorSerializer extends JsonSerializer<SimpleColor> {

	// TODO: Would be nice if the serializer is chosen by the colorClass
	private JsonSerializer<RgbColor> rgbSerializer = new RgbColorSerializer();
	private JsonSerializer<RgbaColor> rgbaSerializer = new RgbaColorSerializer();
	
	@Override
	public void serialize(SimpleColor color, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		if(color.getColorClass() == RgbColor.class) {
			rgbSerializer.serialize((RgbColor)color.getColor(), jgen, provider);
		}
		if(color.getColorClass() == RgbaColor.class) {
			rgbaSerializer.serialize((RgbaColor)color.getColor(), jgen, provider);
		}
	}
}
