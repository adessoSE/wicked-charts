/**
 *   Copyright 2012-2018 Wicked Charts (http://github.com/adessoAG/wicked-charts)
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
package de.adesso.wickedcharts.wicket14.chartjs;

import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;

/**
 * Factory class responsible for creating a {@link JsonRenderer} instance that
 * matches the needs of wicked-charts-wicket14.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 */
public class JsonRendererFactory {

    private static final JsonRendererFactory INSTANCE = new JsonRendererFactory();

    private static final JsonRenderer RENDERER = new JsonRenderer();

    public static JsonRendererFactory getInstance() {
        return INSTANCE;
    }

    private JsonRendererFactory() {
    }

    /**
     * Returns the singleton instance of the {@link JsonRenderer} that is
     * configured for Wicket 1.4.x.
     *
     * @return the singleton {@link JsonRenderer}
     */
    public JsonRenderer getRenderer() {
        return RENDERER;
    }

}
