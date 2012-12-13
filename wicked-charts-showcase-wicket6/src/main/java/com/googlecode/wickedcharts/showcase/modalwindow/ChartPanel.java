package com.googlecode.wickedcharts.showcase.modalwindow;

import org.apache.wicket.markup.html.panel.Panel;

import com.googlecode.wickedcharts.highcharts.Chart;
import com.googlecode.wickedcharts.showcase.options.BasicBarOptions;

public class ChartPanel extends Panel {

	public ChartPanel(String id) {
		super(id);
		add(new Chart("chart", new BasicBarOptions()));
	}

}
