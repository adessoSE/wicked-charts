package de.adesso.wickedcharts.showcase.options.chartjs;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.options.chartjs.base.ShowcaseConfiguration;
import org.apache.wicket.Session;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * Sample which displays a bar chart for the data distribution and a line chart for the time progression of datasets.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/scales/time/combo.html">http://www.chartjs.org/samples/latest/scales/time/combo.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class TimeComboConfigurationWicket6 extends TimeComboConfiguration {

	
	public TimeComboConfigurationWicket6() {
		super();
	}

	@Override
	public Locale getSessionLocale(){
		return Session.get().getLocale();
	}
}
