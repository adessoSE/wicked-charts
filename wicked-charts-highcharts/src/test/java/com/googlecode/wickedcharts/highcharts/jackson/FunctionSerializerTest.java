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

import org.junit.Test;

import com.googlecode.wickedcharts.highcharts.options.Function;

/**
 * 
 * @author Matthias Balke <matthias.balke@gmail.com>
 * 
 */
public class FunctionSerializerTest extends AbstractSerializerTest {

	@Test
	public void testNotNull() {
		// given
		Function function = new Function();
		function.setFunction("");
		JsonRenderer renderer = new JsonRenderer();

		// when
		String json = renderer.toJson(function);

		// then
		assertIgnoreWhitespaces("function() {  }", json);
	}

	@Test
	public void testNotNullWithFunction() {
		// given
		Function function = new Function();
		String functionBody = "return 4;";
		function.setFunction(functionBody);
		JsonRenderer renderer = new JsonRenderer();

		// when
		String json = renderer.toJson(function);

		// then
		assertIgnoreWhitespaces("function() { return 4; }", json);
	}
}
