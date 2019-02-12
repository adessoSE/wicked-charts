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
import de.adesso.wickedcharts.highcharts.options.Crosshair;

import java.io.IOException;

public class CrosshairSerializer extends JsonSerializer<Crosshair> {

	@Override
	public void serialize(final Crosshair value, final JsonGenerator jgen, final SerializerProvider provider)
	    throws IOException, JsonProcessingException {

		if (value.getColor() != null || value.getDashStyle() != null || value.getWidth() != null
		    || value.getzIndex() != null) {
			jgen.writeStartObject();
			if (value.getColor() != null) {
				jgen.writeObjectField("color", value.getColor());
			}
			if (value.getDashStyle() != null) {
				jgen.writeObjectField("dashStyle", value.getDashStyle());
			}
			if (value.getWidth() != null) {
				jgen.writeObjectField("width", value.getWidth());
			}
			if (value.getzIndex() != null) {
				jgen.writeObjectField("zIndex", value.getzIndex());
			}
			jgen.writeEndObject();
		} else {
			// if no attributes are given, simply render true
			jgen.writeBoolean(true);
		}

	}
}
