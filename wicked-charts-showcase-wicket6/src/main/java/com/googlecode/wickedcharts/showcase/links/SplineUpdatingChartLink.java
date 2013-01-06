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
package com.googlecode.wickedcharts.showcase.links;

import org.apache.wicket.markup.html.basic.Label;

import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.showcase.options.SplineUpdatingOptions;
import com.googlecode.wickedcharts.showcase.links.UpdateChartLink;
import com.googlecode.wickedcharts.wicket6.highcharts.Chart;

public class SplineUpdatingChartLink extends UpdateChartLink {

	public SplineUpdatingChartLink(String id, Chart chart, Label codeContainer,
			Options options) {
		super(id, chart, codeContainer, options);
	}

	private static final long serialVersionUID = 1L;

	/**
	 * Always return a fresh {@link Options} object, so that the date ticks are
	 * current.
	 */
	@Override
	public Options getOptions() {
		return new SplineUpdatingOptions();
	}

}
