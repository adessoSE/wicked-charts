package com.googlecode.wickedcharts.highcharts.options.functions;

import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.Function;

/**
 * A javascript function that adds a point to the first series of a chart at the
 * current mouse location. Can be added as click event to {@link ChartOptions}.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class AddPointFunction extends Function {

	//@formatter:off
	public AddPointFunction(){
		
		addParameter("e");
		
		setFunction("   var x = e.xAxis[0].value,"
				+ "         y = e.yAxis[0].value,"
				+ "     series = this.series[0];"
				+ "     series.addPoint([x, y]);");
	}
 //@formatter:on

}
