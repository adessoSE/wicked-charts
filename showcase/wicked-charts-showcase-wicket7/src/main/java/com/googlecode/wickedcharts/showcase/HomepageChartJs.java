package com.googlecode.wickedcharts.showcase;
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


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.googlecode.wickedcharts.chartjs.ChartConfiguration;
import com.googlecode.wickedcharts.showcase.configurations.*;
import com.googlecode.wickedcharts.showcase.configurations.legendposition.*;
import com.googlecode.wickedcharts.showcase.links.ChartjsShowcaseLink;
import com.googlecode.wickedcharts.showcase.links.HighchartsShowcaseLink;
import com.googlecode.wickedcharts.showcase.links.UpdateChartJsLink;
import com.googlecode.wickedcharts.wicket7.chartjs.Chart;

public class HomepageChartJs extends WebPage {

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
        this.add(new UpdateChartJsLink("LineChartStepped", chart, codeContainer,
                new LineChartSteppedConfiguration())); 
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
