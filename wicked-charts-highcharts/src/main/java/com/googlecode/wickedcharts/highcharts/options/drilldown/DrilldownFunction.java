package com.googlecode.wickedcharts.highcharts.options.drilldown;

import com.googlecode.wickedcharts.highcharts.options.Function;

/**
 * A javascript function that when triggered changes the options of the current
 * chart and rerenders the chart.
 * <p/>
 * This class is not part of the public API! Use {@link DrilldownPoint}s to
 * enable drilldown in your charts.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class DrilldownFunction extends Function {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor.
	 * 
	 * @param drilldownArrayName
	 *          name of the javascript array that holds the drilldown options for
	 *          each point.
	 */
	public DrilldownFunction(String drilldownArrayName) {
		setFunction("drilldown(this, " + drilldownArrayName + ");");
	}

}
