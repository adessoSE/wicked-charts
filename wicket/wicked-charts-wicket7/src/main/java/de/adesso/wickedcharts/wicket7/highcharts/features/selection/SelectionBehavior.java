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
package de.adesso.wickedcharts.wicket7.highcharts.features.selection;

import de.adesso.wickedcharts.highcharts.jackson.JsonRenderer;
import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.highcharts.options.interaction.Selection;
import de.adesso.wickedcharts.highcharts.options.interaction.SelectionEvent;
import de.adesso.wickedcharts.highcharts.options.util.OptionsUtil;
import de.adesso.wickedcharts.wicket7.JavaScriptExpressionSendingAjaxBehavior;
import de.adesso.wickedcharts.wicket7.highcharts.Chart;
import de.adesso.wickedcharts.wicket7.highcharts.JsonRendererFactory;
import de.adesso.wickedcharts.wicket7.highcharts.features.livedata.LiveDataAjaxBehavior;
import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.request.resource.JavaScriptResourceReference;
import org.apache.wicket.util.string.StringValue;

public abstract class SelectionBehavior extends JavaScriptExpressionSendingAjaxBehavior {

    private static final String SELECTION_EVENT = "selectionEvent";

    public SelectionBehavior() {
        addJavaScriptValue(SELECTION_EVENT, "WickedCharts.Selection.selectionEventToJson(selectionEvent)");
    }

    @Override
    protected void respond(final AjaxRequestTarget target) {
        Chart chart = (Chart) getComponent();
        Options options = chart.getOptions();

        SelectionEvent event = new SelectionEvent();
        event.setJavascriptChartName(chart.getJavaScriptVarName());

        StringValue selectionEventJson = getVariableValue(SELECTION_EVENT);
        if (selectionEventJson != null && !"".equals(selectionEventJson.toString())) {
            JsonRenderer renderer = JsonRendererFactory.getInstance().getRenderer();
            JsonSelectionEvent jsonEvent = renderer.fromJson(selectionEventJson.toString(), JsonSelectionEvent.class);

            for (JsonSelection jsonSelection : jsonEvent.getxAxes()) {
                Selection selection = mapJsonSelection(options, jsonSelection);
                event.getxAxes().add(selection);
            }

            for (JsonSelection jsonSelection : jsonEvent.getyAxes()) {
                Selection selection = mapJsonSelection(options, jsonSelection);
                event.getyAxes().add(selection);
            }
        }

        onSelection(event, target);
    }

    private Selection mapJsonSelection(final Options options, final JsonSelection jsonSelection) {
        Selection selection = new Selection();
        selection.setMax(jsonSelection.getMax());
        selection.setMin(jsonSelection.getMin());
        selection.setAxis(OptionsUtil.getAxisWithWickedChartsId(options, jsonSelection.getWickedChartsId()));
        return selection;
    }

    public abstract void onSelection(final SelectionEvent event, final AjaxRequestTarget target);

    @Override
    protected void onBind() {
        super.onBind();
        if (!(getComponent() instanceof Chart)) {
            throw new IllegalStateException(LiveDataAjaxBehavior.class.getSimpleName()
                    + " can only be bound to components of type " + Chart.class.getSimpleName() + ".");
        }
    }

    @Override
    public void renderHead(final Component component, final IHeaderResponse response) {
        super.renderHead(component, response);
        response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(SelectionBehavior.class,
                "SelectionBehavior.js")));
    }

}
