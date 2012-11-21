package com.googlecode.wickedcharts.highcharts.options.functions;

import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;

/**
 * A javascript function intended to use as tooltip formatter. If used as
 * tooltip formatter, it displays the point name and the percentage of the
 * currently selected point. You can specify the number of decimal digits by
 * calling {@link Tooltip#setPercentageDecimals(Integer)}.
 * <p/>
 * Example: "PointName: 10.5%".
 * 
 * 
 * @see Tooltip#setFormatter(Function)
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class PercentageFormatter extends Function {

	private static final long serialVersionUID = 1L;

	public PercentageFormatter() {
		setFunction("return '<b>'+ this.point.name +':</b> ' +' ('+ this.percentage +'%)';");
	}
}
