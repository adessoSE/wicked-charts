package de.adesso.wickedcharts.showcase;
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


import java.io.Serializable;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import de.adesso.wickedcharts.wicket7.chartjs.Chart;

import de.adesso.wickedcharts.chartjs.ChartConfiguration;
import de.adesso.wickedcharts.chartjs.charts.configurations.*;
import de.adesso.wickedcharts.showcase.configurations.AreaLineBoundariesChartEndConfiguration;
import de.adesso.wickedcharts.showcase.configurations.AreaLineBoundariesChartFalseConfiguration;
import de.adesso.wickedcharts.showcase.configurations.AreaLineBoundariesChartOriginConfiguration;
import de.adesso.wickedcharts.showcase.configurations.AreaLineBoundariesChartStartConfiguration;
import de.adesso.wickedcharts.showcase.configurations.BarChartHorizontalConfiguration;
import de.adesso.wickedcharts.showcase.configurations.BarChartMultiAxisConfiguration;
import de.adesso.wickedcharts.showcase.configurations.BarChartStackedConfiguration;
import de.adesso.wickedcharts.showcase.configurations.BarChartStackedGroupConfiguration;
import de.adesso.wickedcharts.showcase.configurations.BarChartVerticalConfiguration;
import de.adesso.wickedcharts.showcase.configurations.BubbleChartConfiguration;
import de.adesso.wickedcharts.showcase.configurations.ComboBarLineChartConfiguration;
import de.adesso.wickedcharts.showcase.configurations.DoughnutChartConfiguration;
import de.adesso.wickedcharts.showcase.configurations.FilteringLabelsConfiguration;
import de.adesso.wickedcharts.showcase.configurations.GridLineStylesConfiguration;
import de.adesso.wickedcharts.showcase.configurations.LegendPointStyleConfiguration;
import de.adesso.wickedcharts.showcase.configurations.LineChartAreaDatasetConfiguration;
import de.adesso.wickedcharts.showcase.configurations.LineChartBasicConfiguration;
import de.adesso.wickedcharts.showcase.configurations.LineChartInterpolatedConfiguration;
import de.adesso.wickedcharts.showcase.configurations.LineChartMultiAxisConfiguration;
import de.adesso.wickedcharts.showcase.configurations.LineChartProgressBarConfiguration;
import de.adesso.wickedcharts.showcase.configurations.LineChartStackedConfiguration;
import de.adesso.wickedcharts.showcase.configurations.LineChartSteppedAfterConfiguration;
import de.adesso.wickedcharts.showcase.configurations.LineChartSteppedBeforeConfiguration;
import de.adesso.wickedcharts.showcase.configurations.LineChartWithDifferentPointSizesConfiguration;
import de.adesso.wickedcharts.showcase.configurations.LineStylesConfiguration;
import de.adesso.wickedcharts.showcase.configurations.LinearStepSizeConfiguration;
import de.adesso.wickedcharts.showcase.configurations.LogarithmicLineChartConfiguration;
import de.adesso.wickedcharts.showcase.configurations.LogarithmicScatterChartConfiguration;
import de.adesso.wickedcharts.showcase.configurations.MinMaxConfiguration;
import de.adesso.wickedcharts.showcase.configurations.MinMaxSuggestedConfiguration;
import de.adesso.wickedcharts.showcase.configurations.MultilineLabelsConfiguration;
import de.adesso.wickedcharts.showcase.configurations.NonNumericConfiguration;
import de.adesso.wickedcharts.showcase.configurations.OtherRadarChartConfiguration;
import de.adesso.wickedcharts.showcase.configurations.PieChartConfiguration;
import de.adesso.wickedcharts.showcase.configurations.PointStylesConfiguration;
import de.adesso.wickedcharts.showcase.configurations.PolarAreaChartConfiguration;
import de.adesso.wickedcharts.showcase.configurations.RadarChartConfiguration;
import de.adesso.wickedcharts.showcase.configurations.ScatterChartConfiguration;
import de.adesso.wickedcharts.showcase.configurations.ScatterChartMultiAxisConfiguration;
import de.adesso.wickedcharts.showcase.configurations.TimeComboConfiguration;
import de.adesso.wickedcharts.showcase.configurations.TimeLineConfiguration;
import de.adesso.wickedcharts.showcase.configurations.TimePointConfiguration;
import de.adesso.wickedcharts.showcase.configurations.TimeSeriesConfiguration;
import de.adesso.wickedcharts.showcase.configurations.TooltipAverageConfiguration;
import de.adesso.wickedcharts.showcase.configurations.TooltipBorderConfiguration;
import de.adesso.wickedcharts.showcase.configurations.TooltipCallbacksConfiguration;
import de.adesso.wickedcharts.showcase.configurations.TooltipHtmlLineConfiguration;
import de.adesso.wickedcharts.showcase.configurations.TooltipHtmlPieConfiguration;
import de.adesso.wickedcharts.showcase.configurations.TooltipHtmlPointsConfiguration;
import de.adesso.wickedcharts.showcase.configurations.TooltipNearestConfiguration;
import de.adesso.wickedcharts.showcase.configurations.gridlines.GridLinesBasicConfiguration;
import de.adesso.wickedcharts.showcase.configurations.gridlines.GridLinesChartAreaConfiguration;
import de.adesso.wickedcharts.showcase.configurations.gridlines.GridLinesDisplayFalseConfiguration;
import de.adesso.wickedcharts.showcase.configurations.gridlines.GridLinesDisplayFalseNoBorderConfiguration;
import de.adesso.wickedcharts.showcase.configurations.gridlines.GridLinesTicksConfiguration;
import de.adesso.wickedcharts.showcase.configurations.legendposition.*;
import de.adesso.wickedcharts.showcase.links.ChartjsShowcaseLink;
import de.adesso.wickedcharts.showcase.links.HighchartsShowcaseLink;
import de.adesso.wickedcharts.showcase.links.UpdateChartJsLink;

public class HomepageChartJs extends WebPage implements Serializable {

    private static final long serialVersionUID = 1L;

    public HomepageChartJs(final PageParameters parameters) {
    	
        ChartConfiguration config = this.getConfigurationToDisplay();
        final Chart chart = new Chart("chart", config);
        this.add(chart);
        addNavigationLinks();
        Label codeContainer = this.addCodeContainer();
        this.addChartLinks(chart, codeContainer);
    }

	private Label addCodeContainer() {
        Label codeContainer = new Label("code", new StringFromResourceModel(
        		LineChartBasicConfiguration.class, LineChartBasicConfiguration.class.getSimpleName()
                + ".java"));
        codeContainer.setOutputMarkupId(true);
        this.add(codeContainer);
        return codeContainer;
	}
	
	private void addNavigationLinks() {
		this.add(new HighchartsShowcaseLink());
		this.add(new ChartjsShowcaseLink());
	}
	
	private void addChartLinks(Chart chart, Label codeContainer) { 
        this.add(new UpdateChartJsLink("LineChartBasic", chart, codeContainer,
                new LineChartBasicConfiguration()));
        this.add(new UpdateChartJsLink("LineChartMultiAxis", chart, codeContainer,
                new LineChartMultiAxisConfiguration())); 
        this.add(new UpdateChartJsLink("LineChartSteppedBefore", chart, codeContainer,
                new LineChartSteppedBeforeConfiguration())); 
        this.add(new UpdateChartJsLink("LineChartSteppedAfter", chart, codeContainer,
                new LineChartSteppedAfterConfiguration())); 
        this.add(new UpdateChartJsLink("LineChartInterpolated", chart, codeContainer,
                new LineChartInterpolatedConfiguration())); 
        this.add(new UpdateChartJsLink("LineStyles", chart, codeContainer,
                new LineStylesConfiguration())); 
        this.add(new UpdateChartJsLink("PointStyles", chart, codeContainer,
                new PointStylesConfiguration())); 
        this.add(new UpdateChartJsLink("PointSizes", chart, codeContainer,
                new LineChartWithDifferentPointSizesConfiguration())); 
        this.add(new UpdateChartJsLink("BarChartVertical", chart, codeContainer,
                new BarChartVerticalConfiguration()));
        this.add(new UpdateChartJsLink("BarChartHorizontal", chart, codeContainer,
                new BarChartHorizontalConfiguration()));
        this.add(new UpdateChartJsLink("BarChartStacked", chart, codeContainer,
                new BarChartStackedConfiguration()));
        this.add(new UpdateChartJsLink("BarChartStackedGroup", chart, codeContainer,
                new BarChartStackedGroupConfiguration()));
        this.add(new UpdateChartJsLink("BarChartMultiAxis", chart, codeContainer,
                new BarChartMultiAxisConfiguration()));
        this.add(new UpdateChartJsLink("PieChart", chart, codeContainer,
                new PieChartConfiguration())); 
        this.add(new UpdateChartJsLink("AreaLineBoundariesChartFalse", chart, codeContainer,
                new AreaLineBoundariesChartFalseConfiguration())); 
        this.add(new UpdateChartJsLink("AreaLineBoundariesChartStart", chart, codeContainer,
                new AreaLineBoundariesChartStartConfiguration())); 
        this.add(new UpdateChartJsLink("AreaLineBoundariesChartEnd", chart, codeContainer,
                new AreaLineBoundariesChartEndConfiguration())); 
        this.add(new UpdateChartJsLink("AreaLineBoundariesChartOrigin", chart, codeContainer,
                new AreaLineBoundariesChartOriginConfiguration())); 
        this.add(new UpdateChartJsLink("LineChartStacked", chart, codeContainer,
                new LineChartStackedConfiguration()));
        this.add(new UpdateChartJsLink("LineChartDataset", chart, codeContainer,
                new LineChartAreaDatasetConfiguration()));
        this.add(new UpdateChartJsLink("RadarChart", chart, codeContainer,
                new RadarChartConfiguration()));
        this.add(new UpdateChartJsLink("DoughnutChart", chart, codeContainer,
                new DoughnutChartConfiguration()));
        this.add(new UpdateChartJsLink("PolarAreaChart", chart, codeContainer,
                new PolarAreaChartConfiguration()));
        this.add(new UpdateChartJsLink("ScatterChart", chart, codeContainer,
                new ScatterChartConfiguration()));
        this.add(new UpdateChartJsLink("ScatterChartMultiAxis", chart, codeContainer,
                new ScatterChartMultiAxisConfiguration()));
        this.add(new UpdateChartJsLink("ComboBarLineChart", chart, codeContainer,
                new ComboBarLineChartConfiguration())); 
        this.add(new UpdateChartJsLink("LegendPositionTop", chart, codeContainer,
                new LegendPositionTopConfiguration())); 
        this.add(new UpdateChartJsLink("LegendPositionRight", chart, codeContainer,
                new LegendPositionRightConfiguration())); 
        this.add(new UpdateChartJsLink("LegendPositionBottom", chart, codeContainer,
                new LegendPositionBottomConfiguration())); 
        this.add(new UpdateChartJsLink("LegendPositionLeft", chart, codeContainer,
                new LegendPositionLeftConfiguration())); 
        this.add(new UpdateChartJsLink("StepSize", chart, codeContainer,
                new LinearStepSizeConfiguration())); 
        this.add(new UpdateChartJsLink("MinMax", chart, codeContainer,
                new MinMaxConfiguration())); 
        this.add(new UpdateChartJsLink("MinMaxSuggested", chart, codeContainer,
                new MinMaxSuggestedConfiguration())); 
        this.add(new UpdateChartJsLink("GridLinesBasic", chart, codeContainer,
                new GridLinesBasicConfiguration())); 
        this.add(new UpdateChartJsLink("GridLinesDisplayFalse", chart, codeContainer,
                new GridLinesDisplayFalseConfiguration())); 
        this.add(new UpdateChartJsLink("GridLinesDisplayFalseNoBorder", chart, codeContainer,
                new GridLinesDisplayFalseNoBorderConfiguration())); 
        this.add(new UpdateChartJsLink("GridLinesChartArea", chart, codeContainer,
                new GridLinesChartAreaConfiguration())); 
        this.add(new UpdateChartJsLink("GridLinesTicks", chart, codeContainer,
                new GridLinesTicksConfiguration())); 
        this.add(new UpdateChartJsLink("GridLinesStyle", chart, codeContainer,
                new GridLineStylesConfiguration())); 
        this.add(new UpdateChartJsLink("MultilineLabels", chart, codeContainer,
                new MultilineLabelsConfiguration()));
        this.add(new UpdateChartJsLink("LogarithmicLineChart", chart, codeContainer,
                new LogarithmicLineChartConfiguration()));
        this.add(new UpdateChartJsLink("LogarithmicScatterChart", chart, codeContainer,
                new LogarithmicScatterChartConfiguration()));
        this.add(new UpdateChartJsLink("BubbleChart", chart, codeContainer,
                new BubbleChartConfiguration()));
        this.add(new UpdateChartJsLink("FilteringLabels", chart, codeContainer,
                new FilteringLabelsConfiguration()));
        this.add(new UpdateChartJsLink("TimeLine", chart, codeContainer,
                new TimeLineConfiguration())); 
        this.add(new UpdateChartJsLink("NonNumeric", chart, codeContainer,
                new NonNumericConfiguration())); 
        this.add(new UpdateChartJsLink("TimePoint", chart, codeContainer,
                new TimePointConfiguration())); 
        this.add(new UpdateChartJsLink("TimeSeries", chart, codeContainer,
                new TimeSeriesConfiguration())); 
        this.add(new UpdateChartJsLink("TimeCombo", chart, codeContainer,
                new TimeComboConfiguration())); 
        this.add(new UpdateChartJsLink("OtherRadar", chart, codeContainer,
                new OtherRadarChartConfiguration()));  
        this.add(new UpdateChartJsLink("TooltipCallbacks", chart, codeContainer,
                new TooltipCallbacksConfiguration())); 
        this.add(new UpdateChartJsLink("TooltipBorder", chart, codeContainer,
                new TooltipBorderConfiguration())); 
        this.add(new UpdateChartJsLink("TooltipHtmlLine", chart, codeContainer,
                new TooltipHtmlLineConfiguration())); 
        this.add(new UpdateChartJsLink("TooltipHtmlPie", chart, codeContainer,
                new TooltipHtmlPieConfiguration())); 
        this.add(new UpdateChartJsLink("TooltipHtmlPoints", chart, codeContainer,
                new TooltipHtmlPointsConfiguration())); 
        this.add(new UpdateChartJsLink("LegendPointStyle", chart, codeContainer,
                new LegendPointStyleConfiguration())); 
        this.add(new UpdateChartJsLink("LineChartProgressBar", chart, codeContainer,
                new LineChartProgressBarConfiguration())); 
        this.add(new UpdateChartJsLink("TooltipAverage", chart, codeContainer,
                new TooltipAverageConfiguration())); 
        this.add(new UpdateChartJsLink("TooltipNearest", chart, codeContainer,
                new TooltipNearestConfiguration())); 

	} 

	private ChartConfiguration getConfigurationToDisplay() {
        ChartConfiguration config = ((ShowcaseSession) this.getSession())
                .getCurrentChartjsConfiguration();
        if (config == null) {
        	config = new LineChartBasicConfiguration();
        }
        return config;
	}
	
}
