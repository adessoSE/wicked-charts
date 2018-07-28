/*
 *   Copyright 2012-2018 Wicked Charts (http://github.com/adessoAG/wicked-charts)
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

import de.adesso.wickedcharts.highcharts.theme.*;
import de.adesso.wickedcharts.showcase.links.ChartjsShowcaseLink;
import de.adesso.wickedcharts.showcase.links.HighchartsShowcaseLink;
import de.adesso.wickedcharts.showcase.links.UpdateHighchartLink;
import de.adesso.wickedcharts.showcase.links.UpdateThemeLink;
import de.adesso.wickedcharts.showcase.options.*;
import de.adesso.wickedcharts.wicket8.highcharts.Chart;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.INamedParameters;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import java.util.List;

/**
 * This page takes care of the Highcharts showcase logic.
 * @author SvenWirz
 * @author anedomansky
 * @author maximAtanasov
 */
public class HomepageHighcharts extends WebPage {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs the page according to the current parameters
     * This constructor is called each time a new chart or theme is
     * selected.
     * @param parameters the page parameters from the page URI
     */
    public HomepageHighcharts(final PageParameters parameters) {
        Chart chart = getChartFromParams(parameters);
        add(chart);
        addNavigationLinks();
        addCodeContainer(chart);
        addChartLinks(getThemeString(parameters));
        addThemeLinks(parameters);
    }

    /**
     * Adds links to the different themes
     * @param parameters the page parameters from the page URI
     */
    private void addThemeLinks(PageParameters parameters){
        if (parameters.getAllNamed().size() < 2) {
            add(new UpdateThemeLink("defaultTheme", "chart"));
            add(new UpdateThemeLink("grid", "chart"));
            add(new UpdateThemeLink("skies", "chart"));
            add(new UpdateThemeLink("gray", "chart"));
            add(new UpdateThemeLink("darkblue", "chart"));
        } else {
            String chartString = parameters.getAllNamed().get(1).getValue();
            add(new UpdateThemeLink("defaultTheme", chartString));
            add(new UpdateThemeLink("grid", chartString));
            add(new UpdateThemeLink("skies", chartString));
            add(new UpdateThemeLink("gray", chartString));
            add(new UpdateThemeLink("darkblue", chartString));
        }
    }

    /**
     * Returns the name of the current theme from the page parameters
     * @param parameters the page parameters from the page URI
     * @return The name of the current theme
     */
    private String getThemeString(PageParameters parameters){
        String themeString = "default";
        if (parameters.getAllNamed().size() < 2) {
            return themeString;
        } else {
            themeString= parameters.getAllNamed().get(0).getValue();
        }
        return themeString;
    }

	private void addNavigationLinks() {
		add(new HighchartsShowcaseLink());
		add(new ChartjsShowcaseLink());
	}

    /**
     * Adds links to the charts in the navigation sidebar
     */
    private void addChartLinks(String theme) {
        add(new UpdateHighchartLink("line", theme));
        add(new UpdateHighchartLink("splineWithSymbols", theme));
        add(new UpdateHighchartLink("irregularIntervals", theme));
        add(new UpdateHighchartLink("logarithmicAxis", theme));
        add(new UpdateHighchartLink("scatter", theme));
        add(new UpdateHighchartLink("area", theme));
        add(new UpdateHighchartLink("areaWithNegativeValues",theme));
        add(new UpdateHighchartLink("stackedAndGroupedColumn", theme));
        add(new UpdateHighchartLink("combo", theme));
        add(new UpdateHighchartLink("donut", theme));
        add(new UpdateHighchartLink("interactive", theme));
        add(new UpdateHighchartLink("withDataLabels", theme));
        add(new UpdateHighchartLink("zoomableTimeSeries", theme));
        add(new UpdateHighchartLink("splineInverted", theme));
        add(new UpdateHighchartLink("splineWithPlotBands", theme));
        add(new UpdateHighchartLink("polar", theme));
        add(new UpdateHighchartLink("percentageArea", theme));
        add(new UpdateHighchartLink("areaMissing", theme));
        add(new UpdateHighchartLink("areaInverted", theme));
        add(new UpdateHighchartLink("areaSpline", theme));
        add(new UpdateHighchartLink("areaSplineRange", theme));
        add(new UpdateHighchartLink("basicBar", theme));
        add(new UpdateHighchartLink("columnWithDrilldown", theme));
        add(new UpdateHighchartLink("columnRotated", theme));
        add(new UpdateHighchartLink("stackedBar", theme));
        add(new UpdateHighchartLink("barNegativeStack", theme));
        add(new UpdateHighchartLink("basicColumn", theme));
        add(new UpdateHighchartLink("columnWithNegativeValues", theme));
        add(new UpdateHighchartLink("stackedColumn", theme));
        add(new UpdateHighchartLink("stackedArea", theme));
        add(new UpdateHighchartLink("stackedPercentage", theme));
        add(new UpdateHighchartLink("basicPie", theme));
        add(new UpdateHighchartLink("pieWithGradient", theme));
        add(new UpdateHighchartLink("pieWithLegend", theme));
        add(new UpdateHighchartLink("splineUpdating", theme));
        add(new UpdateHighchartLink("bubble", theme));
        add(new UpdateHighchartLink("3dbubble", theme));
        add(new UpdateHighchartLink("boxplot", theme));
        add(new UpdateHighchartLink("angularGauge", theme));
        add(new UpdateHighchartLink("spiderweb", theme));
        add(new UpdateHighchartLink("windrose", theme));
        add(new UpdateHighchartLink("columnrange", theme));
        add(new UpdateHighchartLink("arearange", theme));
        add(new UpdateHighchartLink("clicktoadd", theme));
        add(new UpdateHighchartLink("dualAxes", theme));
        add(new UpdateHighchartLink("scatterWithRegression", theme));
        add(new UpdateHighchartLink("multipleAxes", theme));
        add(new UpdateHighchartLink("errorBar", theme));
        add(new UpdateHighchartLink("funnel", theme));
        add(new UpdateHighchartLink("pyramid", theme));
        add(new UpdateHighchartLink("heatmap", theme));
    }


    /**
     * Adds a code container corresponding to the current chart
     * @param chart The currently selected chart
     */
    private void addCodeContainer(Chart chart) {
        Label codeContainer = new Label("code", new StringFromResourceModel(
                chart.getOptions().getClass(), chart.getOptions().getClass().getSimpleName()
                + ".java"));
        codeContainer.setOutputMarkupId(true);
        add(codeContainer);
    }

    /**
     * Returns a Chart object from the current page parameters
     * @param params the page parameters from the page URI
     * @return a Chart
     */
    private Chart getChartFromParams(final PageParameters params) {
        String chartString;
        String themeString;
        Chart config;

        //If the showcase is started without any parameters
        //set the parameters to lineBasic and give us a line Chart
        if(params.getAllNamed().size() < 2){
            PageParameters temp = new PageParameters();
            temp.add("theme", "default");
            temp.add("chart", "line");
            setResponsePage(HomepageHighcharts.class, temp);
            config = new Chart("chart", new BasicLineOptions(), null);
            return config;
        }

        themeString = params.getAllNamed().get(0).getValue();
        Theme theme = getThemeFromParams(themeString);
        chartString = params.getAllNamed().get(1).getValue();

        if(chartString == null) {
            config = new Chart("chart", new BasicLineOptions(), theme);
            return config;
        }

        switch(chartString) {
            case "basicBar":
                config = new Chart("chart", new BasicBarOptions(), theme);
                break;

            case "splineWithSymbols":
                config = new Chart("chart", new SplineWithSymbolsOptions(), theme);
                break;

            case "irregularIntervals":
                config = new Chart("chart", new TimeDataWithIrregularIntervalsOptions(), theme);
                break;

            case "logarithmicAxis":
                config = new Chart("chart", new LogarithmicAxisOptions(), theme);
                break;

            case "scatter":
                config = new Chart("chart", new ScatterPlotOptions(), theme);
                break;

            case "area":
                config = new Chart("chart", new BasicAreaOptions(), theme);
                break;

            case "areaWithNegativeValues":
                config = new Chart("chart", new AreaWithNegativeValuesOptions(), theme);
                break;

            case "stackedAndGroupedColumn":
                config = new Chart("chart", new StackedAndGroupedColumnOptions(), theme);
                break;

            case "combo":
                config = new Chart("chart", new ComboOptions(), theme);
                break;

            case "donut":
                config = new Chart("chart", new DonutOptions(), theme);
                break;

            case "withDataLabels":
                config = new Chart("chart", new LineWithDataLabelsOptions(), theme);
                break;

            case "zoomableTimeSeries":
                config = new Chart("chart", new ZoomableTimeSeriesOptions(), theme);
                break;

            case "splineInverted":
                config = new Chart("chart", new SplineWithInvertedAxisOptions(), theme);
                break;

            case "splineWithPlotBands":
                config = new Chart("chart", new SplineWithPlotBandsOptions(), theme);
                break;

            case "polar":
                config = new Chart("chart", new PolarOptions(), theme);
                break;

            case "stackedArea":
                config = new Chart("chart", new StackedAreaOptions(), theme);
                break;

            case "percentageArea":
                config = new Chart("chart", new PercentageAreaOptions(), theme);
                break;

            case "areaMissing":
                config = new Chart("chart", new AreaMissingOptions(), theme);
                break;

            case "areaInverted":
                config = new Chart("chart", new AreaInvertedAxisOptions(), theme);
                break;

            case "areaSpline":
                config = new Chart("chart", new AreaSplineOptions(), theme);
                break;

            case "areaSplineRange":
                config = new Chart("chart", new AreaSplineRangeOptions(), theme);
                break;

            case "columnWithDrilldown":
                config = new Chart("chart", new ColumnWithDrilldownOptions(), theme);
                break;

            case "columnRotated":
                config = new Chart("chart", new ColumnWithRotatedLabelsOptions(), theme);
                break;

            case "stackedBar":
                config = new Chart("chart", new StackedBarOptions(), theme);
                break;

            case "barNegativeStack":
                config = new Chart("chart", new StackedBarOptions(), theme);
                break;

            case "basicColumn":
                config = new Chart("chart", new BasicColumnOptions(), theme);
                break;

            case "columnWithNegativeValues":
                config = new Chart("chart", new ColumnWithNegativeValuesOptions(), theme);
                break;

            case "stackedColumn":
                config = new Chart("chart", new StackedColumnOptions(), theme);
                break;

            case "stackedPercentage":
                config = new Chart("chart", new StackedPercentageOptions(), theme);
                break;

            case "basicPie":
                config = new Chart("chart", new BasicPieOptions(), theme);
                break;

            case "pieWithGradient":
                config = new Chart("chart", new PieWithGradientOptions(), theme);
                break;

            case "pieWithLegend":
                config = new Chart("chart", new PieWithLegendOptions(), theme);
                break;

            case "splineUpdating":
                config = new Chart("chart", new WicketSplineUpdatingOptions(), theme);
                break;

            case "bubble":
                config = new Chart("chart", new BubbleChartOptions(), theme);
                break;

            case "3dbubble":
                config = new Chart("chart", new BubbleChart3DOptions(), theme);
                break;

            case "boxplot":
                config = new Chart("chart", new BoxplotChartOptions(), theme);
                break;

            case "interactive":
                config = new Chart("chart", new InteractionOptions(), theme);
                break;

            case "angularGauge":
                config = new Chart("chart", new AngularGaugeOptions(), theme);
                break;

            case "spiderweb":
                config = new Chart("chart", new SpiderwebOptions(), theme);
                break;

            case "windrose":
                config = new Chart("chart", new WindroseOptions(), theme);
                break;

            case "columnrange":
                config = new Chart("chart", new ColumnRangeOptions(), theme);
                break;

            case "arearange":
                config = new Chart("chart", new AreaRangeOptions(), theme);
                break;

            case "clicktoadd":
                config = new Chart("chart", new ClickToAddAPointOptions(), theme);
                break;

            case "dualAxes":
                config = new Chart("chart", new DualAxesOptions(), theme);
                break;

            case "scatterWithRegression":
                config = new Chart("chart", new ScatterWithRegressionLineOptions(), theme);
                break;

            case "multipleAxes":
                config = new Chart("chart", new MultipleAxesOptions(), theme);
                break;

            case "errorBar":
                config = new Chart("chart", new ErrorBarOptions(), theme);
                break;

            case "funnel":
                config = new Chart("chart", new FunnelOptions(), theme);
                break;

            case "pyramid":
                config = new Chart("chart", new PyramidOptions(), theme);
                break;

            case "heatmap":
                config = new Chart("chart", new HeatmapOptions(), theme);
                break;

            default:
                config = new Chart("chart", new BasicLineOptions(), theme);
                break;
        }
        return config;
    }

    private Theme getThemeFromParams(String themeString) {
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

    /**
     * Used in the renderHead method to highlight the currently
     * selected theme tab
     * @return the index of the currently selected theme tab
     */
    private int getSelectedTab() {
        String theme = "default";
        List<INamedParameters.NamedPair> pairs = getPageParameters().getAllNamed();
        theme = pairs.get(0).getValue();
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

    /**
     * Highlights the currently selected theme tab
     * @param response .
     */
    @Override
    public void renderHead(final IHeaderResponse response) {
        // select bootstrap tab for current theme selected
        int selectedTab = this.getSelectedTab();
        response.render(OnDomReadyHeaderItem.forScript("$('#themes li:eq("
                + selectedTab + ") a').tab('show');"));
    }
}
