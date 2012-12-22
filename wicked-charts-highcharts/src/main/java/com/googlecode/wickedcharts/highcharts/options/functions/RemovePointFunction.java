package com.googlecode.wickedcharts.highcharts.options.functions;

import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.PointOptions;

/**
 * A javascript function that removes the currently selected point from a chart.
 * Can be added as click event to {@link PointOptions}.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class RemovePointFunction extends Function {

	public RemovePointFunction() {
		setFunction("if (this.series.data.length > 1) this.remove();");
	}

}
