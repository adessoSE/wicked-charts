/**
 *   Copyright 2012-2019 Wicked Charts (http://github.com/adessoAG/wicked-charts)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package de.adesso.wickedcharts.showcase.links;

import de.adesso.wickedcharts.showcase.HomepageHighcharts;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * Adds a link to a theme in the Highcharts showcase.
 * Clicking on the link calls the onClick() method, which sets page
 * parameters accordingly.
 */
public class UpdateThemeLink extends Link<Void> {

    private static final long serialVersionUID = 1L;

    private String chartVal;
    private String themeVal;

    /**
     * Constructs a new Link.
     *
     * @param id            the wicket id of the link
     * @param chart the name of the chart the link points to
     */
    public UpdateThemeLink(final String id, String chart) {
        super(id);
        this.chartVal = chart;
        this.themeVal = id;
    }

    @Override
    public void onClick() {
        PageParameters params = new PageParameters();
        params.add("theme", themeVal);
        params.add("chart", chartVal);
        setResponsePage(HomepageHighcharts.class, params);
    }

}