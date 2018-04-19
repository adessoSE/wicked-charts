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
import de.adesso.wickedcharts.highcharts.options.Center;

public class CenterSerializerTest {

	@Test
	public void testPercent() {
		// given
		Center center = new Center(10, 20, Center.Unit.PERCENT);
		JsonRenderer renderer = new JsonRenderer();

		// when
		String json = renderer.toJson(center);

		// then
		Assert.assertEquals("[ \"10%\", \"20%\" ]", json);
	}

	@Test
	public void testPixels() {
		// given
		Center center = new Center(5, -20, Center.Unit.PIXELS);
		JsonRenderer renderer = new JsonRenderer();

		// when
		String json = renderer.toJson(center);

		// then
		Assert.assertEquals("[ 5, -20 ]", json);
	}

}
