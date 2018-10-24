package de.adesso.wickedcharts.showcase.options.chartjs;

import java.io.Serializable;

public enum ChartjsConfigurations implements Serializable {
    BAR_VERTICAL("barVertical"),
    BAR_HORIZONTAL("barHorizontal"),
    BAR_MULTI_AXIS("barMultiAxis"),
    BAR_STACKED("barStacked"),
    BAR_STACKED_GROUP("barStackedGroup"),

    LINE_BASIC("lineBaisc"),
    LINE_MULTI_AXIS("lineMultiAxis"),
    LINE_STEPPED("lineStepped"),
    LINE_INTERPOLATED("lineInterpolated"),
    LINE_STYLES("lineStyles"),
    POINT_STYLES("pointStyles"),
    POINT_SIZES("pointSizes"),

    AREA_LINE_BOUNDARIES("areaLineBoundaries"),
    LINE_DATASET("lineDataset"),
    LINE_STACKED("lineStacked"),
    RADAR("radar"),

    SCATTER("scatter"),
    SCATTER_MULTI_AXIS("scatterMultiAxis"),
    DOUGHNUT("doughnut"),
    PIE("pie"),
    POLAR_AREA("polarArea"),
    RADAR_2("radar2"),
    COMBO_BAR_LINE("comboBarLine"),

    STEP_SIZE("stepSize"),
    MIN_MAX("minMax"),

    LINE_LOGARITHMIC("lineLogarithmic"),
    SCATTER_LOGARITHMIC("scatterLogarithmic"),

    TIME_LINE("timeLine"),
    TIME_POINT("timePoint"),
    TIME_SERIES("timeSeries"),
    TIME_COMBO("timeCombo"),

    GRID_LINES("gridLines"),
    MULTILINE_LABELS("multiLineLabels"),
    FILTERING_LABELS("filteringLables"),
    NON_NUMERIC("nonNumeric"),

    LEGEND_POSITION("legendPosition"),
    LEGEND_POINT_STYLE("legendPointStyle"),

    TOOLTIP("tooltip"),
    TOOLTIP_HTML("tooltipHtml"),
    TOOLTIP_INTERACTIONS("tooltipInteractions"),

    BUBBLE("bubble"),
    LINE_PROGRESS_BAR("lineProgressBar"),
    DATA_LABELLING("dataLabelling");

    private String value;

    ChartjsConfigurations(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}