package de.adesso.wickedcharts.chartjs.chartoptions;

import java.time.LocalDateTime;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class DateAndFormat {
	private String format;
	private LocalDateTime date;
	private String internalDateFormat;
	
	public DateAndFormat() {
		
	}
	
	public DateAndFormat(LocalDateTime date, String format) {
		this.format = format;
		this.internalDateFormat = format;
		this.date = date;
	}
	
	public DateAndFormat(LocalDateTime date, String format, String internalDateFormat) {
		this.format = format;
		this.internalDateFormat = internalDateFormat;
		this.date = date;
	}
}
