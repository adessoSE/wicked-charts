/**
 *   Copyright 2012-2018 Wicked Charts (http://github.com/adessoAG/wicked-charts)
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
package de.adesso.wickedcharts.highcharts.options.functions;

import de.adesso.wickedcharts.highcharts.options.ChartOptions;
import de.adesso.wickedcharts.highcharts.options.Function;

/**
 * A javascript function that adds a point to the first series of a chart at the
 * current mouse location. Can be added as click event to {@link ChartOptions}.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class AddPointFunction extends Function {

  private static final long serialVersionUID = 1L;

	//@formatter:off
	public AddPointFunction(){
		
		this.addParameter("e");
		
		this.setFunction("   var x = e.xAxis[0].value,"
				+ "         y = e.yAxis[0].value,"
				+ "     series = this.series[0];"
				+ "     series.addPoint([x, y]);");
	}
 //@formatter:on

}
