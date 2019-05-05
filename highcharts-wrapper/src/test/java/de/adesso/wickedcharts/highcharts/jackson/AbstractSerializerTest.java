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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbstractSerializerTest {

	/**
	 * Asserts if two strings are the same, ignoring any white space characters.
	 */
	protected void assertIgnoreWhitespaces(String expected, String actual) {
		expected = expected.replaceAll("\\s", "");
		actual = actual.replaceAll("\\s", "");
		assertEquals(expected, actual);
	}

	protected String getStringFromResource(final String resourceName) {
		try {
			InputStream in = AbstractSerializerTest.class.getResourceAsStream(resourceName);
			StringBuilder buffer = new StringBuilder();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String line;
			while ((line = reader.readLine()) != null) {
				buffer.append(line);
			}
			String result = buffer.toString();
			in.close();
			return result;
		} catch (IOException e) {
			throw new RuntimeException("IOException!", e);
		}
	}
}
