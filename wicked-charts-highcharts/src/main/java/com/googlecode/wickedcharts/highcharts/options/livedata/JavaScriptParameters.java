package com.googlecode.wickedcharts.highcharts.options.livedata;

/**
 * Container class for passing javascript parameters to
 * {@link LiveDataSeries#update(JavaScriptParameters)}.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public interface JavaScriptParameters {

	/**
	 * Returns the value of the given parameter or null.
	 * 
	 * @param parameterName
	 *          the name of the parameter. This name was specified when calling
	 *          {@link LiveDataSeries#addJavaScriptParameter(String, String)}.
	 * @return the value of the given parameter or null if the parameter does
	 *         not exist.
	 */
	String getParameterValue(final String parameterName);

}