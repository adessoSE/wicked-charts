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
package com.googlecode.wickedcharts.highcharts.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.googlecode.wickedcharts.highcharts.options.PixelOrPercent;

public class PixelOrPercentSerializer extends JsonSerializer<PixelOrPercent> {

	@Override
	public void serialize(final PixelOrPercent value, final JsonGenerator jgen, final SerializerProvider provider)
	    throws IOException, JsonProcessingException {

		switch (value.getUnit()) {
			case PERCENT:
				jgen.writeString(value.getValue() + "%");
				break;
			case PIXELS:
				jgen.writeNumber(value.getValue());
				break;
			default:
				throw new RuntimeException("Invalid Unit: " + value.getUnit());
		}
	}

}
