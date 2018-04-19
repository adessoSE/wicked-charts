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
package de.adesso.wickedcharts.wicket7.highcharts.features.livedata;

import de.adesso.wickedcharts.highcharts.options.livedata.JavaScriptParameters;
import de.adesso.wickedcharts.highcharts.options.livedata.LiveDataUpdateEvent;
import org.apache.wicket.ajax.AjaxRequestTarget;

/**
 * Wicket-specific extension of {@link LiveDataUpdateEvent}.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 */
public class WicketLiveDataUpdateEvent extends LiveDataUpdateEvent {

    private AjaxRequestTarget ajaxRequestTarget;

    private final LiveDataUpdateEvent wrappedEvent;

    public WicketLiveDataUpdateEvent(final AjaxRequestTarget ajaxRequestTarget, final LiveDataUpdateEvent wrappedEvent) {
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
    public void setParameters(final JavaScriptParameters parameters) {
        this.wrappedEvent.setParameters(parameters);
    }

    @Override
    public JavaScriptParameters getParameters() {
        return this.wrappedEvent.getParameters();
    }

    @Override
    public String getJavascriptChartName() {
        return this.wrappedEvent.getJavascriptChartName();
    }

}
