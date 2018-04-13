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

import de.adesso.wickedcharts.highcharts.options.Global;
import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.highcharts.options.drilldown.DrilldownPoint;
import de.adesso.wickedcharts.highcharts.options.interaction.InteractionFunction;
import de.adesso.wickedcharts.highcharts.options.interaction.SelectionFunction;
import de.adesso.wickedcharts.highcharts.options.livedata.LiveDataSeries;

/**
 * Enumeration of the Wicked Charts features that go beyond merely creating JSON
 * output for Highcharts to evaluate.
 *
 * Not all "interpreters" of the {@link Options} class may support each feature
 * listed here. If an interpreter does not support a certain feature, it should
 * throw an exception if the user tries to use it.
 * 
 * @author Tom
 * 
 */
public enum Feature {

	/**
	 * Support of {@link DrilldownPoint}.
	 */
	DRILLDOWN(DrilldownPoint.class),

	/**
	 * Support of {@link LiveDataSeries}.
	 */
	LIVEDATA(LiveDataSeries.class),

	/**
	 * Support of the {@link Global} option class.
	 */
	GLOBAL(Global.class),

	/**
	 * Support of {@link InteractionFunction}.
	 */
	INTERACTION(InteractionFunction.class),

	/**
	 * Support of {@link SelectionFunction}.
	 */
	SELECTION(SelectionFunction.class);

	private final Class<?> featureClass;

	private Feature(Class<?> featureClass) {
		this.featureClass = featureClass;
	}

	public Class<?> getFeatureClass() {
		return featureClass;
	}

}
