/**
 *   Copyright 2012 Wicked Charts (http://wicked-charts.googlecode.com)
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
package com.googlecode.wickedcharts;

import java.io.IOException;
import java.text.MessageFormat;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.googlecode.wickedcharts.highcharts.JSF21JsonRendererFactory;
import com.googlecode.wickedcharts.highcharts.jackson.JsonRenderer;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.theme.Theme;

/**
 * 
 * @author Matthias Balke <matthias.balke@gmail.com>
 * 
 */
@FacesComponent("com.googlecode.wickedcharts.Chart")
public class UIChart extends UIOutput {

	private String style;
	private Options options;
	private Theme theme;
	private String themeUrlRef;

	private final static String PRE_JS = "\n<script type=\"text/javascript\">\n/*<![CDATA[*/\ndocument.addEventListener(\"DOMContentLoaded\", function onDom(event) {\n";
	private final static String POST_JS = "\n;});\n/*]]>*/\n</script>";

	@Override
	public void encodeEnd(FacesContext context) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
		writer.startElement("div", this);
		writer.writeAttribute("id", this.getId(), null);

		if (this.getStyle() != null && !this.getStyle().isEmpty()) {
			writer.writeAttribute("style", this.getStyle(), null);
		}

		writer.endElement("div");

		JsonRenderer renderer = JSF21JsonRendererFactory.getInstance()
				.getRenderer();

		String chartVarname = this.getId();
		String optionsVarname = this.getId() + "Options";

		Options options = this.getOptions();
		options.getChart().setRenderTo(this.getId());

		// include Theme JS
		this.addThemeJavaScript(writer, renderer);

		writer.append(UIChart.PRE_JS);
		// include Chart JS
		writer.append(MessageFormat.format(
				"var {0} = {1};\nvar {2} = new Highcharts.Chart({0});",
				optionsVarname, renderer.toJson(options), chartVarname));

		writer.append(UIChart.POST_JS);
	}

	private void addThemeJavaScript(ResponseWriter writer, JsonRenderer renderer)
			throws IOException {

		// prepare Theme JS
		if (this.getThemeUrlRef() != null) {
			// include js file from url or local
			writer.append(MessageFormat
					.format("\n<script type=\"text/javascript\" src=\"{0}\"></script>\n",
							this.getThemeUrlRef()));

		} else if (this.getTheme() != null) {
			writer.append(UIChart.PRE_JS);
			writer.append(MessageFormat.format("Highcharts.setOptions({0})",
					renderer.toJson(this.getTheme())));
			writer.append(UIChart.POST_JS);

		}
	}

	public String getStyle() {
		return this.style;
	}

	/**
	 * Sets the CSS style of the chart container.
	 * 
	 * @param cssStyle
	 *            the css style.
	 */
	public void setStyle(String cssStyle) {
		this.style = cssStyle;
	}

	public Options getOptions() {
		this.options = (Options) this.getStateHelper().eval("options");
		return this.options;
	}

	/**
	 * Sets the options that define the content of the chart.
	 * 
	 * @param options
	 *            the options.
	 */
	public void setOptions(Options options) {
		this.options = options;
	}

	public Theme getTheme() {
		this.theme = (Theme) this.getStateHelper().eval("theme");

		return this.theme;
	}

	/**
	 * Sets the {@link Theme} object to be used for this theme.
	 * 
	 * @param theme
	 *            the theme to use.
	 */
	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public String getThemeUrlRef() {
		return this.themeUrlRef;
	}

	/**
	 * Sets the URL to the theme javascript file that is to be used for this
	 * chart.
	 * 
	 * @param themeUrlRef
	 *            absolute or relative URL to the theme javascript file.
	 * @see http://www.highcharts.com/documentation/how-to-use
	 */
	public void setThemeUrlRef(String themeUrlRef) {
		this.themeUrlRef = themeUrlRef;
	}

}
