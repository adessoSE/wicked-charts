package de.adesso.wickedcharts.showcase.options.chartjs;

import org.apache.wicket.Session;

import java.util.Locale;

/**
 * Sample which displays a bar chart for the data distribution and a line chart for the time progression of datasets.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/scales/time/combo.html">http://www.chartjs.org/samples/latest/scales/time/combo.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class TimeComboConfigurationWicket15 extends TimeComboConfiguration {

	
	public TimeComboConfigurationWicket15() {
		super();
	}

	@Override
	public Locale getSessionLocale(){
		return Session.get().getLocale();
	}
}
