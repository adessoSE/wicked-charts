package com.googlecode.wickedcharts.highcharts;

import com.googlecode.wickedcharts.highcharts.jackson.JsonRenderer;

/**
 * Factory class responsible for creating a {@link JsonRenderer} instance that
 * matches the needs of wicked-charts-jsf21.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * @author Matthias Balke (matthias.balke@gmail.com)
 * 
 */
public class JSF21JsonRendererFactory {

	private static final JSF21JsonRendererFactory INSTANCE = new JSF21JsonRendererFactory();

	private static JsonRenderer RENDERER;

	public static JSF21JsonRendererFactory getInstance() {
		return JSF21JsonRendererFactory.INSTANCE;
	}

	private JSF21JsonRendererFactory() {

	}

	/**
	 * Returns the singleton instance of the {@link JsonRenderer} that is
	 * configured for JSF 2.1.
	 * 
	 * @return the singleton {@link JsonRenderer}
	 */
	public JsonRenderer getRenderer() {
		if (JSF21JsonRendererFactory.RENDERER == null) {
			JSF21JsonRendererFactory.RENDERER = this.createJSF21JsonRenderer();
		}
		return JSF21JsonRendererFactory.RENDERER;
	}

	/**
	 * This method creates a {@link JsonRenderer} that is configured for JSF 2.1.
	 * 
	 * @return
	 */
	private JsonRenderer createJSF21JsonRenderer() {
		return new JsonRenderer();
	}

}
