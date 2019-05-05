package de.adesso.wickedcharts.chartjs.chartoptions;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.adesso.wickedcharts.chartjs.chartoptions.label.Label;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the different data objects.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/?h=data">http://www.chartjs.org/docs/latest/?h=data</a>
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
public class Data implements Serializable{

	@JsonProperty("labels")
	private List<? extends Label> labels;
	@JsonProperty("datasets")
	private List<Dataset> datasets;
	@JsonProperty("xLabels")
	private List<? extends Label> xLabels;
	@JsonProperty("yLabels")
	private List<? extends Label> yLabels;
}
