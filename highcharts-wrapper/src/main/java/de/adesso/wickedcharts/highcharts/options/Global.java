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
package de.adesso.wickedcharts.highcharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Defines the "globals" option.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * @see <a
 * href="http://api.highcharts.com/highcharts#global">http://api.highcharts.com/highcharts#global</a>
 */
public class Global implements IProcessableOption, Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * The key under which {@link Global}s are registered in the parent options.
     * See {@link Options#markForProcessing(IProcessableOption)} .
     */
    public static final String PROCESSING_KEY = "GLOBAL";

    private String canvasToolsURL;

    private Boolean useUTC;

    private String VMLRadialGradientURL;

    private Integer timezoneOffset;

    public String getCanvasToolsURL() {
        return this.canvasToolsURL;
    }

    public Boolean getUseUTC() {
        return this.useUTC;
    }

    public Global setCanvasToolsURL(final String canvasToolsURL) {
        this.canvasToolsURL = canvasToolsURL;
        return this;
    }

    public Global setUseUTC(final Boolean useUTC) {
        this.useUTC = useUTC;
        return this;
    }

    public Global setVMLRadialGradientURL(String vMLRadialGradientURL) {
        VMLRadialGradientURL = vMLRadialGradientURL;
        return this;
    }

    public String getVMLRadialGradientURL() {
        return VMLRadialGradientURL;
    }

    @Override
    @JsonIgnore
    public String getProcessingKey() {
        return PROCESSING_KEY;
    }

    public Integer getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(Integer timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }
}
