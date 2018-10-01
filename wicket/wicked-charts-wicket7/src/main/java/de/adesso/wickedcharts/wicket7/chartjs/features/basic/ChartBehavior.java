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
package de.adesso.wickedcharts.wicket7.chartjs.features.basic;


import de.adesso.wickedcharts.chartjs.ChartConfiguration;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import de.adesso.wickedcharts.wicket7.JavaScriptResourceRegistry;
import de.adesso.wickedcharts.wicket7.chartjs.ChartTEST;
import de.adesso.wickedcharts.wicket7.chartjs.JsonRendererFactory;
import org.apache.wicket.Component;
import org.apache.wicket.behavior.Behavior;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;

import java.text.MessageFormat;

/**
 * This behavior takes in an {@link Options} object containing the configuration
 * of a chartTEST and calls the proper javascript to display the chartTEST in the
 * component to which this behavior is added.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 */
public class ChartBehavior extends Behavior {

    private static final long serialVersionUID = 1L;

    private final ChartTEST chartTEST;

    /**
     * Constructor.
     *
     * @param container The chartTEST component
     */
    public ChartBehavior(final ChartTEST container) {
        this.chartTEST = container;
    }

    /**
     * Includes the javascript that calls the Highcharts library to visualize the
     * chartTEST.
     *
     * @param response the Wicket HeaderResponse
     * @param options  the options containing the data to display
     * @param renderer the JsonRenderer responsible for rendering the options
     * @param markupId the DOM ID of the chartTEST component.
     */
    protected void includeChartJavascript(final IHeaderResponse response, final ChartConfiguration options,
                                          final JsonRenderer renderer, final String markupId) {
        String chartVarname = this.chartTEST.getJavaScriptVarName();
        String optionsVarname = markupId + "Options";
        String contextVarname = markupId + "ctx";
        String jsonOptions = renderer.toJson(options);
        
        if(options.getOptionalJavascript() == null) {
            response.render(OnDomReadyHeaderItem.forScript(MessageFormat.format(
                    "var {0} = {1};"
                    + "var {3} = document.getElementById(\"{4}\").getContext(\"2d\");"
                    + " window.{2} = new ChartTEST({3},{0});",
                    optionsVarname, jsonOptions,chartVarname,contextVarname,markupId)));
        }
        else {
        	String optionalJavascript = options.getOptionalJavascript();
        	String replacedVariablesInOptionalJavascript = optionalJavascript.replace("{0}", contextVarname);
            response.render(OnDomReadyHeaderItem.forScript(MessageFormat.format(
                    "{5} var {0} = {1};"
                    + "var {3} = document.getElementById(\"{4}\").getContext(\"2d\");"
                    + " window.{2} = new ChartTEST({3},{0});",
                    optionsVarname, jsonOptions,chartVarname,contextVarname,markupId,replacedVariablesInOptionalJavascript)));
        }
    }

    private void includeJavascriptDependencies(final IHeaderResponse response, final ChartConfiguration options) {
        JavaScriptResourceRegistry resourceRegistry = JavaScriptResourceRegistry.getInstance();
        resourceRegistry.getJQueryEntry().addToHeaderResponse(response);
        resourceRegistry.getChartJsBundle().addToHeaderResponse(response);
        resourceRegistry.getMomentJsentry().addToHeaderResponse(response);
    }

    @Override
    public void onConfigure(final Component component) {
        super.onConfigure(component);
    }

    @Override
    public void renderHead(final Component component, final IHeaderResponse response) {
        component.setOutputMarkupId(true);
        final String id = component.getMarkupId();
        ChartConfiguration options = this.chartTEST.getChartConfiguration();

        JsonRenderer renderer = JsonRendererFactory.getInstance().getRenderer();
        includeJavascriptDependencies(response, options);

        includeChartJavascript(response, options, renderer, id);
    }

}
