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
package de.adesso.wickedcharts.wicket8.highcharts.features.interaction;

import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.highcharts.options.interaction.InteractionEvent;
import de.adesso.wickedcharts.highcharts.options.series.Point;
import de.adesso.wickedcharts.highcharts.options.series.Series;
import de.adesso.wickedcharts.highcharts.options.util.OptionsUtil;
import de.adesso.wickedcharts.wicket8.JavaScriptExpressionSendingAjaxBehavior;
import de.adesso.wickedcharts.wicket8.highcharts.Chart;
import de.adesso.wickedcharts.wicket8.highcharts.features.livedata.LiveDataAjaxBehavior;
import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.request.resource.JavaScriptResourceReference;
import org.apache.wicket.util.string.StringValue;

public abstract class InteractionBehavior extends JavaScriptExpressionSendingAjaxBehavior {

    private static final String SELECTED_POINT = "selectedPoint";

    private static final String SELECTED_SERIES = "selectedSeries";

    public InteractionBehavior() {
        addJavaScriptValue(SELECTED_SERIES, "WickedCharts.Interaction.getSelectedSeries(this)");
        addJavaScriptValue(SELECTED_POINT, "WickedCharts.Interaction.getSelectedPoint(this)");
    }

    @Override
    protected void respond(final AjaxRequestTarget target) {
        Chart chart = (Chart) getComponent();
        Options options = chart.getOptions();

        InteractionEvent event = new InteractionEvent();
        event.setJavascriptChartName(chart.getJavaScriptVarName());

        StringValue selectedPointValue = getVariableValue(SELECTED_POINT);
        if (selectedPointValue != null && !"".equals(selectedPointValue.toString())) {
            Integer selectedPoint = selectedPointValue.toInteger();
            Point point = OptionsUtil.getPointWithWickedChartsId(options, selectedPoint);
            event.setSelectedPoint(point);
        }

        StringValue selectedSeriesValue = getVariableValue(SELECTED_SERIES);
        if (selectedSeriesValue != null && !"".equals(selectedSeriesValue.toString())) {
            Integer selectedSeries = selectedSeriesValue.toInteger();
            Series<?> series = OptionsUtil.getSeriesWithWickedChartsId(options, selectedSeries);
            event.setSelectedSeries(series);
        }

        event.setSelectedChart(options);

        onEvent(event, target);
    }

    public abstract void onEvent(final InteractionEvent event, final AjaxRequestTarget target);

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
        response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(InteractionBehavior.class,
                "InteractionBehavior.js")));
    }

}
