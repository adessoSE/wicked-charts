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

import de.adesso.wickedcharts.showcase.links.ChartjsShowcaseLink;
import de.adesso.wickedcharts.showcase.links.HighchartsShowcaseLink;
import de.adesso.wickedcharts.showcase.links.UpdateHighchartLink;
import de.adesso.wickedcharts.showcase.options.highcharts.base.*;
import de.adesso.wickedcharts.wicket14.highcharts.Chart;
import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

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
        addChartLinks();
    }

    private void addNavigationLinks() {
        add(new HighchartsShowcaseLink());
        add(new ChartjsShowcaseLink());
    }

    /**
     * Adds links to the charts in the navigation sidebar
     */
    private void addChartLinks() {
        add(new UpdateHighchartLink("line"));
        add(new UpdateHighchartLink("splineWithSymbols"));
        add(new UpdateHighchartLink("irregularIntervals"));
        add(new UpdateHighchartLink("logarithmicAxis"));
        add(new UpdateHighchartLink("scatter"));
        add(new UpdateHighchartLink("area"));
        add(new UpdateHighchartLink("areaWithNegativeValues"));
        add(new UpdateHighchartLink("stackedAndGroupedColumn"));
        add(new UpdateHighchartLink("combo"));
        add(new UpdateHighchartLink("donut"));
        add(new UpdateHighchartLink("withDataLabels"));
        add(new UpdateHighchartLink("splineInverted"));
        add(new UpdateHighchartLink("splineWithPlotBands"));
        add(new UpdateHighchartLink("polar"));
        add(new UpdateHighchartLink("percentageArea"));
        add(new UpdateHighchartLink("areaMissing"));
        add(new UpdateHighchartLink("areaInverted"));
        add(new UpdateHighchartLink("areaSpline"));
        add(new UpdateHighchartLink("areaSplineRange"));
        add(new UpdateHighchartLink("basicBar"));
        add(new UpdateHighchartLink("columnWithDrilldown"));
        add(new UpdateHighchartLink("columnRotated"));
        add(new UpdateHighchartLink("stackedBar"));
        add(new UpdateHighchartLink("barNegativeStack"));
        add(new UpdateHighchartLink("basicColumn"));
        add(new UpdateHighchartLink("columnWithNegativeValues"));
        add(new UpdateHighchartLink("stackedColumn"));
        add(new UpdateHighchartLink("stackedArea"));
        add(new UpdateHighchartLink("stackedPercentage"));
        add(new UpdateHighchartLink("basicPie"));
        add(new UpdateHighchartLink("pieWithGradient"));
        add(new UpdateHighchartLink("pieWithLegend"));
        add(new UpdateHighchartLink("bubble"));
        add(new UpdateHighchartLink("3dbubble"));
        add(new UpdateHighchartLink("boxplot"));
        add(new UpdateHighchartLink("angularGauge"));
        add(new UpdateHighchartLink("spiderweb"));
        add(new UpdateHighchartLink("windrose"));
        add(new UpdateHighchartLink("columnrange"));
        add(new UpdateHighchartLink("arearange"));
        add(new UpdateHighchartLink("clicktoadd"));
        add(new UpdateHighchartLink("dualAxes"));
        add(new UpdateHighchartLink("scatterWithRegression"));
        add(new UpdateHighchartLink("multipleAxes"));
        add(new UpdateHighchartLink("errorBar"));
        add(new UpdateHighchartLink("funnel"));
        add(new UpdateHighchartLink("pyramid"));
        add(new UpdateHighchartLink("heatmap"));
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
        Chart config;

        //If the showcase is started without any parameters
        //set the parameters to lineBasic and give us a line Chart
        if(params.keySet().isEmpty()){
            config = new Chart("chart", new BasicLineOptions(), null);
            return config;
        }

        chartString = params.get("chart").toString();

        if(chartString == null) {
            config = new Chart("chart", new BasicLineOptions(), null);
            return config;
        }

        switch(chartString) {
            case "basicBar":
                config = new Chart("chart", new BasicBarOptions(), null);
                break;

            case "splineWithSymbols":
                config = new Chart("chart", new SplineWithSymbolsOptions(), null);
                break;

            case "irregularIntervals":
                config = new Chart("chart", new TimeDataWithIrregularIntervalsOptions(), null);
                break;

            case "logarithmicAxis":
                config = new Chart("chart", new LogarithmicAxisOptions(), null);
                break;

            case "scatter":
                config = new Chart("chart", new ScatterPlotOptions(), null);
                break;

            case "area":
                config = new Chart("chart", new BasicAreaOptions(), null);
                break;

            case "areaWithNegativeValues":
                config = new Chart("chart", new AreaWithNegativeValuesOptions(), null);
                break;

            case "stackedAndGroupedColumn":
                config = new Chart("chart", new StackedAndGroupedColumnOptions(), null);
                break;

            case "combo":
                config = new Chart("chart", new ComboOptions(), null);
                break;

            case "donut":
                config = new Chart("chart", new DonutOptions(), null);
                break;

            case "withDataLabels":
                config = new Chart("chart", new LineWithDataLabelsOptions(), null);
                break;

            case "splineInverted":
                config = new Chart("chart", new SplineWithInvertedAxisOptions(), null);
                break;

            case "splineWithPlotBands":
                config = new Chart("chart", new SplineWithPlotBandsOptions(), null);
                break;

            case "polar":
                config = new Chart("chart", new PolarOptions(), null);
                break;

            case "stackedArea":
                config = new Chart("chart", new StackedAreaOptions(), null);
                break;

            case "percentageArea":
                config = new Chart("chart", new PercentageAreaOptions(), null);
                break;

            case "areaMissing":
                config = new Chart("chart", new AreaMissingOptions(), null);
                break;

            case "areaInverted":
                config = new Chart("chart", new AreaInvertedAxisOptions(), null);
                break;

            case "areaSpline":
                config = new Chart("chart", new AreaSplineOptions(), null);
                break;

            case "areaSplineRange":
                config = new Chart("chart", new AreaSplineRangeOptions(), null);
                break;

            case "columnWithDrilldown":
                config = new Chart("chart", new ColumnWithDrilldownOptions(), null);
                break;

            case "columnRotated":
                config = new Chart("chart", new ColumnWithRotatedLabelsOptions(), null);
                break;

            case "stackedBar":
                config = new Chart("chart", new StackedBarOptions(), null);
                break;

            case "barNegativeStack":
                config = new Chart("chart", new StackedBarOptions(), null);
                break;

            case "basicColumn":
                config = new Chart("chart", new BasicColumnOptions(), null);
                break;

            case "columnWithNegativeValues":
                config = new Chart("chart", new ColumnWithNegativeValuesOptions(), null);
                break;

            case "stackedColumn":
                config = new Chart("chart", new StackedColumnOptions(), null);
                break;

            case "stackedPercentage":
                config = new Chart("chart", new StackedPercentageOptions(), null);
                break;

            case "basicPie":
                config = new Chart("chart", new BasicPieOptions(), null);
                break;

            case "pieWithGradient":
                config = new Chart("chart", new PieWithGradientOptions(), null);
                break;

            case "pieWithLegend":
                config = new Chart("chart", new PieWithLegendOptions(), null);
                break;

            case "bubble":
                config = new Chart("chart", new BubbleChartOptions(), null);
                break;

            case "3dbubble":
                config = new Chart("chart", new BubbleChart3DOptions(), null);
                break;

            case "boxplot":
                config = new Chart("chart", new BoxplotChartOptions(), null);
                break;

            case "angularGauge":
                config = new Chart("chart", new AngularGaugeOptions(), null);
                break;

            case "spiderweb":
                config = new Chart("chart", new SpiderwebOptions(), null);
                break;

            case "windrose":
                config = new Chart("chart", new WindroseOptions(), null);
                break;

            case "columnrange":
                config = new Chart("chart", new ColumnRangeOptions(), null);
                break;

            case "arearange":
                config = new Chart("chart", new AreaRangeOptions(), null);
                break;

            case "clicktoadd":
                config = new Chart("chart", new ClickToAddAPointOptions(), null);
                break;

            case "dualAxes":
                config = new Chart("chart", new DualAxesOptions(), null);
                break;

            case "scatterWithRegression":
                config = new Chart("chart", new ScatterWithRegressionLineOptions(), null);
                break;

            case "multipleAxes":
                config = new Chart("chart", new MultipleAxesOptions(), null);
                break;

            case "errorBar":
                config = new Chart("chart", new ErrorBarOptions(), null);
                break;

            case "funnel":
                config = new Chart("chart", new FunnelOptions(), null);
                break;

            case "pyramid":
                config = new Chart("chart", new PyramidOptions(), null);
                break;

            case "heatmap":
                config = new Chart("chart", new HeatmapOptions(), null);
                break;

            default:
                config = new Chart("chart", new BasicLineOptions(), null);
                break;
        }
        return config;
    }
}
