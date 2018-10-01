package de.adesso.wickedcharts.showcase.chartjs;

import de.adesso.wickedcharts.showcase.options.chartjs.LineChartProgressBarConfiguration;
import org.apache.wicket.markup.html.panel.Fragment;

/**
 *
 * A sample that shows how a line chart with a progress bar is configured.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/advanced/progress-bar.html">http://www.chartjs.org/samples/latest/advanced/progress-bar.html</a>
 *
 * @author maximAtanasov
 */
@SuppressWarnings("serial")
public class LineChartProgressBarConfigurationWicket14 extends LineChartProgressBarConfiguration {

	public LineChartProgressBarConfigurationWicket14() {
		super();
	}
	
	@Override
	public void modfiyIndividualMarkup(Object optionalMarkup) {
		Fragment frag = new Fragment("optionalMarkup","progressBar", ((Fragment)optionalMarkup).getParent());
		((Fragment)optionalMarkup).replaceWith(frag);
	}
}
