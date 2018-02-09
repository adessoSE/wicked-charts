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
import com.googlecode.wickedcharts.showcase.links.UpdateChartLink;
import com.googlecode.wickedcharts.wicket7.chartjs.Chart;

public class Homepage extends WebPage {

    private static final long serialVersionUID = 1L;

    public Homepage(final PageParameters parameters) {
    	
        ChartConfiguration config = this.getConfigurationToDisplay();
        final Chart chart = new Chart("chart", config);
        this.add(chart);
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
	
	private void addChartLinks(Chart chart, Label codeContainer) {
        this.add(new UpdateChartLink("LineChartBasic", chart, codeContainer,
                new LineChartBasicConfiguration()));
        this.add(new UpdateChartLink("BarChartVertical", chart, codeContainer,
                new BarChartVerticalConfiguration()));
        this.add(new UpdateChartLink("BarChartHorizontal", chart, codeContainer,
                new BarChartHorizontalConfiguration()));
        this.add(new UpdateChartLink("BarChartStacked", chart, codeContainer,
                new BarChartStackedConfiguration()));
        this.add(new UpdateChartLink("PieChart", chart, codeContainer,
                new PieChartConfiguration())); 
        this.add(new UpdateChartLink("ComboBarLineChart", chart, codeContainer,
                new ComboBarLineChartConfiguration())); 
        this.add(new UpdateChartLink("LegendPositionTop", chart, codeContainer,
                new LegendPositionTopConfiguration())); 
        this.add(new UpdateChartLink("LegendPositionRight", chart, codeContainer,
                new LegendPositionRightConfiguration())); 
        this.add(new UpdateChartLink("LegendPositionBottom", chart, codeContainer,
                new LegendPositionBottomConfiguration())); 
        this.add(new UpdateChartLink("LegendPositionLeft", chart, codeContainer,
                new LegendPositionLeftConfiguration())); 
	}

	private ChartConfiguration getConfigurationToDisplay() {
        ChartConfiguration config = ((ShowcaseSession) this.getSession())
                .getCurrentChartConfiguration();
        if (config == null) {
        	config = new LineChartBasicConfiguration();
        }
        return config;
	}
	
}
