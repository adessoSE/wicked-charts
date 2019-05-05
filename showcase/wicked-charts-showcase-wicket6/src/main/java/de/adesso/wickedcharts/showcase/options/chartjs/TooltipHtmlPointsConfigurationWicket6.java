package de.adesso.wickedcharts.showcase.options.chartjs;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.options.chartjs.base.ShowcaseConfiguration;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.wicket.markup.html.panel.Fragment;

/**
 * Sample that enables the use of custom html markup for tooltip points.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/tooltips/custom-points.html">http://www.chartjs.org/samples/latest/tooltips/custom-points.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class TooltipHtmlPointsConfigurationWicket6 extends TooltipHtmlPointsConfiguration {
	public TooltipHtmlPointsConfigurationWicket6() {
    	super();
	}

	@Override
	public void modfiyIndividualMarkup(Object optionalMarkup) {
		Fragment frag = new Fragment("optionalMarkup","pointTooltip", ((Fragment)optionalMarkup).getParent());
		((Fragment)optionalMarkup).replaceWith(frag);
	}
}
