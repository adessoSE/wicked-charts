package com.googlecode.wickedcharts.chartjs.jackson.serializer;

import java.io.IOException;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.RgbColor;

public class RgbColorSerializer extends JsonSerializer<RgbColor> {

	
	private static final String RGB = "rgb(%d,%d,%d)";
	
	@Override
	public void serialize(RgbColor color, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		jgen.writeString(String.format(Locale.ENGLISH, RGB, color.getRed(), color.getGreen(), color.getBlue()));
	}

}
