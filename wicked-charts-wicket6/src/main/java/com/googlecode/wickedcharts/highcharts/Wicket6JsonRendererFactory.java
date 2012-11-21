package com.googlecode.wickedcharts.highcharts;

import com.googlecode.wickedcharts.highcharts.jackson.JsonRenderer;

/**
 * Factory class responsible for creating a {@link JsonRenderer} instance that
 * matches the needs of wicked-charts-wicket6.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Wicket6JsonRendererFactory {

  private static final Wicket6JsonRendererFactory INSTANCE = new Wicket6JsonRendererFactory();

  private static JsonRenderer RENDERER = new JsonRenderer();

  public static Wicket6JsonRendererFactory getInstance() {
    return INSTANCE;
  }

  private Wicket6JsonRendererFactory() {

  }

  /**
   * Returns the singleton instance of the {@link JsonRenderer} that is
   * configured for Wicket 6.x.
   * 
   * @return the singleton {@link JsonRenderer}
   */
  public JsonRenderer getRenderer() {
    return RENDERER;
  }

}
