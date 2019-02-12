/**
 *   Copyright 2012-2019 Wicked Charts (http://github.com/adessoAG/wicked-charts)
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
package de.adesso.wickedcharts.highcharts.options;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Matthias Balke (matthias.balke@gmail.com)
 * 
 */
public class Function implements Serializable {

	private static final long serialVersionUID = 1L;

	private String function;

	private final List<String> parameters = new ArrayList<String>();

	public Function() {
	}

	public Function(final String functionBody) {
		this.function = functionBody;
	}

	public String getFunction() {
		String result = getSignature();
		result += "{";
		result += getBody();
		result += "}";
		return result;
	}

	public String getBody() {
		String result = "";
		if (this.function != null) {
			result += this.function;
		}
		return result;
	}

	public Function setFunction(final String functionBody) {
		this.function = functionBody;
		return this;
	}

	/**
	 * With this function, you can add parameters to the signature of the
	 * javascript function. All parameters added with this method will be included
	 * as parameters in the rendered function call.
	 * 
	 * @param parameter
	 *          the name of the parameter.
	 */
	protected void addParameter(final String parameter) {
		this.parameters.add(parameter);
	}

	private String getSignature() {
		if (this.parameters.isEmpty()) {
			return "function()";
		} else {
			String signature = "function(";
			boolean first = true;
			for (String param : this.parameters) {
				if (!first) {
					signature += ",";
				}
				signature += param;
				first = false;
			}
			signature += ")";
			return signature;
		}
	}

}
