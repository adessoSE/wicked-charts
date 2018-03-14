/**
 *   Copyright 2012-2013 Wicked Charts (http://wicked-charts.googlecode.com)
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
package de.adesso.wickedcharts.showcase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.io.IOUtils;
import org.apache.wicket.model.IModel;

public class StringFromResourceModel implements IModel<String> {

	private static final long serialVersionUID = 1L;

	private String modelObject;

	public StringFromResourceModel(Class<?> scope, String resourceName) {
		InputStream in = null;
		BufferedReader reader = null;
		try {
			in = scope.getResourceAsStream(resourceName);
			reader = new BufferedReader(
					new InputStreamReader(in));
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = reader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
			}
			this.modelObject = stringBuffer.toString();
		} catch (IOException e) {
			throw new RuntimeException("Error reading resource '"
					+ resourceName + "' from class '" + scope.getName() + "'.",
					e);
		} finally {
			IOUtils.closeQuietly(in);
			IOUtils.closeQuietly(reader);
		}
	}

	@Override
	public void detach() {
		// do nothing
	}

	@Override
	public String getObject() {
		return this.modelObject;
	}

	@Override
	public void setObject(String object) {
		this.modelObject = object;
	}

}
