/**
 *   Copyright 2012 Wicked Charts (http://wicked-charts.googlecode.com)
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
package com.googlecode.wickedcharts.wicket6.highcharts.features.livedata;

import java.util.List;

import org.apache.wicket.Component;

import com.googlecode.wickedcharts.highcharts.options.IProcessableOption;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.livedata.LiveDataSeries;
import com.googlecode.wickedcharts.highcharts.options.processing.IOptionsProcessor;
import com.googlecode.wickedcharts.highcharts.options.processing.OptionsProcessorContext;
import com.googlecode.wickedcharts.highcharts.options.util.OptionsUtil;

/**
 * This processor reads all {@link LiveDataSeries} from an {@link Options}
 * object and adds a {@link Wicket6LiveDataAjaxBehavior} to the chart.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Wicket6LiveDataProcessor implements IOptionsProcessor {

  private final Component component;

  public Wicket6LiveDataProcessor(Component component) {
    this.component = component;
  }

  @Override
  public void processOptions(Options options, OptionsProcessorContext context) {
    List<IProcessableOption> processables = options.getMarkedForProcessing(LiveDataSeries.PROCESSING_KEY);
    for (IProcessableOption processable : processables) {
      LiveDataSeries series = (LiveDataSeries) processable;

      Wicket6LiveDataAjaxBehavior behavior = getBehaviorFromComponent(component);
      if (behavior == null) {
        behavior = new Wicket6LiveDataAjaxBehavior(series);
        component.add(behavior);
      }

      Wicket6LiveDataFunction function = new Wicket6LiveDataFunction(behavior);
      OptionsUtil.getInstance().setChartEventsLoad(options, function);
    }
  }

  private Wicket6LiveDataAjaxBehavior getBehaviorFromComponent(Component component) {
    List<Wicket6LiveDataAjaxBehavior> behaviors = component.getBehaviors(Wicket6LiveDataAjaxBehavior.class);
    if (behaviors.size() > 1) {
      // TODO: allow multiple Behaviors but only one per series.
      throw new IllegalStateException("Only one " + Wicket6LiveDataAjaxBehavior.class.getSimpleName()
          + " can be active per component!");
    } else if (behaviors.size() == 1) {
      behaviors.get(0).reset();
      return behaviors.get(0);
    } else {
      return null;
    }
  }

}
