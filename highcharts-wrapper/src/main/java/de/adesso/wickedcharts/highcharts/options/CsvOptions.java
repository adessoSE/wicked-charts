package de.adesso.wickedcharts.highcharts.options;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class CsvOptions implements Serializable {
    private Function columnHeaderFormatter;
    private String dateFormat;
    private String decimalPoint;
    private String itemDelimiter;
    private String lineDelimiter = ".";
}
