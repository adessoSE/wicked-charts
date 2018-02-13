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
package de.adesso.wickedcharts.highcharts.options.functions;

import de.adesso.wickedcharts.highcharts.options.Function;
import de.adesso.wickedcharts.highcharts.options.Tooltip;

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
