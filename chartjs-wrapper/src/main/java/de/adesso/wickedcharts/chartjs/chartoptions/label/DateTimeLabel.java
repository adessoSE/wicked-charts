package de.adesso.wickedcharts.chartjs.chartoptions.label;

import org.threeten.bp.LocalDateTime;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Defines datetime labels for the axes.
 *
 * @author SvenWirz
 */
public class DateTimeLabel extends Label implements Serializable {
	
	private LocalDateTime date;
	
	public DateTimeLabel(LocalDateTime date) {
		this.date = date;
	}
	
	public static List<TextLabel> of(String... texts) {
		List<TextLabel> resultList = new ArrayList<TextLabel>();
		for(String text : texts){
			resultList.add(new TextLabel(text));
		}
		return resultList;	}
	
	public static List<TextLabel> of(List<String> textList) {
		List<TextLabel> resultList = new ArrayList<TextLabel>();
		for(String text : textList){
			resultList.add(new TextLabel(text));
		}
		return resultList;
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
