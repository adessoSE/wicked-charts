package com.googlecode.wickedcharts.chartjs.jackson.serializer;

import java.io.IOException;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.RgbaColor;

public class RgbaColorSerializer extends JsonSerializer<RgbaColor> {

	
	private static final String RGBA = "rgba(%d,%d,%d,%.2f)";
	
	@Override
	public void serialize(RgbaColor color, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		jgen.writeString(String.format(Locale.ENGLISH, RGBA, color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()));
	}

}
