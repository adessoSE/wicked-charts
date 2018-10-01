package de.adesso.wickedcharts.showcase.chartjs;

import de.adesso.wickedcharts.showcase.options.chartjs.TooltipHtmlPointsConfiguration;
import org.apache.wicket.markup.html.panel.Fragment;

/**
 * Sample that enables the use of custom html markup for tooltip points.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/tooltips/custom-points.html">http://www.chartjs.org/samples/latest/tooltips/custom-points.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class TooltipHtmlPointsConfigurationWicket14 extends TooltipHtmlPointsConfiguration {
	public TooltipHtmlPointsConfigurationWicket14() {
    	super();
	}

	@Override
	public void modfiyIndividualMarkup(Object optionalMarkup) {
		Fragment frag = new Fragment("optionalMarkup","pointTooltip", ((Fragment)optionalMarkup).getParent());
		((Fragment)optionalMarkup).replaceWith(frag);
	}
}
