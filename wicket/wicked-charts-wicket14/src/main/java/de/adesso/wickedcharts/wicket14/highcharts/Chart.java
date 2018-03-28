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
package de.adesso.wickedcharts.wicket14.highcharts;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.highcharts.theme.Theme;
import de.adesso.wickedcharts.wicket14.highcharts.features.basic.ChartBehavior;

public class Chart extends WebMarkupContainer {
	private static final long serialVersionUID = 1L;

	private Options options;

	private Theme theme;

	private JavascriptResourceReference themeReference;

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

	public JavascriptResourceReference getThemeReference() {
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
	public void setTheme(final JavascriptResourceReference theme) {
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
			final JavascriptResourceReference themeReference) {
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
