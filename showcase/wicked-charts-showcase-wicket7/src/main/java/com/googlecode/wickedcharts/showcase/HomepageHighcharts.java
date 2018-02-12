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
package com.googlecode.wickedcharts.showcase;

import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.theme.*;
import com.googlecode.wickedcharts.showcase.links.ChartjsShowcaseLink;
import com.googlecode.wickedcharts.showcase.links.HighchartsShowcaseLink;
import com.googlecode.wickedcharts.showcase.links.SplineUpdatingChartLink;
import com.googlecode.wickedcharts.showcase.links.UpdateHighchartLink;
import com.googlecode.wickedcharts.showcase.options.*;
import com.googlecode.wickedcharts.wicket7.highcharts.Chart;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HomepageHighcharts extends WebPage {

	private static final long serialVersionUID = 1L;

	public HomepageHighcharts(final PageParameters parameters) {
		Theme theme = this.getThemeFromParams(parameters);
		Options options = this.getOptionsToDisplay();
		final Chart chart = new Chart("chart", options, theme);
		this.add(chart);
		addNavigationLinks();
		Label codeContainer = this.addCodeContainer();
		this.addChartLinks(chart, codeContainer);
	}

	private void addNavigationLinks() {
		this.add(new HighchartsShowcaseLink());
		this.add(new ChartjsShowcaseLink());
	}

	private void addChartLinks(final Chart chart, final Label codeContainer) {
		this.add(new UpdateHighchartLink("line", chart, codeContainer, new BasicLineOptions()));
		this.add(new UpdateHighchartLink("splineWithSymbols", chart, codeContainer, new SplineWithSymbolsOptions()));
		this.add(new UpdateHighchartLink("irregularIntervals", chart, codeContainer,
				new TimeDataWithIrregularIntervalsOptions()));
		this.add(new UpdateHighchartLink("logarithmicAxis", chart, codeContainer, new LogarithmicAxisOptions()));
		this.add(new UpdateHighchartLink("scatter", chart, codeContainer, new ScatterPlotOptions()));

		this.add(new UpdateHighchartLink("area", chart, codeContainer, new BasicAreaOptions()));
		this.add(new UpdateHighchartLink("areaWithNegativeValues", chart, codeContainer,
				new AreaWithNegativeValuesOptions()));

		this.add(new UpdateHighchartLink("stackedAndGroupedColumn", chart, codeContainer,
				new StackedAndGroupedColumnOptions()));
		this.add(new UpdateHighchartLink("combo", chart, codeContainer, new ComboOptions()));
		this.add(new UpdateHighchartLink("donut", chart, codeContainer, new DonutOptions()));
		this.add(new UpdateHighchartLink("withDataLabels", chart, codeContainer, new LineWithDataLabelsOptions()));
		this.add(new UpdateHighchartLink("zoomableTimeSeries", chart, codeContainer,
				new ZoomableTimeSeriesOptions(true)));
		this.add(new UpdateHighchartLink("splineInverted", chart, codeContainer, new SplineWithInvertedAxisOptions()));
		this.add(
				new UpdateHighchartLink("splineWithPlotBands", chart, codeContainer, new SplineWithPlotBandsOptions()));
		this.add(new UpdateHighchartLink("polar", chart, codeContainer, new PolarOptions()));
		this.add(new UpdateHighchartLink("stackedArea", chart, codeContainer, new StackedAreaOptions()));
		this.add(new UpdateHighchartLink("percentageArea", chart, codeContainer, new PercentageAreaOptions()));
		this.add(new UpdateHighchartLink("areaMissing", chart, codeContainer, new AreaMissingOptions()));
		this.add(new UpdateHighchartLink("areaInverted", chart, codeContainer, new AreaInvertedAxisOptions()));

		this.add(new UpdateHighchartLink("areaSpline", chart, codeContainer, new AreaSplineOptions()));
		this.add(new UpdateHighchartLink("areaSplineRange", chart, codeContainer, new AreaSplineRangeOptions()));
		this.add(new UpdateHighchartLink("basicBar", chart, codeContainer, new BasicBarOptions()));
		this.add(
				new UpdateHighchartLink("columnWithDrilldown", chart, codeContainer, new ColumnWithDrilldownOptions()));
		this.add(new UpdateHighchartLink("columnRotated", chart, codeContainer, new ColumnWithRotatedLabelsOptions()));
		this.add(new UpdateHighchartLink("stackedBar", chart, codeContainer, new StackedBarOptions()));
		this.add(new UpdateHighchartLink("barNegativeStack", chart, codeContainer, new BarWithNegativeStackOptions()));
		this.add(new UpdateHighchartLink("basicColumn", chart, codeContainer, new BasicColumnOptions()));
		this.add(new UpdateHighchartLink("columnWithNegativeValues", chart, codeContainer,
				new ColumnWithNegativeValuesOptions()));
		this.add(new UpdateHighchartLink("stackedColumn", chart, codeContainer, new StackedColumnOptions()));
		this.add(new UpdateHighchartLink("stackedPercentage", chart, codeContainer, new StackedPercentageOptions()));
		this.add(new UpdateHighchartLink("basicPie", chart, codeContainer, new BasicPieOptions()));
		this.add(new UpdateHighchartLink("pieWithGradient", chart, codeContainer, new PieWithGradientOptions()));
		this.add(new UpdateHighchartLink("pieWithLegend", chart, codeContainer, new PieWithLegendOptions()));
		this.add(
				new SplineUpdatingChartLink("splineUpdating", chart, codeContainer, new WicketSplineUpdatingOptions()));
		this.add(new UpdateHighchartLink("bubble", chart, codeContainer, new BubbleChartOptions()));
		this.add(new UpdateHighchartLink("3dbubble", chart, codeContainer, new BubbleChart3DOptions()));
		this.add(new UpdateHighchartLink("boxplot", chart, codeContainer, new BoxplotChartOptions()));
		this.add(new UpdateHighchartLink("interactive", chart, codeContainer, new InteractionOptions()));
		this.add(new UpdateHighchartLink("angularGauge", chart, codeContainer, new AngularGaugeOptions()));
		this.add(new UpdateHighchartLink("spiderweb", chart, codeContainer, new SpiderwebOptions()));
		this.add(new UpdateHighchartLink("windrose", chart, codeContainer, new WindroseOptions()));
		this.add(new UpdateHighchartLink("columnrange", chart, codeContainer, new ColumnRangeOptions()));
		this.add(new UpdateHighchartLink("arearange", chart, codeContainer, new AreaRangeOptions()));
		this.add(new UpdateHighchartLink("clicktoadd", chart, codeContainer, new ClickToAddAPointOptions()));
		this.add(new UpdateHighchartLink("dualAxes", chart, codeContainer, new DualAxesOptions()));
		this.add(new UpdateHighchartLink("scatterWithRegression", chart, codeContainer,
				new ScatterWithRegressionLineOptions()));
		this.add(new UpdateHighchartLink("multipleAxes", chart, codeContainer, new MultipleAxesOptions()));
		this.add(new UpdateHighchartLink("errorBar", chart, codeContainer, new ErrorBarOptions()));
		this.add(new UpdateHighchartLink("funnel", chart, codeContainer, new FunnelOptions()));
		this.add(new UpdateHighchartLink("pyramid", chart, codeContainer, new PyramidOptions()));
		this.add(new UpdateHighchartLink("heatmap", chart, codeContainer, new HeatmapOptions()));
	}

	private Label addCodeContainer() {
		Label codeContainer = new Label("code",
				new StringFromResourceModel(BasicLineOptions.class, BasicLineOptions.class.getSimpleName() + ".java"));
		codeContainer.setOutputMarkupId(true);
		this.add(codeContainer);
		return codeContainer;
	}

	private Options getOptionsToDisplay() {
		Options options = ((ShowcaseSession) this.getSession()).getCurrentChartOptions();
		if (options == null) {
			options = new BasicLineOptions();
		}
		return options;
	}

	private int getSelectedTab() {
		String theme = this.getPageParameters().get("theme").toString();
		if ("grid".equals(theme)) {
			return 1;
		} else if ("skies".equals(theme)) {
			return 2;
		} else if ("gray".equals(theme)) {
			return 3;
		} else if ("darkblue".equals(theme)) {
			return 4;
		} else if ("darkgreen".equals(theme)) {
			return 5;
		} else {
			return 0;
		}
	}

	private Theme getThemeFromParams(final PageParameters params) {
		String themeString = params.get("theme").toString();
		if ("grid".equals(themeString)) {
			return new GridTheme();
		} else if ("skies".equals(themeString)) {
			return new SkiesTheme();
		} else if ("gray".equals(themeString)) {
			return new GrayTheme();
		} else if ("darkblue".equals(themeString)) {
			return new DarkBlueTheme();
		} else {
			// default theme
			return null;
		}
	}

	@Override
	public void renderHead(final IHeaderResponse response) {
		// select bootstrap tab for current theme selected
		int selectedTab = this.getSelectedTab();
		response.render(OnDomReadyHeaderItem.forScript("$('#themes li:eq(" + selectedTab + ") a').tab('show');"));
	}
}
