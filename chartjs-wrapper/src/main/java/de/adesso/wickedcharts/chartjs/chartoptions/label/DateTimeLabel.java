package de.adesso.wickedcharts.chartjs.chartoptions.label;

import java.time.LocalDateTime;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class DateTimeLabel extends Label {
	
	private LocalDateTime date;

	public DateTimeLabel() {
		super();
	}
	
	public DateTimeLabel(LocalDateTime date) {
		this.date = date;
	}
}
