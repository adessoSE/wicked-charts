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
package de.adesso.wickedcharts.highcharts.options.processing;

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
