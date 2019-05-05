/*
 * Copyright 2012-2019 Wicked Charts (tom.hombergs@gmail.com)
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

import de.adesso.wickedcharts.highcharts.options.PixelOrPercent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PixelOrPercentSerializerTest {

	@Test
	void testPercent() {
		// given
		PixelOrPercent percent = new PixelOrPercent(10,
				PixelOrPercent.Unit.PERCENT);
		JsonRenderer renderer = new JsonRenderer();

		// when
		String json = renderer.toJson(percent);

		// then
		assertEquals("\"10%\"", json);
	}

	@Test
	void testPixel() {
		// given
		PixelOrPercent pixel = new PixelOrPercent(55,
				PixelOrPercent.Unit.PIXELS);
		JsonRenderer renderer = new JsonRenderer();

		// when
		String json = renderer.toJson(pixel);

		// then
		assertEquals("55", json);
	}

}
