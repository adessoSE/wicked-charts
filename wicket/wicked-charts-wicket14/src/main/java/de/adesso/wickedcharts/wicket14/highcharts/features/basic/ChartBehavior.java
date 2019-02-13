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
package de.adesso.wickedcharts.wicket14.highcharts.features.basic;

import de.adesso.wickedcharts.highcharts.jackson.JsonRenderer;
import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.highcharts.options.processing.Feature;
import de.adesso.wickedcharts.highcharts.options.processing.FeatureCheckingOptionsProcessor;
import de.adesso.wickedcharts.highcharts.options.processing.IOptionsProcessor;
import de.adesso.wickedcharts.highcharts.options.processing.OptionsProcessorContext;
import de.adesso.wickedcharts.highcharts.options.util.OptionsUtil;
import de.adesso.wickedcharts.wicket14.JavaScriptResourceRegistry;
import de.adesso.wickedcharts.wicket14.highcharts.Chart;
import de.adesso.wickedcharts.wicket14.highcharts.JsonRendererFactory;
import de.adesso.wickedcharts.wicket14.highcharts.features.drilldown.DrilldownProcessor;
import de.adesso.wickedcharts.wicket14.highcharts.features.global.GlobalProcessor;
import org.apache.wicket.behavior.AbstractBehavior;
import org.apache.wicket.markup.html.IHeaderResponse;

import java.text.MessageFormat;

public class ChartBehavior extends AbstractBehavior {
    private static final long serialVersionUID = 1L;

    private final Chart chart;

    private static final Feature[] SUPPORTED_FEATURES = new Feature[]{

            Feature.DRILLDOWN,

            Feature.GLOBAL,

    };

    /**
     * Constructor.
     *
     * @param container The container to render the chart in.
     */
    public ChartBehavior(final Chart container) {
        this.chart = container;
    }

    private void addTheme(final IHeaderResponse response,
                          final JsonRenderer renderer) {
        if (this.chart.getTheme() != null) {
            response.renderOnDomReadyJavascript(MessageFormat.format(
                    "Highcharts.setOptions({0});",
                    renderer.toJson(this.chart.getTheme())));
        } else if (this.chart.getThemeUrl() != null) {
            response.renderJavascriptReference(this.chart.getThemeUrl());
        } else if (this.chart.getThemeReference() != null) {
            response.renderJavascriptReference(this.chart.getThemeReference());
        }
    }

    /**
     * Includes the javascript that calls the Highcharts library to visualize
     * the chart.
     *
     * @param response the Wicket HeaderResponse
     * @param options  the options containing the data to display
     * @param renderer the JsonRenderer responsible for rendering the options
     * @param markupId the DOM ID of the chart component.
     */
    protected void includeChartJavascript(final IHeaderResponse response,
                                          final Options options, final JsonRenderer renderer,
                                          final String markupId) {
        String chartVarname = markupId;
        String optionsVarname = markupId + "Options";
        response.renderOnDomReadyJavascript(MessageFormat.format(
                "var {0} = {1};var {2} = new Highcharts.Chart({0});",
                optionsVarname, renderer.toJson(options), chartVarname));
    }

    private void includeJavascriptDependencies(final IHeaderResponse response,
                                               final Options options) {
        JavaScriptResourceRegistry.getInstance().getJQueryEntry()
                .addToHeaderResponse(response);
        JavaScriptResourceRegistry.getInstance().getHighchartsEntry()
                .addToHeaderResponse(response);
        if (OptionsUtil.needsExportingJs(options)) {
            JavaScriptResourceRegistry.getInstance()
                    .getHighchartsExportingEntry()
                    .addToHeaderResponse(response);
        }
        if (OptionsUtil.needsHighchartsMoreJs(options)) {
            JavaScriptResourceRegistry.getInstance().getHighchartsMoreEntry()
                    .addToHeaderResponse(response);
        }
        if (OptionsUtil.needsFunnelJs(options)) {
            JavaScriptResourceRegistry.getInstance().getFunnelEntry().addToHeaderResponse(response);
        }
        if (OptionsUtil.needsHeatmapJs(options)) {
            JavaScriptResourceRegistry.getInstance().getHeatmapEntry().addToHeaderResponse(response);
        }
    }

    @Override
    public void renderHead(final IHeaderResponse response) {

        this.chart.setOutputMarkupId(true);
        Options options = this.chart.getOptions();
        final String id = this.chart.getMarkupId();
        OptionsUtil.getInstance().setRenderTo(options, id);

        JsonRenderer renderer = JsonRendererFactory.getInstance()
                .getRenderer();
        includeJavascriptDependencies(response, options);
        addTheme(response, renderer);

        OptionsProcessorContext context = new OptionsProcessorContext(options);

        IOptionsProcessor featureProcessor = new FeatureCheckingOptionsProcessor(SUPPORTED_FEATURES);
        featureProcessor.processOptions(this.chart.getOptions(), context);

        DrilldownProcessor drilldownProcessor = new DrilldownProcessor(
                this.chart, response);
        drilldownProcessor.processOptions(options, context);

        GlobalProcessor globalProcessor = new GlobalProcessor(
                response);
        globalProcessor.processOptions(options, context);

        includeChartJavascript(response, options, renderer, id);
    }
}
