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
package de.adesso.wickedcharts.showcase;

import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import de.adesso.wickedcharts.wicket6.highcharts.Chart;

import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.highcharts.theme.DarkBlueTheme;
import de.adesso.wickedcharts.highcharts.theme.GrayTheme;
import de.adesso.wickedcharts.highcharts.theme.GridTheme;
import de.adesso.wickedcharts.highcharts.theme.SkiesTheme;
import de.adesso.wickedcharts.highcharts.theme.Theme;
import de.adesso.wickedcharts.showcase.links.SplineUpdatingChartLink;
import de.adesso.wickedcharts.showcase.links.UpdateChartLink;
import de.adesso.wickedcharts.showcase.options.*;

public class Homepage extends WebPage {

    private static final long serialVersionUID = 1L;

    public Homepage(final PageParameters parameters) {
        Theme theme = this.getThemeFromParams(parameters);
        Options options = this.getOptionsToDisplay();
        final Chart chart = new Chart("chart", options, theme);
        this.add(chart);
        Label codeContainer = this.addCodeContainer();
        this.addChartLinks(chart, codeContainer);
    }

    private void addChartLinks(final Chart chart, final Label codeContainer) {
        this.add(new UpdateChartLink("line", chart, codeContainer,
                new BasicLineOptions()));
        this.add(new UpdateChartLink("splineWithSymbols", chart, codeContainer,
                new SplineWithSymbolsOptions()));
        this.add(new UpdateChartLink("irregularIntervals", chart,
                codeContainer, new TimeDataWithIrregularIntervalsOptions()));
        this.add(new UpdateChartLink("logarithmicAxis", chart, codeContainer,
                new LogarithmicAxisOptions()));
        this.add(new UpdateChartLink("scatter", chart, codeContainer,
                new ScatterPlotOptions()));

        this.add(new UpdateChartLink("area", chart, codeContainer,
                new BasicAreaOptions()));
        this.add(new UpdateChartLink("areaWithNegativeValues", chart,
                codeContainer, new AreaWithNegativeValuesOptions()));

        this.add(new UpdateChartLink("stackedAndGroupedColumn", chart,
                codeContainer, new StackedAndGroupedColumnOptions()));
        this.add(new UpdateChartLink("combo", chart, codeContainer,
                new ComboOptions()));
        this.add(new UpdateChartLink("donut", chart, codeContainer,
                new DonutOptions()));
        this.add(new UpdateChartLink("withDataLabels", chart, codeContainer,
                new LineWithDataLabelsOptions()));
        this.add(new UpdateChartLink("zoomableTimeSeries", chart,
                codeContainer, new ZoomableTimeSeriesOptions(true)));
        this.add(new UpdateChartLink("splineInverted", chart, codeContainer,
                new SplineWithInvertedAxisOptions()));
        this.add(new UpdateChartLink("splineWithPlotBands", chart,
                codeContainer, new SplineWithPlotBandsOptions()));
        this.add(new UpdateChartLink("polar", chart, codeContainer,
                new PolarOptions()));
        this.add(new UpdateChartLink("stackedArea", chart, codeContainer,
                new StackedAreaOptions()));
        this.add(new UpdateChartLink("percentageArea", chart, codeContainer,
                new PercentageAreaOptions()));
        this.add(new UpdateChartLink("areaMissing", chart, codeContainer,
                new AreaMissingOptions()));
        this.add(new UpdateChartLink("areaInverted", chart, codeContainer,
                new AreaInvertedAxisOptions()));

        this.add(new UpdateChartLink("areaSpline", chart, codeContainer,
                new AreaSplineOptions()));
        this.add(new UpdateChartLink("basicBar", chart, codeContainer,
                new BasicBarOptions()));
        this.add(new UpdateChartLink("columnWithDrilldown", chart,
                codeContainer, new ColumnWithDrilldownOptions()));
        this.add(new UpdateChartLink("columnRotated", chart, codeContainer,
                new ColumnWithRotatedLabelsOptions()));
        this.add(new UpdateChartLink("stackedBar", chart, codeContainer,
                new StackedBarOptions()));
        this.add(new UpdateChartLink("barNegativeStack", chart, codeContainer,
                new BarWithNegativeStackOptions()));
        this.add(new UpdateChartLink("basicColumn", chart, codeContainer,
                new BasicColumnOptions()));
        this.add(new UpdateChartLink("columnWithNegativeValues", chart,
                codeContainer, new ColumnWithNegativeValuesOptions()));
        this.add(new UpdateChartLink("stackedColumn", chart, codeContainer,
                new StackedColumnOptions()));
        this.add(new UpdateChartLink("stackedPercentage", chart, codeContainer,
                new StackedPercentageOptions()));
        this.add(new UpdateChartLink("basicPie", chart, codeContainer,
                new BasicPieOptions()));
        this.add(new UpdateChartLink("pieWithGradient", chart, codeContainer,
                new PieWithGradientOptions()));
        this.add(new UpdateChartLink("pieWithLegend", chart, codeContainer,
                new PieWithLegendOptions()));
        this.add(new SplineUpdatingChartLink("splineUpdating", chart,
                codeContainer, new WicketSplineUpdatingOptions()));
        this.add(new UpdateChartLink("bubble", chart, codeContainer,
                new BubbleChartOptions()));
        this.add(new UpdateChartLink("3dbubble", chart, codeContainer,
                new BubbleChart3DOptions()));
        this.add(new UpdateChartLink("boxplot", chart, codeContainer, new BoxplotChartOptions()));
        this.add(new UpdateChartLink("interactive", chart, codeContainer,
                new InteractionOptions()));
        this.add(new UpdateChartLink("angularGauge", chart, codeContainer,
                new AngularGaugeOptions()));
        this.add(new UpdateChartLink("spiderweb", chart, codeContainer,
                new SpiderwebOptions()));
        this.add(new UpdateChartLink("windrose", chart, codeContainer,
                new WindroseOptions()));
        this.add(new UpdateChartLink("columnrange", chart, codeContainer,
                new ColumnRangeOptions()));
        this.add(new UpdateChartLink("arearange", chart, codeContainer,
                new AreaRangeOptions()));
        this.add(new UpdateChartLink("clicktoadd", chart, codeContainer,
                new ClickToAddAPointOptions()));
        this.add(new UpdateChartLink("dualAxes", chart, codeContainer,
                new DualAxesOptions()));
        this.add(new UpdateChartLink("scatterWithRegression", chart,
                codeContainer, new ScatterWithRegressionLineOptions()));
        this.add(new UpdateChartLink("multipleAxes", chart, codeContainer,
                new MultipleAxesOptions()));
    }

    private Label addCodeContainer() {
        Label codeContainer = new Label("code", new StringFromResourceModel(
                BasicLineOptions.class, BasicLineOptions.class.getSimpleName()
                + ".java"));
        codeContainer.setOutputMarkupId(true);
        this.add(codeContainer);
        return codeContainer;
    }

    private Options getOptionsToDisplay() {
        Options options = ((ShowcaseSession) this.getSession())
                .getCurrentChartOptions();
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
        response.render(OnDomReadyHeaderItem.forScript("$('#themes li:eq("
                + selectedTab + ") a').tab('show');"));
    }
}
