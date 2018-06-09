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
package de.adesso.wickedcharts.wicket8.highcharts.features.selection;

import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.highcharts.options.interaction.SelectionEvent;
import de.adesso.wickedcharts.highcharts.options.interaction.SelectionFunction;
import de.adesso.wickedcharts.highcharts.options.processing.IOptionsProcessor;
import de.adesso.wickedcharts.highcharts.options.processing.OptionsProcessorContext;
import de.adesso.wickedcharts.wicket8.highcharts.Chart;
import org.apache.wicket.ajax.AjaxRequestTarget;

import java.io.Serializable;
import java.util.List;

public class SelectionProcessor implements IOptionsProcessor, Serializable {

    private final Chart chart;

    public SelectionProcessor(final Chart chart) {
        this.chart = chart;
    }

    @Override
    public void processOptions(final Options options, final OptionsProcessorContext context) {

        List<SelectionFunction> functions = context.getSelectionFunctions();
        for (final SelectionFunction function : functions) {

            // add server side AJAX event
            SelectionBehavior selectionBehavior = new SelectionBehavior() {
                @Override
                public void onSelection(final SelectionEvent event, final AjaxRequestTarget target) {
                    WicketSelectionEvent wicketEvent = new WicketSelectionEvent(target, event);
                    function.onSelect(wicketEvent);
                }
            };
            this.chart.add(selectionBehavior);

            // add client side javascript to trigger an AJAX call
            String functionBody = selectionBehavior.getCallbackScript().toString();
            function.setFunction(functionBody);
        }
    }

}
