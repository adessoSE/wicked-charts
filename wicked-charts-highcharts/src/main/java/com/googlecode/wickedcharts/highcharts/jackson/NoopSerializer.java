package com.googlecode.wickedcharts.highcharts.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * A serializer that produces null JSON output. This serializer is used for
 * features that are not supported by default.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class NoopSerializer extends JsonSerializer<Object> {

	@Override
	public void serialize(Object object, JsonGenerator jgen, SerializerProvider provider) throws JsonGenerationException,
	    IOException {
		jgen.writeNull();
	}

}
