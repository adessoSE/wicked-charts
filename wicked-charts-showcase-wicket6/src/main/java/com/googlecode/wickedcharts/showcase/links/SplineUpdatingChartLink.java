package com.googlecode.wickedcharts.showcase.links;

import org.apache.wicket.markup.html.basic.Label;

import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.showcase.options.SplineUpdatingOptions;
import com.googlecode.wickedcharts.highcharts.Chart;
import com.googlecode.wickedcharts.showcase.links.UpdateChartLink;

public class SplineUpdatingChartLink extends UpdateChartLink{
	
	public SplineUpdatingChartLink(String id, Chart chart, Label codeContainer,
			Options options) {
		super(id, chart, codeContainer, options);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public Options getOptions() {
		return new SplineUpdatingOptions();
	}

}
