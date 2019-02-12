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
import de.adesso.wickedcharts.highcharts.options.series.ThreeDCoordinate;

import java.io.IOException;

/**
 * @param <X> Type of x coordinate
 * @param <Y> Type of y coordinate
 * @param <Z> Type of z coordinate
 * @author Matthias Balke (matthias.balke@gmail.com)
 */
public class ThreeDimensionalCoordinateSerializer<X, Y, Z> extends JsonSerializer<ThreeDCoordinate<X, Y, Z>> {

    @Override
    public void serialize(final ThreeDCoordinate<X, Y, Z> value, final JsonGenerator jgen, final SerializerProvider provider)
            throws IOException, JsonProcessingException {

        String xString = String.valueOf(value.getX());
        if (value.isXQuoted()) {
            xString = "'" + xString + "'";
        }

        String yString = String.valueOf(value.getY());
        if (value.isYQuoted()) {
            yString = "'" + yString + "'";
        }

        String zString = String.valueOf(value.getZ());
        if (value.isZQuoted()) {
            zString = "'" + zString + "'";
        }

        jgen.writeRawValue("[" + xString + ", " + yString + ", " + zString + "]");
    }
}
