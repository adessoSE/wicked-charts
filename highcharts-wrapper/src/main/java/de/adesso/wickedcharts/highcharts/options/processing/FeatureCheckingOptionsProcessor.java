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
package de.adesso.wickedcharts.highcharts.options.processing;

import de.adesso.wickedcharts.highcharts.options.Options;

import java.util.Arrays;
import java.util.List;

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
