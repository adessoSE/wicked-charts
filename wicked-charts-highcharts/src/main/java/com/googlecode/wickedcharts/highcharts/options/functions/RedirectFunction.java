package com.googlecode.wickedcharts.highcharts.options.functions;

import com.googlecode.wickedcharts.highcharts.options.Function;

/**
 * JavaScript function to use for events that redirects the user to a given URL.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class RedirectFunction extends Function {

  private static final long serialVersionUID = 1L;

  /**
   * Constructor.
   * 
   * @param url
   *          the URL to redirect to when the function is called.
   */
  public RedirectFunction(String url) {
    setFunction("window.location=\"" + url + "\";");
  }

}
