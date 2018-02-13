package de.adesso.wickedcharts.chartjs.chartoptions;

import java.util.Arrays;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.experimental.Accessors;

@JsonAutoDetect(
		  fieldVisibility = JsonAutoDetect.Visibility.ANY,
		  getterVisibility = JsonAutoDetect.Visibility.NONE,
		  setterVisibility = JsonAutoDetect.Visibility.NONE,
		  creatorVisibility = JsonAutoDetect.Visibility.NONE
		)
@Accessors(chain = true)
@lombok.Data
public class Scales {
	
	@JsonProperty("xAxes")
	private List<AxesScale> xAxes;
	
	@JsonProperty("yAxes")
	private List<AxesScale> yAxes;

	
	
	public Scales setXAxes(AxesScale singleScale) {
		this.xAxes = Arrays.asList(singleScale);
		return this;
	}
	
	public Scales setxAxes(List<AxesScale> scaleList) {
		this.xAxes = scaleList;
		return this;
	}
	
	public Scales setYAxes(AxesScale singleScale) {
		this.yAxes = Arrays.asList(singleScale);
		return this;
	}
	
	public Scales setYAxes(List<AxesScale> scaleList) {
		this.yAxes = scaleList;
		return this;
	}
}
