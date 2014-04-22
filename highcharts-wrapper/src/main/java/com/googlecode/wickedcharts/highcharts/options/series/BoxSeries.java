package com.googlecode.wickedcharts.highcharts.options.series;

public class BoxSeries extends Series<Box> {
    private static final long serialVersionUID = 1L;

    public BoxSeries addPoint(Box box) {
        super.addPoint(box);
        return this;
    }

}
