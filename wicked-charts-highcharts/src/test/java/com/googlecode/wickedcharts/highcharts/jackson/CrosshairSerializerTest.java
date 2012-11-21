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

import org.junit.Assert;
import org.junit.Test;

import com.googlecode.wickedcharts.highcharts.jackson.JsonRenderer;
import com.googlecode.wickedcharts.highcharts.options.Crosshair;
import com.googlecode.wickedcharts.highcharts.options.GridLineDashStyle;

public class CrosshairSerializerTest extends AbstractSerializerTest {

	@Test
	public void testEmpty() {
		// given
		Crosshair crosshair = new Crosshair();
		JsonRenderer renderer = new JsonRenderer();

		// when
		String json = renderer.toJson(crosshair);

		// then
		Assert.assertEquals("true", json);
	}

	@Test
	public void testFull() {
		// given
		Crosshair crosshair = new Crosshair().setWidth(10).setDashStyle(GridLineDashStyle.DOT);
		JsonRenderer renderer = new JsonRenderer();

		// when
		String json = renderer.toJson(crosshair);

		// then
		assertIgnoreWhitespaces("{\"dashStyle\":\"dot\",\"width\":10}", json);
	}

}
