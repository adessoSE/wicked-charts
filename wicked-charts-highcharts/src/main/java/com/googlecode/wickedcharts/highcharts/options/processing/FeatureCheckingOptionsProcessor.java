package com.googlecode.wickedcharts.highcharts.options.processing;

import java.util.Arrays;
import java.util.List;

import com.googlecode.wickedcharts.highcharts.options.Options;

/**
 * This {@link IOptionsProcessor} checks if the {@link Options} object contains
 * certain features that may not be supported by all interpreters and throws an
 * exception if a feature is not supported. The supported features are provided
 * in the constructor.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class FeatureCheckingOptionsProcessor implements IOptionsProcessor {

	private List<Feature> supportedFeatures;

	public FeatureCheckingOptionsProcessor(Feature... supportedFeatures) {
		this.supportedFeatures = Arrays.asList(supportedFeatures);
	}

	@Override
	public void processOptions(Options options, OptionsProcessorContext context) {
		for (Feature feature : Feature.values()) {
			if (!supportedFeatures.contains(feature) && context.containsFeature(feature)) {
				throw new UnsupportedFeatureException(feature);
			}
		}
	}

}
