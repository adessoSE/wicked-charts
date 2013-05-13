package com.googlecode.wickedcharts.wicket14.highcharts;

import com.googlecode.wickedcharts.highcharts.jackson.JsonRenderer;

public class JsonRendererFactory {

	private static final JsonRendererFactory INSTANCE = new JsonRendererFactory();

	private static JsonRenderer RENDERER = new JsonRenderer();

	public static JsonRendererFactory getInstance() {
		return INSTANCE;
	}

	private JsonRendererFactory() {

	}

	/**
	 * Returns the singleton instance of the {@link JsonRenderer} that is
	 * configured for Wicket 1.5.x.
	 * 
	 * @return the singleton {@link JsonRenderer}
	 */
	public JsonRenderer getRenderer() {
		return RENDERER;
	}

}
