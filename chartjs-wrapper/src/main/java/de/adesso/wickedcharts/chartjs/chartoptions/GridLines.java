package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.jackson.serializer.SingleElementListSerializer;
import lombok.experimental.Accessors;

/**
 * Defines the properties of gridlines.
 *
 */
@SuppressWarnings("serial")
@Accessors(chain = true)
@lombok.Data
public class GridLines implements Serializable {
	private Boolean display;
	private Boolean drawBorder;
	private Boolean drawOnChartArea;
	private Boolean drawTicks;
	@JsonSerialize(using = SingleElementListSerializer.class)
	private List<Color> color;
	private Color zeroLineColor; // TODO: check if change from rgbaColor to Color affects output
	

	public GridLines setColor(Color color) {
		this.color = Arrays.asList(color);
		return this;
	}
	
	public GridLines setColor(List<Color> color) {
		this.color = color;
		return this;
	}
}
