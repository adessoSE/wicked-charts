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
package de.adesso.wickedcharts.highcharts.options;

import de.adesso.wickedcharts.highcharts.json.JsonValueEnum;

/**
 * Possible values for mime type of exported images.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#exporting.type">http://api.highcharts.com/highcharts#exporting.type</a>
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public enum ExportingMimeType implements JsonValueEnum {

	IMAGE_PNG("image/png"),

	IMAGE_JPEG("image/jpeg"),

	APPLICATION_PDF("application/pdf"),

	IMAGE_SVG("image/svg+xml");

	private final String value;

	private ExportingMimeType(final String value) {
		this.value = value;
	}

	@Override
	public String getJsonValue() {
		return this.value;
	}

}
