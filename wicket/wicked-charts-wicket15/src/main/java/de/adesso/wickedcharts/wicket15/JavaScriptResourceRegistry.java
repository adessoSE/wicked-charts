/**
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
package de.adesso.wickedcharts.wicket15;

import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.request.resource.ResourceReference;

/**
 * A registry for the JavaScript dependencies used by wicked-charts. By default,
 * all JavaScript references will be loaded from the web. If you want to package
 * your own JavaScript files or change the URLs, you can do so by calling the
 * setter methods from the init() method of your wicket application.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 */
public class JavaScriptResourceRegistry {

    public class RegistryEntry {

        private String url;

        private ResourceReference reference;

        public RegistryEntry(final ResourceReference reference) {
            this.reference = reference;
        }

        public RegistryEntry(final String url) {
            this.url = url;
        }

        public void addToHeaderResponse(final IHeaderResponse response) {
            if (this.url != null) {
                response.renderJavaScriptReference(this.url);
            } else if (this.reference != null) {
                response.renderJavaScriptReference(this.reference);
            } else {
                throw new IllegalStateException("A RegistryEntry must have at least a non-null url or a non-null reference!");
            }
        }

    }

    public static final String DEFAULT_HIGHCHARTS_URL = "http://code.highcharts.com/4.1.10/highcharts.js";

    public static final String DEFAULT_FUNNEL_URL = "http://code.highcharts.com/4.1.10/modules/funnel.js";

    public static final String DEFAULT_HEATMAP_URL = "http://code.highcharts.com/4.1.10/modules/heatmap.js";

    public static final String DEFAULT_HIGHCHARTS_MORE_URL = "http://code.highcharts.com/4.1.10/highcharts-more.js";

    public static final String DEFAULT_HIGHCHARTS_EXPORTING_URL = "http://code.highcharts.com/4.1.10/modules/exporting.js";

    public static final String DEFAULT_CHARTJS_BUNDLE_URL = "https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.bundle.min.js";

    public static final String DEFAULT_CHARTJS_URL = "https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js";

    public static final String DEFAULT_MOMENTJS_URL = "https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.13.0/moment.min.js";

    public static final String DEFAULT_JQUERY_URL = "https://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js";

    public static JavaScriptResourceRegistry getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new JavaScriptResourceRegistry();
        }
        return INSTANCE;
    }

    private RegistryEntry jqueryEntry = new RegistryEntry(DEFAULT_JQUERY_URL);

    private RegistryEntry highchartsEntry = new RegistryEntry(DEFAULT_HIGHCHARTS_URL);

    private RegistryEntry funnelEntry = new RegistryEntry(DEFAULT_FUNNEL_URL);

    private RegistryEntry heatmapEntry = new RegistryEntry(DEFAULT_HEATMAP_URL);

    private RegistryEntry highchartsExportingEntry = new RegistryEntry(DEFAULT_HIGHCHARTS_EXPORTING_URL);

    private RegistryEntry highchartsMoreEntry = new RegistryEntry(DEFAULT_HIGHCHARTS_MORE_URL);

    private RegistryEntry chartJsEntry = new RegistryEntry(DEFAULT_CHARTJS_URL);

    private RegistryEntry chartJsBundleEntry = new RegistryEntry(DEFAULT_CHARTJS_BUNDLE_URL);

    private RegistryEntry momentJsEntry = new RegistryEntry(DEFAULT_MOMENTJS_URL);

    private static JavaScriptResourceRegistry INSTANCE;

    private JavaScriptResourceRegistry() {

    }

    public RegistryEntry getHighchartsEntry() {
        return this.highchartsEntry;
    }

    public RegistryEntry getHighchartsExportingEntry() {
        return this.highchartsExportingEntry;
    }

    public RegistryEntry getHighchartsMoreEntry() {
        return this.highchartsMoreEntry;
    }

    public RegistryEntry getJQueryEntry() {
        return this.jqueryEntry;
    }

    public RegistryEntry getFunnelEntry() {
        return this.funnelEntry;
    }

    public RegistryEntry getHeatmapEntry() {
        return this.heatmapEntry;
    }

    public RegistryEntry getChartJsEntry() {
        return this.chartJsEntry;
    }

    public RegistryEntry getChartJsBundle() {
        return this.chartJsBundleEntry;
    }

    public RegistryEntry getMomentJsentry() {
        return this.momentJsEntry;
    }



    /**
     * Sets the {@link ResourceReference} to use to load the Highcharts exporting
     * javascript library (exporting.js). Use this method if you want to include
     * the javascript file in your web application.
     *
     * @param reference reference a Resource to be used
     */
    public void setHighchartsExportingReference(final ResourceReference reference) {
        this.highchartsExportingEntry = new RegistryEntry(reference);
    }

    /**
     * Sets the URL to use to load the Highcharts exporting javascript library
     * (exporting.js). Use this method if you want to load the javascript file
     * from an external URL.
     *
     * @param url String which specifies an url
     */
    public void setHighchartsExportingReference(final String url) {
        this.highchartsExportingEntry = new RegistryEntry(url);
    }

    /**
     * Sets the {@link ResourceReference} to use to load the Highcharts module "funnel.js".
     * Use this method if you want to include the javascript file in your web application.
     *
     * @param reference reference a Resource to be used
     */
    public void setFunnelReference(final ResourceReference reference) {
        this.funnelEntry = new RegistryEntry(reference);
    }

    /**
     * Sets the {@link ResourceReference} to use to load the Highcharts module "heatmap.js".
     * Use this method if you want to include the javascript file in your web application.
     *
     * @param reference reference a Resource to be used
     */
    public void setHeatmapReference(final ResourceReference reference) {
        this.heatmapEntry = new RegistryEntry(reference);
    }

    /**
     * Sets the {@link ResourceReference} to use to load the Highcharts "more"
     * javascript library (highcharts-more.js). Use this method if you want to
     * include the javascript file in your web application.
     *
     * @param reference reference a Resource to be used
     */
    public void setHighchartsMoreReference(final ResourceReference reference) {
        this.highchartsMoreEntry = new RegistryEntry(reference);
    }

    /**
     * Sets the URL to use to load the Highcharts "more" javascript library
     * (highcharts-more.js). Use this method if you want to load the javascript
     * file from an external URL.
     *
     * @param url String to specify an url
     */
    public void setHighchartsMoreReference(final String url) {
        this.highchartsMoreEntry = new RegistryEntry(url);
    }

    /**
     * Sets the {@link ResourceReference} to use to load the Highcharts javascript
     * library (highcharts.js). Use this method if you want to include the
     * javascript file in your web application.
     *
     * @param reference reference a Resource to be used
     */
    public void setHighchartsReference(final ResourceReference reference) {
        this.highchartsEntry = new RegistryEntry(reference);
    }

    /**
     * Sets the URL to use to load the Highcharts javascript library
     * (highcharts.js). Use this method if you want to load the javascript file
     * from an external URL.
     *
     * @param url String which specifies an url
     */
    public void setHighchartsReference(final String url) {
        this.highchartsEntry = new RegistryEntry(url);
    }

    /**
     * Sets the {@link ResourceReference} to use to load JQuery (jquery.js).Use
     * this method if you want to include the javascript file in your web
     * application.
     *
     * @param reference reference a Resource to be used
     */
    public void setJQueryReference(final ResourceReference reference) {
        this.jqueryEntry = new RegistryEntry(reference);
    }

    /**
     * Sets the URL to use to load JQuery (jquery.js). Use this method if you want
     * to load the javascript file from an external URL.
     *
     * @param url String which specifies an url
     */
    public void setJQueryReference(final String url) {
        this.jqueryEntry = new RegistryEntry(url);
    }

    /**
     * Sets the {@link ResourceReference} to use to load Chart.js (chart.min.js).Use
     * this method if you want to include the javascript file in your web
     * application.
     *
     * @param reference reference a Resource to be used
     */
    public void setChartJsReference(final ResourceReference reference) {
        this.chartJsEntry = new RegistryEntry(reference);
    }

    /**
     * Sets the URL to use to load Chart.js (chart.min.js). Use this method if you want
     * to load the javascript file from an external URL.
     *
     * @param url String which specifies an url
     */
    public void setChartJsReference(final String url) {
        this.chartJsEntry = new RegistryEntry(url);
    }

    /**
     * Sets the {@link ResourceReference} to use to load Chart.js bundled (chart.bundle.min.js).Use
     * this method if you want to include the javascript file in your web
     * application.
     *
     * @param reference reference a Resource to be used
     */
    public void setChartJsBundleReference(final ResourceReference reference) {
        this.chartJsBundleEntry= new RegistryEntry(reference);
    }

    /**
     * Sets the URL to use to load Chart.js bundled (chart.bundle.min.js). Use this method if you want
     * to load the javascript file from an external URL.
     *
     * @param url String which specifies an url
     */
    public void setChartJsBundleReference(final String url) {
        this.chartJsBundleEntry= new RegistryEntry(url);
    }

    /**
     * Sets the {@link ResourceReference} to use to load Chart.js bundled (chart.bundle.min.js).Use
     * this method if you want to include the javascript file in your web
     * application.
     *
     * @param reference reference a Resource to be used
     */
    public void setMomentJsReference(final ResourceReference reference) {
        this.momentJsEntry= new RegistryEntry(reference);
    }

    /**
     * Sets the URL to use to load Chart.js bundled (chart.bundle.min.js). Use this method if you want
     * to load the javascript file from an external URL.
     *
     * @param url String which specifies an url
     */
    public void setMomentJsReference(final String url) {
        this.momentJsEntry= new RegistryEntry(url);
    }

}
