/**
 * Copyright 2012-2013 Wicked Charts (tom.hombergs@gmail.com)
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

import java.awt.Color;

import org.junit.Test;

import com.googlecode.wickedcharts.highcharts.jackson.JsonRenderer;
import com.googlecode.wickedcharts.highcharts.options.color.ColorReference;
import com.googlecode.wickedcharts.highcharts.options.color.Gradient;
import com.googlecode.wickedcharts.highcharts.options.color.HexColor;
import com.googlecode.wickedcharts.highcharts.options.color.HighchartsColor;
import com.googlecode.wickedcharts.highcharts.options.color.LinearGradient;
import com.googlecode.wickedcharts.highcharts.options.color.SimpleColor;

public class LinearGradientColorReferenceSerializerTest extends
    AbstractSerializerTest {

  @Test
  public void test() {
    // given
    Gradient color = new LinearGradient(0, 1,
        0, 0);
    color
        .addStop(0, new SimpleColor(Color.RED));
    color
        .addStop(0.5, new HighchartsColor(1));
    color
        .addStop(1, new HexColor("#FFFFFF"));
    JsonRenderer renderer = new JsonRenderer();
    String expectedResult = getStringFromResource("LinearGradientColorReference.txt");

    // when
    String json = renderer
        .toJson(color);

    // then
    assertIgnoreWhitespaces(expectedResult, json);
  }

  @Test
  public void testWithBrightness() {
    // given
    Gradient color = new LinearGradient(0, 1,
        0, 0);
    color
        .addStop(0, new SimpleColor(Color.RED));
    color
        .addStop(0.5, new HighchartsColor(1));
    color
        .addStop(1, new HexColor("#FFFFFF"));
    ColorReference c = color
        .brighten(0.5f);
    JsonRenderer renderer = new JsonRenderer();
    String expectedResult = getStringFromResource("LinearGradientColorReference2.txt");

    // when
    String json = renderer
        .toJson(c);

    // then
    assertIgnoreWhitespaces(expectedResult, json);
  }
}
