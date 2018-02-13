package de.adesso.wickedcharts.chartjs.chartoptions;

import java.time.LocalDateTime;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class DateAndFormat {
	private String format;
	private LocalDateTime date;
	
	public DateAndFormat() {
		
	}
	
	public DateAndFormat(LocalDateTime date, String format) {
		this.format = format;
		this.date = date;
	}
}
