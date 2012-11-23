package com.googlecode.wickedcharts.showcase.options;

import com.googlecode.wickedcharts.highcharts.options.Options;

/**
 * Abstract parent class for all Options in the showcase.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public abstract class ShowcaseOptions extends Options {

  /**
   * The label under which the Options class is shown in navigation.
   */
  public abstract String getLabel();

}
