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

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import de.adesso.wickedcharts.highcharts.options.series.Coordinate;

import java.io.IOException;

/**
 * @param <T> Type of x coordinate
 * @param <U> Type of y coordinate
 * @author Matthias Balke (matthias.balke@gmail.com)
 */
public class CoordinateSerializer<T, U> extends JsonSerializer<Coordinate<T, U>> {

    @Override
    public void serialize(final Coordinate<T, U> value, final JsonGenerator jgen, final SerializerProvider provider)
            throws IOException, JsonProcessingException {

        String xString = String.valueOf(value.getX());
        if (value.isXQuoted()) {
            xString = "'" + xString + "'";
        }

        String yString = String.valueOf(value.getY());
        if (value.isYQuoted()) {
            yString = "'" + yString + "'";
        }

        jgen.writeRawValue("[" + xString + ", " + yString + "]");
    }
}
