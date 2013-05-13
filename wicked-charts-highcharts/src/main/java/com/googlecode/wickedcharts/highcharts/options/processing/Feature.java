package com.googlecode.wickedcharts.highcharts.options.processing;

import com.googlecode.wickedcharts.highcharts.options.Global;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.drilldown.DrilldownPoint;
import com.googlecode.wickedcharts.highcharts.options.interaction.InteractionFunction;
import com.googlecode.wickedcharts.highcharts.options.interaction.SelectionFunction;
import com.googlecode.wickedcharts.highcharts.options.livedata.LiveDataSeries;

/**
 * Enumeration of the Wicked Charts features that go beyond merely creating JSON
 * output for Highcharts to evaluate.
 * <p/>
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
