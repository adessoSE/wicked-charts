package de.adesso.wickedcharts.showcase.options.chartjs;

import org.apache.wicket.markup.html.panel.Fragment;

/**
 * Sample that enables the use of custom html markup for tooltips in a pie chart.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/tooltips/custom-pie.html">http://www.chartjs.org/samples/latest/tooltips/custom-pie.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class TooltipHtmlPieConfigurationWicket7 extends TooltipHtmlPieConfiguration {
	public TooltipHtmlPieConfigurationWicket7() {
		super();
	}
	
	@Override
	public void modfiyIndividualMarkup(Object optionalMarkup) {
		Fragment frag = new Fragment("optionalMarkup","pieTooltip", ((Fragment)optionalMarkup).getParent());
		((Fragment)optionalMarkup).replaceWith(frag);
	}
}
