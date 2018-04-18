/*
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
package de.adesso.wickedcharts.showcase;

import org.apache.wicket.Request;
import org.apache.wicket.protocol.http.WebSession;

import de.adesso.wickedcharts.highcharts.options.Options;

public class ShowcaseSession extends WebSession {

	private static final long serialVersionUID = 1L;

	private Options currentChartOptions;

	public ShowcaseSession(final Request request) {
		super(request);
	}

	public Options getCurrentChartOptions() {
		return this.currentChartOptions;
	}

	public void setCurrentChartOptions(final Options currentChartOptions) {
		this.currentChartOptions = currentChartOptions;
	}

}
