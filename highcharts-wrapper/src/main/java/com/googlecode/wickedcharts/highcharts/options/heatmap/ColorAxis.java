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
