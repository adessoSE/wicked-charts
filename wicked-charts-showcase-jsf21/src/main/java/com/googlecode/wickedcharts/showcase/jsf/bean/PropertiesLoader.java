package com.googlecode.wickedcharts.showcase.jsf.bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 * Load maven properties from filtered maven resources file.
 * 
 * @author Matthias Balke <matthias.balke@gmail.com>
 * 
 */
@ManagedBean
@ApplicationScoped
public class PropertiesLoader {

	private final String projectVersion;
	private final String myFacesVersion;

	public PropertiesLoader() {
		this.projectVersion = this.loadProperty("project.version");
		this.myFacesVersion = this.loadProperty("myFaces.version");
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

	public String getMyFacesVersion() {
		return this.myFacesVersion;
	}
}