/**
 * Copyright 2012-2018 Wicked Charts (tom.hombergs@gmail.com)
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

import de.adesso.wickedcharts.highcharts.options.series.Coordinate;
import de.adesso.wickedcharts.highcharts.options.series.CustomCoordinatesSeries;
import org.junit.Test;

/**
 * 
 * @author Matthias Balke (matthias.balke@gmail.com)
 * 
 */
public class CustomCoordinatesSeriesTest extends AbstractSerializerTest {

  @Test
  public void testStringFloatCoordinates() {
    // given
    String dateString1 = "Date.UTC(1970, 9, 27)";
    String dateString2 = "Date.UTC(1971, 1, 12)";

    Coordinate<String, Float> coordinate1 = new Coordinate<String, Float>(
        dateString1, 0f);
    Coordinate<String, Float> coordinate2 = new Coordinate<String, Float>(
        dateString2, 1.6f);

    CustomCoordinatesSeries<String, Float> series = new CustomCoordinatesSeries<String, Float>();
    series
        .addPoint(coordinate1);
    series
        .addPoint(coordinate2);

    JsonRenderer renderer = new JsonRenderer();

    // when
    String json = renderer
        .toJson(series);

    // then
    assertIgnoreWhitespaces("{\n  \"data\" : [ [" + dateString1 + ", 0.0], ["
        + dateString2 + ", 1.6] ]\n}", json);
  }
}
