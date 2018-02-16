package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class TickStyle implements Serializable{
	private static final long serialVersionUID = 1L;
	private String fontStyle;
	private Color fontColor;
}
