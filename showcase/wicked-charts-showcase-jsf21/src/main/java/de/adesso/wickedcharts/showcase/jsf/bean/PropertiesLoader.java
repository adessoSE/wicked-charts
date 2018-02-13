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
package de.adesso.wickedcharts.showcase.jsf.bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 * Load maven properties from filtered maven resources file.
 * 
 * @author Matthias Balke (matthias.balke@gmail.com)
 * 
 */
@ManagedBean
@ApplicationScoped
public class PropertiesLoader {

	private final String projectVersion;
	private final String jsfImplementation;
	private final String mojarraVersion;
	private final String myfacesVersion;

	public PropertiesLoader() {
		this.projectVersion = this.loadProperty("project.version");
		this.jsfImplementation = this.loadProperty("jsf-implementation");
		this.mojarraVersion = this.loadProperty("mojarra.version");
		this.myfacesVersion = this.loadProperty("myfaces.version");
	}

	public String loadProperty(String propertyName) {
		InputStream in = this.getClass().getClassLoader()
				.getResourceAsStream("maven-properties.properties");

		if (in == null)
			return "";

		Properties props = new Properties();
		try {
			props.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return props.getProperty(propertyName);
	}

	public String getProjectVersion() {
		return this.projectVersion;
	}

	public String getJsfImplementation() {
		return this.jsfImplementation;
	}

	public String getJsfImplementationVersion() {
		if ("myfaces".equalsIgnoreCase(this.getJsfImplementation())) {
			return this.myfacesVersion;
		} else {
			if ("mojarra".equalsIgnoreCase(this.getJsfImplementation())) {
				return this.mojarraVersion;
			} else {
				return "unknown";
			}
		}
	}
}