package com.googlecode.wickedcharts.showcase.links;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;

import com.googlecode.wickedcharts.showcase.HomepageHighcharts;

@SuppressWarnings("serial")
public class HighchartsShowcaseLink extends BookmarkablePageLink<Void> {

	public HighchartsShowcaseLink() {
		super("highchartShowcaseLink", HomepageHighcharts.class);
	}
}
