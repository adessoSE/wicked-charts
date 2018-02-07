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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.googlecode.wickedcharts.chartjs.ChartConfiguration;
import com.googlecode.wickedcharts.chartjs.chartoptions.ChartType;
import com.googlecode.wickedcharts.chartjs.chartoptions.Data;
import com.googlecode.wickedcharts.chartjs.chartoptions.Dataset;
import com.googlecode.wickedcharts.chartjs.chartoptions.Legend;
import com.googlecode.wickedcharts.chartjs.chartoptions.Options;
import com.googlecode.wickedcharts.chartjs.chartoptions.Position;
import com.googlecode.wickedcharts.chartjs.chartoptions.Title;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.Color;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import com.googlecode.wickedcharts.wicket7.chartjs.Chart;

public class Homepage extends WebPage {

    private static final long serialVersionUID = 1L;

    public Homepage(final PageParameters parameters) {
    	// LineChart
    	ChartConfiguration config = new ChartConfiguration().setType(ChartType.LINE).setData(dummyData());

		Options options = new Options().setLegend(new Legend().setPosition(Position.TOP)).setResponsive(true)
				.setTitle(new Title().setDisplay(true).setText("A Chart.js Bar Chart"));
		config.setOptions(options);

    	Chart chart = new Chart("linechart", config);
		add(chart);
    	
		// BarChart
		ChartConfiguration config2 = new ChartConfiguration().setType(ChartType.BAR).setData(dummyData());

		Options options2 = new Options().setLegend(new Legend().setPosition(Position.TOP)).setResponsive(true)
				.setTitle(new Title().setDisplay(true).setText("A Chart.js Bar Chart"));
		config.setOptions(options2);

    	Chart chart2 = new Chart("barchart", config2);
		add(chart2);
    	
    }

	public static Data dummyData() {
		Data data = new Data();
		data.setDatasets(new ArrayList<Dataset>());

		data.setLabels(Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December"));

		data.getDatasets().add(randomDataSet(data.getLabels().size(),"Dataset 1",SimpleColor.RED_TRANSPARENT,SimpleColor.RED));
		data.getDatasets().add(randomDataSet(data.getLabels().size(),"Dataset 2",SimpleColor.BLUE_TRANSPARENT,SimpleColor.BLUE));
		return data;
	}
	
	public static Dataset randomDataSet(int size, String label, Color backgroundColor, Color borderColor) {
		List<Integer> dataList = new ArrayList<Integer>();
		Random rng = new Random();
		for (int i = 0; i < size; i++) {
			dataList.add(rng.nextInt(20));
		}

		Dataset dataset = new Dataset();
		dataset.setData(dataList)
			.setBackgroundColor(backgroundColor).setBorderColor(borderColor)
			.setBorderWidth(2)
			.setLabel(label);
		return dataset;
	}
}
