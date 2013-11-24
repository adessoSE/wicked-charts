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
package com.googlecode.wickedcharts.highcharts.options.interaction;

import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.IProcessableOption;
import com.googlecode.wickedcharts.highcharts.options.Options;

/**
 * This javascript function sends an AJAX request to the server. That request
 * contains some information about what point and series the user has selected
 * in the chart. That information is available on the server side as an
 * {@link InteractionEvent} object.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public abstract class InteractionFunction extends Function implements IProcessableOption {

	/**
	 * The key under which {@link InteractionFunction}s are registered in the
	 * parent options. See {@link Options#markForProcessing(IProcessableOption)} .
	 */
	public static final String PROCESSING_KEY = "INTERACTION";

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor.
	 * 
	 * @param parentOptions
	 *          the Options object that contain this function.
	 */
	public InteractionFunction(Options parentOptions) {
		parentOptions.markForProcessing(this);
		// the function body is left empty since it depends on the web framework
		// what the javascript should look like. Hence, the IOptionsProcessor of the
		// rendering framework must call setFunction() to define the javascript.
	}

	@Override
	public String getProcessingKey() {
		return PROCESSING_KEY;
	}

	/**
	 * This method is called on the server side when the
	 * {@link InteractionFunction} is called on the client side.
	 * 
	 * @param event
	 *          the {@link InteractionEvent} containing information about which
	 *          Point of which Series and which Chart has been interacted with.
	 */
	public abstract void onInteraction(InteractionEvent event);

}
