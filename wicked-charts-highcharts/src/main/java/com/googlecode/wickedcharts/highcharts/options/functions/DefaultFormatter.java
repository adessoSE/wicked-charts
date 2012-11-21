package com.googlecode.wickedcharts.highcharts.options.functions;

import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;

/**
 * A simple javascript function intended to use as tooltip formatter. If used as
 * tooltip formatter, the series name and the currently selected y value are
 * displayed as tooltip.
 * <p/>
 * Example: "Series: 4".
 * 
 * @see Tooltip#setFormatter(Function)
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class DefaultFormatter extends Function {

	private static final long serialVersionUID = 1L;

	public DefaultFormatter() {
		setFunction("return ''+ this.series.name +': '+ this.y +'';");
	}

}
