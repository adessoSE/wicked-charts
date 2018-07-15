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
package de.adesso.wickedcharts.wicket8.highcharts.features.selection;

public class JsonSelection {

    private Integer wickedChartsId;

    private Number min;

    private Number max;

    public Integer getWickedChartsId() {
        return this.wickedChartsId;
    }

    public void setWickedChartsId(final Integer wickedChartsId) {
        this.wickedChartsId = wickedChartsId;
    }

    public Number getMin() {
        return this.min;
    }

    public void setMin(final Number min) {
        this.min = min;
    }

    public Number getMax() {
        return this.max;
    }

    public void setMax(final Number max) {
        this.max = max;
    }
}