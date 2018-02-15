package de.adesso.wickedcharts.chartjs.jackson.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.FillingMode;

public class FillingModeSerializer extends JsonSerializer<FillingMode> {

	private static final String STRING_FORMAT = "'%s'";
	private static final String BOOLEAN_FORMAT = "%s";
	private static final String INTEGER_FORMAT = "%s";
	
	@Override
	public void serialize(FillingMode value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		if(value.getReturnType().equals(String.class)) {
			gen.writeRawValue(String.format(STRING_FORMAT, ((String) value.getValue()))); 
		}
		else if(value.getReturnType().equals(Boolean.class)) {
			gen.writeRawValue(String.format(BOOLEAN_FORMAT, ((Boolean) value.getValue()).toString())); 
		}
		else if(value.getReturnType().equals(Integer.class)) {
			gen.writeRawValue(String.format(INTEGER_FORMAT, ((Integer) value.getValue()).toString())); 
		}
		
		
	}

}
