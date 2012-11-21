package com.googlecode.wickedcharts.highcharts.options.livedata;

import java.util.List;

import org.apache.wicket.Component;

import com.googlecode.wickedcharts.highcharts.options.IProcessableOption;
import com.googlecode.wickedcharts.highcharts.options.Options;
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
