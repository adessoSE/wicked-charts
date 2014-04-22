package com.googlecode.wickedcharts.highcharts.options.series;

import java.io.Serializable;

public class Box implements Serializable {
    private static final long serialVersionUID = 2721517577232309011L;

    private Number open;
    private Number high;
    private Number low;
    private Number close;
    private Number median;
    private Number timestamp;

    public Box() {
    }

    public Box(Number low, Number open, Number median, Number close, Number high) {
        this(low, open, median, close, high, null);
    }

    public Box(Number low, Number open, Number median, Number close, Number high, Number timestamp) {
        super();
        this.low = low;
        this.open = open;
        this.median = median;
        this.close = close;
        this.high = high;
        this.timestamp = timestamp;
    }

    public Number getOpen() {
        return open;
    }

    public void setOpen(Number open) {
        this.open = open;
    }

    public Number getHigh() {
        return high;
    }

    public void setHigh(Number high) {
        this.high = high;
    }

    public Number getLow() {
        return low;
    }

    public void setLow(Number low) {
        this.low = low;
    }

    public Number getMedian() {
        return median;
    }

    public void setMedian(Number median) {
        this.median = median;
    }

    public Number getClose() {
        return close;
    }

    public void setClose(Number close) {
        this.close = close;
    }

    public boolean isIncrease() {
        return close.doubleValue() > open.doubleValue();
    }

    public Number getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Number timestamp) {
        this.timestamp = timestamp;
    }

}
