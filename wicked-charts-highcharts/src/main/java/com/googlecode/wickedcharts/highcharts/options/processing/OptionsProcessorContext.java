package com.googlecode.wickedcharts.highcharts.options.processing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.livedata.LiveDataSeries;

/**
 * A context object that holds some context variables that may be needed by
 * {@link IOptionsProcessor}s.
 * <p/>
 * This class is not part of the public API!
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class OptionsProcessorContext implements Serializable {

  private static final long serialVersionUID = 1L;

  private final List<Options> drilldownOptions = new ArrayList<Options>();

  private final List<LiveDataSeries> liveDataSeries = new ArrayList<LiveDataSeries>();

  /**
   * Gets the list of {@link Options} that are the target of a drill down.
   * 
   * @return the drilldown options used by the current chart.
   */
  public List<Options> getDrilldownOptions() {
    return drilldownOptions;
  }

  /**
   * Gets all {@link LiveDataSeries} in the context.
   * 
   * @return the {@link LiveDataSeries} used by the current chart.
   */
  public List<LiveDataSeries> getLiveDataSeries() {
    return liveDataSeries;
  }

}
