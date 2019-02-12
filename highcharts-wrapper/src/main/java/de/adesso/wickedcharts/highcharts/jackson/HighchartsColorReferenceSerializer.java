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
import com.fasterxml.jackson.databind.SerializerProvider;
import de.adesso.wickedcharts.highcharts.options.color.HighchartsColor;

import java.io.IOException;
import java.util.Locale;

public class HighchartsColorReferenceSerializer extends ColorReferenceSerializer<HighchartsColor> {

	private static final String HIGHCHARTS_COLOR = "Highcharts.getOptions().colors[%d]";

	@Override
	protected void serializeIfNotNull(final HighchartsColor color, final JsonGenerator jgen,
	    final SerializerProvider provider) throws IOException, JsonProcessingException {
		if (color.getBrightness() == null) {
			jgen.writeRawValue(String.format(HIGHCHARTS_COLOR, color.getHighchartsIndex()));
		} else {
			String colorString = String.format(Locale.ENGLISH, HIGHCHARTS_COLOR, color.getHighchartsIndex());
			colorString = brighten(colorString, color.getBrightness());
			jgen.writeRawValue(colorString);
		}

	}

}
