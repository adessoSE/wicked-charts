package com.googlecode.wickedcharts.highcharts.options.livedata;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.googlecode.wickedcharts.highcharts.options.IProcessableOption;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.series.Coordinate;
import com.googlecode.wickedcharts.highcharts.options.series.PointSeries;

/**
 * This Series class supports regular updating via AJAX.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public abstract class LiveDataSeries extends PointSeries implements IProcessableOption {

  private static final long serialVersionUID = 1L;

  protected static final String PROCESSING_KEY = "LIVEUPDATE";

  @JsonIgnore
  private final Options parentOptions;

  @JsonIgnore
  private int updateIntervalMs;

  /**
   * Constructs a new {@link LiveDataSeries}.
   * 
   * @param parentOptions
   *          the {@link Options} to which this series are added.
   * @param updateIntervalMs
   *          the interval in which to update the series in milliseconds.
   */
  public LiveDataSeries(Options parentOptions, int updateIntervalMs) {
    this.parentOptions = parentOptions;
    this.setUpdateIntervalMs(updateIntervalMs);
    parentOptions.markForProcessing(this);
  }

  public Options getParentOptions() {
    return parentOptions;
  }

  public void setUpdateIntervalMs(int updateIntervalMs) {
    this.updateIntervalMs = updateIntervalMs;
  }

  public int getUpdateIntervalMs() {
    return updateIntervalMs;
  }

  @Override
  @JsonIgnore
  public String getProcessingKey() {
    return PROCESSING_KEY;
  };

  /**
   * This method is called for each update interval. It must return a coordinate
   * which is then added to the series on the fly.
   * 
   * @return the new {@link Coordinate} to add to the series.
   */
  public abstract Coordinate<Number, Number> update();

}
