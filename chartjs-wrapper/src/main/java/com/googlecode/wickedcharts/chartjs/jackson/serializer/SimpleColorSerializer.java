package com.googlecode.wickedcharts.chartjs.jackson.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.RgbColor;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.RgbaColor;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;

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
