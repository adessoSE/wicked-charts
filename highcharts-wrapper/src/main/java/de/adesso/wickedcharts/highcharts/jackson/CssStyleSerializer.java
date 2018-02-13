/**
 *   Copyright 2012-2013 Wicked Charts (http://wicked-charts.googlecode.com)
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

import java.io.IOException;
import java.util.Map.Entry;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import de.adesso.wickedcharts.highcharts.options.CssStyle;

/**
 * 
 * @author Matthias Balke (matthias.balke@gmail.com)
 * 
 */
public class CssStyleSerializer extends JsonSerializer<CssStyle> {

	@Override
	public void serialize(final CssStyle value, final JsonGenerator jgen, final SerializerProvider provider)
	    throws IOException, JsonProcessingException {

		StringBuilder cssStyleBuilder = new StringBuilder();
		cssStyleBuilder.append("{");

		for (Entry<String, String> property : value.getProperties().entrySet()) {
			cssStyleBuilder.append("\"" + property.getKey() + "\": \"" + property.getValue() + "\",");
		}

		int lastCommaPosition = cssStyleBuilder.lastIndexOf(",");
		if (lastCommaPosition != -1) {
			cssStyleBuilder.deleteCharAt(lastCommaPosition);
		}
		cssStyleBuilder.append(" }");

		jgen.writeRawValue(cssStyleBuilder.toString());

	}

}
