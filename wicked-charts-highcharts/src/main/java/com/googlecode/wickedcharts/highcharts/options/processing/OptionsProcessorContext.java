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
