package de.adesso.wickedcharts.chartjs.chartoptions.label;

import de.adesso.wickedcharts.chartjs.chartoptions.DateAndFormat;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class DateTimeLabel extends Label {
	
	private DateAndFormat dateAndFormat;

	public DateTimeLabel() {
		super();
	}
	
	public DateTimeLabel(DateAndFormat dateAndFormat) {
		this.dateAndFormat = dateAndFormat;
	}
}
