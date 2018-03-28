package de.adesso.wickedcharts.chartjs.chartoptions.label;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Defines datetime labels for the axes .
 *
 */
public class DateTimeLabel extends Label {
	
	private LocalDateTime date;
	
	public DateTimeLabel(LocalDateTime date) {
		this.date = date;
	}
	
	public static List<TextLabel> of(String... texts) {
		return Arrays.stream(texts).map(textLabel -> new TextLabel(textLabel)).collect(Collectors.toList());
	}
	
	public static List<TextLabel> of(List<String> textList) {
		return textList.stream().map(textLabel -> new TextLabel(textLabel)).collect(Collectors.toList());
	}

	public LocalDateTime getDate() {
		return date;
	}

	public DateTimeLabel setDate(LocalDateTime date) {
		this.date = date;
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DateTimeLabel other = (DateTimeLabel) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DateTimeLabel [date=" + date + "]";
	}
	
	
	
	
}
