package de.adesso.wickedcharts.highcharts.options;

import de.adesso.wickedcharts.highcharts.json.JsonValueEnum;

import java.io.Serializable;

public enum  MenuItems implements JsonValueEnum, Serializable {

    PRINT_CHART("printChart"),

    SEPARATOR("separator"),

    DOWNLOAD_PNG("downloadPNG"),

    DOWNLOAD_JPEG("downloadJPEG"),

    DOWNLOAD_PDF("downloadPDF"),

    DOWNLOAD_SVG("downloadSVG");

    String value;

    MenuItems(String jsonValue) {
        value = jsonValue;
    }


    @Override
    public String toString() {
        return value;
    }

    @Override
    public String getJsonValue() {
        return value;
    }
}
