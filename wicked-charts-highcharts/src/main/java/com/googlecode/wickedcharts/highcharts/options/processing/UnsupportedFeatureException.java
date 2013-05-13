package com.googlecode.wickedcharts.highcharts.options.processing;

/**
 * This exception is thrown when a Wicked Charts interpreter finds an option it
 * does not support.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class UnsupportedFeatureException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UnsupportedFeatureException(Feature feature) {
		super(
		    String
		        .format(
		            "The feature %s is not supported by this Wicked Charts interpreter. This exception was thrown because you used the class %s in your chart Options.",
		            feature, feature.getFeatureClass()));
	}
}
