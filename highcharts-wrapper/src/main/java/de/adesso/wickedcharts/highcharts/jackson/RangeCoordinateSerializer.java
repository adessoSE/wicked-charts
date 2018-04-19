/**
 *   Copyright 2012-2018 Wicked Charts (http://github.com/adessoAG/wicked-charts)
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

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import de.adesso.wickedcharts.highcharts.options.series.RangeCoordinate;

/**
 * Serializer for {@link RangeCoordinate}s.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 * @param <X>
 *          Type of x coordinate
 * @param <Y1>
 *          Type of y1 coordinate
 * @param <Y2>
 *          Type of y2 coordinate
 */
public class RangeCoordinateSerializer<X, Y1, Y2> extends JsonSerializer<RangeCoordinate<X, Y1, Y2>> {

	@Override
	public void serialize(final RangeCoordinate<X, Y1, Y2> value, final JsonGenerator jgen,
	    final SerializerProvider provider) throws IOException, JsonProcessingException {

		jgen.writeRawValue("[" + value.getX() + ", " + value.getY1() + ", " + value.getY2() + "]");
	}
}
