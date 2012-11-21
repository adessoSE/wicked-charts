package com.googlecode.wickedcharts.highcharts.options.functions;

import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;

/**
 * A javascript function intended to use as tooltip formatter. If used as
 * tooltip formatter, it displays the total value and the value of the selected
 * stack of a stacked bar or column chart.
 * 
 * @see Tooltip#setFormatter(Function)
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class StackTotalFormatter extends Function {

	private static final long serialVersionUID = 1L;

	public StackTotalFormatter() {
		setFunction("return '<b>'" + "+ this.x " + "+'</b><br/>'" + "+this.series.name +': '" + "+ this.y " + "+'<br/>'"
		    + "+'Total: '" + "+ this.point.stackTotal;");
	}
}
