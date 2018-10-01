package de.adesso.wickedcharts.showcase.modalwindow;

import de.adesso.wickedcharts.showcase.options.highcharts.base.BasicBarOptions;
import de.adesso.wickedcharts.wicket6.highcharts.Chart;
import org.apache.wicket.markup.html.panel.Panel;

public class ChartPanel extends Panel {

	private static final long serialVersionUID = 1L;

	public ChartPanel(String id) {
		super(id);
		this.add(new Chart("chart", new BasicBarOptions()));
	}

}
