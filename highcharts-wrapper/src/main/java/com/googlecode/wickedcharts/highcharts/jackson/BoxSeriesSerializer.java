package com.googlecode.wickedcharts.highcharts.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.googlecode.wickedcharts.highcharts.options.series.Box;
import com.googlecode.wickedcharts.highcharts.options.series.BoxSeries;

import java.io.IOException;

public class BoxSeriesSerializer extends JsonSerializer<BoxSeries> {

    @Override
    public void serialize(final BoxSeries value, final JsonGenerator jgen, final SerializerProvider provider) throws IOException, JsonProcessingException {

        StringBuffer result = new StringBuffer();
        result.append("{");
        if (value.getData() != null) {
            result.append("data: [");
            for (Box point : value.getData()) {
                final Number timestamp = point.getTimestamp();
                result.append("[" + (timestamp != null ? timestamp + ", " : "") +
                        point.getLow() + ", " +
                        point.getOpen() + ", " +
                        point.getMedian() + ", " +
                        point.getClose() + ", " +
                        point.getHigh() +
                        "],");
            }
            result = new StringBuffer(result.substring(0, result.length() - 1));
            result.append("]");
        }
        result.append("}");
        jgen.writeRawValue(result.toString());
    }

}
