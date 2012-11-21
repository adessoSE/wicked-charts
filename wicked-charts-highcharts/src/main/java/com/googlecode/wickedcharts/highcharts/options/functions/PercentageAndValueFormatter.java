package com.googlecode.wickedcharts.highcharts.options.functions;

import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;

/**
 * A javascript function intended to use as tooltip formatter. If used as
 * tooltip formatter, it displays the series name, the value and the percentage
 * of the currently selected point.
 * <p/>
 * Example: "SeriesName: 5 (10%)".
 * 
 * 
 * @see Tooltip#setFormatter(Function)
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class PercentageAndValueFormatter extends Function {

	private static final long serialVersionUID = 1L;

	public PercentageAndValueFormatter() {
		setFunction("return ''+ this.series.name +': '+ this.y +' ('+ Math.round(this.percentage) +'%)';");
	}
}
