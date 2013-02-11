package com.googlecode.wickedcharts.highcharts.options.interaction;

public class BaseEvent {

	private String javascriptChartName;

	/**
	 * Sets the name of the javascript variable holding the Highcharts "chart"
	 * object.
	 * 
	 * @param javascriptChartName
	 *          the name of the javascript variable holding the Highcharts "chart"
	 *          object.
	 */
	public void setJavascriptChartName(final String javascriptChartName) {
		this.javascriptChartName = javascriptChartName;
	}

	/**
	 * Returns the name of the javascript variable holding the Highcharts "chart"
	 * object. The name of this variable can be used to create custom javascript
	 * on the server side when an event is fired via AJAX. The so created
	 * javascript can then be executed on the client.
	 * 
	 * @return the name of the javascript variable holding the Highcharts "chart"
	 *         object.
	 * @see http://api.highcharts.com/highcharts#Chart
	 */
	public String getJavascriptChartName() {
		return this.javascriptChartName;
	}

}
