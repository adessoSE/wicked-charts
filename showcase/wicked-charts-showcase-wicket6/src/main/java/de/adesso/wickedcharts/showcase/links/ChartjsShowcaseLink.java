package de.adesso.wickedcharts.showcase.links;

import de.adesso.wickedcharts.showcase.HomepageChartJs;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

/**
 * Adds a link to the Chart.js showcase in the main page
 */
@SuppressWarnings("serial")
public class ChartjsShowcaseLink extends BookmarkablePageLink<Void> {

	public ChartjsShowcaseLink() {
		super("chartJsShowcaseLink", HomepageChartJs.class);
	}
}
