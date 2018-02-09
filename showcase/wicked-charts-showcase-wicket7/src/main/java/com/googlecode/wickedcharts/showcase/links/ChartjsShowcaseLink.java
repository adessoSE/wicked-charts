package com.googlecode.wickedcharts.showcase.links;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;

import com.googlecode.wickedcharts.showcase.HomepageChartJs;

@SuppressWarnings("serial")
public class ChartjsShowcaseLink extends BookmarkablePageLink<Void> {

	public ChartjsShowcaseLink() {
		super("chartJsShowcaseLink", HomepageChartJs.class);
	}
}
