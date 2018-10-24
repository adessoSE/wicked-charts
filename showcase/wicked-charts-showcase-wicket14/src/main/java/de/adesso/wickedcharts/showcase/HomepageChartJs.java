package de.adesso.wickedcharts.showcase;
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


import de.adesso.wickedcharts.showcase.chartjs.LineChartProgressBarConfigurationWicket14;
import de.adesso.wickedcharts.showcase.chartjs.TimeComboConfigurationWicket14;
import de.adesso.wickedcharts.showcase.chartjs.TooltipHtmlPieConfigurationWicket14;
import de.adesso.wickedcharts.showcase.chartjs.TooltipHtmlPointsConfigurationWicket14;
import de.adesso.wickedcharts.showcase.options.chartjs.*;
import de.adesso.wickedcharts.showcase.options.chartjs.gridlines.*;
import de.adesso.wickedcharts.showcase.options.chartjs.interactions.*;
import de.adesso.wickedcharts.showcase.options.chartjs.legendposition.LegendPositionBottomConfiguration;
import de.adesso.wickedcharts.showcase.options.chartjs.legendposition.LegendPositionLeftConfiguration;
import de.adesso.wickedcharts.showcase.options.chartjs.legendposition.LegendPositionRightConfiguration;
import de.adesso.wickedcharts.showcase.options.chartjs.legendposition.LegendPositionTopConfiguration;
import de.adesso.wickedcharts.showcase.links.ChartjsShowcaseLink;
import de.adesso.wickedcharts.showcase.links.HighchartsShowcaseLink;
import de.adesso.wickedcharts.showcase.links.UpdateChartJsLink;
import de.adesso.wickedcharts.wicket14.chartjs.Chart;
import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * This page takes care of the Chart.js showcase logic.
 * @author SvenWirz
 * @author anedomansky
 * @author maximAtanasov
 */
public class HomepageChartJs extends WebPage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs the page according to the current parameters
     * This constructor is called each time a new chart is
     * selected.
     * @param parameters the page parameters from the page URI
     */
    public HomepageChartJs(final PageParameters parameters) {
        addCharts(parameters);
        addNavigationLinks();
        addChartLinks();
    }

    /**
     * Gets the charts and the code containers from the page parameters,
     * constructs Wicket componenets from them and
     * adds them to a Wicket ListView.
     * @param parameters the page parameters from the page URI
     */
    private void addCharts(PageParameters parameters){

        List<Chart> charts = getChartFromParams(parameters);

        //If we have more than one chart - use SmallComponents
        if(charts.size() > 1){
            List<SmallChartComponent> components = new ArrayList<>();
            for(Chart i : charts){
                components.add(new SmallChartComponent(i));
            }
            add( new ListView<SmallChartComponent>( "components", components ){
                protected void populateItem(ListItem item)
                {
                    item.add( (SmallChartComponent)item.getModelObject() );
                }
            });
        }else { //else use the regular full-width chart component
            List<ChartComponent> components = new ArrayList<>();
            for (Chart i : charts) {
                components.add(new ChartComponent(i));
            }
            add( new ListView<ChartComponent>( "components", components ){
                protected void populateItem(ListItem item)
                {
                    item.add( (ChartComponent)item.getModelObject() );
                }
            });
        }

        //Add Code Components
        List<CodeComponent> code_components = new ArrayList<>();
        for(Chart i : charts){
            code_components.add(new CodeComponent(i));
        }
        add( new ListView<CodeComponent>( "code_components", code_components ){
            protected void populateItem(ListItem item){
                item.add( (CodeComponent)item.getModelObject() );
            }
        });
    }

	private void addNavigationLinks() {
		this.add(new HighchartsShowcaseLink());
		this.add(new ChartjsShowcaseLink());
	}

    /**
     * Adds links to the charts in the navigation sidebar
     */
    private void addChartLinks() {
        this.add(new UpdateChartJsLink("LineChartBasic", ChartjsConfigurations.LINE_BASIC.toString()));
        this.add(new UpdateChartJsLink("BarChartVertical" , ChartjsConfigurations.BAR_VERTICAL.toString()));
        this.add(new UpdateChartJsLink("LineChartMultiAxis", ChartjsConfigurations.LINE_MULTI_AXIS.toString()));
        this.add(new UpdateChartJsLink("LineChartStepped", ChartjsConfigurations.LINE_STEPPED.toString()));
        this.add(new UpdateChartJsLink("LineChartInterpolated", ChartjsConfigurations.LINE_INTERPOLATED.toString()));
        this.add(new UpdateChartJsLink("LineStyles", ChartjsConfigurations.LINE_STYLES.toString()));
        this.add(new UpdateChartJsLink("PointStyles", ChartjsConfigurations.POINT_STYLES.toString()));
        this.add(new UpdateChartJsLink("PointSizes", ChartjsConfigurations.POINT_SIZES.toString()));
        this.add(new UpdateChartJsLink("BarChartHorizontal", ChartjsConfigurations.BAR_HORIZONTAL.toString()));
        this.add(new UpdateChartJsLink("BarChartStacked", ChartjsConfigurations.BAR_STACKED.toString()));
        this.add(new UpdateChartJsLink("BarChartStackedGroup", ChartjsConfigurations.BAR_STACKED_GROUP.toString()));
        this.add(new UpdateChartJsLink("BarChartMultiAxis", ChartjsConfigurations.BAR_MULTI_AXIS.toString()));
        this.add(new UpdateChartJsLink("PieChart", ChartjsConfigurations.PIE.toString()));
        this.add(new UpdateChartJsLink("AreaLineBoundariesChart", ChartjsConfigurations.AREA_LINE_BOUNDARIES.toString()));
        this.add(new UpdateChartJsLink("LineChartStacked", ChartjsConfigurations.LINE_STACKED.toString()));
        this.add(new UpdateChartJsLink("LineChartDataset", ChartjsConfigurations.LINE_DATASET.toString()));
        this.add(new UpdateChartJsLink("RadarChart", ChartjsConfigurations.RADAR.toString()));
        this.add(new UpdateChartJsLink("DoughnutChart", ChartjsConfigurations.DOUGHNUT.toString()));
        this.add(new UpdateChartJsLink("PolarAreaChart", ChartjsConfigurations.POLAR_AREA.toString()));
        this.add(new UpdateChartJsLink("ScatterChart", ChartjsConfigurations.SCATTER.toString()));
        this.add(new UpdateChartJsLink("ScatterChartMultiAxis", ChartjsConfigurations.SCATTER_MULTI_AXIS.toString()));
        this.add(new UpdateChartJsLink("ComboBarLineChart", ChartjsConfigurations.COMBO_BAR_LINE.toString()));
        this.add(new UpdateChartJsLink("LegendPosition", ChartjsConfigurations.LEGEND_POSITION.toString()));
        this.add(new UpdateChartJsLink("StepSize", ChartjsConfigurations.STEP_SIZE.toString()));
        this.add(new UpdateChartJsLink("MinMax", ChartjsConfigurations.MIN_MAX.toString()));
        this.add(new UpdateChartJsLink("GridLines", ChartjsConfigurations.GRID_LINES.toString()));
        this.add(new UpdateChartJsLink("MultilineLabels", ChartjsConfigurations.MULTILINE_LABELS.toString()));
        this.add(new UpdateChartJsLink("LogarithmicLineChart", ChartjsConfigurations.LINE_LOGARITHMIC.toString()));
        this.add(new UpdateChartJsLink("LogarithmicScatterChart", ChartjsConfigurations.SCATTER_LOGARITHMIC.toString()));
        this.add(new UpdateChartJsLink("BubbleChart", ChartjsConfigurations.BUBBLE.toString()));
        this.add(new UpdateChartJsLink("FilteringLabels", ChartjsConfigurations.FILTERING_LABELS.toString()));
        this.add(new UpdateChartJsLink("TimeLine", ChartjsConfigurations.TIME_LINE.toString()));
        this.add(new UpdateChartJsLink("NonNumeric", ChartjsConfigurations.NON_NUMERIC.toString()));
        this.add(new UpdateChartJsLink("TimePoint", ChartjsConfigurations.TIME_POINT.toString()));
        this.add(new UpdateChartJsLink("TimeSeries", ChartjsConfigurations.TIME_SERIES.toString()));
        this.add(new UpdateChartJsLink("TimeCombo", ChartjsConfigurations.TIME_COMBO.toString()));
        this.add(new UpdateChartJsLink("OtherRadar", ChartjsConfigurations.RADAR_2.toString()));
        this.add(new UpdateChartJsLink("Tooltip", ChartjsConfigurations.TOOLTIP.toString()));
        this.add(new UpdateChartJsLink("TooltipHtml", ChartjsConfigurations.TOOLTIP_HTML.toString()));
        this.add(new UpdateChartJsLink("LegendPointStyle", ChartjsConfigurations.LEGEND_POINT_STYLE.toString()));
        this.add(new UpdateChartJsLink("LineChartProgressBar", ChartjsConfigurations.LINE_PROGRESS_BAR.toString()));
        this.add(new UpdateChartJsLink("DataLabellingChart", ChartjsConfigurations.DATA_LABELLING.toString()));
        this.add(new UpdateChartJsLink("TooltipInteractions", ChartjsConfigurations.TOOLTIP_INTERACTIONS.toString()));
    }

    /**
     * Returns a List of Chart objects from the current page parameters.
     * @param params the page parameters from the page URI
     * @return a List of Chart objects
     */
    private List<Chart> getChartFromParams(final PageParameters params) {
        String chartString;
        List<Chart> config = new ArrayList<>();

        //If the showcase is started without any parameters
        //set the parameters to lineBasic and give us a line Chart
        final String chartComponentID = "chart";
        if(params.keySet().isEmpty()){
            PageParameters temp = new PageParameters();
            temp.add("chart", "lineBasic");
            setResponsePage(HomepageChartJs.class, temp);
            config.add(new Chart(chartComponentID, new LineChartBasicConfiguration()));
            return config;
        }

        chartString = params.get(chartComponentID).toString();
        if(chartString == null) {
    		config.add(new Chart(chartComponentID, new LineChartBasicConfiguration()));
    		return config;
    	}

        switch(chartString) {

            case "barVertical":
                config.add(new Chart(chartComponentID, new BarChartVerticalConfiguration()));
                break;

            case "barHorizontal":
                config.add(new Chart(chartComponentID, new BarChartHorizontalConfiguration()));
                break;

            case "barMultiAxis":
                config.add(new Chart(chartComponentID, new BarChartMultiAxisConfiguration()));
                break;

            case "barStacked":
                config.add(new Chart(chartComponentID, new BarChartStackedConfiguration()));
                break;

            case "barStackedGroup":
                config.add(new Chart(chartComponentID, new BarChartStackedGroupConfiguration()));
                break;

            case "lineBasic":
                config.add(new Chart(chartComponentID, new LineChartBasicConfiguration()));
                break;

            case "lineMultiAxis":
                config.add(new Chart(chartComponentID, new LineChartMultiAxisConfiguration()));
                break;

            case "lineStepped":
                config.add(new Chart(chartComponentID, new LineChartSteppedBeforeConfiguration()));
                config.add(new Chart(chartComponentID, new LineChartSteppedAfterConfiguration()));
                break;

            case "lineInterpolated":
                config.add(new Chart(chartComponentID, new LineChartInterpolatedConfiguration()));
                break;

            case "lineStyles":
                config.add(new Chart(chartComponentID, new LineStylesConfiguration()));
                break;

            case "pointStyles":
                config.add(new Chart(chartComponentID, new PointStylesConfiguration()));
                break;

            case "pointSizes":
                config.add(new Chart(chartComponentID, new LineChartWithDifferentPointSizesConfiguration()));
                break;

            case "areaLineBoundaries":
                config.add(new Chart(chartComponentID, new AreaLineBoundariesChartStartConfiguration()));
                config.add(new Chart(chartComponentID, new AreaLineBoundariesChartEndConfiguration()));
                config.add(new Chart(chartComponentID, new AreaLineBoundariesChartOriginConfiguration()));
                config.add(new Chart(chartComponentID, new AreaLineBoundariesChartFalseConfiguration()));
                break;

            case "lineDataset":
                config.add(new Chart(chartComponentID, new LineChartAreaDatasetConfiguration()));
                break;

            case "lineStacked":
                config.add(new Chart(chartComponentID, new LineChartStackedConfiguration()));
                break;

            case "radar":
                config.add(new Chart(chartComponentID, new RadarChartConfiguration()));
                break;

            case "scatter":
                config.add(new Chart(chartComponentID, new ScatterChartConfiguration()));
                break;

            case "scatterMultiAxis":
                config.add(new Chart(chartComponentID, new ScatterChartMultiAxisConfiguration()));
                break;

            case "doughnut":
                config.add(new Chart(chartComponentID, new DoughnutChartConfiguration()));
                break;

            case "pie":
                config.add(new Chart(chartComponentID, new PieChartConfiguration()));
                break;

            case "polarArea":
                config.add(new Chart(chartComponentID, new PolarAreaChartConfiguration()));
                break;

            case "radar2":
                config.add(new Chart(chartComponentID, new OtherRadarChartConfiguration()));
                break;

            case "comboBarLine":
                config.add(new Chart(chartComponentID, new ComboBarLineChartConfiguration()));
                break;

            case "stepSize":
                config.add(new Chart(chartComponentID, new LinearStepSizeConfiguration()));
                break;

            case "minMax":
                config.add(new Chart(chartComponentID, new MinMaxConfiguration()));
                config.add(new Chart(chartComponentID, new MinMaxSuggestedConfiguration()));
                break;

            case "lineLogarithmic":
                config.add(new Chart(chartComponentID, new LogarithmicLineChartConfiguration()));
                break;

            case "scatterLogarithmic":
                config.add(new Chart(chartComponentID, new LogarithmicScatterChartConfiguration()));
                break;

            case "timeLine":
                config.add(new Chart(chartComponentID, new TimeLineConfiguration()));
                break;

            case "timePoint":
                config.add(new Chart(chartComponentID, new TimePointConfiguration()));
                break;

            case "timeSeries":
                config.add(new Chart(chartComponentID, new TimeSeriesConfiguration()));
                break;

            case "timeCombo":
                config.add(new Chart(chartComponentID, new TimeComboConfigurationWicket14()));
                break;

            case "gridLines":
                config.add(new Chart(chartComponentID, new GridLinesBasicConfiguration()));
                config.add(new Chart(chartComponentID, new GridLinesDisplayFalseConfiguration()));
                config.add(new Chart(chartComponentID, new GridLinesDisplayFalseNoBorderConfiguration()));
                config.add(new Chart(chartComponentID, new GridLinesChartAreaConfiguration()));
                config.add(new Chart(chartComponentID, new GridLinesTicksConfiguration()));
                config.add(new Chart(chartComponentID, new GridLineStylesConfiguration()));
                break;

            case "multiLineLabels":
                config.add(new Chart(chartComponentID, new MultilineLabelsConfiguration()));
                break;

            case "filteringLabels":
                config.add(new Chart(chartComponentID, new FilteringLabelsConfiguration()));
                break;

            case "nonNumeric":
                config.add(new Chart(chartComponentID, new NonNumericConfiguration()));
                break;

            case "legendPosition":
                config.add(new Chart(chartComponentID, new LegendPositionTopConfiguration()));
                config.add(new Chart(chartComponentID, new LegendPositionRightConfiguration()));
                config.add(new Chart(chartComponentID, new LegendPositionBottomConfiguration()));
                config.add(new Chart(chartComponentID, new LegendPositionLeftConfiguration()));
                break;

            case "legendPointStyle":
                config.add(new Chart(chartComponentID, new LegendPointStyleConfiguration()));
                break;

            case "tooltip":
                config.add(new Chart(chartComponentID, new TooltipBorderConfiguration()));
                config.add(new Chart(chartComponentID, new TooltipCallbacksConfiguration()));
                config.add(new Chart(chartComponentID, new TooltipAverageConfiguration()));
                config.add(new Chart(chartComponentID, new TooltipNearestConfiguration()));
                break;

            case "tooltipHtml":
                config.add(new Chart(chartComponentID, new TooltipHtmlLineConfiguration()));
                config.add(new Chart(chartComponentID, new TooltipHtmlPieConfigurationWicket14()));
                config.add(new Chart(chartComponentID, new TooltipHtmlPointsConfigurationWicket14()));
                break;

            case "bubble":
                config.add(new Chart(chartComponentID, new BubbleChartConfiguration()));
                break;

            case "lineProgressBar":
                config.add(new Chart(chartComponentID, new LineChartProgressBarConfigurationWicket14()));
                break;

            case "dataLabelling":
                config.add(new Chart(chartComponentID, new DataLabellingChartConfiguration()));
                break;

            case "tooltipInteractions":
                config.add(new Chart(chartComponentID, new DatasetIntersectFalseConfiguration()));
                config.add(new Chart(chartComponentID, new DatasetIntersectTrueConfiguration()));
                config.add(new Chart(chartComponentID, new IndexIntersectFalseConfiguration()));
                config.add(new Chart(chartComponentID, new IndexIntersectTrueConfiguration()));
                config.add(new Chart(chartComponentID, new NearestIntersectFalseConfiguration()));
                config.add(new Chart(chartComponentID, new NearestIntersectTrueConfiguration()));
                config.add(new Chart(chartComponentID, new PointIntersectFalseConfiguration()));
                config.add(new Chart(chartComponentID, new PointIntersectTrueConfiguration()));
                config.add(new Chart(chartComponentID, new xIntersectFalseConfiguration()));
                config.add(new Chart(chartComponentID, new xIntersectTrueConfiguration()));
                config.add(new Chart(chartComponentID, new yIntersectFalseConfiguration()));
                config.add(new Chart(chartComponentID, new yIntersectTrueConfiguration()));
                break;

            default:
                config.add(new Chart(chartComponentID, new LineChartBasicConfiguration()));
                break;
        }
        return config;
    }
}
