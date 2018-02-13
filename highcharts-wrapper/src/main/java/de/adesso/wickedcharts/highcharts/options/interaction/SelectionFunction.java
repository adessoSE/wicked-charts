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
package de.adesso.wickedcharts.highcharts.options.interaction;

import de.adesso.wickedcharts.highcharts.options.ChartOptions;
import de.adesso.wickedcharts.highcharts.options.Events;
import de.adesso.wickedcharts.highcharts.options.Function;
import de.adesso.wickedcharts.highcharts.options.IProcessableOption;
import de.adesso.wickedcharts.highcharts.options.Options;

/**
 * This function may be added to a {@link ChartOptions} object via
 * {@link Events#setSelection(Function)}. When the user zooms in or out of chart
 * (i.e. when he selects a portion of the chart), a {@link SelectionEvent} is
 * triggered and transmitted to the server. You can react to this event on the
 * server side by implementing the {@link #onSelect(SelectionEvent)} method.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public abstract class SelectionFunction extends Function implements IProcessableOption {

	public static final String PROCESSING_KEY = "SELECTION";

	private static final long serialVersionUID = 1L;

	public SelectionFunction(final Options parentOptions) {
		parentOptions.markForProcessing(this);
		addParameter("selectionEvent");
		// the function body is left empty since it depends on the web framework
		// what the javascript should look like. Hence, the IOptionsProcessor of the
		// rendering framework must call setFunction() to define the javascript.
	}

	@Override
	public String getProcessingKey() {
		return PROCESSING_KEY;
	}

	/**
	 * This method is called on the server side when the user selected a portion
	 * of the chart (i.e. when he zoomed in or out).
	 * 
	 * @param event
	 *          the selection event containing some information about which
	 *          portions of the chart have been selected.
	 */
	public abstract void onSelect(final SelectionEvent event);

}
