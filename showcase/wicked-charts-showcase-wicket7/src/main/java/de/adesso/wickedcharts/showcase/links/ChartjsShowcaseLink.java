package de.adesso.wickedcharts.showcase.links;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;

import de.adesso.wickedcharts.showcase.HomepageChartJs;

@SuppressWarnings("serial")
public class ChartjsShowcaseLink extends BookmarkablePageLink<Void> {

	public ChartjsShowcaseLink() {
		super("chartJsShowcaseLink", HomepageChartJs.class);
	}
}
