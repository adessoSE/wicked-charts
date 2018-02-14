package de.adesso.wickedcharts.chartjs.jackson.serializer;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import de.adesso.wickedcharts.chartjs.chartoptions.DateAndFormat;

public class DateAndFormatSerializer extends JsonSerializer<DateAndFormat> {

	private static final String MOMENT_FORMAT = "moment('%s',moment.ISO_8601)";
	private static final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
	
	
	
	@Override
	public void serialize(DateAndFormat value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		String dateOutput = value.getDate().format(formatter);
		String output = String.format(MOMENT_FORMAT, dateOutput);
		gen.writeRawValue(output);
	}

}
