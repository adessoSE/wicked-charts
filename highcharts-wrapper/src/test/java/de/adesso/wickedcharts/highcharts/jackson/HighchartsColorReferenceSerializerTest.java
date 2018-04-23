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

import org.junit.Assert;
import org.junit.Test;

import de.adesso.wickedcharts.highcharts.jackson.JsonRenderer;
import de.adesso.wickedcharts.highcharts.options.color.ColorReference;
import de.adesso.wickedcharts.highcharts.options.color.HighchartsColor;

public class HighchartsColorReferenceSerializerTest {

  @Test
  public void testWithHighchartsIndex() {
    // given
    ColorReference color = new HighchartsColor(3);
    JsonRenderer renderer = new JsonRenderer();

    // when
    String json = renderer.toJson(color);

    // then
    Assert.assertEquals("Highcharts.getOptions().colors[" + 3 + "]", json);
  }

  @Test
  public void testWithHighchartsIndexAndBrightness() {
    // given
    ColorReference color = new HighchartsColor(3);
    color = color.brighten(0.2f);
    JsonRenderer renderer = new JsonRenderer();

    // when
    String json = renderer.toJson(color);

    // then
    Assert.assertEquals("Highcharts.Color(Highcharts.getOptions().colors[" + 3
        + "]).brighten(0.20).get()", json);
  }

}
