package com.googlecode.wickedcharts.highcharts.options.livedata;

import com.googlecode.wickedcharts.highcharts.options.interaction.BaseEvent;

/**
 * An object of this event is passed to
 * {@link LiveDataSeries#update(JavaScriptParameters)}.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class LiveDataUpdateEvent extends BaseEvent {

	private JavaScriptParameters parameters;

	/**
	 * Sets the javascript parameters that are evaluated on the client side and
	 * transmitted to the server.
	 * 
	 * @param parameters
	 *          parameters that have been passed from javascript. You can define
	 *          parameters to be transmitted from client side javascript to the
	 *          server by calling {@link #addJavaScriptParameter(String, String)}.
	 */
	public void setParameters(final JavaScriptParameters parameters) {
		this.parameters = parameters;
	}

	public JavaScriptParameters getParameters() {
		return this.parameters;
	}

}
