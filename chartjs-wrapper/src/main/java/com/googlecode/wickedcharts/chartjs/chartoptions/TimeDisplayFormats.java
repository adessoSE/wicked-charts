package com.googlecode.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;


 

@Accessors(chain = true)
@lombok.Data
public class TimeDisplayFormats {
	private String millisecond;
	private String second;
	private String minute;
	private String hour;
	private String day;
	private String week;
	private String month;
	private String quarter;
	private String year;
}	
