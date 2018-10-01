package de.adesso.wickedcharts.showcase.options.chartjs;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.options.chartjs.base.ShowcaseConfiguration;
import org.apache.wicket.markup.html.panel.Fragment;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Sample that enables the use of custom html markup for tooltips in a pie chart.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/tooltips/custom-pie.html">http://www.chartjs.org/samples/latest/tooltips/custom-pie.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class TooltipHtmlPieConfigurationWicket6 extends TooltipHtmlPieConfiguration {
	public TooltipHtmlPieConfigurationWicket6() {
		super();
	}
	
	@Override
	public void modfiyIndividualMarkup(Object optionalMarkup) {
		Fragment frag = new Fragment("optionalMarkup","pieTooltip", ((Fragment)optionalMarkup).getParent());
		((Fragment)optionalMarkup).replaceWith(frag);
	}
}
