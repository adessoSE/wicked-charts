/**
 *   Copyright 2012-2013 Wicked Charts (http://wicked-charts.googlecode.com)
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
package com.googlecode.wickedcharts.highcharts.options.heatmap;

import com.googlecode.wickedcharts.highcharts.options.Labels;
import com.googlecode.wickedcharts.highcharts.options.color.ColorReference;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ColorAxis implements Serializable {

    private Integer min;

    private Integer max;

    private ColorReference minColor;

    private ColorReference maxColor;

    private Boolean startOnTick;

    private Boolean endOnTick;

    private Labels labels;

    private List<List<Object>> stops;

    public Integer getMin() {
        return min;
    }

    public Integer getMax() {
        return max;
    }

    public ColorReference getMinColor() {
        return minColor;
    }

    public ColorReference getMaxColor() {
        return maxColor;
    }

    public Boolean getStartOnTick() {
        return startOnTick;
    }

    public Boolean getEndOnTick() {
        return endOnTick;
    }

    public Labels getLabels() {
        return labels;
    }

    public List<List<Object>> getStops() {
        return stops;
    }

    public ColorAxis setMin(Integer min) {
        this.min = min;
        return this;
    }

    public ColorAxis setMax(Integer max) {
        this.max = max;
        return this;
    }

    public ColorAxis setMinColor(ColorReference minColor) {
        this.minColor = minColor;
        return this;
    }

    public ColorAxis setMaxColor(ColorReference maxColor) {
        this.maxColor = maxColor;
        return this;
    }

    public ColorAxis setStartOnTick(Boolean startOnTick) {
        this.startOnTick = startOnTick;
        return this;
    }

    public ColorAxis setEndOnTick(Boolean endOnTick) {
        this.endOnTick = endOnTick;
        return this;
    }

    public ColorAxis setLabels(Labels labels) {
        this.labels = labels;
        return this;
    }

    public ColorAxis addStop(final Number percentage, final ColorReference color) {
        List<Object> stopList = new ArrayList<Object>();
        stopList.add(percentage);
        stopList.add(color);
        if (this.stops == null) {
            this.stops = new ArrayList<List<Object>>();
        }
        this.stops.add(stopList);
        return this;
    }

}
