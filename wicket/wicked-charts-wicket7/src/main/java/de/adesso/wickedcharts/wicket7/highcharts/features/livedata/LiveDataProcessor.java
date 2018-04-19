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

import de.adesso.wickedcharts.highcharts.options.IProcessableOption;
import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.highcharts.options.livedata.LiveDataSeries;
import de.adesso.wickedcharts.highcharts.options.processing.IOptionsProcessor;
import de.adesso.wickedcharts.highcharts.options.processing.OptionsProcessorContext;
import de.adesso.wickedcharts.highcharts.options.util.OptionsUtil;
import org.apache.wicket.Component;

import java.util.List;

/**
 * This processor reads all {@link LiveDataSeries} from an {@link Options}
 * object and adds a {@link LiveDataAjaxBehavior} to the chart.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 */
public class LiveDataProcessor implements IOptionsProcessor {

    private final Component component;

    public LiveDataProcessor(final Component component) {
        this.component = component;
    }

    @Override
    public void processOptions(final Options options, final OptionsProcessorContext context) {
        List<IProcessableOption> processables = options.getMarkedForProcessing(LiveDataSeries.PROCESSING_KEY);
        LiveDataFunction function = new LiveDataFunction();
        if (processables.size() > 1) {
            throw new RuntimeException("Only one LiveDataSeries per chart allowed!");
        }
        for (IProcessableOption processable : processables) {
            LiveDataSeries series = (LiveDataSeries) processable;

            LiveDataAjaxBehavior behavior = getBehaviorFromComponent(this.component, series);
            if (behavior == null) {
                behavior = new LiveDataAjaxBehavior(series);
                this.component.add(behavior);
            }
            behavior.addJavaScriptValues(series.getJavaScriptParameters());
            function.addLiveDataSeries(options, behavior);
        }
        OptionsUtil.getInstance().setChartEventsLoad(options, function);
    }

    private LiveDataAjaxBehavior getBehaviorFromComponent(final Component component, final LiveDataSeries series) {
        List<LiveDataAjaxBehavior> behaviors = component.getBehaviors(LiveDataAjaxBehavior.class);

        for (LiveDataAjaxBehavior behavior : behaviors) {
            if (behavior.getSeries().getWickedChartsId().equals(series.getWickedChartsId())) {
                behavior.reset();
                return behavior;
            }
        }

        return null;
    }

}
