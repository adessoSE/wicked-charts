/**
 *   Copyright 2012-2019 Wicked Charts (http://github.com/adessoAG/wicked-charts)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package de.adesso.wickedcharts.highcharts.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import de.adesso.wickedcharts.highcharts.options.DateTimeLabelFormat;
import de.adesso.wickedcharts.highcharts.options.DateTimeLabelFormat.DateTimeProperties;

import java.io.IOException;
import java.util.Map.Entry;

public class DateTimeLabelFormatSerializer extends JsonSerializer<DateTimeLabelFormat> {

	@Override
	public void serialize(final DateTimeLabelFormat value, final JsonGenerator jgen, final SerializerProvider provider)
	    throws IOException, JsonProcessingException {

		StringBuilder dateTimeFormatBuilder = new StringBuilder();
		dateTimeFormatBuilder.append("{");

		for (Entry<DateTimeProperties, String> property : value.getProperties().entrySet()) {
			dateTimeFormatBuilder.append(" " + property.getKey().toCode() + ": '" + property.getValue() + "',");
		}

		int lastCommaPosition = dateTimeFormatBuilder.lastIndexOf(",");
		if (lastCommaPosition != -1) {
			dateTimeFormatBuilder.deleteCharAt(lastCommaPosition);
		}
		dateTimeFormatBuilder.append(" }");

		jgen.writeRawValue(dateTimeFormatBuilder.toString());
	}

}
