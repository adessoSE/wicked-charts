/**
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

import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.highcharts.theme.Theme;
import de.adesso.wickedcharts.showcase.links.ChartjsShowcaseLink;
import de.adesso.wickedcharts.showcase.links.HighchartsShowcaseLink;
import de.adesso.wickedcharts.showcase.links.UpdateHighchartLink;
import de.adesso.wickedcharts.showcase.options.*;
import de.adesso.wickedcharts.wicket14.highcharts.Chart;
import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HomepageHighcharts extends WebPage {

    private static final long serialVersionUID = 1L;

    public HomepageHighcharts(final PageParameters parameters) {
        Options options = this.getOptionsToDisplay();
        final Chart chart = new Chart("chart", options, new Theme());
        this.add(chart);
        Label codeContainer = this.addCodeContainer();
        this.addChartLinks(chart, codeContainer);
        this.add(new ChartjsShowcaseLink());
        this.add(new HighchartsShowcaseLink());
    }

    private void addChartLinks(final Chart chart, final Label codeContainer) {
        this.add(new UpdateHighchartLink("line", chart, codeContainer,
                new BasicLineOptions()));
        this.add(new UpdateHighchartLink("splineWithSymbols", chart, codeContainer,
                new SplineWithSymbolsOptions()));
        this.add(new UpdateHighchartLink("irregularIntervals", chart,
                codeContainer, new TimeDataWithIrregularIntervalsOptions()));
        this.add(new UpdateHighchartLink("logarithmicAxis", chart, codeContainer,
                new LogarithmicAxisOptions()));
        this.add(new UpdateHighchartLink("scatter", chart, codeContainer,
                new ScatterPlotOptions()));

        this.add(new UpdateHighchartLink("area", chart, codeContainer,
                new BasicAreaOptions()));
        this.add(new UpdateHighchartLink("areaWithNegativeValues", chart,
                codeContainer, new AreaWithNegativeValuesOptions()));

        this.add(new UpdateHighchartLink("stackedAndGroupedColumn", chart,
                codeContainer, new StackedAndGroupedColumnOptions()));
        this.add(new UpdateHighchartLink("combo", chart, codeContainer,
                new ComboOptions()));
        this.add(new UpdateHighchartLink("donut", chart, codeContainer,
                new DonutOptions()));
        this.add(new UpdateHighchartLink("withDataLabels", chart, codeContainer,
                new LineWithDataLabelsOptions()));
        this.add(new UpdateHighchartLink("zoomableTimeSeries", chart,
                codeContainer, new ZoomableTimeSeriesOptions(false)));
        this.add(new UpdateHighchartLink("splineInverted", chart, codeContainer,
                new SplineWithInvertedAxisOptions()));
        this.add(new UpdateHighchartLink("splineWithPlotBands", chart,
                codeContainer, new SplineWithPlotBandsOptions()));
        this.add(new UpdateHighchartLink("polar", chart, codeContainer,
                new PolarOptions()));
        this.add(new UpdateHighchartLink("stackedArea", chart, codeContainer,
                new StackedAreaOptions()));
        this.add(new UpdateHighchartLink("percentageArea", chart, codeContainer,
                new PercentageAreaOptions()));
        this.add(new UpdateHighchartLink("areaMissing", chart, codeContainer,
                new AreaMissingOptions()));
        this.add(new UpdateHighchartLink("areaInverted", chart, codeContainer,
                new AreaInvertedAxisOptions()));

        this.add(new UpdateHighchartLink("areaSpline", chart, codeContainer,
                new AreaSplineOptions()));
        this.add(new UpdateHighchartLink("basicBar", chart, codeContainer,
                new BasicBarOptions()));
        this.add(new UpdateHighchartLink("columnWithDrilldown", chart,
                codeContainer, new ColumnWithDrilldownOptions()));
        this.add(new UpdateHighchartLink("columnRotated", chart, codeContainer,
                new ColumnWithRotatedLabelsOptions()));
        this.add(new UpdateHighchartLink("stackedBar", chart, codeContainer,
                new StackedBarOptions()));
        this.add(new UpdateHighchartLink("barNegativeStack", chart, codeContainer,
                new BarWithNegativeStackOptions()));
        this.add(new UpdateHighchartLink("basicColumn", chart, codeContainer,
                new BasicColumnOptions()));
        this.add(new UpdateHighchartLink("columnWithNegativeValues", chart,
                codeContainer, new ColumnWithNegativeValuesOptions()));
        this.add(new UpdateHighchartLink("stackedColumn", chart, codeContainer,
                new StackedColumnOptions()));
        this.add(new UpdateHighchartLink("stackedPercentage", chart, codeContainer,
                new StackedPercentageOptions()));
        this.add(new UpdateHighchartLink("basicPie", chart, codeContainer,
                new BasicPieOptions()));
        this.add(new UpdateHighchartLink("pieWithGradient", chart, codeContainer,
                new PieWithGradientOptions()));
        this.add(new UpdateHighchartLink("pieWithLegend", chart, codeContainer,
                new PieWithLegendOptions()));
        this.add(new UpdateHighchartLink("bubble", chart, codeContainer,
                new BubbleChartOptions()));

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
}
