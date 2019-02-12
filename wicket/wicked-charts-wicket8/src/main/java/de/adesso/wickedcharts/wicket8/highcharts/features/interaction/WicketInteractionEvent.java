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
package de.adesso.wickedcharts.wicket8.highcharts.features.interaction;

import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.highcharts.options.interaction.InteractionEvent;
import de.adesso.wickedcharts.highcharts.options.series.Point;
import de.adesso.wickedcharts.highcharts.options.series.Series;
import org.apache.wicket.ajax.AjaxRequestTarget;

/**
 * Wicket-specific extension of {@link InteractionEvent}.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 */
public class WicketInteractionEvent extends InteractionEvent {

    private AjaxRequestTarget ajaxRequestTarget;

    private final InteractionEvent wrappedEvent;

    WicketInteractionEvent(final AjaxRequestTarget ajaxRequestTarget, final InteractionEvent wrappedEvent) {
        this.wrappedEvent = wrappedEvent;
        this.setAjaxRequestTarget(ajaxRequestTarget);
    }

    public void setAjaxRequestTarget(final AjaxRequestTarget ajaxRequestTarget) {
        this.ajaxRequestTarget = ajaxRequestTarget;
    }

    /**
     * Returns the {@link AjaxRequestTarget} that is connected to the AJAX request
     * that was triggered by interacting with a chart.
     *
     * @return the Wicket {@link AjaxRequestTarget}.
     */
    public AjaxRequestTarget getAjaxRequestTarget() {
        return this.ajaxRequestTarget;
    }

    @Override
    public Options getSelectedChart() {
        return this.wrappedEvent.getSelectedChart();
    }

    @Override
    public Point getSelectedPoint() {
        return this.wrappedEvent.getSelectedPoint();
    }

    @Override
    public Series<?> getSelectedSeries() {
        return this.wrappedEvent.getSelectedSeries();
    }

    @Override
    public void setSelectedChart(final Options selectedChart) {
        this.wrappedEvent.setSelectedChart(selectedChart);
    }

    @Override
    public void setSelectedPoint(final Point selectedPoint) {
        this.wrappedEvent.setSelectedPoint(selectedPoint);
    }

    ;

    @Override
    public void setSelectedSeries(final Series<?> selectedSeries) {
        this.wrappedEvent.setSelectedSeries(selectedSeries);
    }

    @Override
    public String getJavascriptChartName() {
        return this.wrappedEvent.getJavascriptChartName();
    }

}
