package com.googlecode.wickedcharts.highcharts;

import com.googlecode.wickedcharts.highcharts.jackson.JsonRenderer;

/**
 * Factory class responsible for creating a {@link JsonRenderer} instance that
 * matches the needs of wicked-charts-wicket15.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Wicket15JsonRendererFactory {

	private static final Wicket15JsonRendererFactory INSTANCE = new Wicket15JsonRendererFactory();

	private static JsonRenderer RENDERER;

	public static Wicket15JsonRendererFactory getInstance() {
		return INSTANCE;
	}

	private Wicket15JsonRendererFactory() {

	}

	/**
	 * Returns the singleton instance of the {@link JsonRenderer} that is
	 * configured for Wicket 1.5.x.
	 * 
	 * @return the singleton {@link JsonRenderer}
	 */
	public JsonRenderer getRenderer() {
		if (RENDERER == null) {
			RENDERER = createWicket15JsonRenderer();
		}
		return RENDERER;
	}

	/**
	 * This method creates a {@link JsonRenderer} that is configured for Wicket
	 * 1.5.x.
	 * 
	 * @return
	 */
	private JsonRenderer createWicket15JsonRenderer() {
		return new JsonRenderer();
	}

}
