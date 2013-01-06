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
package com.googlecode.wickedcharts.highcharts.options;

import java.io.Serializable;

/**
 * Defines the configuration of the "exporting" option.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#exporting">http://api.highcharts.com/highcharts#exporting</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class ExportingOptions implements Serializable {

	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private Boolean enabled;

	private Boolean enableImages;

	private String filename;

	private ExportingMimeType type;

	private String url;

	private Integer width;

	private ExportingButtons buttons;

	public ExportingButtons getButtons() {
		return this.buttons;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public Boolean getEnableImages() {
		return this.enableImages;
	}

	public String getFilename() {
		return this.filename;
	}

	public ExportingMimeType getType() {
		return this.type;
	}

	public String getUrl() {
		return this.url;
	}

	public Integer getWidth() {
		return this.width;
	}

	public ExportingOptions setButtons(final ExportingButtons buttons) {
		this.buttons = buttons;
		return this;
	}

	public ExportingOptions setEnabled(final Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	public ExportingOptions setEnableImages(final Boolean enableImages) {
		this.enableImages = enableImages;
		return this;
	}

	public ExportingOptions setFilename(final String filename) {
		this.filename = filename;
		return this;
	}

	public ExportingOptions setType(final ExportingMimeType type) {
		this.type = type;
		return this;
	}

	public ExportingOptions setUrl(final String url) {
		this.url = url;
		return this;
	}

	public ExportingOptions setWidth(final Integer width) {
		this.width = width;
		return this;
	}

}
