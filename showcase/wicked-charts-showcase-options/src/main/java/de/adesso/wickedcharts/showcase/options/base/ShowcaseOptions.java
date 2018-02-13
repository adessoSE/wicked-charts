package de.adesso.wickedcharts.showcase.options.base;

import de.adesso.wickedcharts.highcharts.options.Options;

/**
 * Abstract parent class for all Options in the showcase.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public abstract class ShowcaseOptions extends Options {

  private static final long serialVersionUID = 1L;

  /**
   * The label under which the Options class is shown in navigation.
   */
  public abstract String getLabel();

}
