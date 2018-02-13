
package de.adesso.wickedcharts.showcase.links;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;

import de.adesso.wickedcharts.showcase.HomepageHighcharts;

@SuppressWarnings("serial")
public class HighchartsShowcaseLink extends BookmarkablePageLink<Void> {

	public HighchartsShowcaseLink() {
		super("highchartShowcaseLink", HomepageHighcharts.class);
	}
}

