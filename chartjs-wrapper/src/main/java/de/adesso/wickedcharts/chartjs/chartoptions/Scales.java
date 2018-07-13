package de.adesso.wickedcharts.chartjs.chartoptions;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Defines all x- and y-axes.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/axes/">http://www.chartjs.org/docs/latest/axes/</a>
 *
 * @author SvenWirz
 */
@JsonAutoDetect(
		  fieldVisibility = JsonAutoDetect.Visibility.ANY,
		  getterVisibility = JsonAutoDetect.Visibility.NONE,
		  setterVisibility = JsonAutoDetect.Visibility.NONE,
		  creatorVisibility = JsonAutoDetect.Visibility.NONE
		)
@Accessors(chain = true)
@lombok.Data
public class Scales implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@JsonProperty("xAxes")
	private List<AxesScale> xAxes;
	
	@JsonProperty("yAxes")
	private List<AxesScale> yAxes;

	
	
	public Scales setXAxes(AxesScale singleScale) {
		this.xAxes = Arrays.asList(singleScale);
		return this;
	}
	
	public Scales setXAxes(List<AxesScale> scaleList) {
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
