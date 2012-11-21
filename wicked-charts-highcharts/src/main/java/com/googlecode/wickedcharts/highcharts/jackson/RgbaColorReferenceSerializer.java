/**
 * Copyright 2012 Tom Hombergs (tom.hombergs@gmail.com)
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
import java.util.Locale;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.googlecode.wickedcharts.highcharts.options.color.RgbaColor;

public class RgbaColorReferenceSerializer extends ColorReferenceSerializer<RgbaColor> {

	private static final String RGBA = "rgba(%d,%d,%d,%.2f)";

	@Override
	protected void serializeIfNotNull(final RgbaColor color, final JsonGenerator jgen, final SerializerProvider provider)
	    throws IOException, JsonProcessingException {
		if (color.getBrightness() == null) {
			jgen.writeString(String.format(Locale.ENGLISH, RGBA, color.getRed(), color.getGreen(), color.getBlue(),
			    color.getAlpha()));
		} else {
			String colorString = brighten(
			    "\""
			        + String.format(Locale.ENGLISH, RGBA, color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha())
			        + "\"", color.getBrightness());
			jgen.writeRawValue(colorString);
		}

	}

}
