/*
 *   Copyright 2012-2018 Wicked Charts (http://github.com/adessoAG/wicked-charts)
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

import de.adesso.wickedcharts.showcase.HomepageChartJs;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * Adds a link to a chart in the showcase navigation sidebar.
 * Clicking on the link calls the onClick() method, which sets page
 * parameters accordingly.
 */
public class UpdateChartJsLink extends Link<Void> {

    private static final long serialVersionUID = 1L;

    private final String chartVal;

    /**
     * Constructs a new Link.
     *
     * @param id the wicket id of the link
     * @param val the name of the chart the link points to
     */
    public UpdateChartJsLink(final String id, final String val) {
        super(id);
        this.chartVal = val;
    }

    @Override
    public void onClick() {
        PageParameters params = new PageParameters();
        params.add("chart", chartVal);
        setResponsePage(HomepageChartJs.class, params);
    }
}
