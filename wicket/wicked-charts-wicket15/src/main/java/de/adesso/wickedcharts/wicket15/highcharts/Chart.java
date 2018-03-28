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
package de.adesso.wickedcharts.wicket15.highcharts;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.request.resource.JavaScriptResourceReference;

import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.highcharts.theme.Theme;
import de.adesso.wickedcharts.wicket15.highcharts.features.basic.ChartBehavior;

/**
 * A simple markup container to display a chart. A chart can be provided with
 * the following data:
 * <ul>
 * <li><strong>options:</strong> the options define the content of the chart and
 * can also define the look and feel of the chart to a given extent. The
 * {@link Options} class is very similar in structure to the Highcharts API. See
 * <a href="http://api.highcharts.com/highcharts">http://api.highcharts.com/
 * highcharts</a> for more information of what all the options mean.</li>
 * <li><strong>theme:</strong> the theme defines the look and feel of a chart.
 * If no theme is provided, the default theme of Highcharts is used. A
 * {@link Theme} can contain any configuration an {@link Options} object, so it
 * acts as a template for creating charts. It should contain all the
 * configurations common to all the charts you want to display. Note that a
 * theme is set globally, so all charts on one page have the same theme!
 * </ul>
 * Please note that due to a bug in the Highcharts javascript library,
 * <strong>it is currently not possible to change the theme of a chart via
 * AJAX</strong>. If you do this, only the configuration options defined in the
 * new theme are overridden. Any configuration options defined in the old theme 
 * and not in the new theme will stay active.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Chart extends WebMarkupContainer {

	private static final long serialVersionUID = 1L;

	private Options options;

	private Theme theme;

	private JavaScriptResourceReference themeReference;

	private String themeUrl;

	public Chart(final String id, final Options options) {
		super(id);
		this.options = options;
		setOutputMarkupId(true);
		add(createChartBehavior());
	}

	public Chart(final String id, final Options options, final Theme theme) {
		super(id);
		this.options = options;
		this.setTheme(theme);
		setOutputMarkupId(true);
		add(createChartBehavior());
	}

	public Options getOptions() {
		return this.options;
	}

	public Theme getTheme() {
		return this.theme;
	}

	public JavaScriptResourceReference getThemeReference() {
		return this.themeReference;
	}

	public String getThemeUrl() {
		return this.themeUrl;
	}

	public void setOptions(final Options options) {
		this.options = options;
	}

	/**
	 * Sets the theme for this chart by specifying a reference to a javascript
	 * file containing the theme. The javascript file must contain the following
	 * code: <code><pre>
	 * Highcharts.setOptions(myOptions);
	 * </pre></code> where <code>myOptions</code> is a JSON representation of
	 * the theme options.
	 * <p/>
	 * A theme can only be set via one setTheme method. An
	 * {@link IllegalStateException} will be thrown if you call two setTheme
	 * methods.
	 * 
	 * @see <a
	 *      href="http://www.highcharts.com/demo">http://www.highcharts.com/demo</a>
	 * @param theme
	 *            reference to a javascript file containing a theme.
	 */
	public void setTheme(final JavaScriptResourceReference theme) {
		if (this.theme != null || this.themeUrl != null) {
			throw new IllegalStateException(
					"A theme can only be defined once. Calling different setTheme methods is not allowed!");
		}
		this.themeReference = theme;
	}

	/**
	 * Sets the theme for this chart by specifying a URL to a javascript file
	 * containing the theme. The javascript file must contain the following
	 * code: <code><pre>
	 * Highcharts.setOptions(myOptions);
	 * </pre></code> where <code>myOptions</code> is a JSON representation of
	 * the theme options.
	 * <p/>
	 * A theme can only be set via one setTheme method. An
	 * {@link IllegalStateException} will be thrown if you call two setTheme
	 * methods.
	 * 
	 * @see <a
	 *      href="http://www.highcharts.com/demo">http://www.highcharts.com/demo</a>
	 * @param theme
	 *            reference to a javascript file containing a theme.
	 */
	public void setTheme(final String themeUrl) {
		if (this.themeReference != null || this.theme != null) {
			throw new IllegalStateException(
					"A theme can only be defined once. Calling different setTheme methods is not allowed!");
		}
		this.themeUrl = themeUrl;
	}

	/**
	 * Sets the theme for this chart by specifying a theme class.
	 * <p/>
	 * A theme can only be set via one setTheme method. An
	 * {@link IllegalStateException} will be thrown if you call two setTheme
	 * methods.
	 * 
	 * @param theme
	 *            the theme class.
	 */
	public void setTheme(final Theme theme) {
		if (this.themeReference != null || this.themeUrl != null) {
			throw new IllegalStateException(
					"A theme can only be defined once. Calling different setTheme methods is not allowed!");
		}
		this.theme = theme;
	}

	public void setThemeReference(
			final JavaScriptResourceReference themeReference) {
		this.themeReference = themeReference;
	}

	public void setThemeUrl(final String themeUrl) {
		this.themeUrl = themeUrl;
	}

	/**
	 * Factory method for {@link ChartBehavior}s. May be overridden, if a custom
	 * implementation of {@link ChartBehavior} is needed.
	 */
	protected ChartBehavior createChartBehavior() {
		return new ChartBehavior(this);
	}

}
