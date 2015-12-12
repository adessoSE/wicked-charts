/**
 *   Copyright 2012-2013 Wicked Charts (http://wicked-charts.googlecode.com)
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
package com.googlecode.wickedcharts.wicket6.highcharts.features.interaction;

import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.interaction.InteractionEvent;
import com.googlecode.wickedcharts.highcharts.options.interaction.InteractionFunction;
import com.googlecode.wickedcharts.highcharts.options.processing.IOptionsProcessor;
import com.googlecode.wickedcharts.highcharts.options.processing.OptionsProcessorContext;
import com.googlecode.wickedcharts.wicket6.highcharts.Chart;
import org.apache.wicket.ajax.AjaxRequestTarget;

import java.io.Serializable;
import java.util.List;

/**
 * {@link IOptionsProcessor} enabling the Client/Server Interaction for Wicket
 * 6.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 */
public class InteractionProcessor implements IOptionsProcessor, Serializable {

    private final Chart chart;

    public InteractionProcessor(final Chart chart) {
        this.chart = chart;
    }

    @Override
    public void processOptions(final Options options, final OptionsProcessorContext context) {

        List<InteractionFunction> functions = context.getInteractionFunctions();
        for (final InteractionFunction function : functions) {

            // add server side AJAX event
            InteractionBehavior interactionBehavior = new InteractionBehavior() {
                @Override
                public void onEvent(final InteractionEvent event, final AjaxRequestTarget target) {
                    WicketInteractionEvent wicketEvent = new WicketInteractionEvent(target, event);
                    function.onInteraction(wicketEvent);
                }
            };
            this.chart.add(interactionBehavior);

            // add client side javascript to trigger an AJAX call
            String functionBody = interactionBehavior.getCallbackScript().toString();
            function.setFunction(functionBody);
        }
    }

}
