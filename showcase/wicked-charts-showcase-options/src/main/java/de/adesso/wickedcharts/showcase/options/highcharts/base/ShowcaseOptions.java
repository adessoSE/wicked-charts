package de.adesso.wickedcharts.showcase.options.highcharts.base;

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
   * @return the label under which the Options class is shown in navigation.
   */
  public abstract String getLabel();

}
