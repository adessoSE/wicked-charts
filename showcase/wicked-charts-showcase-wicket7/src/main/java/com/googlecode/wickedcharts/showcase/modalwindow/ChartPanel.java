package com.googlecode.wickedcharts.showcase.modalwindow;

import com.googlecode.wickedcharts.showcase.options.BasicBarOptions;
import com.googlecode.wickedcharts.wicket7.highcharts.Chart;
import org.apache.wicket.markup.html.panel.Panel;

public class ChartPanel extends Panel {

    private static final long serialVersionUID = 1L;

    public ChartPanel(String id) {
        super(id);
        this.add(new Chart("chart", new BasicBarOptions()));
    }

}
