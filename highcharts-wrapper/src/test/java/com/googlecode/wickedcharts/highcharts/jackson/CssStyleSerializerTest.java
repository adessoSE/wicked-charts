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

import org.junit.Assert;
import org.junit.Test;

import com.googlecode.wickedcharts.highcharts.jackson.JsonRenderer;
import com.googlecode.wickedcharts.highcharts.options.CssStyle;

/**
 * 
 * @author Matthias Balke <matthias.balke@gmail.com>
 * 
 */
public class CssStyleSerializerTest extends AbstractSerializerTest{

	@Test
	public void testOneProperty() {
		// given
		CssStyle style = new CssStyle();
		style.setProperty("fontSize", "1.3em");
		JsonRenderer renderer = new JsonRenderer();

		// when
		String json = renderer.toJson(style);

		// then
		assertIgnoreWhitespaces("{ \"fontSize\": \"1.3em\" }", json);
	}

	@Test
	public void testTwoProperties() {
		// given
		CssStyle style = new CssStyle();
		style.setProperty("fontSize", "1.3em");
		style.setProperty("border", "1px solid #000000");
		JsonRenderer renderer = new JsonRenderer();

		// when
		String json = renderer.toJson(style);

		// then
        assertIgnoreWhitespaces("{ \"border\": \"1px solid #000000\", \"fontSize\": \"1.3em\" }", json);
	}

	
}
